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

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {
    JPanel mainPanel;

    public DefaultComboBoxModel<String> defaultComboBoxModel;
    public JComboBox<String> positionComboBox;

    public DefaultListModel<String> defaultListModel;
    public JList<String> positionList;
    JScrollPane scrollPane;

    public JButton exitButton;
    public JButton emptyButton;
    JPanel buttonPanel;

    public MainFrame() {
        setMainComponent();
        setMainPanel();
        setMainFrame();
    }
    private void setMainComponent() {
        defaultComboBoxModel = new DefaultComboBoxModel<>();
        positionComboBox = new JComboBox<>(defaultComboBoxModel);    
        defaultComboBoxModel.addElement("Válasszon beosztást...");    
        defaultListModel = new DefaultListModel<>();
        positionList = new JList<>(defaultListModel);
        scrollPane = new JScrollPane(positionList);

        exitButton = new JButton("Kilépés");
        emptyButton = new JButton("Ürítés");
    }
    private void setButtonPanel() {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(emptyButton);
        buttonPanel.add(exitButton);
    }
    private void setMainPanel() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout()); 
        mainPanel.add(positionComboBox, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        setButtonPanel();
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        this.add(mainPanel);
    }
    private void setMainFrame() {
        this.add(mainPanel);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
        this.setTitle("Tamás Domán");
    }
}
