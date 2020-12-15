package sample;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertDialogBox {

    private Stage dialogBox;
    private Label label;
    private Button positiveBtn;
    private Button negativeBtn;

    private void init() {
        dialogBox = new Stage();
        positiveBtn = new Button("OK");
        negativeBtn = new Button("CANCEL");
        label = new Label();
        dialogBox.initModality(Modality.APPLICATION_MODAL);//Blocks User Interaction with any other window
        negativeBtn.setOnAction(
                e -> dialogBox.close()
        );
    }

    public AlertDialogBox() {
        init();
    }

    public AlertDialogBox(String title) {
        init();
        dialogBox.setTitle(title);
    }

    public AlertDialogBox(String title, String message) {
        init();
        dialogBox.setTitle(title);
        label.setText(message);
    }

    public void setWindowTitle(String title) {
        dialogBox.setTitle(title);
    }

    public void setMessage(String message) {
        label.setText(message);
    }

    public void setPositiveButton(String buttonLabel, EventHandler eventHandler) {
        positiveBtn = new Button(buttonLabel);
        positiveBtn.setOnAction(eventHandler);
    }

    public void setNegativeButton(String buttonLabel, EventHandler eventHandler) {
        negativeBtn = new Button(buttonLabel);
        negativeBtn.setOnAction(eventHandler);
        dialogBox.close();
    }

    public void show() {
        HBox layout = new HBox(20);
        layout.getChildren().addAll(label, positiveBtn, negativeBtn);
        Scene scene = new Scene(layout, 250, 250);
        dialogBox.setScene(scene);
        dialogBox.showAndWait();
    }
}
