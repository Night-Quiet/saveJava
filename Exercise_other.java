/**
 目录--------------------------------------------------------------------------
 * 调试工作台运行操作简单计算机操作
 * 多态自建类继承
 * 数独测试
 * 模拟计算指定范围内的面积
 * 简单的可视化显示字句
 * 完整的雇员类，存储机类，并通过读取data.txt文件内容操作
 * 简单的接口操作，创建USB各类，USBDeviceDemo
 * 敲笨钟，输入诗句拼音，判断其是否压“ong”韵，如果是就更改这句诗的最后三个拼音为qiao ben zhong
 * 数独成品，SudokuFx
*/

/**调试工作台运行操作简单计算机操作**/
//public class Exercise_other {
//    public static void main(String[] args) {
//        if (args.length !=3){
//            System.out.println("Usage java Calculator 2 + 3");
//            System.exit(0);
//        }
//        int result=0;
//        switch (args[1].charAt(0)){
//            case '+':
//                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
//                break;
//            case '-':
//                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
//                break;
//            case '*':
//                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
//                break;
//            case '/':
//                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
//                break;
//        }
//        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
//    }
//}

/**多态自建类继承**/
//public class Exercise_other {
//    public static void main(String[] args) {
//        privilege(new level1());
//        privilege(new level2());
//        privilege(new level3());
//    }
//    public static void privilege(level1 o){
//        System.out.println(o.toString());
//    }
//}
//abstract class level{
//    String name="测试工具人";
//    int id=001;
//    String gender="男";
//    String privilegeAdd;
//    public level(){};
//    public level(String name,int id,String gender){
//        this.name=name;
//        this.id=id;
//        this.gender=gender;
//    }
//    public String toString(){
//        return "您的特权为：" + privilegeAdd;
//    }
//}
//class level1 extends level{
//    String name="测试工具人";
//    int id=001;
//    String gender="男";
//    String privilegeAdd="自由上厕所";
//    public level1(){};
//    public level1(String name,int id,String gender){
//        this.name=name;
//        this.id=id;
//        this.gender=gender;
//    }
//    public String toString(){
//        return "尊敬的"+name+",您的特权为：" + privilegeAdd;
//    }
//}
//class level2 extends level1{
//    String privilegeAdd="自由喝水";
//    public level2(){};
//    public level2(String name,int id,String gender){
//        super(name, id, gender);
//    }
//    public String toString(){
//        return super.toString() + " " + privilegeAdd;
//    }
//}
//class level3 extends level2{
//    String privilegeAdd="使用电脑";
//    public level3(){};
//    public level3(String name,int id,String gender){
//        super(name, id, gender);
//    }
//    public String toString(){
//        return super.toString() + " " + privilegeAdd;
//    }
//}

/**数独测试**/
//import java.util.Scanner;
//public class Exercise_other {
//    public static void main(String[] args) {
//        int i=0,j;
//        int[][] grid = reaAPuzzle();
//        int[][] grid_1 = reaAPuzzle();
//
//    }
//    public static int[][] reaAPuzzle() {
////todo
//        Scanner sc = new Scanner(System.in);
//        int i,j;
//        int[][] sudo = new int[9][9];
//        for (i=0;i<9;i++){
//            for (j=0;j<9;j++){
//                sudo[i][j]=sc.nextInt();
//            }
//        }
//        return sudo;
//    }
//    public static int[][] getFreeCellList(int[][] grid) {
////todo
//        int i,j,k=0;
//        for (i=0;i<9;i++) {
//            for (j = 0; j < 9; j++) {
//                if (grid[i][j] == 0)
//                    k++;
//            }
//        }
//        int[][] sudo_free = new int[k][2];
//        k=0;
//        for (i=0;i<9;i++){
//            for (j=0;j<9;j++){
//                if (grid[i][j]==0){
//                    sudo_free[k][0]=i;
//                    sudo_free[k][1]=j;
//                    k++;
//                }
//            }
//        }
//        return sudo_free;
//    }
//    public static boolean isValid(int i, int j, int[][] grid) {
////todo
//        int n,m;
//        int i1 = i-i%3;
//        int j1 = j-j%3;   /*计算位置所在方块的第一个数位置*/
//        /*判断行列是否重复*/
//        for (n=0;n<9;n++){
//            if (n!=j&&grid[i][n]==grid[i][j])
//                return true;
//            else if (n!=i&&grid[n][j]==grid[i][j])
//                return true;
//        }
//        /*判断3x3是否重复*/
//        for (n=i1;n<i1+3;n++){
//            for (m=j1;m<j1+3;m++){
//                if ((n!=i||m!=j)&&grid[n][m]==grid[i][j])
//                    return true;
//            }
//        }
//        return false;
//    }
//}

