public class Lingkaran extends Bentuk{
    private double radius;
    public double PI = 3.1415926535;

    public Lingkaran(double radius, String warna){
        super(warna);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double r){
        radius = r;
    }

    public double hitungLuas(){
        return PI * radius * radius;
    }

    @Override 
    public void printInfo(){
        System.out.println("Lingkaran " + super.getWarna() + ", luas = " + hitungLuas());
    }
}
