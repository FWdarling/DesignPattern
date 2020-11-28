package businessdelegate;

public class Query {
    /**
     *根据参数生成不同的查询类
     */
    public static QueryService getQuery(String queryName) {
        if("OfflineQuery".equals(queryName)) {
            return new OfflineQuery();
        } else if("OnlineQuery".equals(queryName)) {
            return new OnlineQuery();
        } else {
            return null;
        }
    }
}
