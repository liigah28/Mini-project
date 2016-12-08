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
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

public class Conversation extends javax.swing.JFrame {
    private class Message {
    String name;
    String message;
    String time;
    String date;
    
    public Message(String name, String message, String time, String date){
        this.name = name;
        this.message = message;
        this.time = time;
        this.date = date;
    }
    }
    private JTextField userText;
    private JTextArea chatWindow;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private ServerSocket server;
    private Socket connection;   
    private String accountName;
    
    ArrayList<Message> messages = new ArrayList<Message>();
    
     
    //constructor
    //public Conversation(String name){
    public Conversation(){
        System.out.println("Here");
        //accountName = name;
        userText = new JtextField();
        userText.setEditable(false); //doesnt allow the user to type anything in the textbox if there is no one online
        userText.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent event){ //to open a textbox and send message
                        //sendMessage(event.getActionCommand()); //sends the message we typed to the chat area above
                        userText.setText(""); //deletes the sent message from the textbox so that its empty again
                    }
                }
        );
        add(userText, BorderLayout.NORTH); /*A border layout lays out a container,
        arranging and resizing its components to fit in five regions: north, south, east, west, 
        and center. Each region may contain no more than one component*/
        chatWindow = new JTextArea(); //new local variable
        Component ChatWindow = null; //initialize ChatWindow
        add(new JScrollPane(ChatWindow));
        setSize(300,150); //width, height
        boolean setVisible = true; //makes it visible
        
    
    }

    public void sendMessage(){
        Date dateObj = new Date();
        String datetime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault()).format(dateObj);
        String[] split = datetime.split(" ");
        String time = split[1];
        String date = split[0];
        Message message = new Message(accountName, "ccccc", time, date);
        System.out.print(message);
        messages.add(message);    
    }

    private static class JtextField extends JTextField {  //JTextField class here, so we can use it above
        public JtextField() {}
    }
    
    
    public static void main(String[] argv){
        Conversation conversation = new Conversation();
    }
}
