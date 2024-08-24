package app.screen.splash;

import app.screen.Screen;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


// màn hình loading có một progresbar ở giữa màn hình
// màn hình này giả sử là không có tác vụ không đồng bộ nên không bao giờ cần vẽ màn hình loading cho nó nên
// hàm loadPaint để trống
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

    // phải ghi đè lại hàm getlayout trả m
    @Override
    public Pane getLayout() {
        return this.layout;
    }

}
