package simplefactory.entity;

/**
 * 冰淇淋员工类
 * 可以制造冰淇淋
 */
public class IceCreamStaff {
    /**
     * 根据名称制造冰淇淋
     * @param ICName
     * @return
     */
    public static IceCream getIceCream(String ICName){
        if(ICName.equals("香草冰淇淋")){
            return new VanillaIceCream();
        }
        else if(ICName.equals("巧克力冰淇淋")){
            return new ChocolateIceCream();
        }
        else if(ICName.equals("抹茶冰淇淋")){
            return new MatchaIceCream();
        }
        else{
            return new NullIceCream();
        }
    }
}
