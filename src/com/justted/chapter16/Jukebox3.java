package com.justted.chapter16;

import sun.reflect.generics.tree.Tree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Justted on 2017/3/8.
 */
class Song3 implements Comparable<Song3>{
    String title;
    String artist;
    String rating;
    String bpm;

    public boolean equals(Object aSong){
        Song3 s=(Song3) aSong;
        return getTitle().equals(s.getTitle());
    }

    public int hashCode(){
        return title.hashCode();
    }

    Song3(String t,String a, String r, String b) {
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

    public int compareTo(Song3 s) {
        return title.compareTo(s.getTitle());
    }
}

public class Jukebox3 {
    ArrayList<Song3> songList = new ArrayList<Song3>();
    int val;

    public static  void main(String[] args){
        new Jukebox3().go();
    }

    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        TreeSet<Song3> songSet = new TreeSet<Song3>();
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
        Song3 nextSong = new Song3(token[0], token[1],token[2],token[3]);
        songList.add(nextSong);
    }

}

