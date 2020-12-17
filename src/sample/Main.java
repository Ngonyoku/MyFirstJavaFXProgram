package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Scene scene;
    Stage window;

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setOnCloseRequest(e -> {
            e.consume();
            close();
        });
        Button closeBtn = new Button("CLOSE");
        closeBtn.setOnAction(e -> close());

        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(new Label("Press The Button to close the Window"), closeBtn);

        scene = new Scene(layout, 500, 550);
        window.setScene(scene);
        window.show();
    }

    private void close() {
        AlertDialogBox closeRequest = new AlertDialogBox();
        closeRequest.setWindowTitle("Dangerous Operation");
        closeRequest.setMessage("Are you sure you want to Exit this Application?");
        closeRequest.setPositiveButton("YES", event -> {
            System.out.println("File saved Successfully");
            closeRequest.closeDialog();
            window.close();
        });
        closeRequest.setNegativeButton("NO");
        closeRequest.show();
    }

    public static void main(String[] args) {
        launch(args);//Sets Up everything and then Calls the stage() method
    }
}