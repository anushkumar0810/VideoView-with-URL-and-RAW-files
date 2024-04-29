package com.example.videoview;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.videoview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private MediaController mController;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MediaController mediaController = new MediaController(this);
        mediaController.setMediaPlayer(binding.videoView);
        binding.videoView.setMediaController(mediaController);
        binding.videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.samsung_add));

    }
}