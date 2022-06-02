package TextFile16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DocCsv {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\Module2Week4\\src\\file.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Stt: " + line.split(",")[0] + ", Code: " + line.split(",")[1] + ", Name: " + line.split(",")[2]);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
