/**
 目录--------------------------------------------------------------------------
 * Exercise3_21: 判断输入日期为星期几
 * Exercise3_22: 判断输入字符是否在半径为10，圆心为（0，0）的圆内
 * Exercise5_33: 输出10000以内的所有完全数，其所有真因子之和为其本身
 * Exercise5_34: 同电脑玩剪刀石头布，输入相关数字，输出与电脑的胜负
 * Exercise6_1: 输出对整，使得输出整数以6个单位间隔输出
 * Exercise6_13: 输出对整，使得输出小数以相同间隔制表性输出
 * Exercise7_21: 豆机，梅花瓶，高尔顿瓶，输入球的个数，机器的槽数，输出球分布情况
 * Exercise7_23: 设置100个柜子，平方数的柜子为关，并输出关闭的柜子号数
 * Exercise7_28: 输入十个数字，输出这十个数字的所有组合情况
 * Exercise8_14: 输入维度，自动生成矩阵，并判断矩阵特殊行列的个数，以及特殊对角线的个数
 * Exercise8_4_3: 创建雇员类，并按工作时间长短输出雇员工作时间信息
 * Exercise9_12: 创建判断类，输入四个点，判断每两个点形成线段是否相交
 * Exercise10_7: 创建存储机类，完成提款机相关操作
 * Exercise10_25: 创建字符串分割类，完成另类分割
 * Exercise10_25_1: 重构新的split方法，完成另类分割
 * Exercise11_3: 创建更为完善的存储机类，完成存储操作
 * Exercise11_9: 输入矩阵维度，自动生成矩阵，并输出其最多1的行以及列的下标
 * Exercise11_13: 创建特殊的删除方法，去掉输入的十个数字的重复项
 * Exercise12_3: 创建判断数组越界方法，数组越界方法，处理抛出异常
 * Exercise12_5: 以三条边创建三角形，同时创建异常抛出处理类处理异常
 * Exercise12_12: 复制文件内容到自创文件中
 * Exercise14_2: 创建可视化井字棋，电脑自动操作
 * Exercise14_3: 随机可视化显示三张扑克牌
 * Exercise14_6: 可视化设置斑马格子棋盘
 * Exercise14_9: 可视化生成四个风扇
 * Exercise14_10: 可视化生成圆柱主视图
 * Exercise14_15: 可视化生成STOP警告牌
 * Exercise14_16: 可视化生成彩色方框线
 * Exercise15_1: 创建换牌操作，可视化换扑克牌
 * Exercise15_3: 创建球类，创建动作，可视化操作球的运动
 * Exercise15_4: 创建加减乘除类，可视化完成简单计算机操作
 * Exercise15_29: 创建内部车运动类，可视化循环运动的汽车
 * Exercise17_3: 创建特殊文件，完成写入输出操作
 * Exercise17_5: 创建特殊文件，以捕捉异常方式写入操作
 * Exercise17_6_1: 简单外部接口类操作
 * Exercise17_7: 捕获异常处理使用外部类
 * Exercise17_10: 文件拆分储存操作
 * Exercise17_12: 文件整合储存操作
 * Exercise_free: 可视化数据分析图
*/


/**Exercise3_21: 判断输入日期为星期几**/
//import java.util.Scanner;
//public class Exercise{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int year,month,day,h;
//        String input = "";
//        System.out.print("Enter year: (e.g., 2012): ");
//        year = sc.nextInt();
//        System.out.print("Enter month: 1-12: ");
//        month = sc.nextInt();
//        System.out.print("Enter the day of the month: 1-31: ");
//        day = sc.nextInt();
//        if(month == 1 || month == 2){
//            month+=12;
//            year-=1;
//        }
//        // 基姆拉尔森计算公式
//        h = (day + 1 + 2*month + 3*(month+1)/5 + year + year/4 - year/100 + year/400) % 7;
//        switch (h){
//            case 0:input = "Sunday"; break;
//            case 1:input = "Monday"; break;
//            case 2:input = "Tuesday"; break;
//            case 3:input = "Wednesday"; break;
//            case 4:input = "Thursday"; break;
//            case 5:input = "Friday"; break;
//            case 6:input = "Saturday"; break;
//        }
//        System.out.print("Day of the week is " + input);
//    }
//}

/**Exercise3_22: 判断输入字符是否在半径为10，圆心为（0，0）的圆内**/
//import java.util.Scanner;
//public class Exercise {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        double x,y,z;
//        System.out.print("Enter a point with two coordinates: ");
//        x = sc.nextDouble();
//        y = sc.nextDouble();
//        z = x*x + y*y;
//        if(z <= 100){
//            System.out.println("Point (" + x + "," + y + ") is in the circle");
//        }
//        else{
//            System.out.println("Point (" + x + "," + y + ") is not in the circle");
//        }
//
//    }
//}

/**Exercise5_33: 输出10000以内的所有完全数，其所有真因子之和为其本身**/
//public class Exercise {
//    public static void main(String[] args) {
//        int i, k;
//        k = 0;
//        System.out.print("10000以内的完全数有：");
//        for (i = 6; i <= 10000 && k <= 4; i++) {
//            if (beau(i) == 1)
//                System.out.print(i+" ");
//        }
//    }
//
//    public static int beau(int num){
//        int sum = 0,h = 0;
//        for(int a=1;a<num;a++) {
//            if(num % a == 0)
//                sum += a;
//        }
//        if(sum == num)
//            h = 1;
//        return h;
//    }
//}

/**Exercise5_34: 同电脑玩剪刀石头布，输入相关数字，输出与电脑的胜负**/
//import java.util.Scanner;
//public class Exercise{
//    public static void main(String[] args) {
//        int use_num=0,com_num=0;
//        while(use_num<=2&&com_num<=2){
//            System.out.print("scissor(0),rock(1),paper(2): ");
//            Scanner sc = new Scanner(System.in);
//            int use, com = (int) (Math.random() * 3);
//            use = sc.nextInt();
//            System.out.print("The computer is " + guess(com) + ". You are " + guess(use));
//            if (use == com) {
//                System.out.println(" too. It is a draw");
//            } else if ((use == 0 && com == 2) || (use == 1 && com == 0) || (use == 2 && com == 1)) {
//                System.out.println(". You won");
//                use_num+=1;
//            } else {
//                System.out.println(". You loses");
//                com_num+=1;
//            }
//        }
//        System.out.println("\nThe game is over!");
//        System.out.printf("You won %d times\n",use_num);
//        System.out.printf("Computer won %d times\n",com_num);
//    }
//    public static String guess(int num){
//        switch (num) {
//            case 0:
//                return "scissor";
//            case 1:
//                return "rock";
//            case 2:
//                return "paper";
//            default:
//                return "";
//        }
//    }
//}

/**Exercise6_1: 输出对整，使得输出整数以6个单位间隔输出**/
//public class Exercise{
//    public static void main(String[] args) {
//        int i = 1;
//        for(i = 1;i<=100;i++){
//            System.out.printf("%6d",getPentagonalNumber(i));
//            if(i%10==0){
//                System.out.println("\n");
//            }
//        }
//    }
//    public static int getPentagonalNumber(int n){
//        return n*(3*n-1)/2;
//    }
//}

/**Exercise6_13: 输出对整，使得输出小数以相同间隔制表性输出**/
//public class Exercise{
//    public static void main(String[] args) {
//        System.out.println("i"+"        "+"m(i)");
//        System.out.println("----------------");
//        for(int i=1;i<=20;i++){
//            System.out.printf("%-3d%13.4f\n",i,sum_add(i));
//        }
//    }
//    public static double sum_add(int n){
//        double add=0;
//        for(double i=1;i<=n;i++){
//            add+=i/(i+1);
//        }
//        return add;
//    }
//}

