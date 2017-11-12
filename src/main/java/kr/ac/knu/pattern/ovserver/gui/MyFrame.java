package kr.ac.knu.pattern.ovserver.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by rokim on 2017. 5. 28..
 */
public class MyFrame extends JFrame {
    private JFrame mainFrame;
    private JPanel panel;

    public void init() {
        mainFrame = new JFrame("Title");
        mainFrame.setSize(640, 480);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.CYAN);
        mainFrame.add(panel);

        JButton button = new JButton();
        button.setText("CLICK");
        panel.add(button);

        mainFrame.setVisible(true);
    }

    public class LabelGenerator implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JLabel label = new JLabel("라벨");
            panel.add(label);
            panel.revalidate();
            panel.repaint();
        }
    }
}
