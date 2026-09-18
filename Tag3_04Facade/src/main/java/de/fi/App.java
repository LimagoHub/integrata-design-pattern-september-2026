package de.fi;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception    {
        /*try(Connection connection = DriverManager.getConnection("jdbc:h2:c:/tmp/db/integrata;AUTO_SERVER=TRUE", "sa", "")){
            try (Statement statement = connection.createStatement()) {
                try(ResultSet resultSet = statement.executeQuery("SELECT * FROM tbl_personen")) {
                    ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

                    for(int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
                        System.out.printf("%-40s", resultSetMetaData.getColumnName(i));
                    }
                    System.out.println();

                    while(resultSet.next()) {
                        for(int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
                            System.out.printf("%-40s", resultSet.getString(i));
                        }
                        System.out.println();
                    }
                }
            }
        }

         */
        try(Table table = new Table("select * from tbl_personen")){

            for (int i = 0; i < table.getColumnCount(); i++) {
                System.out.printf("%-40s", table.getColumnName(i));
            }
            System.out.println();
            while(table.next()){
                for( int i = 0; i < table.getColumnCount(); i++){
                    System.out.printf("%-40s", table.getColumnValue(i));
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
