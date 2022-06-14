/*
File: MainController.java
Author: Tamás Domán
Copyright: 2022, Tamás Domán
Group: Szoft I N
Date: 2022-06-14
Github: https://github.com/DomanTom07/
Licenc: GNU GPL
*/

package controllers;

import models.MainModel;
import views.MainFrame;

import java.util.Vector;
import models.Position;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;

    Vector<Position> positionVector;

    DefaultComboBoxModel<String> defaultComboBoxModel;
    JComboBox<String> positionComboBox;
    DefaultListModel<String> defaultListModel;

    JButton exitButton;
    JButton emptyButton;
    
    public MainController() {
        mainFrame = new MainFrame();
        mainModel = new MainModel();

        positionVector = mainModel.positionVector;

        positionComboBox = mainFrame.positionComboBox;
        defaultComboBoxModel = mainFrame.defaultComboBoxModel;

        positionVector.forEach(position -> {
            defaultComboBoxModel.addElement(position.name);
        });

        exitButton = mainFrame.exitButton;
        emptyButton = mainFrame.emptyButton;

        setEvents();
    }
    private void handleComboBoxAction() {
        defaultListModel = mainFrame.defaultListModel;
        int index = positionComboBox.getSelectedIndex();

        positionVector.forEach(position -> {
            if (index == position.id) {
                defaultListModel.addElement(position.name);
            }
        });
    }
    private void onClickExit() {
        System.exit(0);
    }
    private void onClickEmpty() {
        defaultListModel.clear();
    }
    private void setEvents() {
        positionComboBox.addActionListener(e -> handleComboBoxAction());
        exitButton.addActionListener(e -> onClickExit());
        emptyButton.addActionListener(e -> onClickEmpty());
    }
}