/**Exercise7_21: 豆机，梅花瓶，高尔顿瓶，输入球的个数，机器的槽数，输出球分布情况**/
//import java.util.Scanner;
//public class Exercise{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of balls to drop: ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter the number of slots in the bean machine: ");
//        int num2 = sc.nextInt();
//        int[] num = new int[num1];
//        int[] slots = new int[num2];
//        int i,j;
//        for(i=0;i<num1;i++){
//            num[i]=9;
//        }
//        for(i=0;i<num2;i++){
//            slots[i]=0;
//        }
//        for(i=0;i<num1;i++){
//            for(j=0;j<num2-1;j++){
//                int balls = (int) (Math.random() * 2);
//                if(balls == 1){
//                    System.out.print("R");
//                    num[i]+=1;
//                }
//                else{
//                    System.out.print("L");
//                    num[i]-=1;
//                }
//                if(j==num2-2){
//                    System.out.println("");
//                }
//            }
//        }
//        for(i=0;i<num1;i++){
//            num[i]=num[i]/2-1;
//        }
//        for(i=0;i<num1;i++){
//            slots[num[i]]+=1;
//        }
//        for(i=num1;i>0;i--){
//            for(j=0;j<num2;j++){
//                if(slots[j]==i){
//                    System.out.print("O");
//                    slots[j]-=1;
//                }
//                else
//                    System.out.print(" ");
//            }
//            System.out.println("");
//        }
//    }
//}

/**Exercise7_23: 设置100个柜子，平方数的柜子为关，并输出关闭的柜子号数**/
//public class Exercise{
//    public static void main(String[] args) {
//        boolean gui[] = new boolean[100];
//        int i,j;
//        for(i=0;i<100;i++){
//            gui[i]=true;
//        }
//        for(i=1;i<100;i++){
//            for(j=i;j<100;j++){
//                if((j+1)%(i+1)==0){
//                    if(gui[j])
//                        gui[j]=false;
//                    else
//                        gui[j]=true;
//                }
//            }
//        }
//        System.out.print("被关闭柜子的号数：");
//        for(i=0;i<100;i++){
//            if(gui[i])
//                System.out.printf((i+1)+" ");
//        }
//    }
//}

/**Exercise7_28: 输入十个数字，输出这十个数字的所有组合情况**/
//import java.util.Scanner;
//public class Exercise{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入十个整数：");
//        int shuzi[]=new int[10];
//        int i,j,k=0;
//        for(i=0;i<10;i++){
//            shuzi[i]=sc.nextInt();
//        }
//        System.out.println("其所有组合情况为：");
//        for (i=0;i<10;i++){
//            for (j=0;j<10;j++){
//                System.out.print(shuzi[i]);
//                System.out.print(shuzi[j]+" ");
//                if(j==9){
//                    System.out.println("");
//                }
//            }
//        }
//    }
//}

/**Exercise8_14: 输入维度，自动生成矩阵，并判断矩阵特殊行列的个数，以及特殊对角线的个数**/
//import java.util.Scanner;
//public class Exercise{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int i,j,sum1=0,sum2=0,sum3=0,sum4=0;
//        System.out.print("Enter the size for the matrix: ");
//        int num = sc.nextInt();
//        int tongji[]={0,0};
//        int chucun[]=new int[num*2+2];
//        int shu[][]=new int[num][num];
//        String yuju;
//        for (i=0;i<num;i++){
//            for (j=0;j<num;j++){
//                shu[i][j]=(int) (Math.random() * 2);
//            }
//        }
//        for (i=0;i<num;i++){
//            for (j=0;j<num;j++){
//                System.out.print(shu[i][j]);
//                sum1+=shu[i][j];
//                sum2+=shu[j][i];
//                if (j==num-1) {
//                    System.out.println("");
//                }
//            }
//            sum3+=shu[i][i];
//            sum4+=shu[i][num-i-1];
//            chucun[i]=sum1;
//            chucun[num+i]=sum2;
//            sum1=0;
//            sum2=0;
//        }
//        chucun[num*2]=sum3;
//        chucun[num*2+1]=sum4;
//        for (i=0;i<num;i++){
//            yuju="All 0s on row ";
//            if (chucun[i]==0){
//                System.out.println(yuju+i);
//                tongji[0]+=1;
//            }
//            yuju="All 1s on row ";
//            if (chucun[i]==num){
//                System.out.println(yuju+i);
//                tongji[0]+=1;
//            }
//        }
//        yuju="No same numbers on a row";
//        if (tongji[0]==0){
//            System.out.println(yuju);
//        }
//        for (i=num;i<num*2;i++){
//            yuju="All 0s on column ";
//            if (chucun[i]==0){
//                System.out.println(yuju+(i-num));
//                tongji[1]+=1;
//            }
//            yuju="All 1s on column ";
//            if (chucun[i]==num){
//                System.out.println(yuju+(i-num));
//                tongji[1]+=1;
//            }
//        }
//        yuju="No same numbers on a column";
//        if (tongji[1]==0){
//            System.out.println(yuju);
//        }
//        if (chucun[num*2]==0){
//            System.out.println("All 0s on the major diagonal");
//        }
//        else if (chucun[num*2]==num){
//            System.out.println("All 1s on the major diagonal");
//        }
//        else{
//            System.out.println("No same numbers on the major diagonal");
//        }
//        if (chucun[num*2+1]==0){
//            System.out.println("All 0s on the sub-diagonal");
//        }
//        else if (chucun[num*2+1]==num){
//            System.out.println("All 1s on the sub-diagonal");
//        }
//        else{
//            System.out.println("No same numbers on the sub-diagonal");
//        }
//
//    }
//}

/**Exercise8_4_3: 创建雇员类，并按工作时间长短输出雇员工作时间信息**/
//public class Exercise{
//    public static void main(String[] args) {
//        int[][] num={{2,4,3,4,5,8,8},{7,3,4,3,3,4,4},
//                {3,3,4,3,3,2,2},{9,3,4,7,3,4,1},
//                {3,5,4,3,6,3,4,4},{3,4,4,6,3,4,4},
//                {3,7,4,8,3,8,4},{6,3,5,9,2,7,9}
//        };
//        java.lang.String[] eum = {"Emplouee0","Emplouee1","Emplouee2","Emplouee3","Emplouee4","Emplouee5","Emplouee6","Emplouee7",};
//        ComparebleEmplouee[] di=new ComparebleEmplouee[num.length];
//        for (int i=0;i<num.length;i++) {
//            di[i] = new ComparebleEmplouee(eum[i], num[i]);
//        }
//        java.util.Arrays.sort(di);
//        for (ComparebleEmplouee people : di){
//            System.out.println(people.toString());
//        }
//
//    }
//}
//class Employer{
//    java.lang.String Employ;
//    int[] time = new int[7];
//    int sum=0;
//    Employer(java.lang.String Em,int[] Ti){
//        Employ = Em;
//        for (int i=0;i<7;i++){
//            time[i]=Ti[i];
//            sum+=Ti[i];
//        }
//    }
//    public int getSum(){
//        return sum;
//    }
//}
//class ComparebleEmplouee extends Employer implements Comparable<ComparebleEmplouee>{
//    public ComparebleEmplouee(java.lang.String Em,int[] Ti){
//        super(Em, Ti);
//    }
//    @Override
//    public int compareTo(ComparebleEmplouee o){
//        if (getSum()>o.getSum())
//            return 1;
//        else if (getSum()<o.getSum())
//            return -1;
//        else
//            return 0;
//    }
//    public String toString(){
//        return Employ +" "+ getSum() +" "+ time[0] +" "+ time[1] +" "+ time[2] +" "+ time[3] +" "+ time[4] +" "+ time[5] +" "+ time[6];
//    }
//}

