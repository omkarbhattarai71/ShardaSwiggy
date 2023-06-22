package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.*;


class MyNumber{
    int num;

    MyNumber(int num){
        this.num = num;
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "num=" + num +
                '}';
    }
}

public class TestClass{
    public static void main(String arg[]) throws IOException{
//      System.out.println("Hello World");

//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader fileInput = Files.newBufferedReader(Paths.get("D:\\Sharda University\\BootCamp\\ShardaSwiggy\\data\\string.csv"));
//        String str = input.readLine();
//        System.out.println(str);

//        System.out.println(fileInput.readLine());
//        String[] partsOfLine = str.split("a");
//        for(String part: partsOfLine){
//            System.out.println(part+"\n");
//        }

        List<MyNumber> numList = new ArrayList<>();  // Or we can write Linked List as well
//        System.out.println(numList);
//        (numList.contains(23))?System.out.println("23 Present"):System.out.println("23 ABSENT"));
        numList.add(new MyNumber(101));
        numList.add(new MyNumber(102));
        numList.add(new MyNumber(103));
        numList.add(new MyNumber(109));
        numList.add(new MyNumber(104));
        numList.add(new MyNumber(23));
        System.out.println(numList);

//        for(MyNumber num: numList){   // Old method
//            if(num.getNum()==23){
//                System.out.println("23 is Present");
//            }
//            else{
//                System.out.println("23 is not Present");
//            }
//        }

        if(numList.stream().filter(num -> num.getNum()==23).findFirst().isPresent()){
            System.out.println("Number 23 is present");
        }


    }
}



