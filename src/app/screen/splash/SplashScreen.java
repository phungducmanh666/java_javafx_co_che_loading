package app.screen.splash;

import app.screen.Screen;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


// màn hình loading có một progresbar ở giữa màn hình
public class SplashScreen extends Screen {

    ProgressBar progressBar;
    BorderPane layout;
    
    public SplashScreen(){
        progressBar = new ProgressBar();
        layout = new BorderPane();
        paint();
    }

    @Override
    public void paint() {
        layout.setCenter(progressBar);
    }

    @Override
    public void loadPaint() {
    }

    @Override
    public Pane getLayout() {
        return this.layout;
    }

}
