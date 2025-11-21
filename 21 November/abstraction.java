package abstraction;

public class Class21 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.print();

        Device d = new Phone();
        d.call();
        d.message();
        d.camera();
        d.connect();
    }
}

abstract class Shape {
    abstract void draw();
    void print() {
        System.out.println("Displaying the shape...");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

interface Device {
    void call();
    void message();
    void camera();
    void connect();
}

class Phone implements Device {
    public void call() {
        System.out.println("Calling...");
    }
    public void message() {
        System.out.println("Sending message...");
    }
    public void camera() {
        System.out.println("Opening camera...");
    }
    public void connect() {
        System.out.println("Connecting to network...");
    }
}
