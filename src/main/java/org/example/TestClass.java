import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestClass{
    public static void main(String arg[]) throws IOException{
//      System.out.println("Hello World");

//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileInput = Files.newBufferedReader(Paths.get("D:\\Sharda University\\BootCamp\\ShardaSwiggy\\data\\string.csv"));
//        String str = input.readLine();
//        System.out.println(str);

        System.out.println(fileInput.readLine());
//        String[] partsOfLine = str.split("a");
//        for(String part: partsOfLine){
//            System.out.println(part+"\n");
//        }


    }
}



