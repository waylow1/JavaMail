package fr.javamail.controllers;

import fr.javamail.scripts.GoogleAuthentication;
import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.ResourceBundle;
import javafx.scene.control.MenuItem;

public class MainController implements  Controller{

    protected boolean connectionMenuItemStatus = false;

    @FXML
    MenuItem connectionMenuItem;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        connectionMenuItem.setOnAction(event -> {
            if (!connectionMenuItemStatus) {
                try {
                    // Appel à GoogleAuthentication pour l'authentification
                    GoogleAuthentication.authenticate();
                    System.out.println("Authentication successful!");
                    connectionMenuItemStatus = true;
                } catch (IOException | GeneralSecurityException e) {
                    e.printStackTrace();
                    System.err.println("Authentication failed: " + e.getMessage());
                }
            }
        });
    }


}
