package composite;



public abstract class EquipmentRoom{

    protected EquipmentRoom parent;

    public abstract String getCategory();
    public abstract int getValue();

    /**
     * 在容器中添加具体的体育器材或者器材分类。
     * @param equip
     * @return
     */
    public EquipmentRoom add(EquipmentRoom equip)
    {
        return null;
    }

    public void printList()
    {
        printList("");
    }

    protected abstract void printList(String Type);

    public String toString()
    {
        return getCategory()+"["+getValue()+"]";
    }

    /**
     * 当子类调用时，得到运动器材的详细分类情况
     * @return
     */
    public String getFullCategory()
    {
        StringBuilder temp = new StringBuilder();
        EquipmentRoom equip=this;
        do {
            temp.insert(0,"/"+equip.getCategory());
            equip=equip.parent;
        } while (equip != null);
        System.out.println(temp);
        System.out.println("");
        return temp.toString();
    }


}
