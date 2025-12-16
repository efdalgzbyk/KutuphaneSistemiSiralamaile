import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<KutuphanedekiKitap> kutuphanedekiKitap = new ArrayList<KutuphanedekiKitap>();

        KutuphanedekiKitap k1 = new KutuphanedekiKitap(1,"test1","asdfas",321,3);
        KutuphanedekiKitap k2 = new KutuphanedekiKitap(2,"test2","dafdsfa",241,6);
        KutuphanedekiKitap k3 = new KutuphanedekiKitap(3,"test3","zczxcz",123,2);
        KutuphanedekiKitap k4 = new KutuphanedekiKitap(4,"test4","fdasfz",532,9);

        kutuphanedekiKitap.add(k1);
        kutuphanedekiKitap.add(k2);
        kutuphanedekiKitap.add(k3);
        kutuphanedekiKitap.add(k4);

        for(KutuphanedekiKitap k : kutuphanedekiKitap){
            k.bilgiYazdir();
            System.out.println("---------------------------");
        }


        System.out.println("Fiyata göre-----------");
        Collections.sort(kutuphanedekiKitap);
        for(KutuphanedekiKitap k : kutuphanedekiKitap){
            k.bilgiYazdir();
            System.out.println("---------------------------");
        }



        System.out.println("Ada göre------------ ");
        Collections.sort(kutuphanedekiKitap ,new YazarComparator());
        for(KutuphanedekiKitap k : kutuphanedekiKitap){
            k.bilgiYazdir();
            System.out.println("--------------------------");
        }

    }

}