package ru.Kurt;

public class Main {

    public static void main(String[] args) {
	    Toy toy1 = new Toy("Шарик", 1, 5);
        Toy toy2 = new Toy("Пистолет", 2, 5);

        Toyhendler toyhendler = new Toyhendler();
        toyhendler.addToy(toy1);
        toyhendler.addToy(toy2);

        toyhendler.getInfo();

        Draw draw = new Draw();
        draw.draw(toyhendler.getToys());

        toyhendler.getInfo();
        draw.showInfo();
        draw.save_file();

    }


}
