package ru.Kurt;

import java.util.ArrayList;

public class Toyhendler {
    ArrayList<Toy> toys = new ArrayList<Toy>();

    public void addToy(Toy toy){
        toys.add(toy);
    }

    public ArrayList<Toy> getToys () {
        return this.toys;
    }

    public void getInfo(){
        for (Toy t: this.toys) {
            System.out.println("ID: "+t.getId());
            System.out.println("Название игрушки: "+t.getName());
            System.out.println("Оставшееся количество: "+t.getQuantity());
            System.out.println("___________________\n");
        }
    }
}

