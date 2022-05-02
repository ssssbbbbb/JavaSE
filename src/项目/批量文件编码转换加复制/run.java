package 项目.批量文件编码转换加复制;

import java.io.File;
import java.util.Arrays;

public class run {
    public static void main(String[] args) {
        //目标位置
        String filename = "C:\\Users\\hhhhh\\Documents\\MyCode\\Java_Eclipse";

        //创建File对象，形参为目标位置的String类型 的地址
        File file = new File(filename);

        //用来储存目标位置下的所有文件（Java_Eclipse目录下的所有文件）File对象
        File[] SRCfile;
        SRCfile = file.listFiles();
//        System.out.println(Arrays.toString(f));

        //用工具类里面的isin()方法，来判断哪些是拥有 src文件夹的目录
        if (SRCfile != null){
            for (File f: SRCfile ){
                MyTools.FileIsIn(f);
            }
        }



    }
}
