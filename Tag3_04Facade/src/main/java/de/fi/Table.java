package de.fi;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

// Zeile muss mehrfach lesbar sein
public class Table implements AutoCloseable {


    private final String CONNECTION_STRING = "jdbc:h2:c:/tmp/db/integrata;AUTO_SERVER=TRUE";
    private final String selectString;
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    private ResultSetMetaData resultSetMetaData = null;
    private Map<String, String> zeile = null;
    private int columnCount = -1;

    public Table(final String selectString) {
        this.selectString = selectString;
    }

    public String getColumnName(int i) throws Exception{
        return getResultSetMetaData().getColumnName(i+1);
    }

    public String getColumnValue(int column) throws Exception {
        return getColumnValue(getColumnName(column));
    }

    public String getColumnValue(String name) throws Exception {
        return getZeile().get(name);
    }

    public boolean next() throws Exception {

        if (resultSet.next()) {
            exchangeData();
            return true;
        }
        return false;
    }

    private void exchangeData() throws Exception {
        for (int column = 0; column < getColumnCount(); column++) {
            getZeile().put(getColumnName(column), getResultSet().getString(getColumnName(column)));
        }
    }

    @Override
    public void close() throws Exception {
        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
        if (connection != null) connection.close();
    }

    private Connection getConnection() throws Exception {
        if (connection == null) {
            connection = DriverManager.getConnection(CONNECTION_STRING, "sa", "");
        }
        return connection;
    }

    private Statement getStatement() throws Exception {
        if (statement == null) {
            statement = getConnection().createStatement();
        }
        return statement;
    }

    private ResultSet getResultSet() throws Exception {
        if (resultSet == null) {
            resultSet = getStatement().executeQuery(selectString);
        }
        return resultSet;
    }

    private ResultSetMetaData getResultSetMetaData() throws Exception {
        if (resultSetMetaData == null) {
            resultSetMetaData = getResultSet().getMetaData();
        }

        return resultSetMetaData;
    }

    private Map<String, String> getZeile() {
        if (zeile == null) {
            zeile = new HashMap<>();
        }
        return zeile;
    }

    public int getColumnCount() throws Exception {
        if (columnCount == -1) {
            columnCount = getResultSetMetaData().getColumnCount();
        }
        return columnCount;
    }
}

