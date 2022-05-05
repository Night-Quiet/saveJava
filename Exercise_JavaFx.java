/**
 目录--------------------------------------------------------------------------
 * 倾斜的OK按钮
 * 通过按钮控制变大变小的球
 * 通过按钮控制可向四个方向移动的球
 * 数据分析图
 * 网格型文本框输入
 * 流水型文本框输入
 * 单个巨型OK按钮
 * 课程按钮混合布局
 * 混合布局Border的实例
 * 单纯一个OK按钮
 * 按钮关联演示
 * 闪动式横幅，文字
 * 双线程，一边按钮控制球的运动操作，一遍打印字符串
 * 自动运动的球
 * 含有背景颜色的按钮
 * 背景颜色分割式按钮
 * 多彩米图
*/

/**倾斜的OK按钮**/
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//import javafx.scene.control.Button;
//public class Exercise_JavaFx extends Application{
//    public void start(Stage primaryStage){
//        Pane pane = new StackPane();
//        Button btOK = new Button("OK");
////        btOK.setTextFill(Color.rgb(32,150,150));
////        btOK.setFont(new Font(22));
////        btOK.setRotate(45);
//        btOK.setStyle("-fx-font-size:22;-fx-text-fill:red;-fx-rotate:45");
//        btOK.setPrefWidth(100);
//        pane.getChildren().add(btOK);
//        Scene scene = new Scene(pane,400,250);
//        primaryStage.setTitle("MyJavaFX");
//        primaryStage.setScene(scene);
//        primaryStage.setAlwaysOnTop(true);
//        primaryStage.show();
//    }
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
//}

/**通过按钮控制变大变小的球**/
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.geometry.VPos;
//import javafx.scene.Node;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.input.KeyCode;
//import javafx.scene.input.MouseButton;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//import sun.plugin2.gluegen.runtime.CPU;
//
//public class Exercise_JavaFx extends Application{
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
//    private CirclePane pane = new CirclePane();
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//
//        HBox hBox = new HBox();
//        BorderPane borderPane = new BorderPane();
//        borderPane.setCenter(pane);
//        borderPane.setBottom(hBox);
//        BorderPane.setAlignment(hBox,Pos.CENTER);
//
////        Circle circle = new Circle(50);
////        circle.setStroke(Color.BLUE);
////        circle.setFill(Color.WHITE);
////        pane.getChildren().add(circle);
//
//        hBox.setSpacing(10);
//        hBox.setPadding(new Insets(10));
//        hBox.setAlignment(Pos.CENTER);
//        Button btEnlarge = new Button("Big");
//        Button btShrink = new Button("Small");
//        hBox.getChildren().add(btEnlarge);
//        hBox.getChildren().add(btShrink);
//
////        btEnlarge.setOnAction(new EnlargeHandler(pane));
//
////        btEnlarge.setOnAction(new EventHandler<ActionEvent>() {
////            @Override
////            public void handle(ActionEvent event) {
////                pane.enlarge();
////            }
////        });
//
////        btEnlarge.setOnAction((ActionEvent e)->{
////            pane.enlarge();
////        });
//        btEnlarge.setOnAction(e->{
//            pane.enlarge();
//            pane.requestFocus();
//        });
//        btShrink.setOnAction(e->{
//            pane.shrink();
//            pane.requestFocus();
//        });
//
//
//        pane.setOnMouseClicked(e->{
//            if (e.getButton()==MouseButton.PRIMARY){
//                pane.enlarge();
//            }else if(e.getButton()==MouseButton.SECONDARY){
//                pane.shrink();
//            }
//        });
//
//        pane.setOnKeyPressed(e->{
//            if (e.getCode() == KeyCode.E){
//                pane.enlarge();
//            }else if (e.getCode() == KeyCode.S){
//                pane.shrink();
//            }
//        });
//
////        btShrink.setOnAction(new ShrinkHandler());
//
//
//        Scene scene = new Scene(borderPane,300,250);
//        primaryStage.setTitle("ControlCircle");
//        primaryStage.setScene(scene);
//        primaryStage.setAlwaysOnTop(true);
//        primaryStage.show();
//        pane.requestFocus();
//    }
//
////    class ShrinkHandler implements EventHandler<ActionEvent>{
////        @Override
////        public void handle(ActionEvent event) {
////            pane.shrink();
////        }
////    }
//}
//
//class CirclePane extends StackPane{
//    private Circle circle = new Circle(50);
//
//    public CirclePane(){
//        getChildren().add(circle);
//        circle.setStroke(Color.BLUE);
//        circle.setFill(Color.WHITE);
//    }
//
//    public void enlarge(){
//        circle.setRadius(circle.getRadius()+2);
//    }
//    public void shrink(){
//        circle.setRadius(circle.getRadius()>2?circle.getRadius()-2:circle.getRadius());
//    }
//}
//
////class EnlargeHandler implements EventHandler<ActionEvent>{
////    private CirclePane pane;
////    public EnlargeHandler(CirclePane pane){
////        this.pane = pane;
////    }
////    @Override
////    public void handle(ActionEvent event) {
////        pane.enlarge();
////    }
////}

