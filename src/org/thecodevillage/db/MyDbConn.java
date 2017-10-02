package org.thecodevillage.db;

import java.sql.*;

/**
 * Created by Elkibet on 9/29/2017.
 */



class MyDbConn{



    public static void main(String args[]){
        try{
            Connection con= getDbConnection("jdbc:mysql://localhost:3306/student_db","root","");
            Statement stmt=con.createStatement();
//            PreparedStatement preparedStatement = con.prepareStatement("sql")
            ResultSet rs=stmt.executeQuery("select * from tbl_students;");
            while(rs.next())
                System.out.println(rs.getInt("id")+"  "+rs.getString("name"));
            con.close();

        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    /**
     * Allows us to connect to database
     * @param url
     * @param username
     * @param password
     * @return
     */
    public static Connection getDbConnection(String url,String username, String password) {
        Connection con =null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(
                    url,username,password);

        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        return con;
    }


}