/**模拟计算指定范围内的面积**/
//public class Exercise_other{
//    public static void main(String[] args) {
//        int num=0,d=1000000;
//        for(int i=1;i<=d;i++){
//            final double x = Math.random() * 4;
//            final double y = Math.random() * 4;
//            if(x<=2||(x>2&&y>2&&(x+y)<6)){
//                num+=1;
//            }
//        }
//        double c = num,bit;
//        bit = c/d;
//        System.out.printf("飞镖投入奇数标记的区域的概率为：%.4f",bit);
//    }
//}

/**简单的可视化显示字句**/
//import javafx.application.Application;
//import javafx.geometry.*;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.*;
//import javafx.stage.Stage;
//public class Exercise_other extends Application{
//    public void start(Stage primaryStage){
//        BorderPane pane = new BorderPane();
//
//        pane.setCenter(new newBorderPane("Welcome To JavaFx"));
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
//class newBorderPane extends StackPane{
//
//    public newBorderPane(String title){
//        Label label = new Label(title);
//        label.setStyle("-fx-font-size: 25");
//        getChildren().add(label);
//        setStyle("-fx-border-color: black");
//        setPadding(new Insets(11.5,12.5,13.5,14.5));
//    }
//}

/**完整的雇员类，存储机类，并通过读取data.txt文件内容操作**/
//import java.io.File;
//import java.util.Scanner;
//public class Exercise_other {
//    public static void main(String[] args) throws Exception{
//        int j=0;
//        File file = new File("data.txt");
//        Scanner input = new Scanner(file,"utf-8");
//        Employee[] p1=new Employee[2];
//        Salary1[] w1=new Salary1[2];
//        while (input.hasNext()){
//            String[] name = new String[7];
//            for (int i=0;i<7;i++){
//                name[i]=input.next();
//            }
//            p1[j]=new Employee(name[0],name[1],name[2],name[3],name[4]);
//            String[] payslip={name[5],name[6]};
//            p1[j].setPaySlip(payslip);
//            w1[j]=new Salary1(p1[j].getEmployeeId(),Double.parseDouble(p1[j].getPaySlip()[0])+Double.parseDouble(p1[j].getPaySlip()[1]));
//            j++;
//        }
//        input.close();
//
//        String p1input="ID: "+p1[0].getEmployeeId()+"\nName: "+p1[0].getName()+
//                "\nSex: "+p1[0].getSex()+"\nDept: "+p1[0].getDept()+"\nDuty: "+
//                p1[0].getDuty()+"\n其税金为: "+w1[0].getTax()+
//                "\n其实际工资为: "+w1[0].getRealWage();
//        String p2input="ID: "+p1[1].getEmployeeId()+"\nName: "+p1[1].getName()+
//                "\nSex: "+p1[1].getSex()+"\nDept: "+p1[1].getDept()+"\nDuty: "+
//                p1[1].getDuty()+"\n其税金为: "+w1[1].getTax()+
//                "\n其实际工资为: "+w1[1].getRealWage();
//        System.out.println(p1input);
//        System.out.println("");
//        System.out.println(p2input);
//
//    }
//
//}
//abstract class Salary{
//    String employeeId;
//    double wage=0;
//    double tax=0;
//    double realWage=0;
//
//    public String getEmployeeId() {
//        return employeeId;
//    }
//
//    public void setEmployeeId(String employeeId) {
//        this.employeeId = employeeId;
//    }
//
//    public double getWage() {
//        return wage;
//    }
//
//    public void setWage(double wage) {
//        this.wage = wage;
//    }
//
//    public double getTax() {
//        return tax;
//    }
//
//    public abstract void setTax();
//
//    public double getRealWage() {
//        return realWage;
//    }
//
//    public abstract void setRealWage();
//
//    Salary(){
//        employeeId="张三";
//        this.wage=2000;
//        this.tax=0;
//        this.realWage=wage-tax;
//    }
//
//    Salary(String employeeId, double wage){
//        this.employeeId=employeeId;
//        this.wage=wage;
//        setTax();
//        setRealWage();
//    }
//
//}
//
//class Employee{
//    String employeeId;
//    String name;
//    String sex;
//    String dept;
//    String duty;
//    String[] paySlip={"2000.0", "0.0"};
//
//    public String getEmployeeId() {
//        return employeeId;
//    }
//
//    public void setEmployeeId(String employeeId) {
//        this.employeeId = employeeId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public String getDept() {
//        return dept;
//    }
//
//    public void setDept(String dept) {
//        this.dept = dept;
//    }
//
//    public String getDuty() {
//        return duty;
//    }
//
//    public void setDuty(String duty) {
//        this.duty = duty;
//    }
//
//    public String[] getPaySlip() {
//        return paySlip;
//
//    }
//
//    public void setPaySlip(String [] paySlip) {
//        this.paySlip[0] = paySlip[0];
//        this.paySlip[1] = paySlip[1];
//    }
//
//    Employee(){
//        this.employeeId="S001";
//        this.name="Jason";
//        this.sex="male";
//        this.dept="Clean-Department";
//        this.duty="clean";
//    }
//
//    Employee(String employeeId, String name, String sex, String dept, String duty){
//        this.employeeId=employeeId;
//        this.name=name;
//        this.sex=sex;
//        this.dept=dept;
//        this.duty=duty;
//    }
//
//}
//
//class Salary1 extends Salary{
//    Salary1(String employeeId, double wage){
//        super(employeeId, wage);
//    }
//    public void setTax(){
//        double wage1=wage-2000;
//        if (wage1<0)
//            this.tax=0;
//        else if (wage1<500)
//            this.tax=wage1*0.05-0;
//        else if (wage1<2000)
//            this.tax=wage1*0.10-25;
//        else if (wage1<5000)
//            this.tax=wage1*0.15-125;
//        else if (wage1<20000)
//            this.tax=wage1*0.20-375;
//        else if (wage1<40000)
//            this.tax=wage1*0.25-1375;
//        else if (wage1<60000)
//            this.tax=wage1*0.30-3375;
//        else if (wage1<80000)
//            this.tax=wage1*0.35-6375;
//        else if (wage1<100000)
//            this.tax=wage1*0.40-10375;
//        else if (wage1>100000)
//            this.tax=wage1*0.45-15375;
//    }
//
//    public void setRealWage(){
//        this.realWage=wage-tax;
//    }
//}

