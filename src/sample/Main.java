package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button openDialogBtn = new Button("Open Dialog");
        openDialogBtn.setOnAction(
                event -> {
                    AlertDialogBox dialogBox = new AlertDialogBox("My Window", "Just some message");
                    dialogBox.setPositiveButton("YES", e -> System.out.println("I have been Clicked!"));
                    dialogBox.show();
                }
        );

        StackPane layout = new StackPane();
        layout.getChildren().add(openDialogBtn);

        Scene scene = new Scene(layout, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);//Sets Up everything and then Calls the stage() method
    }
}