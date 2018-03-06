package no.hiof.olawp.oblig4.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import no.hiof.olawp.oblig4.MainJavaFX;


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


    public static MainJavaFX mainJavaFXApplication;

    @FXML
    public void initialize() {

    }
    @FXML
    private void editFilm(ActionEvent actionEvent){
        
    }




    @FXML
    private void cancelFilm(ActionEvent actionEvent){
        stage.close();
    }


    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
