public class Lexsuz extends Car implements Printable{

    public Lexsuz(String name, String color) {
        super(name, color);
    }


    @Override
    public void print() {
        System.out.println("Car name:" + this.name + "," + "   Car color:" + this.color);

    }
}