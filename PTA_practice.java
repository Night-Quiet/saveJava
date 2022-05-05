/**
 目录--------------------------------------------------------------------------
 * 考试1：输入数组，以及指定范围，删除数组中属于范围内的数字，并输出剩余的数字
 * 考试1：输入数组，反向输出数组内容
 * 考试1：约瑟夫环操作，输入参与人数，以及出列数字，顺序输出出列人号码
 * 考试2：带头结点的单链表的逆置，输入字符串abcd，输出字符串dcba
 * 考试2： jmu-ds-简单密码，输入一行密文字符串，输出每个大写字母换成第前五号字符的明文字符串
 * 考试2： 栈、队列和字符串的基本操作，对输入字符串先入栈，在去指定字符出栈，在入队，最后依次输出出队元素
 * 考试2（未完成-已完成）： 求最大元素值，将n个元素的数组以递归方式算出其最大值，并输出比较操作流程
 * 数据结构第一次练习 1：整数的四则运算，输入两个数字，输出其所有计算
 * 数据结构第一次练习 2：鸡兔同笼问题，输入两个数字，分别是总头数，总腿数，输出鸡，兔的数量
 * 数据结构第一次练习 3：A+B，输入两个数字，输出这两个数字的和
 * 数据结构第二章课堂实验 1：数组循环左移，输入一个数组和需要移动的步数，依次输出移动后的数组数字
 * 数据结构第二次练习 1：顺序表的建立及遍历，输入建立顺序表并输出
 * 数据结构第二次练习 2：jmu-ds-顺序表区间元素删除，属于一个顺序表，删除其中范围数字，再依次输出剩余数字
 * 数据结构第二次练习 3：插入有序数组，输入一个有序数组，在插入一个数字，并使其依旧有序
 * 数据结构第三次练习 1：单链表的创建及遍历，输入一个单链表，并依次输出
 * 数据结构第三次练习 2：求集合交集，输入两个集合，输出交集的元素
 * 数据结构第三次练习 3：两个有序链表合并（新表不含重复元素），输入两个集合，输出并集的元素
 * 数据结构第四次练习 1：堆栈操作合法性，S,X分别是入栈、入栈，如果操作可行且最后栈空即合法，判断合法
 * 数据结构第四次练习 2：回文判断，输入字符序列，输出判断其是否为空
 * 数据结构第四次练习 3：求最大公约数，输入两个整数，输出其辗转相除过程以及结果
 * 数据结构第四次练习 4：逆波兰表达式求值，输入一组逆波兰序列，输出最终计算结果
 * 数据结构第五次练习 1：队列的基本操作，0代表入队，1代表出队，输入一组队列的操作，依次输出队列的数字元素
 * 数据结构第五次练习 2：软硬车厢交替排列，H代表硬座车厢，S代表软座车厢，输入一个车厢队列，输出交替后的车厢队列
 * 数据结构第六次练习 1：找最小的字符串，输入N个字符串，输出其中最小的字符串
 * 数据结构第六次练习 2：字符串反正序连接，将字符串的反序和正序进行连接形成一个新串，并输出
 * 数据结构第六次练习 3：恺撒密码，对输入字符串的每个字符向后移动指定位数得到密文，并输出
 * 数据结构第七次练习 1：二叉树的层次遍历，编写程序，实现（1）按先序遍历序列建立二叉树的二叉链表；（2）按层次遍历二叉树。
 * 数据结构第八次练习 1：求二叉树的叶子结点个数，输入先序，输出中序、叶子结点个数
 * 数据结构第八次练习 2：交换二叉树中每个结点的左孩子和右孩子
 * 数据结构第九次练习 1：图深度优先遍历：输入图顶点数和边数，以及顶点相连，输出深度优先遍历结点序列
 * 数据结构第十次练习 1：排序：输入一组数据，输出排序后结果
 * 数据结构第十一次练习 1：二分查找：二分法查找x，输出x所在下标即比较次数
*/

/**考试1：输入数组，以及指定范围，删除数组中属于范围内的数字，并输出剩余的数字**/
//import java.util.ArrayList;
//import java.util.Scanner;
//public class PTA_practice {
//    public static void main(String[] args) {
//        int num_elem;
//        ArrayList<Integer> list = new ArrayList<>();
//        int x, y;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入数组的大小：");
//        num_elem = sc.nextInt();
//        System.out.print("请输入"+num_elem+"个数字：");
//        for (int i=0; i<num_elem; i++){
//            list.add(sc.nextInt());
//        }
//        System.out.print("请输入限制范围的左范围数字：");
//        x = sc.nextInt();
//        System.out.print("请输入限制范围的右范围数字：");
//        y = sc.nextInt();
//        for (int j=0; j<num_elem; j++){
//            if (list.get(j)>=x&&list.get(j)<=y){
//                list.remove(j);
//                j--;
//                num_elem--;
//            }
//        }
//        System.out.print("不在指定范围内的数字有：");
//        for (int k=0; k<list.size(); k++){
//            System.out.print(list.get(k));
//            if (k!=list.size()-1){
//                System.out.print(" ");
//            }
//        }
//    }
//}