/**通过按钮控制可向四个方向移动的球**/
//import javafx.application.Application;
//import javafx.stage.Stage;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.HBox;
//import javafx.geometry.Pos;
//import javafx.scene.control.Button;
//import javafx.scene.shape.Circle;
//import javafx.scene.paint.Color;
//import javafx.geometry.Pos;
//
//public class Exercise_JavaFx extends Application
//{
//    @Override
//    public void start(Stage primaryStage)
//    {
//        Pane pane = new Pane();
//        Circle circle = new Circle(20, 20, 20);
//        circle.setFill(Color.WHITE);
//        circle.setStroke(Color.BLACK);
//
//        pane.getChildren().add(circle);
//
//        Button up = new Button("Up");
//        Button right = new Button("Right");
//        Button down = new Button("Down");
//        Button left = new Button("Left");
//        HBox hbox = new HBox(5);
//        hbox.setAlignment(Pos.CENTER);
//        hbox.getChildren().addAll(up, right, down, left);
//        pane.getChildren().add(hbox);
//
//        up.setOnAction(e -> {
//            if (circle.getCenterY() - 10 - 5 < 0)
//            {
//                circle.setCenterY(circle.getCenterY());
//            }
//            else
//                circle.setCenterY(circle.getCenterY() - 5);
//            circle.setCenterX(circle.getCenterX());
//        });
//
//        down.setOnAction(e -> {
//            if (circle.getCenterY() + 10 + 5 > pane.getHeight())
//            {
//                circle.setCenterY(circle.getCenterY());
//            }
//            else
//                circle.setCenterY(circle.getCenterY() + 5);
//            circle.setCenterX(circle.getCenterX());
//        });
//        left.setOnAction(e -> {
//            if (circle.getCenterX() - 10 - 5 < 0)
//            {
//                circle.setCenterX(circle.getCenterX());
//            }
//            else
//                circle.setCenterX(circle.getCenterX() - 5);
//            circle.setCenterY(circle.getCenterY());
//        });
//        right.setOnAction(e -> {
//            if (circle.getCenterX() + 10 + 5 > pane.getWidth())
//            {
//                circle.setCenterX(circle.getCenterX());
//            }
//            else
//                circle.setCenterX(circle.getCenterX() + 5);
//            circle.setCenterY(circle.getCenterY());
//        });
//
//        Scene scene = new Scene(pane, 200, 200);
//        primaryStage.setTitle("MoveBall");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}

