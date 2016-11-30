/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author Liigah
 */
public class Account {
    String name;
    private String email;
    
    public Account (String name, String email) {
        this.name = name;
        this.email = email;
    }
}
