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
            dishList[dishCntr] = new Dishes(Integer.valueOf(dishData[0]),Integer.valueOf(dishData[1]), dishData[2], Integer.valueOf(dishData[3]));
//            dishList.add(dishCntr, new Dish(dishData[0].dishData[1].dishData[2],Integer.valueOf(dishData[3])));
        }
        for(Dishes dish: dishList){
            if(dish==null){
                break;
            }
            System.out.println(dish);
        }
    }
    void parseRestroData() throws IOException{
        BufferedReader restroReader = Files.newBufferedReader(Paths.get("D:\\Sharda University\\BootCamp\\ShardaSwiggy\\data\\restro.csv"));
        String line;
        Restaurant[] restroList = new Restaurant[100];
        for(int restroCntr=0;(line=restroReader.readLine())!=null;restroCntr++) {
            String[] restroData = line.split(",");
            restroList[restroCntr] = new Restaurant(Integer.valueOf(restroData[0]), restroData[1]);
        }
        for (Restaurant restro: restroList){
            if(restro==null){
                break;
            }
            System.out.println(restro);

//            restroList[restroCntr] = new
//            restroList.add(restroCntr, new restroData[0],restroData[1]);
//            List<Dish> tempMenu = new ArrayList<>();
//            Location tempLocation = null;

//            tempMenu = dishList.stream().filter(dish->dish.ge)
        }
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Hello and welcome to my ShardaSwiggy App!");

        Main refVar = new Main();
        refVar.parseDishData();
        refVar.parseRestroData();



    }
}