/**考试1：输入数组，反向输出数组内容**/
//import java.util.Scanner;
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入数组的大小：");
//        int num_elem = sc.nextInt();
//        int[] list = new int[num_elem];
//        System.out.print("请输入"+num_elem+"个数字：");
//        for (int i=0; i<num_elem; i++){
//            list[i]=sc.nextInt();
//        }
//        System.out.print("输入数组的反向输出为：");
//        for (int j=0; j<num_elem; j++){
//            System.out.print(list[num_elem-j-1]);
//            if (j!=num_elem-1){
//                System.out.print(" ");
//            }
//        }
//    }
//}

/**考试1：约瑟夫环操作，输入参与人数，以及出列数字，顺序输出出列人号码**/
//import java.util.ArrayList;
//import java.util.Scanner;
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入参与人数个数：");
//        int num_person = sc.nextInt();
//        System.out.print("请输入出列数字：");
//        int num_out = sc.nextInt();
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i=0 ;i<num_person; i++){
//            list.add(i+1);
//        }
//        boolean judge = true;
//        int counter = 1;
//        int counter_person = 0;
//        System.out.print("出列输出顺序为：");
//        while (judge){
//            if (counter==num_out){
//                if (list.size()==1) {
//                    System.out.print(list.get(counter_person));
//                } else {
//                    System.out.print(list.get(counter_person) + " ");
//                }
//                list.remove(counter_person);
//                counter = 0;
//                counter_person--;
//            }
//            if (list.size()==0) {
//                break;
//            }
//            counter++;
//            counter_person++;
//            counter_person=counter_person%list.size();
//        }
//    }
//}

/**考试2：带头结点的单链表的逆置，输入字符串abcd，输出字符串dcba**/
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        String str = null;
//        Lnode La = new Lnode();
//        La.next = null;
//        Lnode r = La; //r是La带头结点的单链表的尾指针
//        Lnode Lb = new Lnode();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入一串字符串：");
//        str = scanner.next();
//        //尾插法创建La带头结点的单链表
//        for (int i = 0; i < str.length(); i++) {
//            Lnode s = new Lnode();
//            s.data = str.charAt(i);
//            s.next = null;
//            r.next = s;
//            r = s;
//        }
//        Lb = Reverse(La);
//        Lnode p = Lb.next;
//        System.out.print("该字符串单链表的逆置字符串顺序为：");
//        while (p != null){
//            System.out.print(p.data);
//            p = p.next;
//        }
//    }
//    static class Lnode{
//        char data;
//        Lnode next;
//    }
//    public static Lnode Reverse( Lnode L ) {
//        Lnode Old_head, New_head, Temp;
//        New_head = null;
//        Old_head = L.next;
//        while (Old_head != null) {
//            Temp = Old_head.next;
//            Old_head.next = New_head;
//            New_head = Old_head;
//            Old_head = Temp;
//        }
//        L.next = New_head;
//        return L;
//    }
//}

/**考试2： jmu-ds-简单密码，输入一行密文字符串，输出每个大写字母换成第前五号字符的明文字符串**/
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int judge = 5;
//        while (judge != -1){
//            System.out.print("请输入一行密文字符串：");
//            String toString = sc.nextLine();
//            String output = "";
//            for (int i=0;i<toString.length();i++){
//                int num_change = toString.substring(i,i+1).hashCode();
//                if (num_change >=65 && num_change<=90) {
//                    output += (char) ((num_change -65 + 26 - 5) % 26 + 65);
//                } else {
//                    output += (char) (num_change);
//                }
//            }
//            System.out.print("转化成的明文字符串为：");
//            if (output.isEmpty()){
//                System.out.println("NULL");
//            } else {
//                System.out.println(output);
//            }
//        }
//    }
//}

/**考试2： 栈、队列和字符串的基本操作，对输入字符串先入栈，在去指定字符出栈，在入队，最后依次输出出队元素**/
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//import java.util.Stack;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入一个字符串和一个指定字符：");
//        String toString = sc.nextLine();
//        Stack<String> stack = new Stack<>();
//        Queue<String> queue = new LinkedList<>();
//        String[] todo = toString.split(" ");
//        int len = todo[0].length();
//        System.out.print("字符串入栈后栈的大小和栈顶元素分别为：");
//        System.out.println(len+" "+todo[0].substring(len-1,len));
//        for (int i=0;i<len;i++){
//            stack.push(todo[0].substring(i,i+1));
//        }
//        System.out.print("栈的所有元素为：");
//        for (int j=0;j<len;j++){
//            String del = stack.pop();
//            System.out.print(del);
//            if (!del.equals(todo[1])){
//                queue.offer(del);
//            }
//        }
//        System.out.println("");
//        System.out.print("出栈并去除指定元素入队后队的大小和队头元素分别为：");
//        System.out.println(queue.size()+" "+ queue.element());
//        System.out.print("队列的所有元素为：");
//        for (String q:queue){
//            System.out.print(q);
//        }
//        System.out.println("");
//
//    }
//}

/**考试2（未完成-已完成）： 求最大元素值，将n个元素的数组以递归方式算出其最大值，并输出比较操作流程**/
/*输入样例：5 1 3 2 5 3，输出样例：max(1,3)=3 max(3,2)=3 max(3,5)=5 max(5,3)=5 5**/
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入需要输入的元素个数：");
//        int num = sc.nextInt();
//        System.out.print("请输入指定个数元素：");
//        int[] suzu = new int[num];
//        for (int i=0;i<num;i++){
//            suzu[i] = sc.nextInt();
//        }
//        System.out.print("最大值比较过程：");
//        arraymax(suzu,1);
//    }
//
//    public static int arraymax(int[] a, int n) {
//        if (n>a.length-1){
//            System.out.print("\n"+"最大值为：");
//            System.out.println(a[0]);
//            return a[0];
//        } else {
//            System.out.printf("max(%d,%d)=%d ", a[0], a[n], max(a[0],a[n]));
//            a[0] = max(a[0],a[n]);
//            n++;
//            return arraymax(a, n);
//        }
//    }
//
//    public static int max(int x, int y) {
//        if (x >= y)
//            return x;
//        else
//            return y;
//    }
//}

/**数据结构第一次练习 1：整数的四则运算，输入两个数字，输出其所有计算**/
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入需要四则运算的两个数字：");
//        int num_input_first =  sc.nextInt();
//        int num_input_second = sc.nextInt();
//        String[] operator = {"+","-","*","/","="};
//        int[] num_calculate = {num_input_first+num_input_second,
//                num_input_first-num_input_second,
//                num_input_first*num_input_second,
//                num_input_first/num_input_second
//        };
//        System.out.println("这两个数字的四则运算为：");
//        for (int i=0;i<4;i++){
//            System.out.println(num_input_first+" "+operator[i]+" "+num_input_second+
//                    " "+operator[4]+" "+num_calculate[i]);
//        }
//    }
//}

/**数据结构第一次练习 2：鸡兔同笼问题，输入两个数字，分别是总头数，总腿数，输出鸡，兔的数量**/
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("依次输入鸡兔头的数量和腿的数量：");
//        int num_input_x =  sc.nextInt();
//        int num_input_y = sc.nextInt();
//        int num_chicken = (4*num_input_x-num_input_y)/2;
//        int num_rabbit = num_input_x-num_chicken;
//        System.out.print("鸡的数量和兔的数量：");
//        if ((4*num_input_x-num_input_y)%2!=0 || num_chicken<0 || num_rabbit<0) {
//            System.out.println(-1+" "+-1);
//        } else {
//            System.out.println(num_chicken+" "+num_rabbit);
//        }
//    }
//}

/**数据结构第一次练习 3：A+B，输入两个数字，输出这两个数字的和**/
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入两个需要相加的数字：");
//        int num_input_first =  sc.nextInt();
//        int num_input_second = sc.nextInt();
//        System.out.print("两数之和为：");
//        System.out.println(num_input_first+num_input_second);
//    }
//}

/**数据结构第二章课堂实验 1：数组循环左移，输入一个数组和需要移动的步数，依次输出移动后的数组数字**/
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入数组的大小和左移的步数：");
//        int n_num = sc.nextInt();
//        int left_num = sc.nextInt();
//        ArrayList<Integer>  list = new ArrayList<>();
//        System.out.print("请依次输入数组的数字：");
//        for (int i=0; i<n_num; i++){
//            list.add(sc.nextInt());
//        }
//        for (int j=0;j<left_num;j++){
//            int num_del = list.get(0);
//            list.add(num_del);
//            list.remove(0);
//        }
//        System.out.print("左移"+left_num+"步后的数组数字顺序为：");
//        for (int k=0;k<n_num;k++){
//            if (k==n_num-1) {
//                System.out.print(list.get(k));
//            } else {
//                System.out.print(list.get(k) + " ");
//            }
//        }
//    }
//}

/**数据结构第二次练习 1：顺序表的建立及遍历，输入建立顺序表并输出**/
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入顺序表大小：");
//        int sun_input = sc.nextInt();
//        int[] num_input = new int[sun_input];
//        System.out.print("请依次输入需要建立顺序表的数字：");
//        for (int i=0; i<sun_input; i++){
//            num_input[i] = sc.nextInt();
//        }
//        System.out.print("顺序表的数字依次是：");
//        for (int j=0; j<sun_input; j++){
//            if (j == sun_input-1) {
//                System.out.print(num_input[j]);
//            } else {
//                System.out.print(num_input[j] + " ");
//            }
//        }
//    }
//}

/**数据结构第二次练习 2：jmu-ds-顺序表区间元素删除，属于一个顺序表，删除其中范围数字，再依次输出剩余数字**/
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入顺序表个元素个数：");
//        int num_input = sc.nextInt();
//        int[] dig_input = new int[num_input];
//        int[] del_input = new int[2];
//        int[] del_save = new int[num_input];
//        int index_save = 0;
//        int num_end = 0;
//        System.out.print("请依次输入顺序表的元素：");
//        for (int i=0; i<num_input; i++){
//            dig_input[i] = sc.nextInt();
//        }
//        System.out.print("请依次输入删除元素的左右范围：");
//        for (int j=0; j<del_input.length; j++){
//            del_input[j] = sc.nextInt();
//        }
//        for (int k=0; k<num_input; k++){
//            if (dig_input[k] > del_input[1] || dig_input[k] < del_input[0]){
//                del_save[index_save++] = dig_input[k];
//            }
//        }
//        for (int l=0; l<index_save; l++){
//            if (l == index_save-1) {
//                System.out.print(del_save[l]);
//            } else {
//                System.out.print(del_save[l] + " ");
//            }
//        }
//    }
//}

/**数据结构第二次练习 3：插入有序数组，输入一个有序数组，在插入一个数字，并使其依旧有序**/
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入数组的大小：");
//        int num_input = sc.nextInt();
//        int[] dig_input = new int[num_input];
//        int[] dig_output = new int[num_input+1];
//        System.out.print("请从小到大顺序输入"+num_input+"个整数：");
//        for (int i=0; i<num_input; i++){
//            dig_input[i] = sc.nextInt();
//        }
//        System.out.print("请输入插入的数字：");
//        int ins_input = sc.nextInt();
//        int num_dig_input = 0;
//        int num_record = 0;
//        for (int j=0; j<num_input; j++){
//            if (dig_input[j]>ins_input){
//                num_dig_input = j;
//                num_record++;
//                break;
//            }
//        }
//        if (num_dig_input==0 && num_record == 0){
//            num_dig_input = num_input;
//        }
//        int num_dig = 0;
//        for (int k=0; k<num_input+1; k++){
//            if (k==num_dig_input){
//                dig_output[k] = ins_input;
//            } else {
//                dig_output[k] = dig_input[num_dig++];
//            }
//        }
//        System.out.print("插入后的有序顺序表依次是：");
//        for (int l=0; l<num_input+1; l++){
//            System.out.print(dig_output[l]+" ");
//        }
//    }
//}

/**数据结构第三次练习 1：单链表的创建及遍历，输入一个单链表，并依次输出**/
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入单链表大小：");
//        int num_inp = sc.nextInt();
//        int[] num_array = new int[num_inp];
//        System.out.print("请依次输入"+num_inp+"个数字：");
//        for (int num_i=0; num_i<num_inp; num_i++){
//            num_array[num_i] = sc.nextInt();
//        }
//        System.out.print("单链表储存的数字依次是：");
//        for (int num_j=0; num_j<num_inp; num_j++){
//            System.out.print(num_array[num_j]);
//            if (num_j!=num_inp-1)
//                System.out.print(" ");
//        }
//    }
//}

/**数据结构第三次练习 2：求集合交集，输入两个集合，输出交集的元素**/
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入集合A和集合B的大小：");
//        int num_first = sc.nextInt();
//        int num_second = sc.nextInt();
//        int[] array_first = new int[num_first];
//        int[] array_second = new int[num_second];
//        int[] array_collect = new int[num_first+num_second];
//        System.out.print("请输入集合A的"+num_first+"个数字元素：");
//        for (int array_i=0; array_i<num_first; array_i++){
//            array_first[array_i] = sc.nextInt();
//        }
//        System.out.print("请输入集合A的"+num_second+"个数字元素：");
//        for (int array_i=0; array_i<num_second; array_i++){
//            array_second[array_i] = sc.nextInt();
//        }
//        int counter=0;
//        for (int array_j=0; array_j<num_first; array_j++){
//            for (int array_k=0; array_k<num_second; array_k++){
//                if (array_first[array_j] == array_second[array_k]){
//                    array_collect[counter] = array_first[array_j];
//                    counter++;
//                    break;
//                }
//            }
//        }
//        System.out.print("集合A，B的交集元素为：");
//        for (int array_l=0; array_l<counter; array_l++){
//            System.out.print(array_collect[array_l]);
//            if (array_l!=counter-1){
//                System.out.print(" ");
//            }
//        }
//    }
//}

/**数据结构第三次练习 3：两个有序链表合并（新表不含重复元素），输入两个集合，输出并集的元素**/
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        boolean judge=true;
//        ArrayList<Integer> list_first = new ArrayList<>();
//        ArrayList<Integer> list_second = new ArrayList<>();
//        ArrayList<Integer> list_comb_temp = new ArrayList<>();
//        ArrayList<Integer> list_comb = new ArrayList<>();
//        System.out.print("请输入集合A的元素（-1结束）：");
//        while (judge){
//            int input = sc.nextInt();
//            if (input==-1){
//                break;
//            }
//            list_first.add(input);
//            list_comb_temp.add(input);
//        }
//        System.out.print("请输入集合B的元素（-1结束）：");
//        while (judge){
//            int input = sc.nextInt();
//            if (input==-1){
//                break;
//            }
//            list_second.add(input);
//            list_comb_temp.add(input);
//        }
//        Collections.sort(list_comb_temp);
//        while (list_comb_temp.size()!=0){
//            int judge_num = list_comb_temp.get(0);
//            list_comb_temp.remove(0);
//            list_comb.add(judge_num);
//            while (true) {
//                if (list_comb_temp.size()!=0) {
//                    if (judge_num == list_comb_temp.get(0)) {
//                        list_comb_temp.remove(0);
//                    } else {
//                        break;
//                    }
//                } else {
//                    break;
//                }
//            }
//        }
//        System.out.print("集合A，B的并集元素为：");
//        if (list_comb.size()==0){
//            System.out.println("NULL");
//        } else {
//            for (int con_i=0; con_i<list_comb.size(); con_i++){
//                System.out.print(list_comb.get(con_i));
//                if (con_i!=list_comb.size()-1){
//                    System.out.print(" ");
//                }
//            }
//        }
//    }
//}

/**数据结构第四次练习 1：堆栈操作合法性，S,X分别是入栈、入栈，如果操作可行且最后栈空即合法，判断合法**/
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请依次输入待测序列个数和堆栈最大容量：");
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        String end = sc.nextLine();
//        int[] list_judge = new int[N];
//        for (int i=0;i<N;i++){
//            list_judge[i]=0;
//            ArrayList<Integer> list = new ArrayList<>();
//            System.out.print("请输入一个仅由S、X构成的序列：");
//            String out = sc.nextLine();
//            int num_judge=0;
//            for (int j=0;j<out.length();j++){
//                if (out.charAt(j)=='S'){
//                    list.add(1);
//                    num_judge++;
//                    if (num_judge>M){
//                        list_judge[i]=1;
//                    }
//                } else if (out.charAt(j) == 'X'){
//                    if (list.size()==0) {
//                        list_judge[i]=1;
//                    } else {
//                        list.remove(0);
//                    }
//                    num_judge--;
//                }
//            }
//            if (list.size()!=0){
//                list_judge[i]=1;
//            }
//        }
//        System.out.println("序列是否合法判断为：");
//        for (int i=0;i<N;i++) {
//            if (list_judge[i]==0){
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }
//    }
//}

