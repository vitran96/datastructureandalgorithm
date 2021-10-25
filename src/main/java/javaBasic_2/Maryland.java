package javaBasic_2;

public class Maryland extends State {
    Maryland() {}

    @Override
    public void printMe() {
        System.out.println("Read it.");
    }

    public static void main(String[] args) {
        Region mid = new State();
        State md = new Maryland();
        Object obj = new Place();
        Place usa = new Region();

        md.printMe();
        mid.printMe();
        ((Place) obj).printMe();
        obj = md;
        ((Maryland) obj).printMe();
        obj = usa;
        ((Place) obj).printMe();
        usa = md;
        ((Place) usa).printMe();
    }
}

class State extends Region {
    State() {}
    @Override
    public void printMe() {
        System.out.println("Ship it.");
    }
}

class Region extends Place {
    Region() {}
    @Override
    public void printMe() {
        System.out.println("Box it.");
    }
}

class Place extends Object {
    Place() {}
    public void printMe() {
        System.out.println("Buy it.");
    }
}
