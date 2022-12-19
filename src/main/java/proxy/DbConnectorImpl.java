package proxy;

public class DbConnectorImpl implements DbConnector {
    @Override
    public String getUrl(String dbName) {
        StringBuilder builder = new StringBuilder();
        builder.append("localhost:port/");
        builder.append(dbName);
        System.out.println("new connector");
        return builder.toString();
    }
}
