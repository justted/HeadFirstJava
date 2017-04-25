package com.justted.chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Justted on 2017/3/8.
 */
class Song1 implements Comparable<Song1>{
    String title;
    String artist;
    String rating;
    String bpm;

    public int compareTo(Song1 s){
        return title.compareTo(s.getTitle());
    }

    Song1(String t,String a, String r, String b) {
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
        return title+" "+artist;
    }
}

public class Jukebox1 {
    ArrayList<Song1> songList = new ArrayList<Song1>();
    public static  void main(String[] args){
        new Jukebox1().go();
    }

    class ArtistCompare implements Comparator<Song1>{
        public int compare(Song1 one, Song1 two){
            return one.getArtist().compareTo(two.getArtist());
        }
    }

    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList,artistCompare);
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
        Song1 nextSong = new Song1(token[0], token[1],token[2],token[3]);
        songList.add(nextSong);
    }
}
