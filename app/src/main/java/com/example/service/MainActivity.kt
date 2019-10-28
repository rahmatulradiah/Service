package com.example.service

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button facebook jika di klik akan menampilkan halaman facebook.com
        btn_facebook.setOnClickListener ({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.facebook.com"))
            startActivity(i)
        })
        //button instagram jika diklik akan menampilkan halaman instagram.com
        btn_instagram.setOnClickListener ({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.instagram.com"))
            startActivity(i)

        })
        //mendeklarasikan variabel mediaplayer dan memanggil data mp3
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.radiah)
        //button yang berfungsi untuk memutar mp3
        btn_play.setOnClickListener {
            MediaPlayer?.start()
        }
        //button yang berfungsi untuk melakukan pause mp3
        btn_pause.setOnClickListener {
            MediaPlayer?.pause()
        }
        //button yang berfungsi untuk melakukan stop mp3
        btn_stop.setOnClickListener {
            MediaPlayer?.seekTo(0)
        }
        var VideoView: VideoView?= videoView
        videoView?.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.rahmatul))
        videoView?.start()

        button_play.setOnClickListener {
            videoView?.start()
        }
        button_pause.setOnClickListener {
            videoView?.pause()
        }
        button_stop.setOnClickListener {
            videoView?.pause()
            videoView?.seekTo(0)
        }
    }
}
