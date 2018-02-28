package no.hiof.olawp.oblig4;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import no.hiof.olawp.oblig4.model.Film;

import java.util.Date;

public class MainJavaFX extends Application {

    private ObservableList<Film>allFilms;
    private Stage primaryStage;
    public static MainJavaFX mainJavaFXApplication;

    public MainJavaFX(){
        allFilms.add(new Film("Superman",69,"A movie about a great guy.",new Date(1969,5,11)));
        allFilms.add(new Film("Batman: Extended Edition",420,"Bat dude does bat things. ",new Date(2008,7,17)));
        allFilms.add(new Film("Interstellar",120,"A movie about space and stuff.",new Date(2011,6,3)));
        allFilms.add(new Film("Fight Club",111,"A movie about some great guys fighting.",new Date(1980,8,29)));
        allFilms.add(new Film("Memento",85,"A movie about four polarbears doing acid during a sick rave in Amsterdam",new Date(1929,1,9)));

        mainJavaFXApplication = this;
    }

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws  Exception {
        FXMLLoader fxmlInnlaster = new FXMLLoader();
        fxmlInnlaster.setLocation(getClass().getResource("view/FilmOversikt.fxml"));

        Parent hovedLayout = fxmlInnlaster.load();

        Scene hovedScene = new Scene(hovedLayout,800,600);
        primaryStage.setScene(hovedScene);
        primaryStage.setTitle("Alle er homo bortsett fra meg");
        primaryStage.show();
    }

    public ObservableList<Film> getAllFilms() {
        return allFilms;
    }

    public void setAllFilms(ObservableList<Film> allFilms) {
        this.allFilms = allFilms;
    }
}
