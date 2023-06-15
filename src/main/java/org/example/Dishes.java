import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Dishes {

    String dishName;
    int dishId;
    int dishPrice;
    public Dishes(int dishId, int dishPrice, String dishName){
        this.dishId = dishId;
        this.dishPrice = dishPrice;
        this.dishName = dishName;
    }
    @Override
    public String toString(){
        return "Dish{" +
                "dishName ='"+dishName+'\''+
                ", dishId="+dishId+
                ", dishPrice="+dishPrice+
                '}';
    }
}
