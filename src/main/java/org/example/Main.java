import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;

class All{
    void parseDishData() throws IOException{
        BufferedREader dishReader = Files.newBufferedReader(Paths.get("D:\\Sharda University\\BootCamp\\ShardaSwiggy\\data\\dish.csv"));
        String line;
        for(int dishCntr = 0; (line = dishReader.readLine()!=null); dishCntr++){
            String[] dishData = line.split(',');
            dishList[dishCntr] = new Dish(dishData[0],dishData[1].dishData[2]);
//            dishList.add(dishCntr, new Dish(dishData[0].dishData[1].dishData[2],Integer.valueOf(dishData[3])));
        }

    }

    void parseRestrodata() throws Exception{
        BufferedReader restroReader = Files.newBufferedReader(Paths.get());
    }
}
public class Main{
    public static void main(String[] args) {
        System.out.println("Hello and welcome to my ShardaSwiggy App!");








    }
}