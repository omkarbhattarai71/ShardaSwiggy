import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Main{
    void parseDishData() throws IOException {
        BufferedReader dishReader = Files.newBufferedReader(Paths.get("D:\\Sharda University\\BootCamp\\ShardaSwiggy\\data\\dish.csv"));
        String line;
        Dishes[] dishList = new Dishes[100];
        for(int dishCntr = 0; (line = dishReader.readLine())!=null; dishCntr++){
            String[] dishData = line.split(",");
            dishList[dishCntr] = new Dishes(Integer.valueOf(dishData[0]),Integer.valueOf(dishData[1]), dishData[2]);
//            dishList.add(dishCntr, new Dish(dishData[0].dishData[1].dishData[2],Integer.valueOf(dishData[3])));
        }
        for(Dishes dish: dishList){
            if(dish==null){
                break;
            }
            System.out.println(dish);
        }

    }
    public static void main(String[] args) throws IOException {
        System.out.println("Hello and welcome to my ShardaSwiggy App!");

        Main refVar = new Main();
        refVar.parseDishData();



    }
}