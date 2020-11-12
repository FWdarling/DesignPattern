package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Locker extends EquipmentRoom{
    private String name;
    private int values;
    private ArrayList<EquipmentRoom> equipments=new ArrayList<EquipmentRoom>();

    public Locker(String name)
    {
        this.name=name;
    }

    @Override
    public String GetCategory() {
        return name;
    }

    @Override
    public int GetValue() {
        int value=0;
        Iterator it = equipments.iterator();
        while (it.hasNext()) {
            EquipmentRoom equip=(EquipmentRoom) it.next();
            value+=equip.GetValue();
        }
        values=value;
        return value;
    }

    @Override
    protected void PrintList(String Type) {
        System.out.println(Type + "/" + this);
        Iterator it = equipments.iterator();
        while (it.hasNext()) {
            EquipmentRoom equip=(EquipmentRoom) it.next();
            equip.PrintList(Type + "/" + name);
        }

    }

    @Override
    public EquipmentRoom add(EquipmentRoom equip) {
        equipments.add(equip);
        equip.parent=this;
        return this;
    }
}
