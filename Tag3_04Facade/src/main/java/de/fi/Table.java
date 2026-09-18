package de.fi;

// Zeile muss mehrfach lesbar sein
public class Table implements AutoCloseable{

    public Table(final String selectString){

    }


    public long getColumnCount() throws Exception{
        return 0;
    }

    // 0 basiert
    public String getColumnName(final int column) throws Exception{
        return null;
    }

    // 0 basiert
    public String getColumnValue(final int column) throws Exception{
        return null;
    }

    public String getColumnValue(final String columnName) throws Exception{
        return null;
    }

    public boolean next() throws Exception{
        return false;
    }


    @Override
    public void close() throws Exception {

    }
}
