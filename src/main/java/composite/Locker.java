package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Locker extends EquipmentRoom{
    private String name;
    private int values;
    private ArrayList<EquipmentRoom> equipments=new ArrayList<EquipmentRoom>();

    /**
     * 构造函数
     * @param name
     */
    public Locker(String name)
    {
        this.name=name;
    }

    @Override
    public String getCategory() {
        return name;
    }

    /**
     * 会统计当前分类下所有运动器材的总价值
     * @return
     */
    @Override
    public int getValue() {
        int value=0;
        Iterator it = equipments.iterator();
        while (it.hasNext()) {
            EquipmentRoom equip=(EquipmentRoom) it.next();
            value+=equip.getValue();
        }
        values=value;
        return value;
    }

    /**
     * 输出当前分类下所有的运动器材的名称和价值
     * 类似于文件遍历
     * @param Type
     */
    @Override
    protected void printList(String Type) {
        System.out.println(Type + "/" + this);
        Iterator it = equipments.iterator();
        while (it.hasNext()) {
            EquipmentRoom equip=(EquipmentRoom) it.next();
            equip.printList(Type + "/" + name);
        }

    }

    /**
     * 在某个大的分类下添加细化的分类，eg.“球”中再划分“空心球/实心球”
     * @param equip
     * @return
     */
    @Override
    public EquipmentRoom add(EquipmentRoom equip) {
        equipments.add(equip);
        equip.parent=this;
        return this;
    }
}