/**数据分析图**/
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.geometry.VPos;
//import javafx.scene.Node;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//import sun.security.krb5.internal.APOptions;
//
//public class Exercise_JavaFx extends Application{
//
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        BorderPane mainPane = new BorderPane();
//        mainPane.setStyle("-fx-background-color: white");
////        添加HBox到主面板上
//        HBox hBox = addHBox();
//        mainPane.setTop(hBox);
//
////        添加VBox到主面板左方
//        VBox vBox = addVBox();
//        mainPane.setLeft(vBox);
//
////        添加FlowPane到主面板的右方
//        FlowPane flowPane = addFlowPane();
//
////        处理主面板中央部分
//        BorderPane centerPane = new BorderPane();
//        mainPane.setCenter(centerPane);
//        centerPane.setCenter(addGridPane());
//        centerPane.setBottom(addAnchorPane());
//
//        Scene scene = new Scene(mainPane);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("LayoutSample DEmo");
//        primaryStage.show();
//    }
//
//    private AnchorPane addAnchorPane() {
//        AnchorPane anchorPane = new AnchorPane();
//        Button buttonOK = new Button("OK");
//        Button buttonCancel = new Button("Cancel");
//        buttonOK.setPrefWidth(80);
//        buttonCancel.setPrefWidth(80);
//        AnchorPane.setRightAnchor(buttonCancel,20.0);
//        AnchorPane.setRightAnchor(buttonOK,10.0);
//        AnchorPane.setRightAnchor(buttonOK,110.0);
//        AnchorPane.setBottomAnchor(buttonOK,10.0);
//        anchorPane.getChildren().addAll(buttonOK,buttonCancel);
//
//        return anchorPane;
//    }
//
//    private GridPane addGridPane() {
//        GridPane gridPane = new GridPane();
//        gridPane.setAlignment(Pos.TOP_CENTER);
//        gridPane.setHgap(10);
//        gridPane.setVgap(10);
//        gridPane.setPadding(new Insets(8,10,8,10));
////        gridPane.setStyle("-fx-grid-lines-visible: true;-fx-background-color: bisque");
//
//        gridPane.add(new ImageView(new Image(this.getClass().getResourceAsStream("graphics/house.png"))),0,0,1,2);
//        Label label1 = new Label("sale");
//        label1.setFont(Font.font(null,FontWeight.BOLD,20));
//        gridPane.add(label1,1,0);
//        Label label2 = new Label("Current Year");
//        label2.setFont(Font.font(null,FontWeight.BOLD,20));
//        gridPane.add(label2,2,0);
//        Label label3 = new Label("Good and Services");
//        gridPane.add(label3,1,1,2,1);
//        Label label4 = new Label("Goods\n80%");
//        gridPane.add(label4,0,2);
//        GridPane.setValignment(label4, VPos.BOTTOM);
//        gridPane.add(new ImageView(new Image(this.getClass().getResourceAsStream("graphics/piechart.png"))),1,2,2,1);
//        Label label5 = new Label("Services\n20%");
//        gridPane.add(label5,3,2);
//        GridPane.setValignment(label5,VPos.BOTTOM);
//
//        return gridPane;
//    }
//
//    private FlowPane addFlowPane() {
//        FlowPane flowPane = new FlowPane();
//        flowPane.setStyle("-fx-background-color: #DAE6F4");
////        flowPane.setPrefWrapLength(169);
//        flowPane.setPadding(new Insets(8,5,8,5));
//        flowPane.setHgap(4);
//        flowPane.setVgap(6);
//
//        ImageView[] views = new ImageView[8];
//        for (int i = 0; i < 8; i++){
//            views[i] = new ImageView(new Image(this.getClass().getResourceAsStream("graphics/chart_"+(i+1)+".png")));
//            flowPane.getChildren().add(views[i]);
//        }
//
//        return flowPane;
//    }
//
//    private VBox addVBox() {
//        VBox vBox = new VBox();
//        vBox.setSpacing(6);
//        vBox.setPadding(new Insets(8));
//        Label lblTitle = new Label("数据");
//        lblTitle.setFont(Font.font(null,FontWeight.BOLD,14));
//        vBox.getChildren().add(lblTitle);
//        Label[] labels = new Label[]{
//                new Label("aaa"),new Label("bbb"),new Label("ccc"),new Label("ddd")
//        };
//        for(Label label : labels){
//            label.setFont(Font.font("consolas"));
//            VBox.setMargin(label,new Insets(0,0,0,15));
//            vBox.getChildren().add(label);
//        }
//
//        return vBox;
//    }
//
//    private  HBox addHBox(){
//        HBox hBox = new HBox();
//        hBox.setAlignment(Pos.CENTER_RIGHT);
//        hBox.setStyle("-fx-background-color: #14A79F");
//        hBox.setSpacing(10);
//        hBox.setPadding(new Insets(15,12,15,12));
//        Button button1 = new Button("button1");
//        Button button2 = new Button("button2");
//        button1.setPrefSize(100,30);
//        button2.setPrefSize(100,30);
//
//        StackPane stackPane1 = new StackPane();
////        stackPane.setStyle("-fx-background-color: yellow");
//        stackPane1.setAlignment(Pos.CENTER_LEFT);
//        Circle circle = new Circle();
//        circle.setRadius(15);
//        circle.setStroke(Color.BLUE);
//        Text helpText = new Text("?");
//        helpText.setFont(Font.font(null, FontWeight.BOLD,18));
//        helpText.setFill(Color.WHITE);
//        StackPane.setMargin(helpText, new Insets(0,0,0,10));
//        stackPane1.getChildren().addAll(circle,helpText);
//
//        hBox.getChildren().add(stackPane1);
//        hBox.getChildren().addAll(button1,button2);
//        HBox.setHgrow(stackPane1,Priority.ALWAYS);
//        return hBox;
//    }
//}

