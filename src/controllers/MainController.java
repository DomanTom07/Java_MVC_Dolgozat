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
