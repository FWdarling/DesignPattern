package composite;


public class Equipment extends EquipmentRoom {
//    所有的方法名，成员名，变量名使用小驼峰命名（我们前面在群里统一过了）把模块内所有文件的命名统一
//            其他问题见comments
    private String name;
    private int value;

    /**
     * 构造函数，具体的体育器材
     * @param name
     * @param value
     */
    public Equipment(String name,int value)
    {
        this.name=name;
        this.value=value;
    }

    @Override
    public String getCategory() {
        return name;
    }

    @Override
    public int getValue() {
        return value;
    }

    /**
     * 输出运动器材的名称和价值
     * @param Type
     */
    @Override
    protected void printList(String Type) {
        System.out.println(Type + "/" + name+"["+value+"]");
    }
}
