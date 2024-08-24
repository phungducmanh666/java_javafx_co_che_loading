## Nội dung

- Tạo cơ chế hiển thị tạm thời một màn hình loading trong khi đang thực hiện một tác vụ không đồng bộ.
- màn hình là một đối tượng chứa một đối tượng thuộc lớp Pane của JavaFx các phương thức.
  - `paint()` để vẽ màn hình.
  - `loadPaint()` để vẽ màn hình khi thực hiện tác vụ không đồng bộ. ở đây mình vẽ màn hình loading khi thực hiện tác vụ không đồng bộ.
  - `getLayout()` hàm này trả về layout của màn hình.
  - `setLoading()` hàm này để thay đổi trạng thái của màn hình, liệu nó có đang loading hay không nếu set là true thì hàm `loadPaint()` sẽ được gọi ngược lại thì hàm `loadPaint()` sẽ được gọi.

## Cấu trúc thư mục

- `src/app` nơi chứa mã code chính của chương trình.
  - `App.java` nơi bắt đầu của chương trình.
  - `screen/Screen.java` lớp cha của tất cả các màn hình trong dự án này.
  - `screen/home/HomeScreen.java` màn hình chính.
  - `screen/splash/SplashScreen.java` màn hình loading sẽ được set cho `HomeScreen.java`.
- `bin` nơi chứa các file `.class` được biên dịch từ các file `.java` trong dự án của bạn.

## lưu ý

- Để chạy chương trình java fx bạn phải cài đặt javafx và thêm các thư viện của javafx cho dự án của bạn.

## Demo trên youtube

[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/t7HBCZyjEN8/maxresdefault.jpg)](https://www.youtube.com/watch?v=t7HBCZyjEN8)