/**简单的接口操作，创建USB各类，USBDeviceDemo**/
//public class Exercise_other {
//    public static void main(String[] args) {
//        Computer computer =new Computer();
//        computer.connectUSB(new HDD(),1);
//        computer.connectUSB(new SSD(),2);
//        computer.connectUSB(new USBMouse(),3);
//        System.out.println("总共的储存容量为：" + computer.getTotalCapacity()+"G");
//    }
//}
//
//interface USB{
//    public void work();
//}
//abstract class StorageDevice{
//    public abstract double getCapacity();
//}
//class HDD extends StorageDevice implements USB{
//    private double capacity = 256;
//    public double getCapacity(){
//        return capacity;
//    }
//    public void setCapacity(){
//        this.capacity=capacity;
//    }
//    public void work(){
//        System.out.println("HDD设备准备就绪。");
//    }
//}
//class SSD extends StorageDevice implements USB{
//    private double capacity = 128;
//    public double getCapacity(){
//        return capacity;
//    }
//    public void setCapacity(){
//        this.capacity=capacity;
//    }
//    public void work(){
//        System.out.println("SSD设备准备就绪。");
//    }
//}
//class USBMouse implements USB{
//    public void work(){
//        System.out.println("USB鼠标开始工作");
//    }
//}
//class Computer{
//    private USB[] usbs = new USB[3];
//
//    public void connectUSB(USB usbDevice, int n){
//        usbs[n-1] = usbDevice;
//        usbs[n-1].work();
//    }
//    public double getTotalCapacity(){
//        double totalCapacity = 0;
//        for (USB usbDevice : usbs){
//            if (usbDevice != null && usbDevice instanceof  StorageDevice){
//                totalCapacity = totalCapacity + ((StorageDevice) usbDevice).getCapacity();
//            }
//        }
//        return totalCapacity;
//    }
//}

