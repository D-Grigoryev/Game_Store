package ru.Kurt;

import java.util.ArrayList;

public class Draw {
    int min = 0;
    int max = 10;
    int count = 0;
    ArrayList<String> toyList = new ArrayList<>();
    Filewriter fw = new Filewriter();
    public void draw(ArrayList<Toy> arr) {
        for (Toy t : arr) {
            t.setFrequency((int) ((Math.random() * (max - min)) + min));
            float w = t.getFrequency();
            if (w > 5) {
                if (t.getQuantity() == 0){
                    System.out.println("Игрушки: "+t.getName()+" кончились");
                    arr.remove(t.getName());
                }
                else {
                    System.out.println("Вы выиграли игрушку- " + t.getName());
                    addWinList(t.getName());
                    t.setQuantity(t.getQuantity() - 1);
                    count++;
                }
            }
            else  System.out.println("Вы не выиграли игрушку- " + t.getName());
        }
    }

    public void addWinList(String toy){
        toyList.add(toy);
    }

    public void showInfo(){
        for (String t: toyList) {
            System.out.println(t);
        }
    }

    public void save_file(){
        fw.writeInfo(toyList);
        toyList.clear();
    }
}
