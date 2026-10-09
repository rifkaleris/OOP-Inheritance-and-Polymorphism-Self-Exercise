public class Main {
    public static void main(String[] args) {
        System.out.println("Ini yang tanpa array: ");
        Silinder silinder = new Silinder(10, 5, "merah");
        silinder.printInfo();
        BujurSangkar bujurSangkar = new BujurSangkar(4.5, "kuning");
        bujurSangkar.printInfo();
        Lingkaran lingkaran = new Lingkaran(2, "ungu");
        lingkaran.printInfo();

        System.out.println("Ini yang pake array: ");
        Bentuk bentuk[] = new Bentuk[3];
        bentuk[0] = new BujurSangkar(4, "red");
        bentuk[1] = new Lingkaran(5, "green");
        bentuk[2] = new Silinder(7, 2, "kuning kecoklatan");

        for (int i = 0; i < bentuk.length; i++){
            bentuk[i].printInfo();
        }
    }
}
