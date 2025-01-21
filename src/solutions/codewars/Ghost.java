package solutions.codewars;

import java.util.Random;

public class Ghost {

    private String color;

    private String[] colors = {"white", "yellow", "purple", "red"};

    public Ghost() {
        int index = new Random().nextInt(colors.length);
        this.color = colors[index];
    }

    public String getColor() {
        return this.color;
    }
}