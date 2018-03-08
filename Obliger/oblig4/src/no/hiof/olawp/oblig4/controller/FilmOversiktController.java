package no.hiof.olawp.oblig4.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import no.hiof.olawp.oblig4.MainJavaFX;
import no.hiof.olawp.oblig4.model.Film;

public class FilmOversiktController {
    @FXML
    private ListView <Film> ListView;


    @FXML
    public void initialize(){
        ListView.setItems(MainJavaFX.mainJavaFXApplication.getAllFilms());
    }
}
