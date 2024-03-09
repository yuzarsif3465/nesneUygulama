package uygulama1;

public class ArabaTest {
    public static void main(String[] args) {
        Araba araba1= new Araba();

        //  Araba araba1;
        //araba1= new Araba();

        araba1.marka="bmw";
        araba1.model="520d";
        araba1.renk="gri";
        araba1.year= 2014;

        System.out.println("Marka: "+araba1.marka);
        System.out.println("Model: "+araba1.model);
        System.out.println("Renk: "+araba1.renk);
        System.out.println("yaş: "+(2021-araba1.year));
    }
}
