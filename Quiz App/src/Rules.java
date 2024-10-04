import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton Start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading = new JLabel(" Welcome " + name + " To Simple Mindes ");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 243));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16)); // Fixed the font name here
        rules.setText(
            "<html>"
            + "1. You have 5 minutes to answer 10 questions.<br><br>"
            + "2. Each question has 4 options, choose the correct one.<br><br>"
            + "3. No negative marking for incorrect answers.<br><br>"
            + "4. Click 'Submit' once you are done."
            + "</html>");
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 25);
        back.setBackground(new Color(30, 144, 243));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        Start = new JButton("Start");
        Start.setBounds(400, 500, 100, 25);
        Start.setBackground(new Color(30, 144, 243));
        Start.setForeground(Color.WHITE);
        Start.addActionListener(this);
        add(Start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Start) {
            new Quiz(name); // Pass the name to the Quiz constructor
            setVisible(false); // Hide the Rules frame
        } else if (ae.getSource() == back) {
            setVisible(false); // Hide the Rules frame
            new Login(); // Navigate back to the Login frame
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
