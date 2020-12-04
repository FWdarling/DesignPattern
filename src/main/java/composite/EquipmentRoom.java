package composite;



public abstract class EquipmentRoom{

    protected EquipmentRoom parent;

    /**
     * 获取详细分类路劲
     * @return
     */
    public abstract String getCategory();

    /**
     * 获取当前物品或者分类下的价值综合
     * @return
     */
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

    /**
     * 调用抽象函数
     */
    public void printList()
    {
        printList("");
    }

    /**
     * 打印当前物品或者分类下的所有信息
     * @param Type
     */
    protected abstract void printList(String Type);

    /**
     * 重写输出函数
     * @return
     */
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
