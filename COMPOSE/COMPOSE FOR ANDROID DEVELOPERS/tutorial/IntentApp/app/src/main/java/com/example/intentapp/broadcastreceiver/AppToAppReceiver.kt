package com.example.intentapp.broadcastreceiver

import android.content.ActivityNotFoundException
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.intentapp.BroadCastActivity
import com.example.intentapp.SecondActivity


/*
it receives broadcast event when i click the broad cast receiver button in main activity and then opens the
BroadCastActivity component in the same app.
 */

class AppToAppReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent?.action == "TEST_ACTION"){
            Intent(context, BroadCastActivity::class.java).also {
                try{
                    context?.startActivity(it)
                }catch (e: ActivityNotFoundException){
                    e.printStackTrace()
                    println("hi selvaganesh")
                }
            }

        }
    }
}