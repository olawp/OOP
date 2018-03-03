package no.hiof.olawp.oblig4.controller;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FilmEditController {
    @FXML
    private DatePicker filmReleaseEdit;
    @FXML
    private TextField filmTitleEdit;
    @FXML
    private TextField filmRuntimeEdit;
    @FXML
    private TextArea filmDescEdit;
    @FXML
    private Stage stage;

    @FXML
    public void initialize(){

    }


    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
