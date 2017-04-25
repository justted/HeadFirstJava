package com.justted.chapter16;

import java.util.TreeSet;

/**
 * Created by Justted on 2017/3/8.
 */
public class TestTree1 {
    public static void main(String[] args) {
        new TestTree1().go();
    }

    public void go() {
        Book1 b1 = new Book1("How Cats Work");
        Book1 b2 = new Book1("Remix your Body");
        Book1 b3 = new Book1("Finding Emo");

        TreeSet<Book1> tree = new TreeSet<Book1>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}

class Book1 implements Comparable{
    String title;

    @Override
    public String toString() {
        return title;
    }

    public Book1(String t) {
        title = t;
    }

    public int compareTo(Object o) {
        Book1 book = (Book1) o;
        return (title.compareTo(book.title));
    }
}
