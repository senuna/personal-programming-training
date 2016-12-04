package eu.senuna;

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by senuna on 04.12.16.
 */
public class Main {

    private static  ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Lunatic Soul", "Mariusz Duda");
        album.addSong("Lunatic Soul", 3.15);
        album.addSong("Hyperactive", 2.44);
        album.addSong("Lunatic Soul 3", 8.15);
        album.addSong("Lunatic Soul 4", 4.15);
        album.addSong("Lunatic Soul 5", 5.35);
        album.addSong("Lunatic Soul 6", 2.15);
        album.addSong("Lunatic Soul 7", 3.15);

        albums.add(album);

        album = new Album("Hyperactive", "Riverside");
        album.addSong("Hyperactive 1", 3.15);
        album.addSong("Hyperactive 2", 3.15);
        album.addSong("Hyperactive 3", 3.15);
        album.addSong("Hyperactive 4", 3.15);
        album.addSong("Hyperactive 5", 3.15);
        album.addSong("Hyperactive 6", 3.15);
        album.addSong("Hyperactive 7", 3.15);
        album.addSong("Hyperactive 8", 3.15);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Lunatic Soul 3", playList);
        albums.get(0).addToPlayList("Hyperactive 3", playList);
        albums.get(0).addToPlayList("oefibeobawf", playList);
        albums.get(0).addToPlaylist(8, playList);

        albums.get(1).addToPlaylist(2,playList);
        albums.get(1).addToPlaylist(10,playList);
        albums.get(1).addToPlaylist(7,playList);
        albums.get(1).addToPlaylist(245,playList);


    }
}
