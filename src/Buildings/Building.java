package Buildings;

public class Building
{
    String street;
    String city;
    Flat [] flats = new Flat[6];
    static int totalFlats = 0;

    static double totalcost = 0;

    public Building(String street, String city)
    {
        this.street = street;
        this.city = city;
    }
    public Building(){}

    public void setStreet(String street)
    {
        this.street = street;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getStreet()
    {
        return street;
    }

    public String getCity()
    {
        return city;
    }

    public void sellFlat(Flat F,int n)
    {
        if (F.sold==true && n<this.flats.length)
        {
            this.flats[n] = F;
            totalFlats= (n+1);
            totalcost +=F.getPrice();
        }
    }

    /*
     public void sellFlat(Flat f,int b)
    {
        int i;
        for(i=b;i<flats.length;i++)
            if(f.sold==true)
            {
                flats[i] = f;
                totalFlats=(i+1);
                totalCost+=f.getPrice();
                break;
            }
    }
     */

    public static double getTotalcost()
    {
        return totalcost;
    }

    public void FlatInfo()
    {
        System.out.println("Building Details:");
        System.out.println("Street: " + street + " City: " + city);

        for (int i = 0; i < flats.length; i++)
        {
            if (flats[i] != null)
            {
                System.out.println("Flat " + (i + 1) + " Details:");
                flats[i].print();
            }
        }
    }


}
