package no.hiof.olawp.javafxtest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application{

    Stage window;
    Scene scene1,scene2;

    public static void main(String[] args) {
	    launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        Label label = new Label("Welcom to the first scene!");
        Button button = new Button("Kill Bill 3 : The Karening");
        button.setOnAction(e -> window.setScene(scene2));

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label,button);
        scene1 = new Scene(layout, 200, 200);

        Button button2 = new Button("Karen sucks, watch Kill Bill 2 instead");
        button2.setOnAction(e -> window.setScene(scene1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2,1200,500);

        window.setScene(scene1);
        window.setTitle("Kroken på døra");
        window.show();
    }
}
