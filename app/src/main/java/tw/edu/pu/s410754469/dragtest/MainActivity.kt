package tw.edu.pu.s410754469.dragtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    lateinit var img:ImageView
    lateinit var img2:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar!!.hide()

    img = findViewById(R.id.img)
    img.setOnTouchListener(object:View.OnTouchListener{
        override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
            if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                img.y = motionEvent.rawY-img.height
                img.x = motionEvent.rawX-img.width/2
            }
            return true
        }
    })

        img2 = findViewById(R.id.img2)
        img2.setOnTouchListener(object:View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    img2.y = motionEvent.rawY-img2.height
                    img2.x = motionEvent.rawX-img2.width/2
                }
                return true
            }
        })
}
}