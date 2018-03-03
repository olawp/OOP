package no.hiof.olawp.oblig4.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import no.hiof.olawp.oblig4.Main;
import no.hiof.olawp.oblig4.MainJavaFX;
import no.hiof.olawp.oblig4.model.Film;

//heihei
import java.util.Date;

public class FilmAddController {
    @FXML
    private TextField filmTitleAdd;
    @FXML
    private TextField filmRuntimeAdd;
    @FXML
    private TextArea filmDescAdd;
    @FXML
    private DatePicker filmReleaseAdd;

    private MainJavaFX mainJavaFX;



    @FXML
    public void initialize(){

    }

    @FXML
    private void addFilm(ActionEvent actionEvent){
        Film film = new Film();
        film.setTitle(filmTitleAdd.getText());
        film.setDescription(filmDescAdd.getText());
        film.setReleaseDate(filmReleaseAdd.getValue());
        film.setRuntime(Integer.parseInt(filmRuntimeAdd.getText()));
        mainJavaFX.getAllFilms().add(film);
        filmTitleAdd.clear();
        filmDescAdd.clear();
        filmRuntimeAdd.clear();
        MainJavaFX.mainJavaFXApplication.goToEditView();
    }

}
