package travel.management.system;

import java.awt.Color;
import javax.swing.*;

public class AddCustomer extends JFrame{
    
    JLabel labelusername;
    
    AddCustomer() {
        setBounds(450, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel lblusername = new JLabel("username");
        lblusername.setBounds(30, 50, 150, 25);
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(220, 50, 150, 25);
        add(labelusername);
        
        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30, 90, 150, 25);
        add(lblid);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new AddCustomer();
    }
}
