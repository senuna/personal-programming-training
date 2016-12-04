package eu.senuna;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by senuna on 04.12.16.
 */
public class Album {
    private String name;
    private  String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for (Song checkedSong: this.songs){ //foreach version ;-)
            if (checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber - 1;
        if((index >0) && (index <= this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have track number" + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song checkedSong = findSong(title);
        if (checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println(title + " This song is not in this album ");
        return false;
    }
}
