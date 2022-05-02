import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class 转码 {
    /**
     * <h2>主要是用来查看该目录下的文件夹里，有没有src文件夹。</h2>
     * <p>
     * 判断该字符串数组里是否有该元素，如果有返回true，否则返回false。
     */
    public static boolean isin(String[] o) {
        if (o != null) {
            for (String s : o) {
                if (Objects.equals(s, "src")) {
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * 编码解码:把GBK编码的 file ，以UTF-8编码的格式 复制到 fileName中
     */
    public static void encoding_and_decoding(File file, File fileName) {
        FileInputStream fis;
        InputStreamReader isr = null;
        FileOutputStream fos;
        OutputStreamWriter osw = null;

        try {
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis, "GBK");
            fos = new FileOutputStream(fileName);
            osw = new OutputStreamWriter(fos, "UTF-8");
            char[] cbuf = new char[30];
            int len;
            while ((len = isr.read(cbuf)) != -1) {
                osw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (osw != null) {
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }



    @Test
    public void test(){
        String filename = "C:\\Users\\hhhhh\\Documents\\MyCode\\Java_Eclipse";  //目标位置
        File file = new File(filename);     // 创建File对象，形参为目标位置的String类型 的地址

        String[] s; //用来储存目标位置下的所有文件的名字（Java_Eclipse目录下的所有文件名）
        s = file.list();

        //储存拥有src文件夹的项目文件
        HashMap<String, File> FileList = new HashMap<>();
        if (s != null){
            for (String value : s) {
                File srcFile = new File(filename + "\\" + value);   // 创建对应项目文件的File（Java_Eclipse目录下的文件夹）

                /*  isSRC ：用来储存 项目文件夹下的 所有文件及目录的名称,然后判断该项目是否有src文件夹
                            例：.../Java_Eclipse/A项目  --- 储存A项目里的文件及目录，然后使用 转码.isin() 判断是否有 src文件夹
                                如果有，就根据该项目，创建新的File对象 haveSrcFile (例如：.../Java_Eclipse/A项目/src)  --- 待会来遍历此文件对象里面的java文件及目录
                 */
                String[] isSRC = srcFile.list();
                if (转码.isin(isSRC)) {
                    File haveSrcFile = new File(filename + "\\" + value + "\\src");
                    FileList.put(value, haveSrcFile);
                }
            }

        }
        // 现在得到的是一个HashMap集合,以键值对的形式["文件名称", File]储存了拥有src文件夹的目录名，及其File对象！
        for (String haveSrcFilename : FileList.keySet()){

            // 集合内的值是File对象，也就是src相应的文件目录，然后遍历它，如果得到的还是文件夹，则就再遍历一次
            File[] in_the_src = FileList.get(haveSrcFilename).listFiles();

            if (in_the_src != null){
                for (File f : in_the_src){
                    if (f.isDirectory()){
                        // 创建该文件夹( f )，然后写入Java文件

                        File[] files = f.listFiles();
                        //可以写一个方法，传入File对象，然后进行编码解码
                        if (files != null){
                            for (File ff : files){
                                File thisFile = new File("src\\"+haveSrcFilename+ff.toString().substring(ff.toString().indexOf("\\src")));
                                thisFile.mkdirs();
                                转码.encoding_and_decoding(ff, thisFile);
//                                System.out.println("src\\"+haveSrcFilename+ff.toString().substring(ff.toString().indexOf("\\src")));
                            }
                        }

                    }else {
                        // 创建该项目(名为：haveSrcFilename)，并把Java文件 f 写入
                        FileInputStream fileInputStream;
                        InputStreamReader inputStreamReader = null;
                        FileOutputStream fileOutputStream;
                        OutputStreamWriter outputStreamWriter = null;

                        try {
                            fileInputStream = new FileInputStream(f);
                            inputStreamReader = new InputStreamReader(fileInputStream,"GBK");
                            fileOutputStream = new FileOutputStream("src//"+haveSrcFilename+f.getPath());
                            outputStreamWriter = new OutputStreamWriter(fileOutputStream,"UTF-8");
                            char[] cbuf = new char[30];
                            int len;

                            while ( (len = inputStreamReader.read(cbuf)) != -1){
                                outputStreamWriter.write(cbuf,0,len);
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }finally {

                            try {
                                if (inputStreamReader != null){

                                    inputStreamReader.close();
                                }
                                if (outputStreamWriter != null){
                                    outputStreamWriter.close();
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
//                        System.out.println("src\\"+haveSrcFilename+f.toString().substring(f.toString().indexOf("\\src")));
                    }
                }
            }
        }


    }






    /**
     *  1、给出需要复制文件的目录
     *      C:\Users\hhhhh\Documents\MyCode\Java_Eclipse
     *  2、遍历该目录下的所有目录
     *      如果遍历出的目录里有src文件夹，则保存该目录的路径，存入数组
     *  3、只复制最外层目录及src目录下的所有文件
     *
     *
     * @throws IOException
     */
    @Test
    public void test1() throws IOException {
        File f = new File("C:\\Users\\hhhhh\\Documents\\MyCode\\Java_Eclipse\\A_数组\\src\\a_数组的概述.java");

        FileInputStream fileInputStream = new FileInputStream(f);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"GBK");

        File ff = new File("src//test//aa//");
        ff.mkdirs();
        FileOutputStream fileOutputStream = new FileOutputStream(ff+转码.qieGe(f.toString()));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"UTF-8");

        char[] cbuf = new char[20];
        int len;

        while ( (len = inputStreamReader.read(cbuf)) != -1){
//            String str = new String(cbuf,0,len);
//            System.out.println(str);
            outputStreamWriter.write(cbuf,0,len);
        }

        inputStreamReader.close();
        outputStreamWriter.close();
    }
}

