/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

import java.awt.Image;

/**
 *
 * @author Liigah
 */
public class Student extends Account {
    String description;
    String education;
    String interest;
    String nationality;
    Image img;
    int age;
   
    
    public Student (String name, String email){
        super (name, email);
        
    }
}