/**数据结构第四次练习 2：回文判断，输入字符序列，输出判断其是否为空**/
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入一个字符串序列：");
//        String input = sc.nextLine();
//        ArrayList<Character> list = new ArrayList<>();
//        boolean judge=true;
//        for(int i=0;i<input.length();i++){
//            list.add(input.charAt(input.length()-i-1));
//        }
//        for (int j=0;j<input.length();j++){
//            if (input.charAt(j)!=list.get(j)){
//                judge=false;
//            }
//        }
//        System.out.print("该字符串序列是否是回文的判断为：");
//        if (judge){
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//}

/**数据结构第四次练习 3：求最大公约数，输入两个整数，输出其辗转相除过程以及结果**/
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入两个正整数：");
//        int first_num = sc.nextInt();
//        int second_num = sc.nextInt();
//        int tem_num;
//        boolean judge = true;
//        System.out.print("辗转相除的过程以及结果为：");
//        while (judge) {
//            System.out.printf("gcd(%d,%d) ",first_num,second_num);
//            if (first_num<second_num){
//                tem_num = first_num;
//                first_num = second_num;
//                second_num = tem_num;
//                continue;
//            }
//            if (first_num%second_num==0){
//                System.out.println(second_num);
//                break;
//            } else {
//                tem_num = first_num%second_num;
//                first_num = second_num;
//                second_num = tem_num;
//                continue;
//            }
//        }
//    }
//}

