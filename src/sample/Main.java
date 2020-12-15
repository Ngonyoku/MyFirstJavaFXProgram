package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("My New Window");
        stage.show();//
    }

    public static void main(String[] args) {
        launch(args);//Sets Up everything
    }
}