/**网格型文本框输入**/
//import javafx.application.Application;
//import javafx.geometry.HPos;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.geometry.VPos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Stage;
//
//public class Exercise_JavaFx extends Application{
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        GridPane pane = new GridPane();
//        pane.setStyle("-fx-grid-lines-visible: true");
//        pane.setAlignment(Pos.CENTER);
//        pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
//        pane.setHgap(10);
//        pane.setVgap(10);
//
//        pane.add(new Label("First Name:"),0,0);
//        pane.add(new TextField(),1,0);
//        pane.add(new Label("MI:"),0,1);
//        pane.add(new TextField(),1,1);
//        pane.add(new Label("Last Name:"),0,2);
//        pane.add(new TextField(),1,2);
//        Button btAdd = new Button("Add Name");
//        pane.add(btAdd,1,3);
//        GridPane.setHalignment(btAdd, HPos.RIGHT);
//        GridPane.setValignment(btAdd, VPos.CENTER);
//
//        Scene scene = new Scene(pane);
//        primaryStage.setTitle("ShowGriPane");
//        primaryStage.setScene(scene);
//        primaryStage.setAlwaysOnTop(true);
//        primaryStage.show();
//
//    }
//
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
//}

/**流水型文本框输入**/
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.geometry.Orientation;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.FlowPane;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//
//import java.awt.*;
//
//public class Exercise_JavaFx extends Application {
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        FlowPane pane = new FlowPane();
//
////        垂直排列设置
////        pane.setOrientation(Orientation.VERTICAL);
//
//        pane.setStyle("-fx-background-color: yellow;-fx-border-color: red");
//
////        留白
//        pane.setPadding(new Insets(25,12,25,12));
//        pane.setHgap(10);
//        pane.setVgap(10);
//
////        设置中间
//        pane.setAlignment(Pos.CENTER);
//
//        pane.getChildren().addAll(new Label("First Name:"),new TextField(), new Label("MI: "));
//        TextField tfMi = new TextField();
//        tfMi.setPrefColumnCount(1);
//        pane.getChildren().addAll(tfMi, new Label("LAst Name:"),new TextField());
//        Scene scene = new Scene(pane);
//        primaryStage.setTitle("ShowFlowPane");
//        primaryStage.setScene(scene);
//        primaryStage.setAlwaysOnTop(true);
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
//}

/**单个巨型OK按钮**/
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.stage.Stage;
//
//import java.awt.*;
//
//public class Exercise_JavaFx extends Application {
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Button btOK = new Button("OK");
//        Scene scene = new Scene(btOK,200,250);
//        primaryStage.setTitle("MyJavaFX");
//        primaryStage.setScene(scene);
//        primaryStage.setAlwaysOnTop(true);
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
//}

/**课程按钮混合布局**/
//import javafx.application.Application;
//import javafx.geometry.*;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//import javafx.scene.control.Button;
//
//public class Exercise_JavaFx extends Application{
//    public void start(Stage primaryStage){
//        BorderPane pane=new BorderPane();
//
//        pane.setTop(getHBox());
//        pane.setLeft(getVBox());
//
//        Scene scene=new Scene(pane,400,300);
//        primaryStage.setTitle("ShowHBoxVBox");
//        primaryStage.setScene(scene);
//        primaryStage.setAlwaysOnTop(true);
//        primaryStage.show();
//    }
//
//    private HBox getHBox(){
//        HBox hBox=new HBox(15);
//        hBox.setAlignment(Pos.CENTER);
//        hBox.setPadding(new Insets(15,15,15,15));
//        hBox.setStyle("-fx-background-color: gold");
//        hBox.getChildren().add(new Button("确定"));
//        hBox.getChildren().add(new Button("取消"));
//        return hBox;
//    }
//
//    private VBox getVBox(){
//        VBox vBox=new VBox(15);
//        vBox.setPadding(new Insets(15,5,5,5));
//        vBox.getChildren().add(new Label("课程"));
//
//        Label[] courses={new Label("语文"),new Label("数学"),new Label("化学")};
//
//        for (Label course:courses){
//            VBox.setMargin(course,new Insets(0,0,0,15));
//            vBox.getChildren().add(course);
//        }
//        return vBox;
//    }
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
//}

