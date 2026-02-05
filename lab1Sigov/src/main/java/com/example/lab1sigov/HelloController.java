package com.example.lab1sigov;

import com.example.lab1sigov.Model.Convert_systemNumber;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public TextField textField_ch;
    @FXML
    private Label textLabel;

    @FXML
    protected void onHelloButtonClick() {
        try
        {
            int a = Integer.parseInt(textField_ch.getText());
            Convert_systemNumber convert = new Convert_systemNumber(a);
            textLabel.setText(convert.convertDV());
        }
        catch (Throwable _)
        {
            textLabel.setText("Неверный формат ввода!");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        textLabel.setText("Конвертация чисел");
    }
}