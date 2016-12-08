/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

/**
 *
 * @author Liigah
 */
import java.sql.*;
import java.util.ArrayList;

public class P7 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws SQLException {
        // TODO code application logi
        System.out.println("Main method");
        DBconnector dbc = new DBconnector();
        
        ArrayList<Student> students = dbc.getUsers();
        
        for (Student s : students) {
            System.out.println(s);
        }

    }

}