/**Exercise9_12: 创建判断类，输入四个点，判断每两个点形成线段是否相交**/
//import java.util.Scanner;
//public class Exercise {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter x1,y1,x2,y2,x3,y3,x4,y4: ");
//        double x1 = sc.nextDouble();
//        double y1 = sc.nextDouble();
//        double x2 = sc.nextDouble();
//        double y2 = sc.nextDouble();
//        double x3 = sc.nextDouble();
//        double y3 = sc.nextDouble();
//        double x4 = sc.nextDouble();
//        double y4 = sc.nextDouble();
//        LinearEquation di = new LinearEquation(x1,y1,x2,y2,x3,y3,x4,y4);
//        di.function();
//    }
//}
//class LinearEquation{
//    double x1,x2,y1,y2,x3,y3,x4,y4;
//    LinearEquation(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4){
//        this.x1=x1;
//        this.x2=x2;
//        this.y1=y1;
//        this.y2=y2;
//        this.x3=x3;
//        this.y3=y3;
//        this.x4=x4;
//        this.y4=y4;
//    }
//    void function(){
//        double a1,b1,c1,a2,b2,c2,jie;
//        double[] jieda = new double[2];
//        a1 = y1-y2;
//        b1 = x1-x2;
//        c1 = (y1-y2)*x1-(x1-x2)*y1;
//        a2 = y3-y4;
//        b2 = x3-x4;
//        c2 = (y3-y4)*x3-(x3-x4)*y3;
//        jie = a1*b2-b1*a2;
//        if (x1==x3&&x2==x4&&y1==y3&&y2==y4){
//            System.out.println("The two lines are coincidence");
//        }
//        else if (jie == 0){
//            System.out.println("The two lines are parallel");
//        }
//        else if (jie!=0){
//            jieda[0] = (c1*b2-c2*b1)/jie;
//            jieda[1] = (a1*c2-a2*c1)/jie;
//            System.out.printf("The intersecting point is at (%.5f,%.5f)",jieda[0],jieda[1]);
//        }
//    }
//}

/**Exercise10_7: 创建存储机类，完成提款机相关操作**/
//import java.util.Scanner;
//public class Exercise{
//    public static void main(String[] args) {
//        Accout di[] = new Accout[10];
//        for (int i=0;i<10;i++){
//            di[i] = new Accout(i);
//        }   //创建十个账户，id分别为0-9
//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            System.out.print("Enter an id: ");
//            int id = sc.nextInt();  //输入id选择
//            System.out.println(""); //美观
//            double money;
//            if (id > 9 || id < 0) {
//                System.out.println("The id is error");  //id错误识别
//                System.out.println(""); //美观
//            }
//            else {
//                label1:while(true) {    //label1为跳转位置
//                    // 菜单
//                    System.out.println("Main menu\n1:check balance\n2:withdraw\n3:deposit\n4:exit\n");
//                    System.out.print("Enter a choice: ");
//                    int num = sc.nextInt(); //输入菜单选择
//                    System.out.println(""); //美观
//                    if (num>4||num<0){
//                        System.out.println("Wrong input, please select again\n");
//                        continue;   //菜单输入错误识别
//                    }
//                    switch (num) {
//                        case 1:
//                            System.out.println(""); //美观
//                            di[id].yuer();  //显示余额
//                            break;
//                        case 2:
//                            System.out.print("Enter amount: "); //输入所取金额
//                            money = sc.nextDouble();
//                            System.out.println(""); //美观
//                            di[id].quqian(money);   //显示所取金额，显示余额
//                            break;
//                        case 3:
//                            System.out.print("Enter amount: "); //输入所存金额
//                            money = sc.nextDouble();
//                            System.out.println(""); //美观
//                            di[id].cuqian(money);   //显示所存金额，显示余额
//                            break;
//                        case 4:
//                            break label1;   //跳转至第一个大循环，重新输入id
//                    }
//                }
//            }
//        }
//
//    }
//}
//class Accout{
//    private int id=0;   //默认id=0
//    private double balance=100; //默认储蓄为100
//    Accout(){
//
//    }   //无输入，默认创建账户0
//    Accout(int id){
//        this.id=id;
//    }   //输入id，创建账户id
//    void yuer(){    //查询余额
//        System.out.println("You balance are : "+balance+"\n");
//    }
//    void quqian(double money){  //取钱
//        balance-=money;
//        System.out.println("Please keep your money: "+money);
//        System.out.println("You balance are : "+balance+"\n");
//    }
//    void cuqian(double money){  //存钱
//        balance+=money;
//        System.out.println("Your deposit is: "+money);
//        System.out.println("You balance are : "+balance+"\n");
//    }
//
//}

/**Exercise10_25: 创建字符串分割类，完成另类分割**/
//import java.util.Arrays;
//import java.util.Scanner;
//public class Exercise {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("输入待分割字符串：");
//        String s = sc.nextLine();
//        System.out.print("输入分割判断字符串：");
//        String regex = sc.nextLine();
//        split split = new split(s , regex); //新split
//        String[] ss = split.splitComplete();
//        for (String sd:ss){ //展示
//            System.out.print(sd+" ");
//        }
//    }
//}
//class split{
//    String str,str1;
//    split(String str,String str1){
//        this.str=str;   //待剪切字符串
//        this.str1=str1; //剪切判断字符串
//    }
//    String[] splitComplete() {
//        int count = 0;
//        int[] position_1 = new int[str.length()];
//        String[] str_1 = str.split(str1);
//        // 如下循环是将截切判断字符串的位置储存在数组position_1中
//        for (int i = 0; i < str1.length(); i++) {
//            if (str.indexOf(str1.charAt(i)) == -1)
//                continue;
//            else {
//                for (int k = 0; k < str.length(); k++) {
//                    if (str.charAt(k) == str1.charAt(i)) {
//                        position_1[count]=k;
//                        count+=1;
//                    }
//                }
//            }
//        }
//        int[] position = new int[count];
//        for (int i = 0; i < count; i++) {
//            position[i] = position_1[i];
//        }   //去除数组中的null，产生刚好完全的数组position
//        Arrays.sort(position);  //排序，为了方便之后的提取
//        String[] come = new String[position.length+str_1.length];
//        int num1=0,num2=0,num3=0;
//        //num1为come的索引使用，num2为position的索引使用，num3为str_1的索引使用
//        for (int l=0;l<str.length();l++){
//            if (position[num2]==l){
//                come[num1]=Character.toString(str.charAt(l));
//                if (num2!=(position.length-1)){
//                    num2++;
//                }   //避免if判断时数组越界
//                num1++;
//            }
//            else{
//                //此if是解决原始split对于字符串第一字符为切割符，以及切割连续时产生的空字符
//                if (str_1[num3].length()!=0) {
//                    come[num1] = str_1[num3];
//                    num1++;
//                }   //空字符的不储存
//                l = l + str_1[num3].length() - 1;   //提取后，l跟随增加，到下一个提取点
//                num3++;
//            }
//        }
//        int count1=0;
//        //如下操作去除数组中的null，产生刚好完全的数组come_complete
//        for (int j=0;j<come.length;j++){
//            if (come[j]==null)
//                break;
//            count1++;
//        }
//        String[] come_complete = new String[count1];
//        for (int j=0;j<count1;j++){
//            come_complete[j]=come[j];
//        }
//        return come_complete;
//    }
//}

