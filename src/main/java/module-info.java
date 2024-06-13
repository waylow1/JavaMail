module fr.javamail{
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.api.client;
    requires com.google.api.services.gmail;
    requires google.api.client;
    requires com.google.api.client.json.gson;
    requires com.google.api.client.auth;
    requires com.google.api.client.extensions.jetty.auth;
    requires com.google.api.client.extensions.java6.auth;

    opens fr.javamail.scripts to javafx.fxml;
    opens fr.javamail.controllers;
    exports fr.javamail.scripts;
    exports fr.javamail.controllers;
}
