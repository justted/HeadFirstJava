package com.justted.chapter16;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Justted on 2017/3/8.
 */
public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    class BookCompare implements Comparator<Book> {

        public int compare(Book one, Book two) {
            return (one.title.compareTo(two.title));
        }
    }

    public void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");
        BookCompare bookCompare = new BookCompare();
        TreeSet<Book> tree = new TreeSet<Book>(bookCompare);
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}

class Book {
    String title;

    @Override
    public String toString() {
        return title;
    }

    public Book(String t) {
        title = t;
    }
}
