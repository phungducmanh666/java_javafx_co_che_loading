package app;

import app.screen.Screen;
import app.screen.home.HomeScreen;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        changeScreen(primaryStage, new HomeScreen());
    }

    public void changeScreen(Stage stage, Screen screen){
        Scene scene = new Scene(screen.getLayout(), 700, 500);
        stage.setScene(scene);
        stage.show();
    }

}
