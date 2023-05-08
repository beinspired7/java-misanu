package org.finalProject.project5.entities;

import java.sql.*;
import java.util.*;
import java.util.stream.Collectors;

public abstract class Entity {
    static final String DB_URL = "jdbc:mysql://localhost/Biblioteka";
    static final String USER = "test";
    static final String PASS = "test";

    static final String QUERY_INDEX = "SELECT %s FROM `%s`;";
    static final String QUERY_GET = "SELECT %s FROM `%s` WHERE id = ?";
    static final String QUERY_INSERT = "INSERT INTO %s (%s) VALUES (%s)";
    static final String QUERY_UPDATE = "UPDATE %s SET %s WHERE id = ?";
    static final String QUERY_DELETE = "DELETE FROM %s WHERE id = ?";

    protected Object[] values;
    public Entity(Object... values) {
        this.values = values;
    }

    protected abstract String getTable();
    protected abstract String[] getFields();
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
    private String[] getSelectionFields() {
        List<String> lista = new ArrayList<>();
        lista.add("id");
        lista.addAll(Arrays.asList(getFields()));

        return lista.stream().map(field -> String.format("`%s`", field)).toArray(String[]::new);
    }

    public int delete(int id) throws SQLException {
        String query = String.format(QUERY_DELETE, getTable());

        PreparedStatement stmt = getConnection().prepareStatement(query);

        stmt.setInt(1, id);

        return stmt.executeUpdate();
    }

    public int update(int id, Map<String, Object> values) throws SQLException {
        String valuePlaceholders = values.keySet().stream()
                .map(key -> String.format("`%s` = ?", key)).collect(Collectors.joining(", "));
        String query = String.format(QUERY_UPDATE, getTable(), valuePlaceholders);

        PreparedStatement stmt = getConnection().prepareStatement(query);

        int counter = 0;
        for (String key: values.keySet()) {
            stmt.setObject(++counter, values.get(key));
        }
        stmt.setInt(++counter, id);

        return stmt.executeUpdate();
    }

    public int insert(Map<String, Object> values) throws SQLException {
        String field = String.join(",", values.keySet());

        String valuePlaceholders = values.keySet().stream().map(key -> "?").collect(Collectors.joining(", "));
        String query = String.format(QUERY_INSERT, getTable(), field, valuePlaceholders);

        PreparedStatement stmt = getConnection().prepareStatement(query);

        int counter = 0;
        for (String key: values.keySet()) {
            stmt.setObject(++counter, values.get(key));
        }

        return stmt.executeUpdate();
    }

    public Map<String, Object> get(int id) throws SQLException {
        String query = String.format(QUERY_GET, String.join(",", getSelectionFields()), getTable());
        PreparedStatement stmt = getConnection().prepareStatement(query);
        stmt.setInt(1, id);

        ResultSet rs = stmt.executeQuery();

        Map<String, Object> entity = new HashMap<>();

        if (rs.next()) {
            Arrays.stream(getFields()).forEach(field -> {
                try {
                    entity.put(field, rs.getObject(field));
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        return entity;
    }

    public Map<Integer, Map<String, Object>> index() throws SQLException {

        Statement stmt = getConnection().createStatement();
        String query = String.format(QUERY_INDEX, String.join(",", getSelectionFields()), getTable());
        ResultSet rs = stmt.executeQuery(query);

        Map<Integer, Map<String, Object>> entities = new HashMap<>();

        while (rs.next()) {
            Map<String, Object> mapa = new HashMap<>();

            Arrays.stream(getFields()).forEach(field -> {
                try {
                    mapa.put(field, rs.getObject(field));
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            });

            entities.put(rs.getInt("id"), mapa);
        }

        return entities;
    }
}
