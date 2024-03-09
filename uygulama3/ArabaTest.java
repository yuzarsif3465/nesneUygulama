package uygulama3;


public class ArabaTest {
    public static void main(String[] args) {
        Araba araba1= new Araba("gri","bmw","cla180",2012);
        System.out.println("renk: "+araba1.renk);
        System.out.println("model: "+araba1.model);
        System.out.println("marka: "+araba1.marka);
        System.out.println("yaş: "+(2021-araba1.year));

        Araba araba2= new Araba("red","ford","mustang",2017);
        System.out.println("renk: "+araba2.renk);
        System.out.println("model: "+araba2.model);
        System.out.println("marka: "+araba2.marka);
        System.out.println("yaş: "+(2021-araba2.year));

    }
}
