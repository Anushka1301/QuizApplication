package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener {
    
    JButton rules, back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i2);
        image.setBounds(30, 30, 800,700);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(975, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(Color.pink);
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(990, 160, 300, 30);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        name.setForeground(Color.pink);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(935, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 10));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(955, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(1115, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)  {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[]args)
    {
        new Login();
    }
    
}
