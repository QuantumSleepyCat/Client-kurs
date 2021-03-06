package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //primaryStage.initStyle(StageStyle.TRANSPARENT);
        Parent root = FXMLLoader.load(getClass().getResource("aboutFilm.fxml"));
        primaryStage.setScene(new Scene(root, 488, 356));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
