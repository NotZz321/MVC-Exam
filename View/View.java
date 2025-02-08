package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class View {
    JFrame  frame;
    JPanel panel;
    int screenWidth = 1280;
    int screenHeight = 720;
    JTextField input;
    JLabel labelEnter;
    JLabel status;
    JTextArea storage;
    public ActionListener submitListener;

    public View(){
        frame = new JFrame("View");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(screenWidth, screenHeight));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        addContent();
    }

    private void addContent(){
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(screenWidth, screenHeight));
        panel.setBounds(0,0, screenWidth, screenHeight);;
        panel.setLayout(null);
        panel.setBackground(Color.white);



        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        View v = new View();
    }
}
