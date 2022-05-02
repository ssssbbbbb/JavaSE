package 项目.批量文件编码转换加复制;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *  <h1>此类是用来遍历文件夹的工具类<h1/>
 *
 */
public class MyTools {

    /**
     *  <p>遍历该目录下的文件及文件夹，返回String类型的多维数组</p>
     *
     */
    public static void traverse(File file){
        // 返回一个字符串数组，如果该文件在此路径中是什么名字的，那它就以什么名字添加进字符串数组

        if (file.isDirectory()){
            ArrayList<File> traverseFileNameArray = new ArrayList<>(Arrays.asList(Objects.requireNonNull(file.listFiles())));

        }
    }

    /**
     *  判断是否有名为src的文件夹
     *
     */
    public static boolean isin(String[] o){
        if (o != null){
            for (String s : o){
                if (Objects.equals(s, "src")){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 判断是否有名为src的文件夹
     */
    public static boolean FileIsIn(File f) {
        if (f.list() != null) {
            for (String s : f.list()) {
                if (s.equals("src")){
                    return true;
                }
            }
        }
        return false;
    }
}
