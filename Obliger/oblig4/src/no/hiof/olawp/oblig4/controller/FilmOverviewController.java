package no.hiof.olawp.oblig4.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import no.hiof.olawp.oblig4.Main;
import no.hiof.olawp.oblig4.MainJavaFX;
import no.hiof.olawp.oblig4.model.Film;

public class FilmOverviewController {
    @FXML
    private Button filmBtnNew;
    @FXML
    private Button filmBtnEdit;
    @FXML
    private Button filmBtnDelete;
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
    private MainJavaFX mainJavaFX;
    public ObservableList<Film> filmObservableList = MainJavaFX.mainJavaFXApplication.getAllFilms();


    @FXML
    public void initialize(){


        filmListView.setItems(MainJavaFX.mainJavaFXApplication.getAllFilms());
        filmListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        filmListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Film>() {
            @Override
            public void changed(ObservableValue<? extends Film> observable, Film oldFilm, Film newFilm) {
                filmDescription.setText(newFilm.getDescription());
                filmRuntime.setText(String.valueOf(newFilm.getRuntime()));
                filmReleaseDate.setText(String.valueOf(newFilm.getReleaseDate().getYear()));
                filmTitle.setText(newFilm.getTitle());

            }
        });

        if (!filmListView.getItems().isEmpty()) {
            filmListView.getSelectionModel().select(MainJavaFX.mainJavaFXApplication.selectedItem);
        }
    }

    @FXML
    public void deleteFilm(ActionEvent actionEvent){
        filmListView.getItems().remove(filmListView.getSelectionModel().getSelectedIndex());
    }


    @FXML
    public void goToEditScene(ActionEvent actionEvent){
        MainJavaFX.mainJavaFXApplication.goToEditView();
    }

    public ListView<Film> getFilmListView() {
        return filmListView;
    }
    @FXML
    public void goToAddScene(ActionEvent actionEvent) {
        MainJavaFX.mainJavaFXApplication.goToAddView();

    }
}

