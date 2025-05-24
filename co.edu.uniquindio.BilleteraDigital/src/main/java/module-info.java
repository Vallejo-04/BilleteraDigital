module co.edu.uniquindio.billeteradigital.billeteraapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.uniquindio.billeteradigital.billeteraapp to javafx.fxml;
    exports co.edu.uniquindio.billeteradigital.billeteraapp;
    opens co.edu.uniquindio.billeteradigital.billeteraapp.model to javafx.fxml;
    exports co.edu.uniquindio.billeteradigital.billeteraapp.model;
    opens co.edu.uniquindio.billeteradigital.billeteraapp.ViewController to javafx.fxml;
    exports co.edu.uniquindio.billeteradigital.billeteraapp.ViewController to javafx.fxml;

}