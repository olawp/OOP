package no.hiof.olawp.oblig5.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import no.hiof.olawp.oblig5.MainJavaFX;
import no.hiof.olawp.oblig5.model.Film;
import no.hiof.olawp.oblig5.model.Production;


public class FilmAddController {
    @FXML
    private TextField filmTitleAdd;
    @FXML
    private TextField filmRuntimeAdd;
    @FXML
    private TextArea filmDescAdd;
    @FXML
    private DatePicker filmReleaseAdd;

    private Stage stage;
    private MainJavaFX mainJavaFX;

    @FXML
    private void cancelFilm(ActionEvent actionEvent){
        stage.close();
    }


    @FXML
    private void addFilm(ActionEvent actionEvent){
        try{
            if (filmTitleAdd.getText().isEmpty())
               MainJavaFX.mainJavaFXApplication.showMessageBox("Type in a title.");
            else if (filmDescAdd.getText().isEmpty())
                MainJavaFX.mainJavaFXApplication.showMessageBox("Please add a description");
            else if (filmReleaseAdd.getValue() == null)
                MainJavaFX.mainJavaFXApplication.showMessageBox("Pick a release date.");
            else if (filmRuntimeAdd.getText().isEmpty())
                MainJavaFX.mainJavaFXApplication.showMessageBox("Type in the movies runtime.");

            if (!filmTitleAdd.getText().isEmpty() && filmDescAdd.getText().isEmpty() && filmReleaseAdd.getValue() != null && filmRuntimeAdd.getText().isEmpty()) {
                Production aFilm = new Film(filmTitleAdd.getText(), Integer.parseInt(filmRuntimeAdd.getText()), filmDescAdd.getText(), filmReleaseAdd.getValue());
                mainJavaFX.mainJavaFXApplication.getAllFilms().add((Film) aFilm);
                stage.close();
            }


        }
        catch (Error e){
            System.out.println(e.getMessage());
        }
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

}
