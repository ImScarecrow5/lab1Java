module com.example.lab1sigov {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jdi;


    opens com.example.lab1sigov to javafx.fxml;
    exports com.example.lab1sigov;
}