/**混合布局Border的实例**/
//import javafx.application.Application;
//import javafx.geometry.*;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//import javafx.scene.control.Button;
//public class Exercise_JavaFx extends Application {
//    public void start(Stage primaryStage){
//        BorderPane pane = new BorderPane();
//
//        pane.setTop(new CustomPane("Top"));
//        pane.setRight(new CustomPane("Right"));
//        pane.setBottom(new CustomPane("Bottom"));
//        pane.setLeft(new CustomPane("Left"));
//        pane.setCenter(new CustomPane("Center"));
//
//        Scene scene = new Scene(pane,600,500);
//        primaryStage.setTitle("ShowBorderPane");
//        primaryStage.setScene(scene);
//        primaryStage.setAlwaysOnTop(true);
//        primaryStage.show();
//    }
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
//}
//
//class CustomPane extends StackPane{
//
//    public CustomPane(String title){
//        Label label = new Label(title);
//        label.setStyle("-fx-font-size: 25");
//        getChildren().add(label);
//        setStyle("-fx-border-color: red");
//        setPadding(new Insets(11.5,12.5,13.5,14.5));
//    }
//}

/**单纯一个OK按钮**/
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//
//import java.awt.*;
//
//public class Exercise_JavaFx extends Application {
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Pane pane = new StackPane();
//        Button btOK = new Button("OK");
//        pane.getChildren().add(btOK);
//        Scene scene = new Scene(pane,400,250);
//        primaryStage.setTitle("MyJavaFX");
//        primaryStage.setScene(scene);
//        primaryStage.setAlwaysOnTop(true);
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
//}

/**按钮关联演示**/
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Button;
//import javafx.scene.control.ButtonType;
//import javafx.scene.control.TextInputDialog;
//import javafx.scene.layout.StackPane;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
//import javafx.stage.FileChooser;
//import javafx.stage.Stage;
//
//import java.io.File;
//
//public class Exercise_JavaFx extends Application {
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
//
//    private Stage stage;
//    Media media;
//    MediaPlayer mediaPlayer;
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        stage = primaryStage;
//        StackPane pane = new StackPane();
//
//        Button button = new Button("Alert演示");
//        Button button1 = new Button("Confirm演示");
//        Button button2 = new Button("TextInput演示");
//        Button button3 = new Button("File演示");
//
////        pane.getChildren().add(button);
////        pane.getChildren().add(button1);
////        pane.getChildren().add(button2);
//        pane.getChildren().add(button3);
//
//        button.setOnAction(e -> {
//            showAlert();
//        });
//
//        button1.setOnAction(e -> {
//            showConfirm();
//        });
//
//        button2.setOnAction(e -> {
//            showTextInput();
//        });
//
//        button3.setOnAction(e -> {
//            showFile();
//        });
//
//        Scene scene = new Scene(pane,500,500);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//    }
//
//    private void showFile(){
//        FileChooser fileChooser = new FileChooser();
//        FileChooser.ExtensionFilter extensionFilter1 = new FileChooser.ExtensionFilter("Medias","*.mp3","*.mp4");
//        FileChooser.ExtensionFilter extensionFilter2 = new FileChooser.ExtensionFilter("all files","*.*");
//        fileChooser.getExtensionFilters().addAll(extensionFilter1,extensionFilter2);
////        File file = fileChooser.showOpenDialog(null);  // 对话框和原本框独立
//        File file = fileChooser.showOpenDialog(stage);
//        media = new Media(file.toURI().toString());
//        System.out.println(file.toURI().toString());
//        mediaPlayer = new MediaPlayer(media);
//        mediaPlayer.play();
//    }
//
//    private void showAlert(){
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setTitle("标题信息");
////        alert.setHeaderText("信息头");
//        alert.setHeaderText(null);
//        alert.setContentText("信息正文...\n...\n...\n...");
////        alert.show();   // 后续命令不执行
//        alert.showAndWait();  // 后续命令等待关闭对话框执行
//        System.out.println("后续。。。。");
//    }
//
//    private void showConfirm(){
//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//        alert.setTitle("提示");
//        alert.setHeaderText(null);
//        alert.setContentText("确定退出程序吗");
////        alert.showAndWait();
//        ButtonType buttonType = alert.getResult();
//        if (buttonType == ButtonType.OK){
//            System.out.println("退出");
//        } else if (buttonType == ButtonType.CANCEL) {
//            System.out.println("取消");
//        }
//
//        // 加入选择
//        ButtonType buttonType1 = new ButtonType("button1");
//        ButtonType buttonType2 = new ButtonType("button2");
//        ButtonType buttonType3 = new ButtonType("button3");
//        alert.getButtonTypes().addAll(buttonType1,buttonType2,buttonType3);
//        alert.showAndWait();
//        if (alert.getResult() == buttonType2){
//            System.out.println("button2 clicked");
//        }
//    }
//
//    private void showTextInput(){
//        TextInputDialog textInputDialog = new TextInputDialog("默认值");
//        textInputDialog.setTitle("找回密码");
//        textInputDialog.setHeaderText("回答问题：    ");
//        textInputDialog.setContentText("你是谁");
//        textInputDialog.showAndWait();
//        String message = textInputDialog.getResult();
//        System.out.println(message);
//    }
//}

