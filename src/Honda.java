public class Honda extends Car implements Printable {

    public Honda(String name, String color) {
        super(name, color);
    }

    @Override
    public void print() {
        System.out.println("Car name:" + this.name + "," + "   Car color:" + this.color);
    }
}


