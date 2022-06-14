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

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    public MainController() {
        mainFrame = new MainFrame();
        mainModel = new MainModel();
    }
    
}
