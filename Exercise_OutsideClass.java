/**
 目录--------------------------------------------------------------------------
 * Serializable类
 * Circle类
*/

/**Serializable类**/
//import java.io.Serializable;
///*
////实现接口Serializable的类的对象可以序列化，但是此类中可能存在不可序列化的东西
////例如静态变量。还有引用的未序列化的对象。
////静态变量，JVM会自动忽略，但是引用未序列化的对象，要添加关键字transiznt进行标记
////让JVM忽略此变量*/
//public class Exercise_OutsideClass implements Serializable
//{
//    private double annualInterestRates;
//    private int numberOfYears;
//    private double loanAmount;
//    private java.util.Date loanDate;
//
//    public Exercise_OutsideClass()
//    {
//        this(2.5, 1, 1000);
//    }
//
//    public Exercise_OutsideClass(double annualInterestRates, int numberOfYears, double loanAmount)
//    {
//        this.annualInterestRates = annualInterestRates;
//        this.numberOfYears = numberOfYears;
//        this.loanAmount = loanAmount;
//        loanDate = new java.util.Date();
//    }
//
//    public double getAnnualInterestRates()
//    {
//        return annualInterestRates;
//    }
//
//    public void setAnnualInterestRates(double annualInterestRates)
//    {
//        this.annualInterestRates = annualInterestRates;
//    }
//
//    public int getNumberOfYears()
//    {
//        return numberOfYears;
//    }
//
//    public void setNumberOfYears(int numverOfYears)
//    {
//        this.numberOfYears = numberOfYears;
//    }
//
//    public double getLoanAmount()
//    {
//        return loanAmount;
//    }
//
//    public void setLoanAmount(double loanAmount)
//    {
//        this.loanAmount = loanAmount;
//    }
//
//    public double getMonthlyPayment()
//    {
//        double monthlyInterestRate = annualInterestRates / 1200;
//        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
//                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
//
//        return monthlyPayment;
//    }
//
//    public double getTotalPayment()
//    {
//        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
//        return totalPayment;
//    }
//
//    public java.util.Date getLoanDate()
//    {
//        return loanDate;
//    }
//}

/**Circle类**/
//import javafx.animation.KeyFrame;
//import javafx.animation.Timeline;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.util.Duration;
//
//public class Exercise_OutsideClass extends Pane {
//    public final double radius = 50;
//    private double x  =80, y = 90;
//    private double dx = 10, dy = 10;
//    private Circle circle = new Circle(x,y,radius);
//    private Timeline timeline;
//
//    public Exercise_OutsideClass(){
//        circle.setFill(Color.RED);
//        this.getChildren().add(circle);
//        timeline = new Timeline(new KeyFrame(Duration.millis(40),e->{
//            moveBall();
//        }));
//        timeline.setCycleCount(Timeline.INDEFINITE);
//        timeline.play();
//    }
//
//    public void increaseSpeed(){
//        timeline.setRate(timeline.getRate()+0.1);
//    }
//    public void decreaseSpeed(){
//        timeline.setRate(timeline.getRate() >0 ? timeline.getRate()-0.1:0);
//    }
//
//    public void play(){
//        timeline.play();
//    }
//
//    public void pause(){
//        timeline.pause();
//    }
//
//    protected  void moveBall(){
//        if (x < radius || x > getWidth()-radius){
//            dx = -dx;
//        }
//        if (y < radius || y > getHeight()-radius){
//            dy = -dy;
//        }
//        x += dx;
//        y += dy;
//        circle.setCenterX(x);
//        circle.setCenterY(y);
//    }
//}


