package com.yt8492.exoplayerplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.yt8492.exoplayerplayground.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val player = ExoPlayer.Builder(this).build()
        binding.playerView.player = player
        val mediaItem = MediaItem.fromUri("https://demo.unified-streaming.com/k8s/features/stable/video/tears-of-steel/tears-of-steel.ism/.m3u8")
        player.setMediaItem(mediaItem)
        player.prepare()
        player.play()
    }
}