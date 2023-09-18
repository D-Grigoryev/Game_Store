package ru.Kurt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Filewriter {

    public void writeInfo(ArrayList<String> str){
      try(FileWriter fileWriter = new FileWriter("winlist.txt")){
          for (String s: str) {
              fileWriter.write("Название игрушки: "+s+"\n");
          }
      }
        catch(IOException ex){
          System.out.println(ex.getMessage());
        }
    }
}
