public class Toyota extends Car implements Printable{
    public Toyota(String name, String color) {
        super(name, color);
    }

    @Override
    public void print() {
        System.out.println("Car name:" + this.name + "," + "   Car color:" + this.color);

    }
}