/**Exercise10_25_1: 重构新的split方法，完成另类分割**/
//import java.util.Scanner;
//public class Exercise{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("输入待分割字符串：");
//        String s = sc.nextLine();
//        System.out.print("输入分割判断字符串：");
//        String regex = sc.nextLine();
//        String[] split = split(s , regex);
//        for(int i = 0; i < split.length; i ++){
//            System.out.print(split[i] + " ");
//        }
//    }
//    public static String[] split(String s, String regex){
//        String[] StringArray = s.split(regex);
//        String[] split = new String[StringArray.length + StringArray.length - 1];
//        int count = 0;
//        for(int i = 0; i < StringArray.length - 1; i ++){
//            count = count + StringArray[i].length();
//            split[2 * (i + 1) - 2] = StringArray[i];
//            split[2 * (i + 1) - 1] = s.substring(count , count + 1);
//            count ++;
//        }
//        split[split.length - 1] = StringArray[StringArray.length - 1];
//        return split;
//    }
//}

/**Exercise11_3: 创建更为完善的存储机类，完成存储操作**/
//import java.util.Date;
//public class Exercise {
//    public static void main(String[] args) {
//        Account man1=new Account(003,10000,0.04);
//        savingAccount man2=new savingAccount(004,10000,0.01);
//        checkingAccount man3=new checkingAccount(005,100,0.05);
//        System.out.println(man1.toString());
//        System.out.println(man2.toString());
//        System.out.println(man3.toString());
//    }
//}
//class Account{
//    int id=001;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public double getRate() {
//        return rate;
//    }
//
//    public void setRate(double rate) {
//        this.rate = rate;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    double balance=0;
//    double rate=0.03;
//
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    java.util.Date date;
//    public Account(){
//        date = new java.util.Date();
//    }
//    public Account(int id,double balance,double rate){
//        this.id=id;
//        this.balance=balance;
//        this.rate=rate;
//        date=new java.util.Date();
//    }
//    public void deposit(double cun){
//        balance+=cun;
//    }
//    public void withdraw(double qu){
//        balance-=qu;
//    }
//    public String toString(){
//        return "尊敬的"+id+"号顾客,您的银行账户余额为：" + balance;
//    }
//}
//class savingAccount extends Account{
//    java.util.Date date;
//    public savingAccount(){
//        date=new java.util.Date();
//    }
//    public savingAccount(int id,double balance,double rate){
//        super(id, balance, rate);
//    }
//    public void withdraw(double qu){
//        if (balance<qu){
//            System.out.println("抱歉，您的余额并不存在这么多钱。");
//        }
//        else{
//            balance-=qu;
//        }
//    }
//    public String toString(){
//        return "尊敬的"+id+"号顾客,您的储蓄账户余额为："+balance;
//    }
//}
//class checkingAccount extends Account{
//    java.util.Date date;
//    public checkingAccount(){
//        date=new java.util.Date();
//    }
//    public checkingAccount(int id,double balance,double rate){
//        super(id, balance, rate);
//    }
//    public String toString(){
//        return "尊敬的"+id+"号顾客,您的支票账户余额为："+balance;
//    }
//}

/**Exercise11_9: 输入矩阵维度，自动生成矩阵，并输出其最多1的行以及列的下标**/
//import java.util.*;
//public class Exercise {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the array size n: ");
//        int num=sc.nextInt();
//        ArrayList<Integer> row=new ArrayList<>();
//        ArrayList<Integer> column=new ArrayList<>();
//        int row1,column1;
//        int[][] ran=new int[num][num];
////        存放0，1
//        for(int i=0;i<num;i++){
//            for (int j=0;j<num;j++){
//                ran[i][j]=(int) (Math.random()*2);
//            }
//        }
////        输出0，1矩阵
//        for (int i=0;i<num;i++){
//            row1=0;
//            column1=0;
//            for (int j=0;j<num;j++){
//                System.out.print(ran[i][j]);
//                if (j==num-1){
//                    System.out.println("");
//                }
//                if (ran[i][j]==1){
//                    row1+=1;
//                }
//                if (ran[j][i]==1){
//                    column1+=1;
//                }
//            }
//            row.add(row1);
//            column.add(column1);
//        }
////        输出最多1的行列下标
//        System.out.print("The largest row index: ");
//        int num1=0;
//        for (int i=0;i<num;i++){
//            if (row.get(i)==Collections.max(row)){
//                if (num1==0){
//                    System.out.print(i);
//                }
//                else {
//                    System.out.print(", "+i);
//                }
//                num1++;
//            }
//        }
//        num1=0;
//        System.out.println("");
//        System.out.print("The largest column index: ");
//        for (int i=0;i<num;i++){
//            if (column.get(i)==Collections.max(column)){
//                if (num1==0){
//                    System.out.print(i);
//                }
//                else {
//                    System.out.print(", "+i);
//                }
//                num1++;
//            }
//        }
//    }
//}

/**Exercise11_13: 创建特殊的删除方法，去掉输入的十个数字的重复项**/
//import java.util.ArrayList;
//import java.util.Scanner;
//public class Exercise {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter ten integers: ");
//        ArrayList<Integer> list1=new ArrayList<>();
//        for (int i=0;i<10;i++){
//            list1.add(sc.nextInt());
//        }
//        removeDuplicate(list1);
//    }
//    public static void removeDuplicate(ArrayList<Integer> list){
//        for (int i=0;i<list.size();i++){
//            if (i!=list.lastIndexOf(list.get(i))){
//                list.remove(list.lastIndexOf(list.get(i)));
//                i--;
//            }
//        }
//        System.out.print("The distinct integers are ");
//        for (int i=0;i<list.size();i++){
//            System.out.print(list.get(i)+" ");
//        }
//    }
//}

/**Exercise12_3: 创建判断数组越界方法，数组越界方法，处理抛出异常**/
//import java.util.Scanner;
//public class Exercise {
//    public static void main(String[] args) throws IndexOutOfBoundsException{
//        int[] Random = new int[100];
//        boolean donum=true;
//        Scanner sc = new Scanner(System.in);
//        for (int i=0;i<100;i++){
//            Random[i] = (int) (Math.random()*100+1);
//        }
//        do {
//            System.out.print("请输入数组索引: ");
//            int num = sc.nextInt();
//            try {
//                System.out.println("对应查到的数是： " + getArrayValue(Random,num));
//            }
//            catch (RandomException ex) {
//                if(ex.getNum() == -1)
//                    donum = false;
//                else
//                    System.out.println(ex.getMessage());
//
//            }
//        }while (donum);
//
//    }
//    public static int getArrayValue(int[] data, int index) throws RandomException{
//        if(index < 0 || index >= data.length)
//            throw new RandomException("数组越界，请重新输入!",index);
//        return data[index];
//    }
//}
//class RandomException extends Exception{
//    private int num;
//    public RandomException(String message,int num){
//        super(message);
//        this.num=num;
//    }
//    public int getNum(){
//        return num;
//    }
//}

