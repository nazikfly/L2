public class Main {
    public static void main(String[] arg) {

        Car [] cars = { createObject("Toyota"),createObject("Honda"),createObject("Lexsuz")};
        for (Car a : cars){
            a.print();
        }

    }
    public static Car createObject( String classname) {
        switch (classname) {
            case "Honda":
                return new Honda("Accord","White");
            case "Toyota":
                return new Toyota("Camry","Black");
            case "Lexsuz":
                return new Lexsuz("470","Grey");

        }
        return null;
    }
}