/**数据结构第四次练习 4：逆波兰表达式求值，输入一组逆波兰序列，输出最终计算结果**/
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<String> list = new ArrayList<>();
//        System.out.print("请输入一组逆波兰序列：");
//        String input = sc.nextLine();
//        String[] content = input.split(" ");
//        for (int i=0;i<content.length;i++){
//            list.add(content[i]);
//        }
//        boolean judge=true;
//        while (judge){
//            int new_num=0;
//            int num=0;
//            int num_i=0;
//            for (int i=0;i<list.size();i++){
//                if (judge_arg(list,i)){
//                    num_i = i;
//                    break;
//                }
//            }
//            new_num=calculate(list,num_i);
//            list.remove(num_i-2);
//            list.remove(num_i-2);
//            list.remove(num_i-2);
//            list.add(num_i-2,String.valueOf(new_num));
//            if (list.size()==1){
//                judge=false;
//            }
//        }
//        System.out.print("最终的计算结果为：");
//        System.out.println(list.get(0));
//    }
//    private static int calculate(ArrayList<String> list,int num){
//        int new_num=0;
//        if (list.get(num).equals("+")){
//            new_num=Integer.valueOf(list.get(num-2))+Integer.valueOf(list.get(num-1));
//        } else if (list.get(num).equals("-")){
//            new_num=Integer.valueOf(list.get(num-2))-Integer.valueOf(list.get(num-1));
//        } else if (list.get(num).equals("*")){
//            new_num=Integer.valueOf(list.get(num-2))*Integer.valueOf(list.get(num-1));
//        }
//        return new_num;
//    }
//    private static boolean judge_arg(ArrayList<String> list,int num){
//        boolean judge = true;
//        if (!list.get(num).equals("+")&&!list.get(num).equals("-")&&!list.get(num).equals("*")){
//            judge=false;
//        }
//        return judge;
//    }
//}

