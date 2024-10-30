package robert.paba.navigation3hal

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var angkaAwal = 99
    private lateinit var fragment1: f1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val hal1 = findViewById<TextView>(R.id.hal1)
        val hal2 = findViewById<TextView>(R.id.hal2)
        val hal3 = findViewById<TextView>(R.id.hal3)

        //menu 1
        hal1.setOnClickListener {
            angkaAwal = 99
            fragment1 = f1.newInstance(angkaAwal)
            supportFragmentManager.beginTransaction().replace(R.id.menu, fragment1, f1::class.java.simpleName).commit()
        }

        //menu 2
        hal2.setOnClickListener {
            angkaAwal -= 2
            fragment1.updateAngka(angkaAwal)
        }

        //menu 3
        hal3.setOnClickListener {
            angkaAwal -= 3
            fragment1.updateAngka(angkaAwal)
        }
    }


}