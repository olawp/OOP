package no.hiof.olawp.oblig5.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;
import no.hiof.olawp.oblig5.FileHandler;
import no.hiof.olawp.oblig5.MainJavaFX;
import no.hiof.olawp.oblig5.model.Film;


public class FilmOverviewController {
    @FXML
    private ImageView filmPoster;
    @FXML
    private Button filmBtnEdit;
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



    @FXML
    public void initialize() {
        filmBtnEdit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!filmListView.getItems().isEmpty())
                    MainJavaFX.mainJavaFXApplication.goToEditView();
                else {
                    MainJavaFX.mainJavaFXApplication.showMessageBox("You cant edit a movie when the list is empty");
                }

            }
        });

        filmListView.setItems(MainJavaFX.mainJavaFXApplication.getAllFilms());
        filmListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        filmListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Film>() {
            @Override
            public void changed(ObservableValue<? extends Film> observable, Film oldFilm, Film newFilm) {
                filmDescription.setText(newFilm.getDescription());
                filmRuntime.setText(String.valueOf(newFilm.getRuntime()));
                filmReleaseDate.setText(String.valueOf(newFilm.getReleaseDate().getYear()));
                filmTitle.setText(newFilm.getTitle());
                Image image = new Image("https://image.tmdb.org/t/p/w500" + newFilm.getPosterURL());
                filmPoster.setImage(image);
            }
        });


        if (!filmListView.getItems().isEmpty()) {
            filmListView.getSelectionModel().select(MainJavaFX.mainJavaFXApplication.selectedItem);
        }

        filmListView.setCellFactory(new Callback<ListView<Film>, ListCell<Film>>() {
            @Override
            public ListCell<Film> call(ListView<Film> param) {
                return new FilmCell();
            }
        });

    }

    static class FilmCell extends ListCell<Film> {
        @Override
        protected void updateItem(Film item, boolean empty) {
            super.updateItem(item, empty);
            if (item != null){
                setText(item.getTitle() + " - (" + item.getReleaseDate().getYear() + ")");
            }

        }
    }


    @FXML
    public void deleteFilm(ActionEvent actionEvent){
            if (!filmListView.getItems().isEmpty()) {
                filmListView.getItems().remove(filmListView.getSelectionModel().getSelectedIndex());
            }
            else {
                MainJavaFX.mainJavaFXApplication.showMessageBox("You cant delete an object that does not exist. Lul");
            }
    }


    @FXML
    public void goToAddScene(ActionEvent actionEvent) {
        MainJavaFX.mainJavaFXApplication.goToAddView();

    }

}

