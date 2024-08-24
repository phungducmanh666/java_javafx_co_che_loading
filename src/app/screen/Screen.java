package app.screen;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Pane;

// lớp cha của các màn hình
public abstract class Screen {

    // biến để xác định màn hình hiện là bình thường hay màn hình đang tải
    BooleanProperty loading = new SimpleBooleanProperty(false);
    Screen loadingScreen;

    public Screen() {
        // listen biến loading để quyết định gọi hàm vẽ bình thường hay vẽ loading
        loading.addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
                if(arg0.getValue().booleanValue()){
                    // khi biến loading là true gọi hàm vẽ màn hình loading
                    loadPaint();
                }
                else{
                    // khi biến loading là false gọi hàm vẽ bình thường
                    paint();
                }
            }
        });
    }

    public boolean getLoading(){
        return this.loading.get();
    }

    public void setLoading(boolean loading){
        // hàm để đặt trạng thái loading của màn hình
        this.loading.set(loading);
    }

    // hàm được gọi để hiển thị giao diện khi không loading
    public abstract void paint();

    // hàn hiển thị giao diện khi đang tải
    public abstract void loadPaint();

    public void setLoadingScreen(Screen screen){
        // hàm này để set màn hình loading được vẽ khi loading
        this.loadingScreen = screen;
    }

    public Screen getLoadingScreen(){
        return this.loadingScreen;
    }

    public abstract Pane getLayout();
}
