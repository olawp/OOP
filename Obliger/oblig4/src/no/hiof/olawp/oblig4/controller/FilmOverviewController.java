package no.hiof.olawp.oblig4.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import no.hiof.olawp.oblig4.MainJavaFX;
import no.hiof.olawp.oblig4.model.Film;

public class FilmOverviewController {
    @FXML
    private Label filmTitle;
    @FXML
    private TextArea filmDescription;
    @FXML
    private TextField filmReleaseDate;
    @FXML
    private TextField filmRuntime;
    @FXML
    private ListView<Film> filmListView;

    private Stage stage;
    private Film pickedFilm;
    private int filmIndex = 0;
    private MainJavaFX mainJavaFX;

    @FXML
    public void initialize(){

        ObservableList<Film> filmObservableList = mainJavaFX.getAllFilms();

        if (filmIndex < filmObservableList.size()) {

            filmListView.setItems(MainJavaFX.mainJavaFXApplication.getAllFilms());
            filmListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Film>() {
                @Override
                public void changed(ObservableValue<? extends Film> observable, Film oldFilm, Film newFilm) {
                    System.out.println(newFilm);
                }
            });

            Film aFilm = filmObservableList.get(filmIndex);

            filmInfo(aFilm);

        }
    }

    private void filmInfo(Film aFilm){
        if (aFilm != null){
            filmTitle.setText(aFilm.getTitle());
            filmDescription.setText(aFilm.getDescription());
            filmReleaseDate.setText(aFilm.getReleaseDate().toString());
            filmRuntime.setText(String.valueOf(aFilm.getRuntime()));
        }
    }

    @FXML
    public void setFilmAndQuit(ActionEvent actionEvent){
        pickedFilm = filmListView.getSelectionModel().getSelectedItem();
        stage.close();
    }

    public void setStage(Stage stage){
        this.stage = stage;
    }
}
