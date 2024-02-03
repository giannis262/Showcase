package Buildings;

public class SpecialFlat extends Flat
{
    String Specialextras; //έξτρα παροχές του διαμερίσματος-οι ονομασίες τους
    double extraCost; //το επιπλέον κόστος του διαμερίσματος

    public SpecialFlat(double cost, double squarem,String extras, String Specialextras, double extraCost)
    {
        super(cost,squarem, extras);
        this.extraCost=extraCost;
        this.Specialextras=extras;
    }

    public SpecialFlat()
    {}

    public void setSpecialextras(String Specialextras)
    {
        this.Specialextras=Specialextras;
    }

    public String getSpecialextras()
    {
        return this.Specialextras;
    }

    public void setExtraCost(double extraCost)
    {
        this.extraCost=extraCost;
    }

    public double getextraCost()
    {
        return this.extraCost;
    }

    public void print()
    {
        super.print();
        System.out.println("SpecialExtras: " + this.Specialextras+ "ExtraCost: " + this.extraCost);
    }

    double totalcost()
    {
        return super.getPrice() + extraCost;
    }
}
