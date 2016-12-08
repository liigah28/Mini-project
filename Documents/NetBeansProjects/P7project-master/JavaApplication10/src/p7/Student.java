/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author Liigah
 */
public class Student extends Account {

    String description;
    String education;
    ArrayList<Integer> interest;
    String nationality;
    Image img;
    int age;

    public Student(String name, String email, ArrayList<Integer> interests) {
        super(name, email);
        interest = interests;
    }

    public String toString() {
        return "Student: " + name;
    }
}