/**Exercise12_5: 以三条边创建三角形，同时创建异常抛出处理类处理异常**/
//import javax.print.DocFlavor;
//import java.lang.annotation.Target;
//import java.util.TreeMap;
//public class Exercise {
//    public static void main(String[] args) throws IllegalTriangleException {
//        try {
//            Triangleset Triangle1 = new Triangleset(1.0, 1.0, 1.0);
//            System.out.println(Triangle1.toString());
//            Triangleset Triangle2 = new Triangleset(1.0, 1.0, 4.0);
//            System.out.println(Triangle2.toString());
//        }
//        catch (IllegalTriangleException ex){
//            System.out.println(ex.getMessage());
//            System.out.println("错误三角形的三边分别为："+ex.getSide1()+" "+ex.getSide2()+" "+ex.getSide3());
//        }
//
//
//    }
//}
//class Triangleset{
//    public double side1,side2,side3;
//    public Triangleset(){
//        side1=1.0;
//        side2=1.0;
//        side3=1.0;
//    }
//    public Triangleset(double side1,double side2,double side3) throws IllegalTriangleException{
//        if (side1+side2<=side3||side1+side3<=side2||side2+side3<=side1){
//            throw new IllegalTriangleException("输入三角形三边值有误！",side1,side2,side3);
//        }
//        else {
//            this.side1=side1;
//            this.side2=side2;
//            this.side3=side3;
//        }
//    }
//    public String toString(){
//        return "正确三角形三边分别为：" + side1 +" "+side2+" "+side3;
//    }
//}
//class IllegalTriangleException extends Exception{
//    public double side1;
//
//    public double getSide1() {
//        return side1;
//    }
//
//    public double getSide2() {
//        return side2;
//    }
//
//    public double getSide3() {
//        return side3;
//    }
//
//    public double side2;
//    public double side3;
//    public IllegalTriangleException(String message,double side1,double side2,double side3){
//        super(message);
//        this.side1=side1;
//        this.side2=side2;
//        this.side3=side3;
//    }
//}

/**Exercise12_12: 复制文件内容到自创文件中**/
//import java.io.File;
//import java.io.PrintWriter;
//import java.util.Scanner;
//public class Exercise {
//    public static void main(String[] args) throws Exception {
//        File file1 = new File("Test.java");
//        File file2 = new File("java Exercise12_12 Test.java");
//        Scanner input = new Scanner(file1,"utf-8");
//        PrintWriter output = new PrintWriter(file2);
//        String name1="";
//        int k=0;
//        int h=0;
//        while (input.hasNext()){
//            String name = input.nextLine();
//            String na = name.trim();
//            if (na.length()!=0) {
//                if (na.charAt(0) == '{') {
//                    output.print(" {");
//                }
//                if (na.charAt(0) != '{'){
//                    if (h!=0)
//                        output.println("");
//                    output.print(name);
//                }
//            }
//            else
//                output.println("");
//            k=0;
//            h++;
//        }
//        input.close();
//        output.close();
//    }
//}

/**Exercise14_2: 创建可视化井字棋，电脑自动操作**/
//import javafx.application.Application;
//import javafx.stage.Stage;
//import javafx.scene.Scene;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.GridPane;
//import javafx.geometry.Insets;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//public class Exercise extends Application
//{
//    @Override
//    public void start(Stage primaryStage)
//    {
//        GridPane pane = new GridPane();
//        pane.setPadding(new Insets(8, 8, 8, 8));
//        pane.setHgap(8);
//        pane.setVgap(8);
//        Integer[] array1 = {0,1,2};
//        Integer[] array2 = {0,1,2};
//        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
//        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
//        Collections.shuffle(list1);
//        Collections.shuffle(list2);
//        int num=0;
//        for (int column = 0; column < 3; column++)
//        {
//            for (int row = 0; row < 3; row++)
//            {
//
//                pane.add(getNode(num), list1.get(column), list2.get(row));
//                num+=1;
//                num=num%2;
//            }
//        }
//
//        Scene scene = new Scene(pane);
//        primaryStage.setTitle("WellChessboard");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    //随机生成井字游戏中的操作
//    public ImageView getNode(int i)
//    {
//        if (i == 0)
//        {
//            return new ImageView("image/o.gif");
//        }
//        else
//        {
//            return new ImageView("image/x.gif");
//        }
//    }
//}

/**Exercise14_3: 随机可视化显示三张扑克牌**/
////随机显示一副扑克牌中任意三张
////采取的随机方式：数组转列表，列表调用Collections.shuffle()方法
//import javafx.application.Application;
//import javafx.stage.Stage;
//import javafx.scene.Scene;
//import javafx.scene.layout.HBox;
//import javafx.geometry.Insets;
//import javafx.scene.image.ImageView;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.Collections;
//public class Exercise extends Application
//{
//    @Override
//    public void start(Stage primaryStage)
//    {
//        HBox pane = new HBox(5);
//        pane.setPadding(new Insets(5, 5, 5, 5));
//        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
//                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
//                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
//                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
//                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
//                51, 52};
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
//        Collections.shuffle(list);
//
//        ImageView p1 = new ImageView("image/card/" + Integer.valueOf(list.get(0)) + ".png");
//        ImageView p2 = new ImageView("image/card/" + Integer.valueOf(list.get(1)) + ".png");
//        ImageView p3 = new ImageView("image/card/" + Integer.valueOf(list.get(2)) + ".png");
//        pane.getChildren().addAll(p1, p2, p3);
//
//        Scene scene = new Scene(pane);
//        primaryStage.setTitle("ShowCard");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}

/**Exercise14_6: 可视化设置斑马格子棋盘**/
////写着写着就写出了兴趣，把方方正正的棋盘改成了
////将面板划分为64份，颜色按照棋盘分布，大小随着窗体大小改变
//import javafx.application.Application;
//import javafx.stage.Stage;
//import javafx.scene.Scene;
//import javafx.scene.layout.GridPane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//public class Exercise extends Application
//{
//    @Override
//    public void start(Stage primaryStage)
//    {
//        GridPane pane = new GridPane();
//        //按照黑白存在的规律，先奇数行的白，然后奇数行的黑
//        //接着偶数行的黑，最后偶数行的白
//        for (int column = 0; column < 8; column = column + 2)
//        {
//            for (int row = 0; row < 8; row = row + 2)
//            {
//                pane.add(getSquare(column, row, pane, 0), column, row);
//            }
//        }
//        for (int column = 1; column < 8; column = column + 2)
//        {
//            for (int row = 0; row < 8; row = row + 2)
//            {
//                pane.add(getSquare(column, row, pane, 1), column, row);
//            }
//        }
//        for (int column = 0; column < 8; column = column + 2)
//        {
//            for (int row = 1; row < 8; row = row + 2)
//            {
//                pane.add(getSquare(column, row, pane, 1), column, row);
//            }
//        }
//        for (int column = 1; column < 8; column = column + 2)
//        {
//            for (int row = 1; row < 8; row = row + 2)
//            {
//                pane.add(getSquare(column, row, pane, 0), column, row);
//            }
//        }
//        Scene scene = new Scene(pane);
//        primaryStage.setTitle("Checkerbord");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//    //按照给定行和列返回设定确定位置，并返回（使用绑定bind）
//    public Rectangle getSquare(int column, int row, GridPane pane, int judge)
//    {
//        Rectangle re = new Rectangle();
//        //找到每个格子的起始坐标，面板的宽和高：pane.width,pane.height
//        re.xProperty().bind(pane.widthProperty().divide(8).multiply(row));
//        re.yProperty().bind(pane.heightProperty().divide(8).multiply(column));
//        //确定每个格子的高和宽
//        re.widthProperty().bind(pane.widthProperty().divide(8));
//        re.heightProperty().bind(pane.heightProperty().divide(8));
//
//        if (judge == 0)
//        {
//            re.setFill(Color.WHITE);
//            re.setStroke(Color.WHITE);
//        }
//        else if (judge == 1)
//        {
//            re.setFill(Color.BLACK);
//            re.setStroke(Color.BLACK);
//        }
//        return re;
//    }
//}

