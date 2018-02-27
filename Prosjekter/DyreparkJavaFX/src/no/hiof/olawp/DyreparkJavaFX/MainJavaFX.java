package no.hiof.olawp.DyreparkJavaFX;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import no.hiof.olawp.DyreparkJavaFX.model.Dyr;

import java.time.LocalDate;



public class MainJavaFX extends Application {

    private ObservableList<Dyr> listeMedDyr = FXCollections.observableArrayList();
    public static MainJavaFX javaFXApplikasjon;
    private Stage primaryStage;

    public MainJavaFX() {
        listeMedDyr.add(new Dyr("Trine","Grizzly",69, LocalDate.of(2014,4,5)));
        listeMedDyr.add(new Dyr("Joakim","Isbjørn",420, LocalDate.of(2014,4,5)));
        listeMedDyr.add(new Dyr("Karen","Løk",1337, LocalDate.of(2014,4,5)));
        listeMedDyr.add(new Dyr("Per","Dovenedyr",8008, LocalDate.of(2014,4,5)));
        listeMedDyr.add(new Dyr("Johan","Nisse",19, LocalDate.of(2014,4,5)));
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        MainJavaFX.javaFXApplikasjon = this;
        this.primaryStage = primaryStage;
        gaaTilDyreDetaljScene();
    }



    public void gaaTilDyreDetaljScene() throws Exception{
        FXMLLoader fxmlInnlaster = new FXMLLoader();
        fxmlInnlaster.setLocation(getClass().getResource("view/DyreDetalj.fxml"));
        Parent rootNode = fxmlInnlaster.load();

        Scene hovedScene  = new Scene(rootNode);

        primaryStage.setTitle("Dyrepark");
        primaryStage.setScene(hovedScene);
        primaryStage.show();
    }

    public void gaaTilDyreListeScene() throws Exception{
        FXMLLoader fxmlInnlaster = new FXMLLoader();

        fxmlInnlaster.setLocation(getClass().getResource("view/DyreListe.fxml"));
        Parent rootNode = fxmlInnlaster.load();

        Scene listeScene = new Scene(rootNode);

        primaryStage.setTitle("Liste med dyr");
        primaryStage.setScene(listeScene);
    }

    public ObservableList<Dyr> getListeMedDyr() {
        return listeMedDyr;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
