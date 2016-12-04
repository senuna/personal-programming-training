package eu.senuna;

/**
 * Created by senuna on 04.12.16.
 */
public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return this.title + " : " + this.duration;
    }
}
