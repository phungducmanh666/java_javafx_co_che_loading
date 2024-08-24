package app.screen.home;

import app.screen.Screen;
import app.screen.splash.SplashScreen;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

// màn hình có buttn load kế thừa từ lớp Screen
public class HomeScreen extends Screen {

    // có layout để vẽ các component lên đây
    BorderPane layout;

    Button btnLoad;

    public HomeScreen(){
        // gọi hàm tạo của lớp cha (Screen) để lắng nghe sự thay đổi của biến loading
        super();

        // khởi tạo đối tượng trong lớp
        layout = new BorderPane();
        btnLoad = new Button("load");

        // thêm sự kiện khi nhấn button load
        btnLoad.setOnMouseClicked(e -> {
            // đầu tiên là thay đổi text của button
            btnLoad.setText("changed");
            // thay đổi biến loading để gọi hàm loadPaint() trong hàm này sẽ cài logic để vẽ màn hình loading
            setLoading(true);
            // giả sử tác vụ không đồng bộ bằng cách tạo một luồng mới sau 3s thì set lại biến loading là false để gọi hàm paint() thay vì loadPaint()
            Thread t = new Thread(){
                @Override
                public void run(){
                    try {
                        Thread.sleep(3000);                        
                    } catch (Exception e) {
                    }
                    // các lệnh thay đổi một giá trị trong fx phải được gọi trong callback của hàm runLater
                    Platform.runLater(() -> {
                        setLoading(false);
                    });
                }
            };
            t.start();
        });

        // set màn hình loading
        setLoadingScreen(new SplashScreen());
        paint();
    }

    @Override
    public void paint() {
        // làm mới layout
        layout.getChildren().clear();
        // vẽ button lên layout
        layout.setCenter(btnLoad);
    }

    @Override
    public void loadPaint() {
        // làm mới layout
        layout.getChildren().clear();
        // vẽ màn hình loading vào layout
        layout.setCenter(getLoadingScreen().getLayout());
    }

    @Override
    public Pane getLayout() {
        return this.layout;
    }
}
