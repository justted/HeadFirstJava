package com.justted.chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Justted on 2017/3/6.
 */
class Song implements Comparable<Song>{
    String title;
    String artist;
    String rating;
    String bpm;

    Song(String t,String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {

        return title;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return title;
    }

    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }
}

public class Jukebox {
    ArrayList<Song> songList = new ArrayList<Song>();
    public static  void main(String[] args){
        new Jukebox().go();
    }

    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }
    void getSongs(){
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line=reader.readLine())!=null){
                addSong(line);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse){
        String[] token = lineToParse.split("/");
        Song nextSong = new Song(token[0], token[1],token[2],token[3]);
        songList.add(nextSong);
    }


}
