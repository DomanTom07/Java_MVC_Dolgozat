/*
File: MainFrame.java
Author: Tamás Domán
Copyright: 2022, Tamás Domán
Group: Szoft I N
Date: 2022-06-14
Github: https://github.com/DomanTom07/
Licenc: GNU GPL
*/

package views;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    JPanel mainPanel;
    public MainFrame() {
        setMainComponent();
        setMainPanel();
        setMainFrame();
    }
    private void setMainComponent() {
        
    }
    private void setMainPanel() {
        mainPanel = new JPanel();
    }
    private void setMainFrame() {
        this.add(mainPanel);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        this.setVisible(true);
    }
}