/**数据结构第五次练习 1：队列的基本操作，0代表入队，1代表出队，输入一组队列的操作，依次输出队列的数字元素**/
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入入队的数字个数和操作次数：");
//        int first = sc.nextInt();
//        int second = sc.nextInt();
//        ArrayList<Integer> list = new ArrayList<>();
//        int num=1;
//        for (int i=0;i<second;i++){
//            System.out.print("请输入队列的操作（0代表入队，1代表出队）：");
//            int input = sc.nextInt();
//            if (input==0){
//                list.add(num);
//                num++;
//            } else {
//                list.add(list.get(0));
//                list.remove(0);
//            }
//        }
//        System.out.print("最终队列的数字元素依次为：");
//        for (int i=0;i<first;i++){
//            if (i!=0){
//                System.out.print(" ");
//            }
//            System.out.print(list.get(i));
//        }
//    }
//}

/**数据结构第五次练习 2：软硬车厢交替排列，H代表硬座车厢，S代表软座车厢，输入一个车厢队列，输出交替后的车厢队列**/
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Character> list = new ArrayList<>();
//        System.out.print("请输入车厢总节数（min为2，max为10）：");
//        int size = sc.nextInt();
//        String empty = sc.nextLine();
//        if (size<2 || size>10){
//            System.out.println("ERROR");
//        } else {
//            System.out.print("请输入车厢代号队列（H代表硬座车厢，S代表软座车厢）：");
//            String input = sc.nextLine();
//            for (int i=0;i<size;i++){
//                list.add(input.charAt(i));
//            }
//            char judge = 'X';
//            System.out.print("交替排列后的车厢代号队列为：");
//            while (list.size()!=0){
//                if (list.size()==size){
//                    judge = sh(list,'S');
//                } else {
//                    judge = sh(list,judge);
//                }
//                System.out.print(judge);
//            }
//        }
//    }
//    public static char sh(ArrayList<Character> list,char c){
//        char r = 'X';
//        for (int i=0;i<list.size();i++) {
//            if (list.get(0) == c) {
//                list.add(list.get(0));
//                list.remove(0);
//            } else {
//                r = list.remove(0);
//                break;
//            }
//        }
//        if (r == 'X'){
//            r = list.remove(0);
//        }
//        return r;
//    }
//}

