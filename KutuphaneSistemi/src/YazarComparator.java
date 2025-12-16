import java.util.Comparator;

public class YazarComparator implements Comparator<KutuphanedekiKitap> {

    @Override
    public int compare(KutuphanedekiKitap k1, KutuphanedekiKitap k2) {
        return k1.getYazar().compareToIgnoreCase(k2.getYazar());
    }
}
