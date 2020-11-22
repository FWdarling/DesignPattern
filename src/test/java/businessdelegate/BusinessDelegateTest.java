package businessdelegate;

import org.junit.Test;

public class BusinessDelegateTest {
    @Test
    public void businessDelegateTest() {
        System.out.println("---------------- [Pattern] BusinessDelegate ----------------");
        try {
            QueryDelegate queryDelegate = new QueryDelegate(OfflineQuery.class.getName());
            queryDelegate.setQueryType();
            Dog dogAthlete = new Dog(queryDelegate);
            dogAthlete.doQuery();
        } catch (ClassNotFoundException e) {
            System.out.println("此查询类型不存在！");
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------ END ------------------------");
    }
}
