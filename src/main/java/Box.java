package main.java;

public class Box {
    public void createBox() {
        System.out.println("create box");
    }

    public void createBox(int length) {
        System.out.println("create box with length");
    }

    public void createBox(int length, int width) {
        System.out.println("create box with length and width");
    }

    public String createBox(int length, int width) {
        System.out.println("create box with length and width");
        Integer.toString(width);
    }
}
