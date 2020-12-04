package businessdelegate;

public class QueryDelegate {
    private String _queryName;
    private QueryService _queryService;

    public QueryDelegate() {
        System.out.println("未指定查询类型，默认为\"OnlineQuery\"");
        this._queryName = "OnlineQuery";
    }

    /**
     * 构造函数
     * @param queryName
     */
    public QueryDelegate(String queryName) {
        System.out.println("指定查询类为:" + queryName);
        this._queryName = queryName;
    }

    /**
     *获取新查询类
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public void setQueryType() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class query = Class.forName(_queryName); //获取查询类
        this._queryService = (QueryService) query.newInstance(); //获取查询类对象
    }

    public void doQuery() {
        _queryService.lookUp();
    }
}
