package com.example.lab1sigov;

import com.example.lab1sigov.Model.ASCII_convert;
import com.example.lab1sigov.Model.Convert_systemNumber;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public TextField textField_ch;
    public ChoiceBox comboBox1;
    public ChoiceBox comboBox2;
    public TextField textField_ch1;
    public Label textLabel1;
    public ChoiceBox comboBox2_1;
    public TextField textField_ch2_1;
    public ChoiceBox comboBox2_2;
    public TextField textField_ch2_2;
    @FXML
    private Label textLabel;

    @FXML
    protected void ConvertButtonClick() {
        try
        {
            String a = textField_ch.getText();

            int sch1 = (int) comboBox1.getValue();
            int sch2 = (int) comboBox2.getValue();


            Convert_systemNumber convert = new Convert_systemNumber(a, sch1, sch2);
            textField_ch1.setText(convert.convert());
        }
        catch (Throwable _)
        {
            textLabel.setText("Неверный формат ввода!");
        }

    }

    public void SwitchButton(ActionEvent actionEvent) {
        String temp = (String) comboBox1.getValue();
        comboBox1.setValue(comboBox2.getValue());
        comboBox2.setValue(temp);

        temp = (String) comboBox2_1.getValue();
        comboBox2_1.setValue(comboBox2_2.getValue());
        comboBox2_2.setValue(temp);
    }

    public void ConvertButtonClick2(ActionEvent actionEvent) {
        try {
            String a = textField_ch2_1.getText();

            String sch1 = (String) comboBox2_1.getValue();
            String sch2 = (String) comboBox2_2.getValue();

            ASCII_convert convert = new ASCII_convert(a);

            String res = convert.convert(sch1, sch2); // 1000001 == A, 48 65 6C 6C 6F, 72 101 108 108 111, 01000001 01000010
            if (res == "") textLabel1.setText("Неверный формат ввода!");
            textField_ch2_2.setText(res);
        }
        catch (Throwable _)
        {
            textLabel1.setText("Неверный формат ввода!");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox1.getItems().addAll(2, 8, 10, 16);
        comboBox2.getItems().addAll(2, 8, 10, 16);
        comboBox2_1.getItems().addAll("ASCII", "String", "Hex", "Binary");
        comboBox2_2.getItems().addAll("ASCII", "String", "Hex", "Binary");
        textLabel.setText("Конвертация чисел");
    }
}