/**Exercise14_9: 可视化生成四个风扇**/
////抱歉老师，考试繁忙，之后补
//import javafx.application.Application;
//import javafx.stage.Stage;
//import javafx.scene.Scene;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Arc;
//import javafx.scene.shape.ArcType;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.GridPane;
//import javafx.geometry.Insets;
//import javafx.scene.paint.Color;
//public class Exercise extends Application
//{
//    @Override
//    public void start(Stage primaryStage)
//    {
//        GridPane pane = new GridPane();
//        pane.setPadding(new Insets(10, 10, 10, 10));
//        for (int column = 0; column < 2; column++)
//        {
//            for (int row = 0; row < 2; row++)
//            {
//                pane.add(getCircle(), column, row);
//                pane.add(getArc(), column, row);
//            }
//        }
//        Scene scene = new Scene(pane);
//        primaryStage.setTitle("ShowFan");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//    //生成空心圆
//    public Pane getCircle()
//    {
//        Pane pane = new Pane();
//        pane.setPadding(new Insets(10, 10, 10, 10));
//        Circle c = new Circle(100, 100, 80);
////      c.setFill(Color.WHITE);
////      c.setStroke(Color.BLACK);
//        c.setStyle("-fx-fill : white; -fx-stroke : black");
//        pane.getChildren().add(c);
//        return pane;
//    }
//    //生成扇叶
//    public Pane getArc()
//    {
//        Pane pane = new Pane();
//        pane.setPadding(new Insets(10, 10, 10, 10));
//        for (int i = 0; i < 4; i++)
//        {
//            Arc a = new Arc(100, 100, 60, 60, (i * 90 + 45), 30);
//            a.setType(ArcType.ROUND);
//            a.setFill(Color.BLACK);
//            a.setStroke(Color.BLACK);
//            pane.getChildren().add(a);
//        }
//        return pane;
//    }
//}

/**Exercise14_10: 可视化生成圆柱主视图**/
//import javafx.application.Application;
//import javafx.geometry.Pos;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Stage;
//import javafx.scene.Scene;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Arc;
//import javafx.scene.shape.Ellipse;
//import javafx.scene.shape.Line;
//import javafx.scene.layout.Pane;
//import javafx.geometry.Insets;
//public class Exercise extends Application
//{
//    @Override
//    public void start(Stage primaryStage)
//    {
//        Pane pane = new Pane();
//        pane.setPadding(new Insets(20, 0, 20, 20));
//        Ellipse e = new Ellipse(100, 60, 80, 20);
//        e.setFill(Color.WHITE);
//        e.setStroke(Color.BLACK);
//        pane.getChildren().add(e);
//
//        Line line1 = new Line(20, 60, 20, 160);
//        Line line2 = new Line(180, 60, 180, 160);
//        line1.setStroke(Color.BLACK);
//        line2.setStroke(Color.BLACK);
//        pane.getChildren().addAll(line1, line2);
//
//        Arc a = new Arc(100, 160, 80, 20, 0, -180);
//        a.setStroke(Color.BLACK);
//        a.setFill(Color.WHITE);
//        pane.getChildren().add(a);
//
//        Arc a2 = new Arc(100, 160, 80, 20, 0, 180);
//        a2.setStroke(Color.BLACK);
//        a2.setFill(Color.WHITE);
//        a2.getStrokeDashArray().addAll(6.0, 21.0);
//        pane.getChildren().add(a2);
//
//        GridPane gridPane = new GridPane();
//        gridPane.setAlignment(Pos.CENTER);
//        gridPane.add(pane,0,0);
//
//        Scene scene = new Scene(gridPane);
//        primaryStage.setTitle("PaintCylinder");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}

/**Exercise14_15: 可视化生成STOP警告牌**/
//import javafx.application.Application;
//import javafx.geometry.Pos;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Stage;
//import javafx.scene.Scene;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Polygon;
//import javafx.collections.ObservableList;
//import javafx.scene.layout.Pane;
//import javafx.geometry.Insets;
//import javafx.scene.text.Text;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
//import javafx.scene.text.FontPosture;
//public class Exercise extends Application
//{
//    @Override
//    public void start(Stage primaryStage)
//    {
//        Pane pane = new Pane();
//        pane.setPadding(new Insets(20, 20, 20, 20));
//        final double X = 150;
//        final double R = 100;
//
//        Polygon line = new Polygon();
//        line.setStroke(Color.RED);
//        line.setFill(Color.RED);
//        ObservableList<Double> list = line.getPoints();
//
//        for (int i = 0; i < 6; i++)
//        {
//            //一定注意三角函数使用的是弧度制
//            list.add(X + R * Math.cos(i * Math.PI / 3));
//            list.add(X - R * Math.sin(i * Math.PI / 3));
//        }
//        pane.getChildren().add(line);
//
//        double startX = X - R / 3 * 2;
//        double startY = X;
//        double size = 50;
//        //size * 0.4 保证字体在中间
//        Text stop = new Text(startX, startY + size * 0.4, "STOP");
//        //Text中的字体设置当然是setFont()
//        stop.setFont(Font.font("MyFont", FontWeight.BOLD, FontPosture.ITALIC, size));
//        stop.setFill(Color.WHITE);
//
//        pane.getChildren().add(stop);
//
//        GridPane gridPane = new GridPane();
//        gridPane.setAlignment(Pos.CENTER);
//        gridPane.add(pane,0,0);
//
//        Scene scene = new Scene(gridPane);
//        primaryStage.setTitle("Warning");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}

/**Exercise14_16: 可视化生成彩色方框线**/
//import javafx.application.Application;
//import javafx.stage.Stage;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.shape.Line;
//import javafx.scene.paint.Color;
//import javafx.beans.property.DoubleProperty;
//import javafx.beans.property.SimpleDoubleProperty;
//public class Exercise extends Application
//{
//    @Override
//    public void start(Stage primaryStage)
//    {
//        Pane pane = new Pane();
//        DoubleProperty x1 = new SimpleDoubleProperty();
//        x1.bind(pane.widthProperty().divide(3));
//        DoubleProperty x2 = new SimpleDoubleProperty();
//        x2.bind(pane.widthProperty().multiply(2).divide(3));
//        DoubleProperty y1 = new SimpleDoubleProperty();
//        y1.bind(pane.heightProperty().divide(3));
//        DoubleProperty y2 = new SimpleDoubleProperty();
//        y2.bind(pane.heightProperty().multiply(2).divide(3));
//
//        Line lineX1 = new Line();
//        lineX1.setStroke(Color.RED);
//        lineX1.startXProperty().bind(x1);
//        lineX1.setStartY(0.0);
//        lineX1.endXProperty().bind(x1);
//        lineX1.endYProperty().bind(pane.heightProperty());
//        Line lineX2 = new Line();
//        lineX2.setStroke(Color.RED);
//        lineX2.startXProperty().bind(x2);
//        lineX2.setStartY(0.0);
//        lineX2.endXProperty().bind(x2);
//        lineX2.endYProperty().bind(pane.heightProperty());
//        Line lineY1 = new Line();
//        lineY1.setStroke(Color.BLUE);
//        lineY1.setStartX(0.0);
//        lineY1.startYProperty().bind(y1);
//        lineY1.endXProperty().bind(pane.widthProperty());
//        lineY1.endYProperty().bind(y1);
//        Line lineY2 = new Line();
//        lineY2.setStroke(Color.BLUE);
//        lineY2.setStartX(0.0);
//        lineY2.startYProperty().bind(y2);
//        lineY2.endXProperty().bind(pane.widthProperty());
//        lineY2.endYProperty().bind(y2);
//
//        pane.getChildren().addAll(lineX1, lineX2, lineY1, lineY2);
//
//        Scene scene = new Scene(pane);
//        primaryStage.setTitle("DivideLine");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}

