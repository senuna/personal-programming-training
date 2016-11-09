package eu.senuna.oop2.compositionRoom;

/**
 * Created by senuna on 09.11.16.
 */
public class Ceiling {
    private int height;
    private int paintedColour;

    public Ceiling(int height, int paintedColour) {
        this.height = height;
        this.paintedColour = paintedColour;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColour() {
        return paintedColour;
    }
}
