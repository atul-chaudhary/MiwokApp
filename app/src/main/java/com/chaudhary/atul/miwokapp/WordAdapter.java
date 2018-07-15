package com.chaudhary.atul.miwokapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

class WordAdapter  extends ArrayAdapter<Word> {

    int colors;

    public WordAdapter(Context context, ArrayList<Word> words) {

        super(context,0,words);

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null)
        {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            listItemView = layoutInflater.inflate(R.layout.list_item,parent,false);

        }

        Word currentItem = getItem(position);

        TextView otherlang = (TextView)listItemView.findViewById(R.id.textView);
        otherlang.setText(currentItem.getVlanguage());

        TextView  englang = (TextView)listItemView.findViewById(R.id.textView2);
        englang.setText(currentItem.getVenglish());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.imageView);



        if (currentItem.hasImage()) {


            imageView.setImageResource(currentItem.imageResId);
            imageView.setVisibility(View.VISIBLE);

        }else {

            imageView.setVisibility(View.GONE);

        }


        return listItemView;

    }
}
