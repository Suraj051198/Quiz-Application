import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

    JButton rules, back;
    JTextField tfname; // Store this as a class variable if you want to access it later

    // Constructor
    public Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon("C:/Users/suraj/OneDrive/Desktop/java P/Quiz App/img/login.jpeg");
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        JLabel heading = new JLabel("Simplie Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        heading.setForeground(new Color(30, 144, 243));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 30);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        name.setForeground(new Color(30, 144, 243));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 243));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 243));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(1200, 500);
        setLocation(200, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            setVisible(false);
            String name = tfname.getText();
            new Rules(name);
        }
        else if (ae.getSource() == back) {
            System.out.println("Back button clicked");
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login(); // Anonymous object
    }
}