/**闪动式横幅，文字**/
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//
//public class Exercise_JavaFx extends Application {
//    private String text = "";
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        StackPane pane = new StackPane();
//        Label label = new Label("Programming is fun");
//        label.setFont(Font.font(29));
//        pane.getChildren().add(label);
//
//        new Thread(() -> {
//            try {
//                while (true) {
//                    if (label.getText().trim().length() == 0)
//                        text = "Programming is fun";
//                    else
//                        text = "";
//                    Platform.runLater(() -> {
//                        label.setText(text);
//                    });
//                    Thread.sleep(200);
//                }
//            } catch (InterruptedException ex) {
//            }
//        }).start();
//
//        Scene scene = new Scene(pane,300,50);
//        primaryStage.setTitle("FlashText");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}

/**双线程，一边按钮控制球的运动操作，一遍打印字符串**/
//import javafx.animation.KeyFrame;
//import javafx.animation.Timeline;
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.beans.property.DoubleProperty;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.scene.paint.CycleMethod;
//import javafx.scene.paint.RadialGradient;
//import javafx.scene.paint.Stop;
//import javafx.scene.shape.Circle;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//
//import java.util.concurrent.Executor;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class Exercise_JavaFx extends Application {
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        BorderPane pane = new BorderPane();
//        BallPane ballPane = new BallPane();
//        ballPane.setStyle("-fx-border-color: grey");
//        pane.setCenter(ballPane);
//
//        HBox hBox = new HBox();
//        pane.setBottom(hBox);
//
//        hBox.setSpacing(10);
//        hBox.setPadding(new Insets(10));
//        hBox.setAlignment(Pos.CENTER);
//        Button btnStart = new Button("Start");
//        Button btnPause = new Button("Pause");
//        btnStart.setFont(Font.font(20));
//        btnPause.setFont(Font.font(20));
//        btnStart.setOnAction(e -> {
//            ballPane.play();
//
//            /**线程多开独立运行**/
//            new Thread(() -> {
//
//                /**线程更改GUI操作**/
//                Platform.runLater(() -> {
//                    btnStart.setText("OK");
//                });
//
//                try {
//                    System.out.println("操作的极限：");
//                    for (int i=0; i<10; i++) {
//                        System.out.println("读取中......");
//                        Thread.sleep(200);
//                    }
//                } catch (Exception e1){
//                    e1.printStackTrace();
//                }
//            }).start();
//
//            /**卡球运动操作**/
////            try {
////                System.out.println("操作的极限：");
////                for (int i=0; i<10; i++) {
////                    System.out.println("读取中......");
////                    Thread.sleep(200);
////                }
////            } catch (Exception e1){
////                e1.printStackTrace();
////            }
//
//        });
//        btnPause.setOnAction(e -> {
//            ballPane.pause();
//        });
//        hBox.getChildren().addAll(btnStart,btnPause);
//
//        Scene scene = new Scene(pane, 350, 350);
//        primaryStage.setTitle("控球运动");
//        primaryStage.setScene(scene);
//        primaryStage.setAlwaysOnTop(true);
//        primaryStage.show();
//
//        ballPane.requestFocus();
//    }
//
//    public static void main(String[] args) {
//        Application.launch(args);
//        /** 普通写法 **/
////        Runnable printA = new PrintChar('a',100);
////        Runnable printB = new PrintChar('b',100);
////        Runnable print100 = new PrintNum(100);
////        Thread thread = new Thread(printA);
////        Thread thread1 = new Thread(printB);
////        Thread thread2 = new Thread(print100);
////        thread.start();
////        thread1.start();
////        thread2.start();
//
//        /** 常用写法 **/
////        new Thread(new Runnable() {
////            @Override
////            public void run() {
////                for (int i=0; i<100; i++)
////                    System.out.print("c");
////            }
////        }).start();
////        new Thread(() -> {
////            for (int i=0; i<100; i++){
////                System.out.print("d");
////            }
////        }).start();
//
//        /**另一种写法**/
//        ExecutorService executor = Executors.newFixedThreadPool(3);
//
//        executor.execute(new PrintChar('a',100));
//        executor.execute(new PrintChar('b',100));
//        executor.execute(new PrintNum(100));
//
//        executor.shutdown();
//        while (!executor.isTerminated()){}
//        System.out.println("任务结束");
//
//    }
//}
//
//class BallPane extends Pane {
//    public final double radius = 50;
//    private double x =radius, y = radius;
//    private double dx = 1, dy = 1;
//    private Circle circle = new Circle(x, y, radius);
//    private Timeline animation;
//
//    public BallPane() {
//        circle.setFill(Color.RED);
//
//        Stop[] stops = new Stop[] {
//                new Stop(0, Color.WHITE),
//                new Stop(0.3, Color.RED),
//                new Stop(1, Color.DARKRED)
//        };
//        RadialGradient rg = new RadialGradient(0,.1,
//                x-25,y-25, radius,
//                false, CycleMethod.NO_CYCLE,stops);
//        circle.setFill(rg);
//        getChildren().add(circle);
//
//        animation = new Timeline(new KeyFrame(Duration.millis(18), e -> moveBall()));
//        animation.setCycleCount(Timeline.INDEFINITE);
////        animation.play();
//    }
//
//    public void play() {
//        animation.play();
//    }
//
//    public void pause() {
//        animation.pause();
//    }
//
//    public void increaseSpeed() {
//        animation.setRate(animation.getRate() + 0.1);
//    }
//
//    public void decreaseSpeed() {
//        animation.setRate(
//                animation.getRate() > 0 ? animation.getRate() - 0.1 : 0
//        );
//    }
//
//    public DoubleProperty rateProperty() {
//        return animation.rateProperty();
//    }
//
//    protected void moveBall() {
//        if (x < radius || x > getWidth() - radius) {
//            dx = -dx;
//        }
//        if (y < radius || y > getHeight() - radius) {
//            dy = -dy;
//        }
//        x += dx;
//        y += dy;
//        circle.setCenterX(x);
//        circle.setCenterY(y);
//
//        //渐变效果
//        Stop[] stops = new Stop[] { new Stop(0, Color.WHITE), new Stop(0.3, Color.RED),new Stop(1,
//                Color.DARKRED) };
//        RadialGradient rg = new RadialGradient(0,.1,x-25,y-25,radius, false, CycleMethod.NO_CYCLE,stops);
//        circle.setFill(rg);
//    }
//
//
//}
//
//class PrintChar implements Runnable{
//    private  char charToPrint;
//    private int times;
//
//    public PrintChar(char c, int t){
//        charToPrint = c;
//        times = t;
//    }
//
//    public void run(){
//        for (int i = 0; i < times; i++){
//            System.out.print(charToPrint);
//        }
//    }
//}
//
//class PrintNum implements Runnable{
//    private int lastNum;
//
//    public PrintNum(int n){
//        lastNum = n;
//    }
//    public void run(){
//        for (int i = 1;i <= lastNum; i++){
//            System.out.print(" " + i);
//        }
//    }
//}

