package org.finalProject.CollectionRegularExpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        // Creating Java Map

        Map<String, ArrayList<String>> year = new HashMap<String, ArrayList<String>>();

        // Inserting Elements Into List
        ArrayList<String> January = new ArrayList<>(31);

        // Српски православни календар

        January.add("Sveti mučenik Bonifatije – Oci (Paterice) ulje");
        January.add("SLAVA Sveti Ignjatije Bogonosac ulje");
        January.add("Sveta mučenica Julijana; Sveti Petar, Mitropolit Kijevski ulje");
        January.add("Sveta velikomučenica Anastasija; Sveti Nikifor Leprozni	voda");
        January.add("Svetih 10 mučenika Kritskih; Prepodobni Naum Ohridski – Tucindan	ulje");
        January.add("Sveta prepodobnomučenica Evgenija – Badnjidan	vino");
        January.add("Roždestvo Hristovo – Božić ⵔ	mrs");
        January.add("Sabor Presvete Bogorodice mrs");
        January.add("SLAVA Sveti prvomučenik i arhiđakon Stefan	mrs");
        January.add("Svetih 20.000 mučenika Nikomidijskih	mrs");
        January.add("Svetih 14.000 mladenaca Vitlejemskih	mrs");
        January.add("Sveta mučenica Anisija; Prepodobna Teodora	mrs");
        January.add("Prepodobna Melanija; Sveti Dositej Zagrebački Ispovednik (Odanije Roždestva)	mrs");
        January.add("SLAVA JANUAR – Obrezanje Gospodnje; Sveti Vasilije Veliki (Nova godina)	mrs");
        January.add("Prepodobni Serafim Sarovski; Sveti Silvestar (Pretprazništvo Bogojavljenja) ◑	mrs");
        January.add("Sveti prorok Malahija; Sveti mučenik Gordije	mrs");
        January.add("Sabor 70 svetih apostola; Sveti Jevstatije Srpski	mrs");
        January.add("Sveti Teopemt i Teona – Krstovdan	suho.");
        January.add("Bogojavljenje	mrs");
        January.add("Sveti mučenik Julijan i Vasilisa; Prepodobni Georgije Hozevit; Sveti Grigorije Ohridski ⬤	mrs");
        January.add("Sveti mučenik Polievkt; Sveti Filip, Mitropolit Moskovski	mrs");
        January.add("Sveti Grigorije Niski; Prepodobni Dometijan Mitilinski	mrs");
        January.add("Prepodobni Teodosije Veliki; Prepodobni Mihailo Klopski	mrs");
        January.add("Sveta mučenica Tatijana; Ikona Mlekopitateljica	voda");
        January.add("Sveti mučenici Ermil i Stratonik (Odanije Bogojavljenja)	mrs");
        January.add("SLAVA Sveti Sava, prvi Arhiepiskop srpski – Savindan	riba");
        January.add("Prepodobni Pavle Tivejski; prepodobni Gavrilo Lesnovski ◐	mrs");
        January.add("SLAVA Časne verige Svetog apostola Petra; Prepodobni Romilo Ravanički");
        January.add("Prepodobni Antonije Veliki");
        January.add("Sveti Atanasije Veliki; Sveti Maksim, Arhiepiskop srpski");

        // Inserting Elements Into a Map

        year.put("January", January);

        ArrayList<String> February = new ArrayList<>();
        February.add("Prepodobni Makarije Egipatski; Sveti Marko Efeski	post");
        February.add("Prepodobni Jevtimije Veliki	");
        February.add("Prepodobni Maksim Ispovednik; Sveti mučenik Neofit	post");
        February.add("Sveti apostol Timotej; Prepodobni mučenik Anastasije	");
        February.add("Sveti Sveštenomučenik Kliment Ankirski	");
        February.add("Prepodobna Ksenija Rimljanka; Sveti mučenik Vavila	");
        February.add("Sveti Grigorije Bogoslov; Prepodobni Publije	");
        February.add("Prepodobni Ksenofont i Marija	post");
        February.add("Prenos moštiju Svetog Jovana Zlatousta	");
        February.add("Prepodobni Jefrem Sirin; Prepodobni Isak Sirin	post");
        February.add("Prenos moštiju Svetog Ignjatija Bogonosca	");
        February.add("+++ SVETA TRI JERARHA	");
        February.add("Sveti besrebrenici Kir i Jovan	");
        February.add("Sveti mučenik Trifun (Pretprazništvo Sretenja)	");
        February.add("+++ SRETENjE GOSPODNjE	post");
        February.add("Sveti Simeon i Ana; Sveti Jakov, Arhiepiskop srpski	");
        February.add("Prepodobni Isidor Pelusiot; Prepodobni Nikolaj	post");
        February.add("Sveta mučenica Agatija; Sveti Polievkt - Velike (zimske) zadušnice	");
        February.add("Sveti Fotije Carigradski; Sveti Vukol Smirnski (Odanije Sretenja) (Mesne Poklade)	");
        February.add("Sveti Partenije Lampsakijski	");
        February.add("Sveti Teodor Stratilat; Sveti Sava, Drugi Arhiepiskop srpski	");
        February.add("Sveti mučenik Nikifor	");
        February.add("Sveti Sveštenomučenik Haralampije	");
        February.add("Sveti Vlasije; Sveti velikomučenik Đorđe Kratovac	");
        February.add("Sveti Meletije Antiohijski	");
        February.add("Sveti Simeon Mirotočivi (Bele poklade)	");
        February.add("Prepodobni Avksentije; Sveti Kiril Slovenski (Početak posta)	post");
        February.add("Sveti apostol Onisim; Prepodobni Jevsevije Pustinjak	post");

        year.put("February", February);

      

        final String FullNameRegEx = "(ulje|voda|post)";

        final Pattern pattern = Pattern.compile(FullNameRegEx, Pattern.MULTILINE);

        for (String key: year.keySet()) {
            for (String svetac : year.get(key)) {
                Matcher matcher = pattern.matcher(svetac);

                if (!matcher.find()) {
                    continue;
                }
                System.out.println(String.format("Mjesec: %s, dan: %d, %s", key, year.get(key).indexOf(svetac) + 1, svetac));
            }
        }
    }
}
