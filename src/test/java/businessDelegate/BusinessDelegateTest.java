package businessDelegate;

import org.junit.Test;

public class BusinessDelegateTest {
    @Test
    public void businessDelegateTest() {
        QueryDelegate queryDelegate = new QueryDelegate("OfflineQuery");
        queryDelegate.setQueryType();
        Dog dogAthlete = new Dog(queryDelegate);
        dogAthlete.doQuery();
    }
}
