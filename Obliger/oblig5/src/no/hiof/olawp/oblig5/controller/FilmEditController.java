package no.hiof.olawp.oblig5.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import no.hiof.olawp.oblig5.MainJavaFX;
import no.hiof.olawp.oblig5.model.Film;

public class FilmEditController {
    @FXML
    private ListView<Film> editListView;
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
    public void initialize() {
        editListView.setItems(MainJavaFX.mainJavaFXApplication.getAllFilms());

        editListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Film>() {
            @Override
            public void changed(ObservableValue<? extends Film> observable, Film oldFilm, Film newFilm) {
                filmDescEdit.setText(newFilm.getDescription());
                filmRuntimeEdit.setText(String.valueOf(newFilm.getRuntime()));
                filmReleaseEdit.setValue(newFilm.getReleaseDate());
                filmTitleEdit.setText(newFilm.getTitle());
            }
        });

        if (!editListView.getItems().isEmpty()) {
            editListView.getSelectionModel().select(MainJavaFX.mainJavaFXApplication.selectedItem);
        }
    }


    @FXML
    private void editFilm(ActionEvent actionEvent){
            if (filmTitleEdit.getText().isEmpty())
                MainJavaFX.mainJavaFXApplication.showMessageBox("Type in a title.");
            else if (filmDescEdit.getText().isEmpty())
                MainJavaFX.mainJavaFXApplication.showMessageBox("Please add a description");
            else if (filmReleaseEdit.getValue() == null)
                MainJavaFX.mainJavaFXApplication.showMessageBox("Pick a release date.");
            else if (filmRuntimeEdit.getText().isEmpty())
                MainJavaFX.mainJavaFXApplication.showMessageBox("Type in the movies runtime.");
            else {
                updateInfo();
                MainJavaFX.mainJavaFXApplication.goToPrimaryView();

                stage.close();
            }

    }


    private void updateInfo(){
        editListView.getSelectionModel().getSelectedItem().setTitle(filmTitleEdit.getText());
        editListView.getSelectionModel().getSelectedItem().setDescription(filmDescEdit.getText());
        editListView.getSelectionModel().getSelectedItem().setRuntime(Integer.parseInt(filmRuntimeEdit.getText()));
        editListView.getSelectionModel().getSelectedItem().setReleaseDate(filmReleaseEdit.getValue());
    }


    @FXML
    private void cancelFilm(ActionEvent actionEvent){
        stage.close();
    }


    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
