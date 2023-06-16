import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Dishes {

    String dishName;
    int dishId;
    int restroId;
    int dishPrice;
    public Dishes(int dishId,int restroId, String dishName, int dishPrice){
        this.dishId = dishId;
        this.dishPrice = dishPrice;
        this.dishName = dishName;
        this. restroId=restroId;
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
