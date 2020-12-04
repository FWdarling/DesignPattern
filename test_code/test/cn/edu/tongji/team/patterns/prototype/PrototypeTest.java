package prototype;

import cn.edu.tongji.team.model.beans.chocolate.ChocolateType;
import cn.edu.tongji.team.patterns.prototype.Name;
import cn.edu.tongji.team.patterns.prototype.TempGiftBox;
import org.junit.Test;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 23:15 2020/12/4
 * @Modified By:
 **/
public class PrototypeTest {
    @Test
    public void prototypeTest(){
        TempGiftBox box = new TempGiftBox("费列罗豪华礼盒", ChocolateType.Deluxe, Name.Ferrero);
        System.out.println("原box信息：\n");
        System.out.println(box);
        TempGiftBox box2 = null;
        TempGiftBox deepCloneBox = null;
        TempGiftBox serializeCloneBox = null;
        try {
            box2 = (TempGiftBox) box.clone();
            deepCloneBox = (TempGiftBox) box.deepClone();
            serializeCloneBox = (TempGiftBox) box.serializeClone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(box2);

        System.out.println("\n测试浅拷贝");
        box2.setPrice(999);
        box2.setGiftBoxName("费列罗超级豪华礼盒");
        System.out.println("box's price:" + box.getPrice());
        System.out.println("box2's price:" + box2.getPrice());
        System.out.println("box's giftBoxName:" + box.getGiftBoxName()
                + ", name's hash code:" + box.getGiftBoxName().hashCode());
        System.out.println("box2's giftBoxName:" + box2.getGiftBoxName()
                + ", name's hash code:" + box2.getGiftBoxName().hashCode());

        System.out.println("\n测试深拷贝");
        deepCloneBox.setGiftBoxName("费列罗梦幻豪华礼盒");
        System.out.println("box's giftBoxName:" + box.getGiftBoxName()
                + ", name's hash code:" + box.getGiftBoxName().hashCode());
        System.out.println("deepCloneBox's giftBoxName:" + deepCloneBox.getGiftBoxName()
                + ", name's hash code:" + deepCloneBox.getGiftBoxName().hashCode());
        System.out.println("serializeCloneBox's giftBoxName:" + serializeCloneBox.getGiftBoxName()
                + ", name's hash code:" + serializeCloneBox.getGiftBoxName().hashCode());
    }
}
