package br.com.bicmsystems.servicesandbroadcastreceiver.broadcasts

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.widget.Toast
import br.com.bicmsystems.servicesandbroadcastreceiver.R

class AlarmReceiver : BroadcastReceiver() {

    private var mp: MediaPlayer? = null

    override fun onReceive(context: Context?, intent: Intent?) {
        mp = MediaPlayer.create(context, R.raw.alarm_clock)
        mp!!.start()
        Toast.makeText(context, "Alarm...", Toast.LENGTH_SHORT).show()
    }


}
