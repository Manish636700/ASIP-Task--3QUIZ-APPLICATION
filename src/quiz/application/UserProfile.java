/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application;

/**
 *
 * @author mitta
 */
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class UserProfile {

    JFrame f;
    JPanel panel,top_panel;
    JLabel l = new JLabel();

    UserProfile(String Username) {
        f = new JFrame();
        panel = new JPanel();
        top_panel = new JPanel();
        l.setText("Welcome to Quiz World , " + Username);
        JButton b1 = new JButton("NORTH");;
        JButton b2 = new JButton("SOUTH");;
        JButton b3 = new JButton("EAST");;
        JButton b4 = new JButton("WEST");;
        JButton b5 = new JButton("Take Quiz");
        b5.setBounds(200, 200, 150, 30);
       // b1.setBounds(900,0,40,80);
        l.setBounds(500, 50, 200, 30);
        panel.add(b5);
        
        panel.add(l);
        top_panel.add(b1);
        panel.setLayout(null);
        top_panel.setLayout(null);
        f.add(top_panel, BorderLayout.NORTH);
        //f.add(b2, BorderLayout.SOUTH);
       // f.add(b3, BorderLayout.EAST);
       // f.add(b4, BorderLayout.WEST);
        f.add(panel, BorderLayout.CENTER);
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Test(Username);
                f.setVisible(false);
            }

        });
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setTitle("Welcome " +Username);
        f.setSize(300, 300);
        f.setVisible(true);
    }
}