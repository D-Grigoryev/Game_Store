package ru.Kurt;

public class Toy {
    private int id = 0;
    private  String name;
    private int quantity;
    private float frequency;
    private int weight;

    public Toy(String name, int quantity, int weight) {
        setId(this.id);
        this.name = name;
        this.quantity = quantity;
        this.frequency = weight % 100;
        this.weight = weight;
    }

    public void setFrequency(float w) {
        this.frequency = w % 100;
    }

    public String getName() {
        return name;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id+1;
    }
}
