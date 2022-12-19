package proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbConnectorProxy implements DbConnector {
    private DbConnectorImpl dbConnector;
    private Map<String, String> cache;

    public DbConnectorProxy(DbConnectorImpl dbConnector) {
        this.dbConnector = dbConnector;
        cache = new HashMap<>();
    }

    @Override
    public String getUrl(String dbName) {
        if (!cache.containsKey(dbName)) {
            String db = dbConnector.getUrl(dbName);
            cache.put(dbName, db);
            return db;
        }
        System.out.println("Connector from cache");
        return cache.get(dbName);
    }
}
