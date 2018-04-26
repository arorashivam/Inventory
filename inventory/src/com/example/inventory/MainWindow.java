package com.example.inventory;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends Frame implements ActionListener{
    TextField tf;
    Label l1;
    Panel panel = new Panel();
    Font font = new Font("Verdana", Font.PLAIN, 16);
    MainWindow() {

        // Setting the TextField
        tf = new TextField();
        tf.setBounds(60,50,170,20);

        // Setting the Button
        Button b = new Button("click me");
        b.setBounds(300,100,80,30);

        // Setting the Panel
        panel.setBounds(5, 50, 100, 400);
        panel.setBackground(Color.gray);

        // Setting the Label
        l1 = new Label("New India Plywood and Hardware", SwingConstants.CENTER);
        l1.setBounds(300,15,280,30);
        l1.setFont(font);

        //Registering Listener
        b.addActionListener(this);

        // Setting and Adding Components in the Frame MainWindow
        setSize(800,600);
        add(l1);
        add(panel);
        add(b);
        add(tf);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        tf.setText("Hello World !");
    }
}
