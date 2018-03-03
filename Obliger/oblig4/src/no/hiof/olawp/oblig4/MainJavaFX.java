package no.hiof.olawp.oblig4;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Modality;
import javafx.stage.Stage;
import no.hiof.olawp.oblig4.controller.FilmEditController;
import no.hiof.olawp.oblig4.model.Film;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

public class MainJavaFX extends Application {

    private ObservableList<Film> allFilms = FXCollections.observableArrayList();
    private Stage primaryStage;
    public static MainJavaFX mainJavaFXApplication;

    public MainJavaFX(){
        allFilms.add(new Film("Superman",69,"A movie about a super guy.", LocalDate.of(2011,9,11)));
        allFilms.add(new Film("Batman: Extended edition",420,"A movie about a super guy that likes bats.",LocalDate.of(1969,11,14)));
        allFilms.add(new Film("Olaman: Super extended edition",1337,"A movie about a super guy named Ola.",LocalDate.of(2003,4,23)));
        allFilms.add(new Film("Polarbearman",69,"A movie about a super polarbear that also is a dude.",LocalDate.of(1975,6,11)));

        mainJavaFXApplication = this;
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        goToPrimaryView();

    }

    public void goToPrimaryView(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("view/FilmOverview.fxml"));
            Parent mainLayout = fxmlLoader.load();

            Scene mainScene = new Scene(mainLayout, 800, 600);
            primaryStage.setScene(mainScene);
            primaryStage.setTitle("Movie overview");
            primaryStage.setResizable(false);
            primaryStage.centerOnScreen();
            primaryStage.show();
        }
        catch (IOException ioe){
            showMessageBox(ioe.getMessage());
        }
    }

    public void goToEditView(){
        try{
            Stage editStage = new Stage();

            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("view/FilmEdit.fxml"));
            Parent editLayout = fxmlLoader.load();

            FilmEditController filmEditController = fxmlLoader.getController();
            filmEditController.setStage(editStage);
            Scene editScene = new Scene(editLayout,600,400);

            editStage.initModality(Modality.APPLICATION_MODAL);
            editStage.initOwner(primaryStage);

            editStage.setScene(editScene);
            editStage.setTitle("Edit movie");
            editStage.setResizable(false);
            editStage.centerOnScreen();
            editStage.showAndWait();
        }
        catch (IOException ioe){
            showMessageBox("I/0 error: " + ioe.getMessage());
        }
        catch (IllegalStateException exc) {
            showMessageBox("Some error occured: " + exc.getMessage());
            System.err.println(exc);

        }
    }


    private void showMessageBox(String message){
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setTitle("Error during loading of GUI.");
        errorAlert.setHeaderText(null);
        errorAlert.setContentText(message);
        errorAlert.show();
    }

    public ObservableList<Film> getAllFilms() {
        return allFilms;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
