public class Bentuk{
    public String warna;

    public Bentuk(String warna){
        this.warna = warna;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void printInfo(){
        System.out.println("Bentuk berwarna " + warna);
    }
}

class BujurSangkar extends Bentuk{
    private double sisi;

    public BujurSangkar(double sisi, String warna){
        super(warna);
        this.sisi = sisi; 
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double hitungLuas(){
        return sisi * sisi;
    }

    @Override 
    public void printInfo(){
        System.out.println("Bujur sangkar berwarna " + super.getWarna() + ", luas " + hitungLuas());
    }
}