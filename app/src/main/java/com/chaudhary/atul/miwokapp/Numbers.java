package com.chaudhary.atul.miwokapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Numbers extends AppCompatActivity {

    int[]  audioHolder = {R.raw.number_one,R.raw.number_two,R.raw.number_three,R.raw.number_four,R.raw.number_five,R.raw.number_six,R.raw.number_seven,R.raw.number_eight,R.raw.number_nine,R.raw.number_ten};
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ListView listView = (ListView)findViewById(R.id.listView);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti",R.drawable.number_one));
        words.add(new Word("two", "otiiko",R.drawable.number_two));
        words.add(new Word("three", "tolookosu",R.drawable.number_three));
        words.add(new Word("four", "oyyisa",R.drawable.number_four));
        words.add(new Word("five", "massokka",R.drawable.number_five));
        words.add(new Word("six", "temmokka",R.drawable.number_six));
        words.add(new Word("seven", "kenekaku",R.drawable.number_seven));
        words.add(new Word("eight", "kawinta",R.drawable.number_eight));
        words.add(new Word("nine", "wo’e",R.drawable.number_nine));
        words.add(new Word("ten", "na’aacha",R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this,words);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                mediaPlayer = MediaPlayer.create(getApplicationContext(),audioHolder[i]);
                mediaPlayer.start();

            }
        });


    }
}
