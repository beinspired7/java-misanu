package Project4.contract;

import java.util.List;

public abstract class Loader<T> {
    protected List<T> items = null;
    public abstract List<T> load();
}
