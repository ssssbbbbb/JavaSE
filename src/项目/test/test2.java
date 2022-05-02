package 项目.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\hhhhh\\Desktop\\a\\z\\v\\n\\m\\test.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.close();
        System.out.println(file.getAbsolutePath());
    }
}
