package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author: CINDY DENG 1850477
 * Date: 2020/11/26,11:38
 * Version: 1.0
 */
public class ObjectStructure {
    private List<Element> list = new ArrayList<Element>();

    //对list内的element实现具体的visitor类
    public void accept(Visitor visitor) {
        Iterator<Element> i = list.iterator();
        while (i.hasNext()) {
            (i.next()).accept(visitor);
        }
    }
    //增加element进入list
    public void add(Element element) {
        list.add(element);
    }
    //从list中移除element
    public void remove(Element element) {
        list.remove(element);
    }
}
