import java.awt.*;

public abstract class Car {
    String name;
    String color;


    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void print();

}