/**Exercise15_1: 创建换牌操作，可视化换扑克牌**/
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.geometry.VPos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//public class Exercise extends Application {
//    private CardsPane cardsPane = new CardsPane();
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        VBox pane = new VBox(5);
//        pane.setPadding(new Insets(5));
//
//        pane.getChildren().add(cardsPane);
//
//        Button btRefresh = new Button("Refresh");
//        pane.getChildren().add(btRefresh);
//        pane.setAlignment(Pos.CENTER);
//        VBox.setMargin(btRefresh,new Insets(5));
//
//        btRefresh.setOnAction(new CardsPaneCg(cardsPane));
//
//        Scene scene = new Scene(pane);
//        primaryStage.setTitle("RefreshCards");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}
//
//class CardsPane extends HBox{
//    private Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
//            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
//            21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
//            31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
//            41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
//            51, 52};
//    private ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
//    private ImageView p1;
//    private ImageView p2;
//    private ImageView p3;
//    private ImageView p4;
//
//    public CardsPane(){
//        setSpacing(5);
//        setPadding(new Insets(5, 5, 5, 5));
//        Collections.shuffle(list);
//        p1 = new ImageView("image/card/" + Integer.valueOf(list.get(0)) + ".png");
//        p2 = new ImageView("image/card/" + Integer.valueOf(list.get(1)) + ".png");
//        p3 = new ImageView("image/card/" + Integer.valueOf(list.get(2)) + ".png");
//        p4 = new ImageView("image/card/" + Integer.valueOf(list.get(3)) + ".png");
//        getChildren().addAll(p1,p2,p3,p4);
//    }
//
//    public void refresh(){
//        Collections.shuffle(list);
//        getChildren().removeAll(p1,p2,p3,p4);
//        p1 = new ImageView("image/card/" + Integer.valueOf(list.get(0)) + ".png");
//        p2 = new ImageView("image/card/" + Integer.valueOf(list.get(1)) + ".png");
//        p3 = new ImageView("image/card/" + Integer.valueOf(list.get(2)) + ".png");
//        p4 = new ImageView("image/card/" + Integer.valueOf(list.get(3)) + ".png");
//        getChildren().addAll(p1,p2,p3,p4);
//
//    }
//
//}
//
//class CardsPaneCg implements EventHandler<ActionEvent>{
//    private CardsPane paneCg;
//    public CardsPaneCg(CardsPane paneCg){
//        this.paneCg=paneCg;
//    }
//
//    @Override
//    public void handle(ActionEvent event) {
//        paneCg.refresh();
//    }
//}

/**Exercise15_3: 创建球类，创建动作，可视化操作球的运动**/
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.geometry.VPos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.stage.Stage;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//public class Exercise extends Application{
//    private CirclePaneMove circlePaneMove = new CirclePaneMove();
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        BorderPane pane = new BorderPane();
//        HBox hBox = new HBox(5);
//        hBox.setPadding(new Insets(5));
//        hBox.setAlignment(Pos.CENTER);
//
//        pane.setCenter(circlePaneMove);
//
//        Button btUp = new Button("Up");
//        Button btRight = new Button("Right");
//        Button btDown = new Button("Down");
//        Button btLeft = new Button("Left");
//        hBox.getChildren().addAll(btUp,btRight,btDown,btLeft);
//        pane.setBottom(hBox);
//
//        btUp.setOnAction(new Up());
//        btDown.setOnAction(new Down());
//        btLeft.setOnAction(new Left());
//        btRight.setOnAction(new Right());
//
//        Scene scene = new Scene(pane,400,400);
//        primaryStage.setTitle("MoveBall");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//    class Up implements EventHandler<ActionEvent> {
//        @Override
//        public void handle(ActionEvent event) {
//            circlePaneMove.MoveUp();
//        }
//    }
//    class Down implements EventHandler<ActionEvent> {
//        @Override
//        public void handle(ActionEvent event) {
//            circlePaneMove.MoveDown();
//        }
//    }
//    class Left implements EventHandler<ActionEvent> {
//        @Override
//        public void handle(ActionEvent event) {
//            circlePaneMove.MoveLeft();
//        }
//    }
//    class Right implements EventHandler<ActionEvent> {
//        @Override
//        public void handle(ActionEvent event) {
//            circlePaneMove.MoveRight();
//        }
//    }
//}
//
//class CirclePaneMove extends BorderPane {
//    private Circle circle = new Circle(200,200,20);
//
//    public CirclePaneMove(){
//        getChildren().add(circle);
//        circle.setStroke(Color.BLUE);
//        circle.setFill(Color.WHITE);
//    }
//    public void MoveUp(){
//        if (circle.getCenterY()-20-5<0)
//            circle.setCenterY(circle.getCenterY());
//        else
//            circle.setCenterY(circle.getCenterY()-5);
//        circle.setCenterX(circle.getCenterX());
//    }
//    public void MoveDown(){
//        if (circle.getCenterY()+20+5>getHeight())
//            circle.setCenterY(circle.getCenterY());
//        else
//            circle.setCenterY(circle.getCenterY()+5);
//        circle.setCenterX(circle.getCenterX());
//    }
//    public void MoveLeft(){
//        if (circle.getCenterX()-20-5<0)
//            circle.setCenterX(circle.getCenterX());
//        else
//            circle.setCenterX(circle.getCenterX()-5);
//        circle.setCenterY(circle.getCenterY());
//    }
//    public void MoveRight(){
//        if (circle.getCenterX()+20+5>getWidth())
//            circle.setCenterX(circle.getCenterX());
//        else
//            circle.setCenterX(circle.getCenterX()+5);
//        circle.setCenterY(circle.getCenterY());
//    }
//}

/**Exercise15_4: 创建加减乘除类，可视化完成简单计算机操作**/
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//public class Exercise extends Application {
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        VBox pane = new VBox();
//        pane.setAlignment(Pos.CENTER);
//        pane.setPadding(new Insets(20));
//
//        HBox calculation = new HBox(10);
//
//        Label lbNumber1 = new Label("Number1");
//        TextField tfNumber1 = new TextField();
//        tfNumber1.setPrefColumnCount(5);
//        Label lbNumber2 = new Label("Number2");
//        TextField tfNumber2 = new TextField();
//        tfNumber2.setPrefColumnCount(5);
//        Label lbResult = new Label("Result");
//        TextField tfResult = new TextField();
//        tfResult.setPrefColumnCount(5);
//
//        calculation.getChildren().addAll(lbNumber1,tfNumber1,lbNumber2,tfNumber2,lbResult,tfResult);
//        pane.getChildren().add(calculation);
//
//        HBox button = new HBox(10);
//        button.setAlignment(Pos.CENTER);
//
//        Button btAdd = new Button("Add");
//        Button btSubtract = new Button("Subtract");
//        Button btMultiply = new Button("Multiply");
//        Button btDivide = new Button("Divide");
//
//        button.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);
//        pane.getChildren().add(button);
//
//
//        btAdd.setOnAction(e->{
//            double result = Double.parseDouble(tfNumber1.getText())+Double.parseDouble(tfNumber2.getText());
//            tfResult.setText(result+"");
//        });
//        btSubtract.setOnAction(e->{
//            double result = Double.parseDouble(tfNumber1.getText())-Double.parseDouble(tfNumber2.getText());
//            tfResult.setText(result+"");
//        });
//        btMultiply.setOnAction(e->{
//            double result = Double.parseDouble(tfNumber1.getText())*Double.parseDouble(tfNumber2.getText());
//            tfResult.setText(result+"");
//        });
//        btDivide.setOnAction(e->{
//            if (Double.parseDouble(tfNumber2.getText())!=0) {
//                double result = Double.parseDouble(tfNumber1.getText()) / Double.parseDouble(tfNumber2.getText());
//                tfResult.setText(result + "");
//            }
//            else
//                tfResult.setText("Number2 is zero");
//        });
//
//        Scene scene = new Scene(pane);
//        primaryStage.setTitle("SimpleCalculate");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//
//    }
//}

