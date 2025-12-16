public abstract class Kitap {

    private int id;
    private String ad;
    private String yazar;
    private double fiyat;

    Kitap(int id, String ad, String yazar, double fiyat) {
        this.id = id;
        this.ad = ad;
        this.yazar = yazar;
        this.fiyat = fiyat;
    }


    //getler
    public int getId(){
        return id;
    }
    public String getAd(){
        return ad;
    }
    public String getYazar(){
        return yazar;
    }
    public double getFiyat(){
        return fiyat;
    }

    //setler

    public void setId(int id){
        this.id = id;
    }
    public void setAd(String ad){
        this.ad = ad;
    }
    public void setYazar(String yazar){
        this.yazar = yazar;
    }
    public void setFiyat(double fiyat){
        this.fiyat = fiyat;
    }

    public abstract void bilgiYazdir();

}
