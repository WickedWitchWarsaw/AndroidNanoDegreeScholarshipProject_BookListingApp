package com.wickedwitchwarsaw.scholarshipbooklistingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ZuZ on 08/07/2017.
 */
public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.book_list_item, parent, false);
        }
        Book currentBook = getItem(position);

        TextView bookTitleTextView = listItemView.findViewById(R.id.text_view_book_title);
        bookTitleTextView.setText(currentBook.getBookTitle());

        TextView bookAuthorTextView = listItemView.findViewById(R.id.text_view_author);
        bookAuthorTextView.setText(currentBook.getBookAuthor());

        return listItemView;
    }
}
