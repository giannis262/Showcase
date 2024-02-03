package Buildings;

public class Flat
{
    double cost; //αξία τετραγωνικού μέτρου του διαμερίσματος
    boolean sold=false; //ένδειξη ότι αρχικά το διαμέρισμα δεν έχει πωληθεί
    double squarem; //τετραγωνικά μέτρα διαμερίσματος
    int flatNum; //αριθμός διαμερίσματος
    String extras; //παροχές διαμερίσματος π.χ. τζάκι κ.λ.π.
    static int totalFlats=0; // αυτός ο μετρητής θα αυξάνει αυτόματα κατά 1 σε κάθε νέο διαμέρισμα και μετά θα καταχωρείται στο πεδίο flatNum

    public Flat()
    {
    }
    public Flat(double cost, double squarem, String extras)
    {
        this.cost = cost;
        this.squarem = squarem;
        this.extras = extras;
        this.flatNum =(totalFlats+1);
        totalFlats++;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public void setSold(boolean sold)
    {
        this.sold = sold;
    }

    public void setSquarem(Double squarem)
    {
        this.squarem = squarem;
    }

    public void setFlatNum(int flatNum)
    {
        this.flatNum = flatNum;
    }

    public void setExtras(String extras)
    {
        this.extras=extras;
    }

    double getCost()
    {
        return cost;
    }

    boolean getSold()
    {
        return sold;
    }

    double getSquarem()
    {
        return squarem;
    }

    int getFlatNum()
    {
        return flatNum;
    }

    String getExtras()
    {
        return extras;
    }

    public void SetSold()
    {
        sold=true;
    }

    public double getPrice()
    {
        return cost*squarem;
    }

    String FlatInfo()
    {
        return "Aksia tetragwnikou metrou diamerismatos" + cost + "Pliromeno diamerisma" + sold + "Tetragwnika metra diamerismatos" + squarem + "Arithmos diamerismatos" + flatNum + "Paroxes diamerismatos" + extras ;
    }

    void print()
    {
        System.out.println("Aksia tetragwnikou metrou diamerismatos" + cost + "Pliromeno diamerisma" + sold + "Tetragwnika metra diamerismatos" + squarem + "Arithmos diamerismatos" + flatNum + "Paroxes diamerismatos" + extras);
    }

}
