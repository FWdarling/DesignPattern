package entity;

public class SportsMan {
    private String name;
    private int age;
    public SportsMan(String name,int age){this.name=name;this.age=age;}
    public String getName(){return name;}
    public int getAge(){return age;}

    public void modifyName(String name){this.name=name;}
    public void modifyAge(int age){this.age=age;}


}
