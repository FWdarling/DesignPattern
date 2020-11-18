package businessdelegate;

public class Query {
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
