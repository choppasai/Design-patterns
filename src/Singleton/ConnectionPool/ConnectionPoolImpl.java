package Singleton.ConnectionPool;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

//public class ConnectionPoolImpl implements ConnectionPool {
//    private static volatile ConnectionPoolImpl instance;
//    private final int maxConnections;
//    private final List<Connection> connections;
//    private final List<Boolean> availableConnections;
//
//    private ConnectionPoolImpl(int maxConnections) {
//        this.maxConnections = maxConnections;
//        this.connections = new ArrayList<>();
//        this.availableConnections = new ArrayList<>();
//    }
//
//    public static ConnectionPoolImpl getInstance(int maxConnections) {
//        if (instance == null) {
//            synchronized (ConnectionPoolImpl.class) {
//                if (instance == null) {
//                    instance = new ConnectionPoolImpl(maxConnections);
//                }
//            }
//        }
//        return instance;
//    }
//
//    public static void resetInstance() {
//        instance = null;
//    }
//
//    @Override
//    public void initializePool() {
//        for (int i = 0; i < maxConnections; i++) {
//            connections.add(new DatabaseConnection()); // Assuming DatabaseConnection class exists
//            availableConnections.add(true);
//        }
//    }
//
//    @Override
//    public Connection getConnection() {
//        for (int i = 0; i < maxConnections; i++) {
//            if (availableConnections.get(i)) {
//                availableConnections.set(i, false);
//                return connections.get(i);
//            }
//        }
//        return null; // or throw an exception if all connections are in use
//    }
//
//    @Override
//    public void releaseConnection(DatabaseConnection connection) {
//
//    }
//
//    @Override
//    public void releaseConnection(Connection connection) {
//        int index = connections.indexOf(connection);
//        if (index != -1) {
//            availableConnections.set(index, true);
//        }
//    }
//
//    @Override
//    public int getAvailableConnectionsCount() {
//        int count = 0;
//        for (boolean available : availableConnections) {
//            if (available) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    @Override
//    public int getTotalConnectionsCount() {
//        return connections.size();
//    }
//}
