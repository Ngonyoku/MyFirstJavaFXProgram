package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Scene scene1, scene2;
    HBox l1;
    VBox l2;

    @Override
    public void start(Stage stage) throws Exception {
        l1 = new HBox(10);
        l2 = new VBox(10);

        Label label1 = new Label();
        Label label2 = new Label();
        label1.setText("First Scene");
        label2.setText("Second Scene");
        Button next = new Button("NEXT");
        Button prev = new Button("PREV");

        l1.getChildren().addAll(label1, next);
        l2.getChildren().addAll(label2, prev);
        scene1 = new Scene(l1, 250, 250);
        scene2 = new Scene(l2, 300, 300);
        next.setOnAction(
                event -> stage.setScene(scene2)
        );
        prev.setOnAction(
                event -> stage.setScene(scene1)
        );

        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);//Sets Up everything and then Calls the stage() method
    }
}