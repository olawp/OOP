package no.hiof.olawp.oblig5;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import no.hiof.olawp.oblig5.controller.FilmAddController;
import no.hiof.olawp.oblig5.controller.FilmEditController;
import no.hiof.olawp.oblig5.model.Film;

import java.io.IOException;
import java.time.LocalDate;

public class MainJavaFX extends Application {

    private ObservableList<Film> allFilms = FXCollections.observableArrayList();
    private Stage primaryStage;
    public static MainJavaFX mainJavaFXApplication;
    public int selectedItem = 0;

    public MainJavaFX(){
        mainJavaFXApplication = this;
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        FileHandler.readFile();
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
            Image applicationIcon = new Image(getClass().getResourceAsStream("olaThinking.png"));
            primaryStage.getIcons().add(applicationIcon);
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
            Image applicationIcon = new Image(getClass().getResourceAsStream("olaThinking.png"));
            editStage.getIcons().add(applicationIcon);
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

    public void goToAddView(){
        try {
            Stage addStage = new Stage();

            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("view/FilmAdd.fxml"));
            Parent addLayout = fxmlLoader.load();

            FilmAddController filmAddController = fxmlLoader.getController();
            filmAddController.setStage(addStage);
            Scene addScene = new Scene(addLayout,600,400);

            addStage.initModality(Modality.APPLICATION_MODAL);
            addStage.initOwner(primaryStage);

            addStage.setScene(addScene);
            addStage.setTitle("Add movie");
            Image applicationIcon = new Image(getClass().getResourceAsStream("olaThinking.png"));
            addStage.getIcons().add(applicationIcon);
            addStage.setResizable(false);
            addStage.centerOnScreen();
            addStage.showAndWait();
        }
        catch (IOException ioe){
            showMessageBox("I/O error: " + ioe.getMessage());
        }
        catch (IllegalStateException exc) {
            showMessageBox("Some error occured: " + exc.getMessage());
            System.err.println(exc);
        }

    }


    public void showMessageBox(String message){
        Alert e = new Alert(Alert.AlertType.ERROR);
        e.setTitle("An error occurred");
        e.setHeaderText(null);
        e.setContentText(message);
        e.show();
    }

    public ObservableList<Film> getAllFilms() {
        return allFilms;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
