package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("NGONYOKU");//Set The Title of the Window

        StackPane layout = new StackPane();//Set the layout
        Scene scene = new Scene(layout, 600, 500); //Initialize the Scene
        stage.setScene(scene);//Set the Scene
        stage.show();//Display Everything
    }

    public static void main(String[] args) {
        launch(args);//Sets Up everything and then Calls the stage() method
    }
}