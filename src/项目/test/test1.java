package 项目.test;

import java.io.File;
import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\hhhhh\\Desktop\\a");
        File[] ArrayFile = test1.xh(file);
        System.out.println(Arrays.toString(ArrayFile));

    }
    public static File[] xh(File file){
        File[] files = file.listFiles();

        if (files != null) {
            for (File f : files){
                if (f.isDirectory()) {
                    test1.xh(f);
                }
            }
        }
        return file.listFiles();
    }
}
