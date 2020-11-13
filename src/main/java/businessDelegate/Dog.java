import Entity.Animal;

public class Dog extends Animal {
    private QueryDelegate _queryDelegate;
    public Dog(QueryDelegate queryDelegate) {
        this._queryDelegate = queryDelegate;
    }
    public void doQuery() {
        this._queryDelegate.doQuery();
    }
}
