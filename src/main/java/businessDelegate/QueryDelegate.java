public class QueryDelegate {
    private String _queryName;
    private QueryService _queryService;

    public QueryDelegate() {
        System.out.println("未指定查询类型，默认为\"OnlineQuery\"");
        this._queryName = "OnlineQuery";
    }
    public QueryDelegate(String queryName) {
        System.out.println("指定查询类为:" + queryName);
        this._queryName = queryName;
    }

    public void setQueryType() {
        try {
            Class query = Class.forName(_queryName); //获取查询类
            this._queryService = (QueryService) query.newInstance(); //获取查询类对象
        } catch (ClassNotFoundException e) {
            System.out.println("此查询类型不存在！");
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException e) {
            System.out.println(e.getMessage());
        }
    }

    public void doQuery() {
        _queryService.lookUp();
    }
}
