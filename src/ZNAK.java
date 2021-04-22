
public class ZNAK
{
    private String last_name;
    private String name;
    private int[] date;

    public String getLast_name(){return last_name;}
    public String getName(){return name;}
    public int[] getDate(){return date;}
public ZNAK(String last_name,String name,int[] date)
{
    this.last_name = last_name;
    this.name = name;
    this.date = date;
}
    public void setName(String name){this.name = name;}
    public void setLast_name(String last_name){this.last_name = last_name;}
    public void setDate (int[] date){this.date = date;}
    public void ZODIAC(ZNAK znak)
    {
        int month = znak.date[1];
        int day = znak.date[0];
        if ((month==3) && (day<21&&day>0))
        {
            System.out.println("Рыба");
        }
        else if ((month==2) && (day<30&&day>18))
        {
            System.out.println("Рыба");
        }
        else System.out.println("Не рыба");
    }
}