/**数据结构第六次练习 1：找最小的字符串，输入N个字符串，输出其中最小的字符串**/
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入字符串个数：");
//        int num = sc.nextInt();
//        String none = sc.nextLine();
//        System.out.print("请输入一个待比较字符串：");
//        String toString = sc.nextLine();
//        for (int i=0; i<num-1; i++){
//            System.out.print("请输入一个待比较字符串：");
//            String judge = sc.nextLine();
//            if (judge.compareTo(toString)<0){
//                toString = judge;
//            }
//        }
//        System.out.println("Min is: "+toString);
//    }
//}

/**数据结构第六次练习 2：字符串反正序连接，将字符串的反序和正序进行连接形成一个新串，并输出**/
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入一个字符串（禁止换行符、空格、制表符，且len<20）：");
//        String input = sc.nextLine();
//        String output = "";
//        for (int i=0;i<input.length();i++){
//            output = output+input.substring(input.length()-i-1,input.length()-i);
//        }
//        output = output.concat(input);
//        System.out.print("反正序连接后的字符串为：");
//        System.out.println(output);
//    }
//}

/**数据结构第六次练习 3：恺撒密码，对输入字符串的每个字符向后移动指定位数得到密文，并输出**/
//import java.util.Scanner;
//
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int judge = 0;
//        while (judge != -1){
//            System.out.print("请输入加密移动的位数（输入-1结束）：");
//            judge = sc.nextInt();
//            if (judge == -1)
//                break;
//            String none = sc.nextLine();
//            System.out.print("请输入一段只含小写字符的原文：");
//            String toString = sc.nextLine();
//            String output = "";
//            for (int i=0;i<toString.length();i++){
//                int num_change = toString.substring(i,i+1).hashCode()+judge;
//                output+=(char) ((num_change-97)%26+97);
//            }
//            System.out.print("加密后的密文为：");
//            System.out.println(output);
//        }
//    }
//}

