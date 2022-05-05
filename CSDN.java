/**
 目录--------------------------------------------------------------------------
 * 源文件更改名字, 重命名源文件消失
 * 源文件留在原地, 复制其并换名字, 即转存 -- 简单版
 * 源文件留在原地, 复制其并换名字, 即转存 -- 编码格式无bug版
 * 读取Excel表格数据
 *
*/

import sun.rmi.runtime.Log;
import javax.xml.ws.LogicalMessage;
import java.io.*;
import jxl.*;

/**源文件更改名字, 重命名源文件消失**/
//public class CSDN {
//    public static void main(String[] args) {
//        String filePath = "..\\..\\source\\file\\test.txt";
//        try {
//            File src = new File(filePath);
//            filePath += ".properties";
//            File des = new File(filePath);
//            if (des.exists()) {
//                boolean res = des.delete();
//                if (!res) {
//                    System.out.println("Failed to delete file");
//                }
//            }
//            if (!src.renameTo(des)) {
//                System.out.println("Failed to renameTo file");
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        // 版权声明：本文为CSDN博主「请叫我大师兄__」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//        // 原文链接：https://blog.csdn.net/qq_27093465/article/details/72673274
//    }
//}
/**源文件留在原地, 复制其并换名字, 即转存 -- 简单版**/
//public class CSDN {
//    public static void main(String[] args) {
//        // 用缓冲区读写，来提升读写效率。
//        FileWriter fw = null;
//        FileReader fr = null;
//        try {
//            fr = new FileReader("..\\..\\source\\file\\test.txt");//读
//            fw = new FileWriter("..\\..\\source\\file\\test.txt.properties");//写
//            char[] buf = new char[1024];//缓冲区
//            int len;
//            while ((len = fr.read(buf)) != -1) {
//                fw.write(buf, 0, len);//读几个写几个
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            if (fr != null) {
//                try {
//                    fr.close();
//                } catch (IOException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//
//            if (fw != null) {
//                try {
//                    fw.flush();
//                    fw.close();
//                } catch (IOException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
//        // 版权声明：本文为CSDN博主「请叫我大师兄__」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//        // 原文链接：https://blog.csdn.net/qq_27093465/article/details/72673274
//    }
//}
/**源文件留在原地, 复制其并换名字, 即转存 -- 编码格式无bug版**/
//public class CSDN {
//    public static void main(String[] args) {
//        String src = "..\\..\\source\\file\\test.txt";
//        String des = "..\\..\\source\\file\\test.txt.properties";
//        if(copyFile(src, des)) {
//            System.out.println("copy success!");
//        } else {
//            System.out.println("detail!");
//        }
//        // 版权声明：本文为CSDN博主「请叫我大师兄__」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//        // 原文链接：https://blog.csdn.net/qq_27093465/article/details/72730796
//    }
//    private static boolean copyFile(String src, String des) {
//        InputStreamReader fr = null;
//        OutputStreamWriter fw = null;
//        try {
//            fr = new InputStreamReader(new FileInputStream(src), "UTF-8");//读
//            fw = new OutputStreamWriter(new FileOutputStream(des), "UTF-8");//写
//            char[] buf = new char[1024];//缓冲区
//            int len;
//            while ((len = fr.read(buf)) != -1) {
//                fw.write(buf, 0, len);//读几个写几个
//            }
//            return true;
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            return false;
//        } finally {
//            if (fr != null) {
//                try {
//                    fr.close();
//                } catch (IOException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//            if (fw != null) {
//                try {
//                    fw.flush();
//                    fw.close();
//                } catch (IOException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
//    }
//}
/**读取Excel表格数据**/
//public class CSDN {
//    public static void main(String[] args) {
//        int i;
//        Sheet sheet;
//        Workbook book;
//        Cell cell1,cell2,cell3,cell4,cell5,cell6,cell7;
//        try {
//            //hello.xls为要读取的excel文件名
//            book= Workbook.getWorkbook(new File("..\\..\\source\\file\\hello.xls"));
//
//            //获得第一个工作表对象(ecxel中sheet的编号从0开始,0,1,2,3,....)
//            sheet=book.getSheet(0);
//            //获取左上角的单元格
//            cell1=sheet.getCell(0,0);
//            System.out.println("标题："+cell1.getContents());
//
//            i=1;
//            while(true)
//            {
//                //获取每一行的单元格
//                cell1=sheet.getCell(0,i);//（列，行）
//                cell2=sheet.getCell(1,i);
//                cell3=sheet.getCell(2,i);
//                cell4=sheet.getCell(3,i);
//                cell5=sheet.getCell(4,i);
//                cell6=sheet.getCell(5,i);
//                cell7=sheet.getCell(6,i);
//                if("".equals(cell1.getContents())==true)    //如果读取的数据为空
//                    break;
//                System.out.println(cell1.getContents()+"\t"+cell2.getContents()+"\t"+cell3.getContents()+"\t"+cell4.getContents()
//                        +"\t"+cell5.getContents()+"\t"+cell6.getContents()+"\t"+cell7.getContents());
//                i++;
//            }
//            book.close();
//        }
//        catch(Exception e)  {
//            System.out.println(e.getMessage());
//        }
//    }
//}