/**自动运动的球**/
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.input.KeyCode;
//import javafx.stage.Stage;
//public class Exercise_JavaFx extends Application{
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Exercise_OutsideClass ballPane = new Exercise_OutsideClass();
//
//        ballPane.setOnMousePressed(e->{ballPane.pause();});
//        ballPane.setOnMouseReleased(e->{ballPane.play();});
//
//        ballPane.setOnKeyPressed(e->{
//            if (e.getCode() == KeyCode.UP) {
//                ballPane.increaseSpeed();
//            }else if (e.getCode() == KeyCode.DOWN){
//                ballPane.decreaseSpeed();
//            }
//        });
//
//        Scene scene = new Scene(ballPane,350,350);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//        ballPane.requestFocus();
//    }
//}

/**含有背景颜色的按钮**/
//import javafx.application.Application;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.FlowPane;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.Pane;
//import javafx.stage.Stage;
//
//public class Exercise_JavaFx extends Application {
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
////        Pane pane = new Pane();
//
//        FlowPane pane = new FlowPane();
//        pane.setAlignment(Pos.CENTER);
//
//        pane.setStyle("-fx-background-color: aqua");
//        Button buttonOK = new Button("OK");
//        Button buttonCancel = new Button("cancel");
//        pane.getChildren().addAll(buttonOK,buttonCancel);
//
//        buttonOK.setLayoutX(10);
//        buttonCancel.setLayoutX(60);
//
////        pane.setPrefSize(280,280);
//
//        GridPane gridPane= new GridPane();
//        gridPane.setAlignment(Pos.CENTER);
//        gridPane.add(pane,0,0);
//
//        Scene scene = new Scene(gridPane,300,300);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}

