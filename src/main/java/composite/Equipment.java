package composite;


public class Equipment extends EquipmentRoom {
    private String name;
    private int value;
    public Equipment(String name,int value)
    {
        this.name=name;
        this.value=value;
    }

    @Override
    public String GetCategory() {
        return name;
    }

    @Override
    public int GetValue() {
        return value;
    }

    /**
     * 输出运动器材的名称和价值
     * @param Type
     */
    @Override
    protected void PrintList(String Type) {
        System.out.println(Type + "/" + name+"["+value+"]");
    }
}
