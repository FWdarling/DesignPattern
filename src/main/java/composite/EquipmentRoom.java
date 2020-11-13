package composite;



public abstract class EquipmentRoom{

    protected EquipmentRoom parent;

    public abstract String GetCategory();
    public abstract int GetValue();

    /**
     * 在容器中添加具体的体育器材或者器材分类。
     * @param equip
     * @return
     */
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

    /**
     * 当子类调用时，得到运动器材的详细分类情况
     * @return
     */
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
