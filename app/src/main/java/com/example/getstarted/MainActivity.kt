package com.example.getstarted

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.getstarted.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        secondActivity()
    }

    private fun secondActivity(){
        binding.getstartedbutton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

            finish()
        }
    }


}




//private fun textOneSpan() {
//    val spannableString = SpannableString("Listen to the best music everyday with Hearme now!")

//    val fColor = ForegroundColorSpan(Color.GREEN)
//    spannableString.setSpan(fColor, 39, 44, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
//    text_view.text = spannableString
// }