/**敲笨钟，输入诗句拼音，判断其是否压“ong”韵，如果是就更改这句诗的最后三个拼音为qiao ben zhong**/
//import java.util.Scanner;
//
//public class Exercise_other {
//    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        System.out.print("请输入诗句的数量：");
//        int n=scanner.nextInt();
//        scanner.nextLine();
//        StringBuilder sb=new StringBuilder();
//        for(int i=0;i<n;i++) {
//            System.out.print("请输入一句诗句的拼音：");
//            sb.append(scanner.nextLine());
//            int sum1=0;
//            for(int j=0;j<sb.length();j++) {
//                if(sb.charAt(j)==','||sb.charAt(j)=='.') {
//                    if(cha(sb,j)) {
//                        sum1++;
//                    }
//                }
//            }
//            if(sum1==2) {
//                int sum=0;
//                for(int j=sb.length()-1;j>-1;j--){
//                    if(sb.charAt(j)==' ') {
//                        sum++;
//                    }
//                    if(sum==3) {
//                        System.out.print("更改后的诗句为：");
//                        sb.append("qiao ben zhong.");
//                        System.out.println(sb.toString());
//                        break;
//                    }else {
//                        sb.deleteCharAt(j);
//                    }
//                }
//            }else {
//                System.out.println("Skipped");
//            }
//            sb.delete(0, sb.length());
//        }
//    }
//
//    private static boolean cha(StringBuilder sb, int j) {
//        boolean flag=false;
//        if(sb.charAt(j-1)=='g'&&sb.charAt(j-2)=='n'&&sb.charAt(j-3)=='o') {
//            flag=true;
//        }
//        return flag;
//    }
//}