/**数据结构第七次练习 1：二叉树的层次遍历，编写程序，实现（1）按先序遍历序列建立二叉树的二叉链表；（2）按层次遍历二叉树。**/
//import java.io.IOException;
//import java.util.LinkedList;
//import java.util.Queue;
//
////按加入空树信息的先序遍历序列建立二叉树的二叉链表代码提供如下：
////先序遍历序列建立二叉链表
//public class PTA_practice {
//    public static void main(String[]args) throws IOException {
//        BtNode btNode = createBiTree();
//        LevelOrder(btNode);
//
//
//    }
//    public static BtNode createBiTree() throws IOException {
//        char c=(char) System.in.read();
//        if(c=='#'){
//            return null;
//        }else{
//            BtNode bt=new BtNode();
//            bt.data=c;
//            bt.lchild=createBiTree();
//            bt.rchild=createBiTree();
//            return bt;
//        }
//    }
//    static class BtNode{
//        char data;
//        BtNode lchild,rchild;
//    }
//    public static Queue<BtNode> LevelOrder(BtNode bt){
//        Queue<BtNode> btNodeQueue=new LinkedList<>();
//        btNodeQueue.add(bt);
//        while (!btNodeQueue.isEmpty()){
//            BtNode tmp=btNodeQueue.poll();
//            System.out.print(tmp.data);
//            if (tmp.lchild!=null)
//                btNodeQueue.add(tmp.lchild);
//            if (tmp.rchild!=null)
//                btNodeQueue.add(tmp.rchild);
//        }
//        return btNodeQueue;
//    }
//}

/**数据结构第八次练习 1：求二叉树的叶子结点个数，输入先序，输出中序、叶子结点个数**/
/*一棵二叉树的先序序列是一个字符串，若字符是‘#’,表示该二叉树是空树，否则该字符是相应结点的数据元素。**/
//import java.io.IOException;
//
//public class PTA_practice {
//    private static int num;
//    public static void main(String[] args) throws IOException{
//        System.out.print("二叉树的先序序列为：");
//        BtNode btNode = createBiTree();
//        System.out.print("该二叉树的中序遍历序列为：");
//        inorder(btNode);
//        System.out.print("\n该二叉树叶子结点个数：");
//        leafNodes(btNode);
//        System.out.println(num);
//
//    }
//    public static BtNode createBiTree() throws IOException {
//        char c=(char) System.in.read();
//        if (c=='#'){
//            return null;
//        }else {
//            BtNode bt = new BtNode();
//            bt.data=c;
//            bt.lchild=createBiTree();
//            bt.rchild=createBiTree();
//            return bt;
//        }
//    }
//    static class BtNode{
//        char data;
//        BtNode lchild,rchild;
//    }
//
//    public static void inorder(BtNode p){
//        if(p != null){
//            inorder(p.lchild);
//            System.out.print(p.data);
//            inorder(p.rchild);
//        }
//    }
//    public static void leafNodes(BtNode p){
//        if (p != null){
//            if (p.lchild==null && p.rchild==null) {
//                num++;
//            }
//            leafNodes(p.lchild);
//            leafNodes(p.rchild);
//        }
//    }
//}

