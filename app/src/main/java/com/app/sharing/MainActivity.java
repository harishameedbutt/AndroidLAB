package com.app.sharing;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button text, mp3, image, video;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShareText(View view) {
        String text = "HeLoo  World";
        intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, text);
        intent.setType("text/plain");
        startActivity(intent);
    }

    public void ShareImage(View view) {
        String Path = Environment.getExternalStorageDirectory() + "/" + Environment.DIRECTORY_DCIM + "/image.jpg";
        Uri uri = Uri.parse(Path);
        intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_STREAM, uri);
        intent.setType("image/jpg");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "image/jpg");
        intent.putExtra(android.content.Intent.EXTRA_STREAM, uri);
        startActivity(Intent.createChooser(intent, "Share via"));
    }

    public void ShareMp3(View view) {

        Toast.makeText(MainActivity.this, "MP3", Toast.LENGTH_SHORT).show();
        String Path = Environment.getExternalStorageDirectory() + "/" + Environment.DIRECTORY_DCIM + "/audio.wav";
        Uri uri = Uri.parse(Path);
        intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_STREAM, uri);
        intent.setType("audio/mp3");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "audio/mp3");
        intent.putExtra(android.content.Intent.EXTRA_STREAM, uri);
        startActivity(Intent.createChooser(intent, "Share via"));
    }

    public void ShareVideo(View view) {
        String Path = Environment.getExternalStorageDirectory() + "/" + Environment.DIRECTORY_DCIM + "/video.3gp";
        Uri uri = Uri.parse(Path);
        intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_STREAM, uri);
        intent.setType("video/3gp");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "video/3gp");
        intent.putExtra(android.content.Intent.EXTRA_STREAM, uri);
        startActivity(Intent.createChooser(intent, "Share via"));
    }

}



