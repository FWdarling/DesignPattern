package composite;



public abstract class EquipmentRoom{

    protected EquipmentRoom parent;

    public abstract String GetCategory();
    public abstract int GetValue();

    public EquipmentRoom add(EquipmentRoom equip)
    {
        return null;
    }

    public void PrintList()
    {
        PrintList("");
    }
    protected abstract void PrintList(String Type);

    public String toString()
    {
        return GetCategory()+"["+GetValue()+"]";
    }

    public String GetFullCategory()
    {
        StringBuilder temp = new StringBuilder();
        EquipmentRoom equip=this;
        do {
            temp.insert(0,"/"+equip.GetCategory());
            equip=equip.parent;
        } while (equip != null);
        System.out.println(temp);
        System.out.println("");
        return temp.toString();
    }


}
