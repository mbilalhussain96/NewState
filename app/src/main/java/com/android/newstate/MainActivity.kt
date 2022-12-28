package com.android.newstate


import android.R.attr.button
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.android.stateprogressbar.StateProgressBar


class MainActivity : AppCompatActivity() {

    var descriptionData = arrayOf("Step One", "Step Two", "Step Three", "Step Four", "Step Five", "Step Six")

    var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val stateProgressBar =
            findViewById<View>(R.id.your_state_progress_bar_id) as StateProgressBar
        stateProgressBar.setStateDescriptionData(descriptionData)

        // button given along with id

        // button given along with id
        button = findViewById<View>(R.id.button) as Button

        button!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                when (stateProgressBar.currentStateNumber) {
                    1 -> stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.TWO)
                    2 -> stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.THREE)
                    3 -> stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.FOUR)
                    4 -> stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.FIVE)
                    5 -> stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.SIX)
                    6 -> stateProgressBar.setAllStatesCompleted(true)
                }
            }
        })


    }
}