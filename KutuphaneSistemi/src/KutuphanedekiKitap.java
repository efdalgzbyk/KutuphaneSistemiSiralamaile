public class KutuphanedekiKitap extends Kitap implements  Indirim, Comparable<KutuphanedekiKitap> {

    private int adet;

    KutuphanedekiKitap(int id, String ad, String yazar, double fiyat,int adet) {
        super(id, ad, yazar, fiyat);
        this.adet = adet;
    }

    public double toplamFiyat(){
        return getFiyat()*adet;
    }



    @Override
    public double indirimFiyat() {
        if(toplamFiyat() >= 300){
            return toplamFiyat()*0.9;
        }else {
            return toplamFiyat();
        }
    }

    @Override
    public void bilgiYazdir() {
        System.out.println("Kütüphane Bilgileri");
        System.out.println("id= "+getId());
        System.out.println("ad= "+getAd());
        System.out.println("yazar= "+getYazar());
        System.out.println("fiyat= "+indirimFiyat());
        System.out.println("adet= "+adet);
    }

    @Override
    public int compareTo(KutuphanedekiKitap k) {
        return Double.compare(k.toplamFiyat(),this.toplamFiyat());
    }
}
