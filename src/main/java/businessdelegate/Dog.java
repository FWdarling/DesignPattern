package businessdelegate;

public class Dog {
    private QueryDelegate _queryDelegate;

    //获取"查询委托"对象并保存在此类中
    public Dog(QueryDelegate queryDelegate) {
        this._queryDelegate = queryDelegate;
    }

    //调用"查询委托"对象的查询方法开始查询
    public void doQuery() {
        this._queryDelegate.doQuery();
    }
}