/**数独成品，SudokuFx**/
///**
// * 学号：20182005025    姓名：黄金城   班级：辅修1901
// *
// * 已完成
// * 1. 在Sudoku类中实现数独的核心相关算法
// *
// * 已完成
// * 2. 使用JavaFx将数独程序图形化，完成基本的数独功能
// *        提供类似九宫格界面用于数独数字的输入和显示（提示：可以在GridPane的单元格中嵌入TextField，用于显示和输入数字）
// *        提供两个按钮用来求解及清空界面。求解成功就将对应的数字填写到九宫格界面中，清空就是将界面所有数字清空。
// *        在程序的合适的位置，提供信息栏，用于显示程序求解的相关信息，例如显示“求解完成”，“输入有误”，“无解”或其它自己认为有需要的信息。
// *
// * 扩展功能部分
// *
// * 已完成
// * 3. 提供一个检验功能，对于用户自己输入的求解方案，验证是否正确，验证信息可以显示在上面功能中的信息栏中。
// *
// * 已完成
// * 4. 提供打开和保存功能。具体来说，就是可以通过保存按钮，打开一个文件保存对话框，将当前九宫格界面的数字状态保存到一个文本存档文件；
// *    通过打开按钮，打开一个文件对话框，用于加载保存的存档文件。（提示：可以按照二维矩阵的样式将九宫格中的数字保存到文本文件，没有填写数字的
// *    空白部分就设置为0。
// *
// * 已完成
// * 5. 提供背景音乐功能，允许用户开启和关闭背景音乐，注意，为了性能，使用在新线程中播放音乐的方式。
// *
// * 已完成
// * 6. 在程序的合适位置显示时间信息，当程序打开时就开始计时，显示用户使用数独程序的时长，注意，更新GUI中的显示信息，也许需要用到Platform.runLater方法
// *
// * 7. 自己实现的额外功能
// * */
//
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.*;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
//import javafx.stage.FileChooser;
//import javafx.stage.Stage;
//
//import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Scanner;
//
//public class Exercise_other extends Application {
//
//    public TextField[][] field = new TextField[9][9];
//    public int[][] sudo = new int[9][9];
//    //    private TextField field1 = new TextField("错误提示处");
//    private Label error = new Label("错误提示处");
//    private Stage stage;
//    Media media;
//    MediaPlayer mediaPlayer;
//    int openClose = 0;
//    private int time = 0;
//
//    @Override
//    public void start(Stage primaryStage) {
//
//        stage = primaryStage;
//
//        BorderPane pane = new BorderPane();
//
//        GridPane gridPane = addGridPane();
//        HBox hBox = addHBox();
//
//
//        HBox hBox1 = Time();
//        pane.setTop(hBox1);
//
//        pane.setCenter(gridPane);
//        pane.setBottom(hBox);
//
//        new Thread(() -> {
//            music();
//        }).start();
//
//        Scene scene = new Scene(pane);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("数独游戏");
//        primaryStage.show();
//    }
//
//    //    按钮
//    private HBox addHBox() {
//        HBox hBox = new HBox(15);
//        hBox.setAlignment(Pos.CENTER);
//        hBox.setPadding(new Insets(10));
//        Button button1 = new Button("求解");
//        Button button2 = new Button("清空");
//        Button button3 = new Button("检验");
//        Button button4 = new Button("保存");
//        Button button5 = new Button("打开");
//        Button button6 = new Button("音乐");
//        hBox.getChildren().addAll(button1, button2,button3,button4,button5,button6);
//
//        button1.setOnAction(e -> {
//            answer();
//        });
//
//        button2.setOnAction(e -> {
//            empty();
//        });
//
//        button3.setOnAction(e -> {
//            checkout();
//        });
//
//        button4.setOnAction(e -> {
//            try{
//                save();
//                error.setText("保存成功");
//            } catch (IOException e1) {
//                e1.getMessage();
////                field1.setText("保存出错");
//                error.setText("保存出错");
//            }
//        });
//
//        button5.setOnAction(e -> {
//            try{
//                open();
//                error.setText("打开成功");
//            } catch (Exception e1) {
//                e1.getMessage();
////                field1.setText("打开出错");
//                error.setText("打开出错");
//            }
//        });
//
//        button6.setOnAction(e -> {
//            if (openClose % 2 == 0) {
//                mediaPlayer.play();
//                error.setText("音乐已播放");
//                openClose++;
//            } else {
//                mediaPlayer.pause();
//                error.setText("音乐已暂停");
//                openClose++;
//            }
//        });
//
//        return hBox;
//    }
//    //    数独框
//    private GridPane addGridPane() {
//        GridPane gridPane = new GridPane();
//        gridPane.setStyle("-fx-grid-lines-visible: true");
//        gridPane.setAlignment(Pos.CENTER);
//        gridPane.setPadding(new Insets(10.0));
//        for (int num1 = 0; num1 < 9; num1++) {
//            for (int num2 = 0; num2 < 9; num2++) {
//                field[num1][num2] = new TextField();
//                field[num1][num2].setPrefColumnCount(1);
//                gridPane.add(field[num1][num2], num1, num2);
//            }
//        }
//        return gridPane;
//    }
//    //    清空
//    private void empty(){
//        for (int num1 = 0; num1 < 9; num1++) {
//            for (int num2 = 0; num2 < 9; num2++) {
//                field[num1][num2].setText("");
//            }
//        }
//        error.setText("已清空");
//    }
//    //    求解
//    private void answer(){
//        SudoKu sudoKu = new SudoKu();
//        sudo = sudoKu.readAPuzzle(field);
//        if (!sudoKu.isValid(sudo)) {   /*判断数独是否符合输入要求*/
////            field1.getText();
////            field1.setText("输入有误");
//            error.setText("输入有误");
//        } else if (sudoKu.search(sudo)) {      /*搜寻答案*/
////            field1.getText();
////            field1.setText("求解完成");
//            error.setText("求解完成");
//            for (int num1 = 0; num1 < 9; num1++) {
//                for (int num2 = 0; num2 < 9; num2++) {
//                    field[num1][num2].getText();
//                    field[num1][num2].setText(sudo[num1][num2] + "");
//                }
//            }
//        } else {
////            field1.getText();
////            field1.setText("无解");
//            error.setText("无解");
//        }
//    }
//    //    检验
//    private void checkout(){
//        SudoKu sudoKu = new SudoKu();
//        sudo = sudoKu.readAPuzzle(field);
//
//        boolean judge = false;
//
//        for (int num1=0; num1<9; num1++){
//            for (int num2=0; num2<9; num2++){
//                if (field[num1][num2].getText().length() == 0){
//                    judge = true;
//                } else if (Integer.parseInt(field[num1][num2].getText()) == 0){
//                    judge = true;
//                }
//            }
//        }
//        if (!sudoKu.isValid(sudo) || judge==true) {   /*判断数独是否符合输入要求*/
////            field1.getText();
////            field1.setText("答案有错");
//            error.setText("答案有错");
//        } else {
////            field1.getText();
////            field1.setText("答案为真");
//            error.setText("答案为真");
//        }
//    }
//    //    保存
//    private void save() throws IOException{
//        FileChooser fileChooser = new FileChooser();
//        FileChooser.ExtensionFilter extensionFilter1 = new FileChooser.ExtensionFilter("txt","*.txt");
//        FileChooser.ExtensionFilter extensionFilter2 = new FileChooser.ExtensionFilter("all files","*.*");
//        fileChooser.getExtensionFilters().addAll(extensionFilter1,extensionFilter2);
//        File file = fileChooser.showSaveDialog(stage);
//
//        int content;
//        PrintWriter output = new PrintWriter(file, "utf-8");
//        for (int num1 = 0; num1 < 9; num1++) {
//            for (int num2 = 0; num2 < 9; num2++) {
//                if (field[num1][num2].getText().length() == 0) {
//                    content = 0;
//                } else {
//                    int number = Integer.parseInt(field[num2][num1].getText());
//                    content = number;
//                }
//                output.print(content+" ");
//            }
//            output.println();
//        }
//        output.close();
//    }
//    //    打开
//    private void open() throws Exception{
//
//        FileChooser fileChooser = new FileChooser();
//        FileChooser.ExtensionFilter extensionFilter1 = new FileChooser.ExtensionFilter("txt","*.txt");
//        FileChooser.ExtensionFilter extensionFilter2 = new FileChooser.ExtensionFilter("all files","*.*");
//        fileChooser.getExtensionFilters().addAll(extensionFilter1,extensionFilter2);
//
//        File file = fileChooser.showOpenDialog(stage);
//        Scanner input = new Scanner(file, "utf-8");
//        while (input.hasNext()) {
//            for (int num1 = 0; num1 < 9; num1++) {
//                for (int num2 = 0; num2 < 9; num2++) {
//                    field[num2][num1].getText();
//                    field[num2][num1].setText(input.next());
//                }
//            }
//        }
//        input.close();
//
//    }
//    //    背景音乐
//    //    网络地址，播放可能需要开网且稍微等上几秒
//    private void music(){
////        media = new Media("file:/C:/Users/YeShenRen/Desktop/1.mp3");
//        String[] context = new String[2];
//        context[0] = "http://ting6.yymp3.net:82/new27/xuezhiqian7/2.mp3";
//        context[1] = "http://ting6.yymp3.net:82/new26/huachenyu2/4.mp3";
//        int number = (int) (Math.random()*2+0);
//        new Thread(() -> {
////            media =new Media("http://ting6.yymp3.net:82/new27/xuezhiqian7/2.mp3");
////            media = new Media("http://ting6.yymp3.net:82/new26/huachenyu2/4.mp3");
//            media = new Media(context[number]);
//            mediaPlayer=new MediaPlayer(media);
//        }).start();
//    }
//    //    时间
//    private HBox Time(){
//        HBox hBox = new HBox();
//        hBox.setAlignment(Pos.CENTER_LEFT);
//
//        StackPane stackPane = new StackPane();
//        stackPane.setAlignment(Pos.CENTER_RIGHT);
//        Label label = new Label(time+"");
//
//        new Thread(() -> {
//            try {
//                while (true) {
//                    Thread.sleep(1000);
//                    time++;
//                    Platform.runLater(() -> {
//                        label.getText();
//                        label.setText(time + "");
//                    });
//                }
//            } catch (InterruptedException e) {}
//        }).start();
//
//        stackPane.getChildren().add(label);
//        StackPane.setMargin(label, new Insets(0,30,0,0));
//
//        HBox.setMargin(error, new Insets(0,0,0,30));
//
//        hBox.getChildren().add(error);
//        hBox.getChildren().add(stackPane);
//        HBox.setHgrow(stackPane, Priority.ALWAYS);
//
//        return hBox;
//    }
//
//}
//
///**
// * 封装数独的核心算法
// * */
//
//class SudoKu{
//    public SudoKu(){};
//    //  read 键盘数独，return 数独数组
//    public int[][] readAPuzzle(TextField[][] field) {
//        int[][] sudo = new int[9][9];
//        for (int num1 = 0; num1 < 9; num1++) {
//            for (int num2 = 0; num2 < 9; num2++) {
//                if (field[num1][num2].getText().length() == 0) {
//                    sudo[num1][num2] = 0;
//                } else {
//                    int number = Integer.parseInt(field[num1][num2].getText());
//                    sudo[num1][num2] = number;
//                }
//            }
//        }
//        return sudo;
//    }
//    //  read 数独数组，return 数独空闲所在位置数组
//    public int[][] getFreeCellList(int[][] grid) {
//        int i,j,k=0;
//        for (i=0;i<9;i++) {
//            for (j = 0; j < 9; j++) {
//                if (grid[i][j] == 0)
//                    k++;    /*记录数独free个数，用于创建数组sudo_free*/
//            }
//        }
//        int[][] sudo_free = new int[k][2];
//        k=0;    /*k的重置循环使用*/
//        //完成制作空闲数组
//        for (i=0;i<9;i++){
//            for (j=0;j<9;j++){
//                if (grid[i][j]==0){
//                    sudo_free[k][0]=i;
//                    sudo_free[k][1]=j;
//                    k++;
//                }
//            }
//        }
//        return sudo_free;
//    }
//    //  print 填充好数独
//    public void printGrid(int[][] grid) {
//        int i,j;
//        for (i=0;i<9;i++){
//            for (j=0;j<9;j++){
//                System.out.print(grid[i][j]+" ");   /*整齐*/
//                if (j==8){
//                    System.out.println(""); /*换行*/
//                }
//            }
//        }
//    }
//    //  find 答案，or 无解，无解 return false
//    public boolean search(int[][] grid) {
//        int i,j,k=0;
//        int x,y;
//        int[][] free = getFreeCellList(grid);
//        for (k=0;k<free.length;k++){
//            x=free[k][0];
//            y=free[k][1];
//            do {
//                grid[x][y]+=1;
//                if (grid[x][y]==10){
//                    grid[x][y]=0;
//                    k-=2;   /*循环结束+1，故-2，使得回到last one*/
//                    break;  /*防止死循环*/
//                }
//            }while(isValid(x,y,grid));  /*do while 解决为0问题*/
//            if (k==-2)  /*退至0且失败，退出，+1未完成，故为-2*/
//                return false;
//        }
//        return true;
//    }
//    //  judge 数字 是否符合要求, 不符合 return false
//    public boolean isValid(int i, int j, int[][] grid) {
//        int n,m;
//        int i1 = i-i%3;
//        int j1 = j-j%3;   /*计算位置所在方块的左上角数的位置*/
//        /*判断行列是否重复*/
//        for (n=0;n<9;n++){
//            if ((n!=j&&grid[i][n]==grid[i][j])||(n!=i&&grid[n][j]==grid[i][j]))
//                return true;
//        }
//        /*判断3x3是否重复*/
//        for (n=i1;n<i1+3;n++){
//            for (m=j1;m<j1+3;m++){
//                if ((n!=i||m!=j)&&grid[n][m]==grid[i][j])
//                    return true;
//            }
//        }
//        return false;
//    }
//    //  judge 输入数独 是否符合要求，不符合return false
//    public boolean isValid(int[][] grid) {
//        int i,j;
//        for (i=0;i<9;i++){
//            for (j=0;j<9;j++){
//                if (grid[i][j]>9||grid[i][j]<0) /*判断是否范围内*/
//                    return false;
//                if (grid[i][j]!=0){
//                    if (isValid(i,j,grid))  /*判断是否重复*/
//                        return false;
//                }
//            }
//        }
//        return true;
//    }
//}