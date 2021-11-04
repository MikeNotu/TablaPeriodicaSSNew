package com.bateman.tablaperiodica;

import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class TableActivity extends AppCompatActivity {


    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter asniAdapter;
    MediaPlayer mediaPlayer;
    private Button buttonAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        listView=(ListView)findViewById(R.id.listview);
        arrayList = new ArrayList<String>();
        Field[] fields = R.raw.class.getFields();

        for (int i =0;i<fields.length;i++){
            arrayList.add(fields[i].getName());
        }

        asniAdapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(asniAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(mediaPlayer != null){
                    mediaPlayer.release();
                }

                int resId = getResources().getIdentifier(arrayList.get(i),"raw",getPackageName());
                mediaPlayer = MediaPlayer.create(TableActivity.this,resId);
                mediaPlayer.start();
            }
        });

        /*ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Actinio");
        arrayList.add("Aluminio");
        arrayList.add("Americio");
        arrayList.add("Antimonio");
        arrayList.add("Argon");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.notification_sound_effect);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.notification_sound_effect2);
        final MediaPlayer tp_1 = MediaPlayer.create(this,R.raw.actinio);
        final MediaPlayer tp_2 = MediaPlayer.create(this,R.raw.aluminio);
        final MediaPlayer tp_3 = MediaPlayer.create(this,R.raw.americio);
        final MediaPlayer tp_4 = MediaPlayer.create(this,R.raw.antimonio);
        final MediaPlayer tp_5 = MediaPlayer.create(this,R.raw.argon);
        listView.setAdapter((arrayAdapter));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    tp_1.start();
                    tp_1.stop();
                }
                if (i==1){
                    tp_2.start();
                }
                if (i==2){
                    tp_3.start();
                }
                if (i==3){
                    tp_4.start();
                }
                if (i==4){
                    tp_5.start();
                }
            }
            private void stopPlaying() {
                if (tp_1 != null) {
                    tp_1.stop();
                    tp_1.release();
                }
                if (tp_2 != null) {
                    tp_2.stop();
                    tp_2.release();
                }
            }
        });
        buttonAudio = findViewById(R.id.buttonAudio);
        buttonAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });*/
    }
}