/**Exercise15_29: 创建内部车运动类，可视化循环运动的汽车**/
//import javafx.animation.KeyFrame;
//import javafx.animation.Timeline;
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
//import javafx.scene.input.DragEvent;
//import javafx.scene.input.KeyCode;
//import javafx.scene.input.MouseButton;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Polygon;
//import javafx.scene.shape.Rectangle;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//import sun.plugin2.gluegen.runtime.CPU;
//public class Exercise extends Application{
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        CarPane carPane = new CarPane();
//
//        carPane.setOnMousePressed(e->{carPane.pause();});
//        carPane.setOnMouseReleased(e->{carPane.play();});
//
//        carPane.setOnKeyPressed(e->{
//            if (e.getCode() == KeyCode.UP) {
//                carPane.increaseSpeed();
//            }else if (e.getCode() == KeyCode.DOWN){
//                carPane.decreaseSpeed();
//            }
//        });
//
//        Scene scene = new Scene(carPane,350,150);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//        carPane.requestFocus();
//    }
//    public class CarPane extends Pane {
//        public final double radius = 5;
//        private double x  = 0 , y = 150;
//        private double dx = 1;
//        private Circle circle1 = new Circle(x+15,y-5,radius);
//        private Circle circle2 = new Circle(x+35,y-5,radius);
//        private Rectangle rectangle = new Rectangle(x,y-20,50,10);
//        private Polygon trapezoid = new Polygon();
//        private Timeline timeline;
//        public CarPane(){
//            circle1.setFill(Color.BLACK);
//            circle2.setFill(Color.BLACK);
//            rectangle.setFill(Color.CORNFLOWERBLUE);
//
//            trapezoid.getPoints().addAll(x+10,y-20,x+20,y-30,x+30,y-30,x+40,y-20);
//            trapezoid.setFill(Color.LIGHTBLUE);
//
//            this.getChildren().addAll(circle1,circle2,rectangle,trapezoid);
//            timeline = new Timeline(new KeyFrame(Duration.millis(10), e->{
//                moveCar();
//            }));
//            timeline.setCycleCount(Timeline.INDEFINITE);
//            timeline.play();
//        }
//
//        public void increaseSpeed(){
//            timeline.setRate(timeline.getRate()+0.1);
//        }
//        public void decreaseSpeed(){
//            timeline.setRate(timeline.getRate() >0 ? timeline.getRate()-0.1:0);
//        }
//
//        public void play(){
//            timeline.play();
//        }
//
//        public void pause(){
//            timeline.pause();
//        }
//
//        protected  void moveCar(){
//            x += dx;
//            if (x > getWidth() - 50){
//                x=0;
//            }
//            circle1.setCenterX(x+15);
//            circle2.setCenterX(x+35);
//            rectangle.setX(x);
//            trapezoid.setLayoutX(x);
//        }
//    }
//}

/**Exercise17_3: 创建特殊文件，完成写入输出操作**/
//import java.io.*;
//public class Exercise {
//    public static void main(String[] args) throws IOException {
//        int sum=0;
//        DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_03.dat"));
//        output.writeInt(70);
//        output.writeInt(10);
//        output.writeInt(95);
//        output.writeInt(85);
//        output.writeInt(100);
//        DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_03.dat"));
//        while (input.available()!=0){
//            sum+=input.readInt();
//        }
//        System.out.println(sum);
//
//    }
//}

/**Exercise17_5: 创建特殊文件，以捕捉异常方式写入操作**/
//import java.io.ObjectOutputStream;
//import java.io.ObjectInputStream;
//import java.io.FileOutputStream;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Date;
////技术太差，渗透过的代码。
//public class Exercise {
//    public static void main(String[] args) throws ClassNotFoundException, IOException {
//        try(
//                ObjectOutputStream output = new ObjectOutputStream(
//                        new FileOutputStream("object1.dat"));
//        ){
//            int[] numbers = {1, 2, 3, 4, 5};
//            double d = 5.5;
//            Date date = new Date();
//            output.writeObject(numbers);
//            output.writeDouble(d);
//            output.writeObject(date);
//        }
//
//        try(
//                ObjectInputStream input = new ObjectInputStream(
//                        new FileInputStream("object1.dat"));
//        ){
//            int[] getNum = (int[])(input.readObject());
//            int length = getNum.length;
//            for (int i = 0; i < length; i++)
//            {
//                System.out.print(getNum[i] + " ");
//            }
//            System.out.println();
//            System.out.println(input.readDouble());
//            System.out.println((Date)(input.readObject()));
//        }
//    }
//}

/**Exercise17_6_1: 简单外部接口类操作**/
//import java.io.*;
//public class Exercise
//{
//    public static void main(String[] args) throws IOException
//    {
//        try(
//                ObjectOutputStream output = new ObjectOutputStream(
//                        new FileOutputStream("exercise17_07.dat"));
//        ){
//            for (int i = 0; i < 3; i++)
//            {
//                output.writeObject(new Exercise_OutsideClass());
//            }
//        }
//    }
//}

/**Exercise17_7: 捕获异常处理使用外部类**/
//import java.io.ObjectInputStream;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.EOFException;
//public class Exercise
//{
//    public static void main(String[] args)
//    {
//        try
//        {
//            try(
//                    ObjectInputStream input = new ObjectInputStream(
//                            new FileInputStream("exercise17_07.dat"));
//            ){
//                while (true)
//                {
//                    Exercise_OutsideClass loan = (Exercise_OutsideClass)(input.readObject());
//                    System.out.println(loan.getTotalPayment());
//                    System.out.println(loan.getLoanDate());
//                }
//            }
//        }
//        catch (EOFException ex)
//        {
//            System.out.println("All were read");
//        }
//        catch(ClassNotFoundException ex)
//        {
//            System.out.println(ex);
//        }
//        catch(IOException ex)
//        {
//            ex.printStackTrace();
//        }
//    }
//}

/**Exercise17_10: 文件拆分储存操作**/
//import java.io.*;
//public class Exercise {
//    public static void main(String[] args) throws IOException {
//        int n=10;
//        int num=0;
//        byte[] buffer = new byte[8192];
//        BufferedOutputStream[] output = new BufferedOutputStream[n];
//        BufferedInputStream input = new BufferedInputStream(new FileInputStream("LOL.rar"));
//        int estimate=input.available();
//        int end=estimate/n;
//        for (int i=0;i<n;i++){
//            output[i] = new BufferedOutputStream(new FileOutputStream("SourceFile"+i+".txt"),end);
//        }
//        while ((input.read(buffer))!=-1){
//            output[num].write(buffer);
//            if (estimate-input.available()>end){
//                estimate=input.available();
//                num++;
//            }
//        }
//        input.close();
//        for (int i=0;i<n;i++)
//            output[i].close();
//    }
//}

/**Exercise17_12: 文件整合储存操作**/
//import java.io.*;
//public class Exercise {
//    public static void main(String[] args) throws IOException {
//        int n=10;
//        int num=0;
//        byte[] buffer = new byte[8192];
//        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("SourceFile.txt"));
//        BufferedInputStream[] input = new BufferedInputStream[n];
//        for (int i=0;i<n;i++){
//            input[i] = new BufferedInputStream(new FileInputStream("SourceFile"+i+".txt"));
//        }
//        for (int i=0;i<n;i++){
//            while ((input[i].read(buffer))!=-1){
//                output.write(buffer);
//            }
//        }
//        for (int i=0;i<n;i++){
//            input[i].close();
//        }
//        output.close();
//    }
//}

/**Exercise_free: 可视化数据分析图**/
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
//public class Exercise extends Application{
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
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
//        mainPane.setRight(flowPane);
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
//        flowPane.setPrefWrapLength(169);
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