/**背景颜色分割式按钮**/
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.*;
//import javafx.stage.Stage;
//
//import java.awt.*;
//
//public class Exercise_JavaFx extends Application {
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Button buttonOk = new Button("OK");
//        Button buttonCancel = new Button("Cancel");
//        buttonOk.setPrefSize(100,30);
//        buttonCancel.setPrefSize(100,30);
//
////        AnchorPane pane= new AnchorPane();
////        pane.getChildren().addAll(buttonOk,buttonCancel);
////
////        AnchorPane.setLeftAnchor(buttonOk,30.0);
////        AnchorPane.setTopAnchor(buttonOk,30.0);
////
////        AnchorPane.setRightAnchor(buttonCancel,30.0);
////        AnchorPane.setBottomAnchor(buttonCancel,30.0);
////
//////        AnchorPane.setTopAnchor(buttonCancel,240.0);
//
//        HBox pane = new HBox();
//        pane.setStyle("-fx-background-color: aqua");
//        pane.setPrefHeight(77);
//        pane.getChildren().addAll(buttonOk);
//        pane.setAlignment(Pos.CENTER_LEFT);
//        HBox.setMargin(buttonOk,new Insets(0,0,0,30));
//        StackPane stackPane = new StackPane();
//        stackPane.getChildren().addAll(buttonCancel);
//        stackPane.setStyle("-fx-background-color: yellow");
//        stackPane.setAlignment(Pos.CENTER_RIGHT);
//        StackPane.setMargin(buttonCancel,new Insets(0,30,0,0));
//        pane.getChildren().add(stackPane);
//        HBox.setHgrow(stackPane,Priority.ALWAYS);
//
//        Scene scene = new Scene(pane,300,300);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}

/**多彩米图**/
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.paint.Color;
//import javafx.scene.paint.CycleMethod;
//import javafx.scene.paint.LinearGradient;
//import javafx.scene.paint.Stop;
//import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
//
//import java.awt.*;
//
//public class Exercise_JavaFx extends Application {
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Pane pane = new StackPane();
//
//        for (int i = 0; i < 4; i++){
//            Rectangle r = new Rectangle(250,60);
//
//            r.widthProperty().bind(pane.widthProperty().divide(3));
//            r.heightProperty().bind(pane.heightProperty().divide(7));
////边框
//            r.setRotate(i * 180 / 4);
//            r.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
////颜色
////            r.setFill(Color.BLACK);
//            r.setFill(null);
////圆角
//            r.setArcHeight(10);
//            r.setArcWidth(10);
//
////            渐变
//            Stop[] stops = new Stop[] {new Stop(0,Color.color(Math.random(),Math.random(),Math.random())),new Stop(1,Color.color(Math.random(),Math.random(),Math.random())) };
//            LinearGradient lg1 = new LinearGradient(0,0,1,0,true, CycleMethod.NO_CYCLE,stops);
//            r.setFill(lg1);
//
//            pane.getChildren().add(r);
//        }
//
//        Scene scene = new Scene(pane,550,300);
//        primaryStage.setTitle("SHowRectangle");
//        primaryStage.setScene(scene);
//        primaryStage.setAlwaysOnTop(true);
//        primaryStage.show();
//    }
//}

/****/


/****/


/****/

