package quiz.application;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton rules, back;
    JTextField tfname;
    
    public Login() {
        getContentPane().setBackground(Color.white);
        
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0, 600, 500);
        add(image);
        
       JLabel heading = new JLabel("QUIZ APPLICATION MADE BY CHETAN");
       heading.setBounds(700, 60, 520, 100);
       heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 24));
       heading.setForeground(new Color (30,144,254));
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name");
       name.setBounds(820, 170, 300, 20);
       name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
       name.setForeground(new Color (30,144,254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(745, 230, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
                
        rules =new JButton("Game Rules/ Next");
        rules.setBounds(735,300,150,25);
        rules.setBackground(new Color (30,144,254));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);
           
        back =new JButton("Go Back");
        back.setBounds(930,300,150,25);
        back.setBackground(new Color (30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        
        setTitle("Quiz Application - Login");
        setSize(1200, 500);      // (length , width)
        setLocation(200,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() ==rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
            
        }else if (ae.getSource() == back){
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }

    
}
