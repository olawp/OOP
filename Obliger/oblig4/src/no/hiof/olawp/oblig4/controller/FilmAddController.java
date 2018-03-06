package no.hiof.olawp.oblig4.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import no.hiof.olawp.oblig4.MainJavaFX;
import no.hiof.olawp.oblig4.model.Film;
import no.hiof.olawp.oblig4.model.Production;


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
    public void initialize(){
    }

    @FXML
    private void cancelFilm(ActionEvent actionEvent){
        stage.close();
    }


    @FXML
    private void addFilm(ActionEvent actionEvent){
        try{
            if (filmTitleAdd.getText().isEmpty())
                throw new Error("Please type in a title.");
            if (filmDescAdd.getText().isEmpty())
                throw new Error("Please type in a small description");
            if (filmReleaseAdd.getValue() == null)
                throw new Error("Pick a relase date");
            if (Integer.parseInt(filmRuntimeAdd.getText()) >= 1000)
                throw new Error("Type in a runtime");

            Production aFilm = new Film(filmTitleAdd.getText(),Integer.parseInt(filmRuntimeAdd.getText()),filmDescAdd.getText(),filmReleaseAdd.getValue());
            mainJavaFX.mainJavaFXApplication.getAllFilms().add((Film) aFilm);
            stage.close();


        }
        catch (Error e){
            System.out.println(e.getMessage());
        }
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

}
