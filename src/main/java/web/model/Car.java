package web.model;

public class Car {
    private String color;
    private String model;
    private int number;

    public Car(String color, String model, int number) {
        this.color = color;
        this.model = model;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