/**数据结构第八次练习 2：交换二叉树中每个结点的左孩子和右孩子**/
//import java.io.IOException;
//
//public class PTA_practice {
//    public static void main(String[] args) throws IOException {
//        System.out.print("二叉树的先序序列为：");
//        BtNode btNode = createBiTree();
//        System.out.print("该二叉树的中序遍历序列为：");
//        inorder(btNode);
//        change(btNode);
//        System.out.println("");
//        System.out.print("该二叉树交换后的中序遍历序列为：");
//        inorder(btNode);
//    }
//
//    public static BtNode createBiTree() throws IOException {
//        char c = (char) System.in.read();
//        if (c == '#') {
//            return null;
//        } else {
//            BtNode bt = new BtNode();
//            bt.data = c;
//            bt.lchild = createBiTree();
//            bt.rchild = createBiTree();
//            return bt;
//        }
//    }
//
//    static class BtNode {
//        char data;
//        BtNode lchild, rchild;
//    }
//
//    public static void change(BtNode p) {
//        if (p!=null){
//            BtNode temp = p.lchild;
//            p.lchild = p.rchild;
//            p.rchild = temp;
//            change(p.lchild);
//            change(p.rchild);
//        }
//    }
//
//    public static void inorder(BtNode p){
//        if(p != null){
//            inorder(p.lchild);
//            System.out.print(p.data);
//            inorder(p.rchild);
//        }
//    }
//}

/**数据结构第九次练习 1：图深度优先遍历：输入图顶点数和边数，以及顶点相连，输出深度优先遍历结点序列**/
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Stack;
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int e = sc.nextInt();
//        int[][] node = new int[e][2];
//        for (int i = 0; i < e; i++) {
//            node[i][0] = sc.nextInt();
//            node[i][1] = sc.nextInt();
//        }
//        ArrayList<Integer> list_remain = new ArrayList<>();
//        ArrayList<Integer> list_print = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            list_remain.add(i);
//        }
//        Stack<Integer> stack = new Stack<>();
//        int start = 0;
//        stack.push(start);
//        list_print.add(start);
//        while (list_remain.size() != 0) {
//            if (stack.isEmpty()){
//                stack.push(list_remain.get(0));
//                list_print.add(list_remain.get(0));
//            }
//            start = stack.pop();
//            System.out.print(start+" ");
//            for (int i=0;i<list_remain.size();i++){
//                if (list_remain.get(i)==start) {
//                    list_remain.remove(i);
//                    break;
//                }
//            }
//            ArrayList<Integer> list_have = new ArrayList<>();
//            for (int j = 0; j < n; j++) {
//                if (node[j][0] == start) {
//                    if (!judge(node[j][1],list_print))
//                        list_have.add(node[j][1]);
//                }
//            }
//            while (!list_have.isEmpty()) {
//                int max = sort(list_have);
//                stack.push(max);
//                list_print.add(max);
//                // 可能出错点
//                for (int i=0;i<list_have.size();i++){
//                    if (list_have.get(i)==max) {
//                        list_have.remove(i);
//                        break;
//                    }
//                }
//            }
//        }
//    }
//    public static int sort(ArrayList<Integer> list){
//        int max = -1;
//        for (Integer integer : list) {
//            if (integer > max)
//                max = integer;
//        }
//        return max;
//    }
//    public static boolean judge(int have,ArrayList<Integer> list){
//        for (Integer integer : list) {
//            if (integer == have)
//                return true;
//        }
//        return false;
//    }
//}

/**数据结构第十次练习 1：排序：输入一组数据，输出排序后结果*/
//import java.util.Arrays;
//import java.util.Scanner;
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        for(int j=0;j<=40;j++){
//            int n = sc.nextInt();
//            int[] nu = new int[n];
//            for (int i=0;i<n;i++){
//                nu[i]=sc.nextInt();
//            }
//            Arrays.sort(nu);
//            for (int i=0;i<n-1;i++) {
//                System.out.print(nu[i]+" ");
//            }
//            System.out.println(nu[n-1]);
//        }
//    }
//}

/**数据结构第十一次练习 1：二分查找：二分法查找x，输出x所在下标即比较次数*/
//import java.util.Scanner;
//public class PTA_practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int[] list = new int[num];
//        for (int i=0;i<num;i++){
//            list[i]=sc.nextInt();
//        }
//        int search = sc.nextInt();
//        int cyc = 0;
//        int local = -1;
//        int lo=0;
//        int hi=list.length-1;
//        int mid;
//        while (lo <= hi){
//            mid = (lo+hi)/2;
//            if (list[mid]==search){
//                local = mid;
//                cyc++;
//                break;
//            }else if (list[mid]<search){
//                lo = mid+1;
//                cyc++;
//            }else {
//                hi = mid-1;
//                cyc++;
//            }
//        }
//        System.out.println(local);
//        System.out.println(cyc);
//    }
//}
