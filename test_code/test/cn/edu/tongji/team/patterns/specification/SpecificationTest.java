package cn.edu.tongji.team.patterns.specification;

import cn.edu.tongji.team.model.beans.chocolate.Chocolate;
import cn.edu.tongji.team.model.beans.warehouse.Menu;
import cn.edu.tongji.team.model.beans.warehouse.ProductWareHouse;
import org.junit.Test;

import java.util.Iterator;

/**
 * description: SpecificationTest
 * date: 12/3/20 5:07 PM
 * author: fourwood
 */
public class SpecificationTest {
    private static ProductWareHouse productWareHouse = ProductWareHouse.getInstance();

    @Test
    public void specificationTest(){
        Menu<Chocolate> chocolateMenu = productWareHouse.getChocolateMenu();
        IProductSpecification<Double> equalSpec = new ChocolateByPriceEqual<Double>(32.88);
        int count = 0;

        for (Iterator<Chocolate> it = chocolateMenu.iterator(); it.hasNext(); ) {
            Chocolate spoiledChocolate = it.next();
            if(equalSpec.isProductSatisfiedBy(spoiledChocolate.getPrice())){
                count++;
                System.out.print("           ");
                System.out.println(count + "." + spoiledChocolate);
            }
        }

        IProductSpecification<Double> thanSpec = new ChocolateByPriceThan<Double>(24.88);
        count = 0;
        for (Iterator<Chocolate> it = chocolateMenu.iterator(); it.hasNext(); ) {
            Chocolate spoiledChocolate = it.next();
            if(thanSpec.isProductSatisfiedBy(spoiledChocolate.getPrice())){
                count++;
                System.out.print("           ");
                System.out.println(count + "." + spoiledChocolate);
            }
        }
    }

}
