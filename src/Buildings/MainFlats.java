package Buildings;

import java.util.Scanner;

public class MainFlats
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Building B1 = new Building("","");


        System.out.println("Building 1");
        System.out.println("Δωσε οδο και πολη");
        B1.setStreet(sc.next());
        B1.setCity(sc.next());

        Flat x2 = new Flat();

        System.out.println("Flat 1");
        System.out.println("αξία τετραγωνικού μέτρου του διαμερίσματος");
        x2.setCost(sc.nextDouble());
        System.out.println("Εχει πουληθει true/false ?");
        x2.setSold(sc.nextBoolean());
        System.out.println("τετραγωνικά μέτρα διαμερίσματος");
        x2.setSquarem(sc.nextDouble());
        System.out.println("αριθμός διαμερίσματος");
        x2.setFlatNum(sc.nextInt());
        System.out.println("παροχές διαμερίσματος π.χ. τζάκι κ.λ.π.");
        x2.setExtras(sc.next());

        x2.SetSold();
        B1.sellFlat(x2,0);

        System.out.println("SpecialFlat 1");

        SpecialFlat y2 = new SpecialFlat();

        System.out.println("αξία τετραγωνικού μέτρου του διαμερίσματος");
        y2.setCost(sc.nextDouble());
        System.out.println("Εχει πουληθει true/false ?");
        y2.setSold(sc.nextBoolean());
        System.out.println("τετραγωνικά μέτρα διαμερίσματος");
        y2.setSquarem(sc.nextDouble());
        System.out.println("αριθμός διαμερίσματος");
        y2.setFlatNum(sc.nextInt());
        System.out.println("παροχές διαμερίσματος π.χ. τζάκι κ.λ.π.");
        y2.setExtras(sc.next());
        System.out.println("το επιπλέον κόστος του διαμερίσματος");
        y2.setExtraCost(sc.nextDouble());
        System.out.println("έξτρα παροχές του διαμερίσματος-οι ονομασίες τους");
        y2.setSpecialextras(sc.next());

        y2.SetSold();
        B1.sellFlat(y2,1);


        Building B2 = new Building("","");


        System.out.println("Building 2");
        System.out.println("Δωσε οδο και πολη");
        B2.setStreet(sc.next());
        B2.setCity(sc.next());

        System.out.println("Flat 1");

        Flat x1 = new Flat();

        System.out.println("αξία τετραγωνικού μέτρου του διαμερίσματος");
        x1.setCost(sc.nextDouble());
        System.out.println("Εχει πουληθει true/false ?");
        x1.setSold(sc.nextBoolean());
        System.out.println("τετραγωνικά μέτρα διαμερίσματος");
        x1.setSquarem(sc.nextDouble());
        System.out.println("αριθμός διαμερίσματος");
        x1.setFlatNum(sc.nextInt());
        System.out.println("παροχές διαμερίσματος π.χ. τζάκι κ.λ.π.");
        x1.setExtras(sc.next());

        x2.SetSold();
        B2.sellFlat(x1,0);


        System.out.println("Flat 2");

        Flat x3 = new Flat();

        System.out.println("αξία τετραγωνικού μέτρου του διαμερίσματος");
        x3.setCost(sc.nextDouble());
        System.out.println("Εχει πουληθει true/false ?");
        x3.setSold(sc.nextBoolean());
        System.out.println("τετραγωνικά μέτρα διαμερίσματος");
        x3.setSquarem(sc.nextDouble());
        System.out.println("αριθμός διαμερίσματος");
        x3.setFlatNum(sc.nextInt());
        System.out.println("παροχές διαμερίσματος π.χ. τζάκι κ.λ.π.");
        x3.setExtras(sc.next());

        x3.SetSold();
        B2.sellFlat(x3,1);

        System.out.println("SpecialFlat");

        SpecialFlat y3 = new SpecialFlat();

        System.out.println("αξία τετραγωνικού μέτρου του διαμερίσματος");
        y3.setCost(sc.nextDouble());
        System.out.println("Εχει πουληθει true/false ?");
        y3.setSold(sc.nextBoolean());
        System.out.println("τετραγωνικά μέτρα διαμερίσματος");
        y3.setSquarem(sc.nextDouble());
        System.out.println("αριθμός διαμερίσματος");
        y3.setFlatNum(sc.nextInt());
        System.out.println("παροχές διαμερίσματος π.χ. τζάκι κ.λ.π.");
        y3.setExtras(sc.next());
        System.out.println("το επιπλέον κόστος του διαμερίσματος");
        y3.setExtraCost(sc.nextDouble());
        System.out.println("έξτρα παροχές του διαμερίσματος-οι ονομασίες τους");
        y3.setSpecialextras(sc.next());

        y3.SetSold();
        B2.sellFlat(y3,2);

        System.out.println("Sunoptika to prwto building exei: ");
        B1.FlatInfo();

        System.out.println("Sunoptika to deutero building exei: ");
        B2.FlatInfo();

        System.out.println("Aksia 1ou Building: "+(x2.getCost()+y2.getextraCost()));


        System.out.println("Aksia 2ou Building: "+( x1.getCost()+x3.getCost()+y3.getextraCost()));


        System.out.println("Sunoliki aksia twn buildings" +Building.getTotalcost());

    }
}
