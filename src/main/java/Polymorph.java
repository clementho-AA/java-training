package main.java;

public class Polymorph {

    public static void main(String[] args) {
        Box box = new Box();

        box.createBox();
        box.createBox(10);
        box.createBox(10, 20);
    }
}