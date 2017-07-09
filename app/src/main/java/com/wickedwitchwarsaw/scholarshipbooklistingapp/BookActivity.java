package com.wickedwitchwarsaw.scholarshipbooklistingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("book1 book1 book1", "Author1"));
        books.add(new Book("book1 book1 book1", "Author1"));
        books.add(new Book("book1 book1 book1", "Author1"));
        books.add(new Book("book1 book1 book1", "Author1"));
        books.add(new Book("book1 book1 book1", "Author1"));
        books.add(new Book("book1 book1 book1", "Author1"));
        books.add(new Book("book1 book1 book1", "Author1"));
        books.add(new Book("book1 book1 book1", "Author1"));
        books.add(new Book("book1 book1 book1", "Author1"));

        ListView bookListView = (ListView) findViewById(R.id.list);
        BookAdapter adapter = new BookAdapter(this, books);
        bookListView.setAdapter(adapter);

    }
}
