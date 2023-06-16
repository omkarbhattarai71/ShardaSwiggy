import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Restaurant {
    int restroId;
    String restroName;

//    String location;
//    Dishes[]  dishList = new Dishes[100];
   public Restaurant(int restroId, String restroName){
       this.restroId=restroId;
       this.restroName=restroName;
   }
    public void setRestroId(int restroId){
        this.restroId=restroId;
    }

    public int getRestroId(){
        return restroId;
    }

    public void setRestroName(String restroName){
        this.restroName=restroName;
    }

    public String getRestroName(){
        return restroName;
    }

    @Override
    public String toString(){
        return "Restaurant{" +
                "Restaurant Name ='"+restroName+'\''+
                ", Restaurant Id="+restroId+
                '}';
    }


}
