/**
 目录--------------------------------------------------------------------------
 * 对文件temp.dat写入内容，并打印其里面的内容
 * Scanner的另用，向指定文件加入内容
 * 创建score.dat文件，输入内容，再读取文件，打印内容
 * 读取或创建文件score.txt，并输入相关内容
*/

/**对文件temp.dat写入内容，并打印其里面的内容**/
//import java.io.*;
//
//public class Exercise_IO {
//    public static void main(String[] args) throws IOException {
//        DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
//        for (int i=0;i<300;i++){
//            output.writeInt(i);
//        }
//        output.close();
//
//        DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
//        int value;
//        while (input.available() != 0){
//            value = input.readInt();
//            System.out.print(value + " ");
//        }
//        input.close();
//    }
//}

/**Scanner的另用，向指定文件加入内容**/
//import java.io.File;
//import java.util.Scanner;
//
//public class Exercise_IO {
//    public static void main(String[] args) throws Exception {
//        File file1 = new File("Test.java");
//        File file2 = new File("java Exercise12_12 Test.java");
//        Scanner input = new Scanner(file1,"utf-8");
//        while (input.hasNext()){
//            String name = input.next();
//            double score = input.nextDouble();
//            System.out.println(name + " " + score);
//        }
//        input.close();
//    }
//}

/**创建score.dat文件，输入内容，再读取文件，打印内容**/
//import java.io.*;
//import java.io.DataOutputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class Exercise_IO {
//    public static void main(String[] args) throws IOException {
//        DataOutputStream output = new DataOutputStream(new FileOutputStream("score.dat",true));
//        output.writeInt(70);
//        output.writeInt(90);
//        output.writeInt(99);
//        output.writeInt(85);
//        output.writeInt(101);
//
//        DataInputStream input = new DataInputStream(new FileInputStream("score.dat"));
//
//        while (input.available() != 0){
//            System.out.println(input.readUTF()+ " "+ input.readDouble());
//        }
//    }
//}

/**读取或创建文件score.txt，并输入相关内容**/
//import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//public class Exercise_IO {
//    public static void main(String[] args) throws IOException {
//        //File file = new File("score.txt");
//        File file = new File(Exercise_IO.class.getResource("/").getPath()+"score.txt");
//        if (file.exists()) {
//            System.out.println("文件存在");
//        }
//        System.out.println(System.getProperty("user.dir"));
//        System.out.println(Exercise_IO.class.getResource("").getPath());
//        PrintWriter output = new PrintWriter(file);
//        output.print("张三 ");
//        output.println(88);
//        output.print("李四 ");
//        output.println(85);
//        output.close();
//        System.out.println("文件已经创建");
//    }
//}

/****/


/****/


/****/


/****/


/****/


/****/


/****/


/****/


/****/


/****/


/****/


/****/


/****/


/****/


/****/