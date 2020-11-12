package Iterator;

public class SportsMan {
    private String name;
    private int Age;
    public SportsMan(String name,int age){this.name=name;this.Age=age;}
    public String GetName(){return name;}
    public int GetAge(){return Age;}

    public void ModifyName(String name){this.name=name;}
    public void ModifyAge(int age){Age=age;}


}
