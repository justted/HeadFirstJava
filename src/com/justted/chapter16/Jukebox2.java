package com.justted.chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by Justted on 2017/3/8.
 */

class Song2 implements Comparable<Song2>{
    String title;
    String artist;
    String rating;
    String bpm;

    public boolean equals(Object aSong){
        Song2 s=(Song2) aSong;
        return getTitle().equals(s.getTitle());
    }

    public int hashCode(){
        return title.hashCode();
    }

    Song2(String t,String a, String r, String b) {
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

    public int compareTo(Song2 s) {
        return title.compareTo(s.getTitle());
    }
}

public class Jukebox2 {
    ArrayList<Song2> songList = new ArrayList<Song2>();
    public static  void main(String[] args){
        new Jukebox2().go();
    }

    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        HashSet<Song2> songSet = new HashSet<Song2>();
        songSet.addAll(songList);
        System.out.println(songSet);
    }
    void getSongs(){
        try {
            File file = new File("SongListMore.txt");
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
        Song2 nextSong = new Song2(token[0], token[1],token[2],token[3]);
        songList.add(nextSong);
    }

}
