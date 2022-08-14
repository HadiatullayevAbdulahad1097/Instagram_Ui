package developer.abdulahad.instagram_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import developer.abdulahad.instagram_ui.BlankFragment

class MainActivity : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handler = Handler()
        val blankFragment = BlankFragment()
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.add(R.id.my_conteiner, blankFragment)
        transaction.commit()
    }
}