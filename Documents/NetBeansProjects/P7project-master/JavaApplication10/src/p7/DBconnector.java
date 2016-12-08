/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class DBconnector {

    //static final String HOST = "jdbc:mysql://localhost/p7";
    static final String HOST = "jdbc:mysql://localhost/p7";
    static final String PASSWORD = "";
    static final String USER = "root";
    Connection con;

    private static DBconnector DB;

    DBconnector() {
        try {
            String url;

            con = DriverManager.getConnection(HOST, USER, PASSWORD);

            /* Statement stat = con.createStatement();
            ResultSet result = stat.executeQuery("select * from users");
            while (result.next()) {
                System.out.println(result.getString("name"));

            }*/
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }

    public static synchronized DBconnector getDB() { //Singleton pattern - makes sure that only one connection to DB is used
        if (DB == null) {
            DB = new DBconnector();
        }

        return DB;
    }

    public ArrayList<Student> getUsers() {
        ArrayList<Student> users = new ArrayList<Student>();
        try {
            Statement stat = con.createStatement();
            Statement stat2 = con.createStatement();
            ResultSet result = stat.executeQuery("select * from users");
            while (result.next()) {
                System.out.println(result.getString("name"));
                String id = result.getString("id");
                ArrayList<Integer> interests = new ArrayList<Integer>();
                ResultSet result2 = stat2.executeQuery("select * from matching where user_id=" + id);
                while (result2.next()) {
                    int interest_id = result2.getInt(3);
                    System.out.println(interest_id);
                    interests.add(interest_id);
                }
                result2.close();
                System.out.println(result.getString("name"));
                users.add(new Student(result.getString("name"), "fakeemail", interests));
            }
            result.close();

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        return users;

    }

    /**
     * Method to check if the user is in the database and be able to log in
     *
     * @param username The user name typed into the form
     * @param password
     * @return Returns null if login is invalid. Returns a Student object if
     * login is valid.
     */
    public Student getLogin(String username, String password, ArrayList<Integer> interests) {
        Student s = null;
        try {
            Statement stat = con.createStatement();
            ResultSet result = stat.executeQuery("select * from accountTable where aauemail="
                    + "\"" + username + "\"" + ";");  //get username

            String checkUser = result.getString("name");
            String checkPass = result.getString("password");
            if (checkUser.equals(username) && checkPass.equals(password)) {
                s = new Student(result.getString("name"), "fakeemail", interests);
            }
            con.close();
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        return s;
    }

}
