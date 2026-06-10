gitpackage com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var txtName : EditText
    lateinit var txtUser : EditText
    lateinit var txtCell : EditText
    lateinit var btnBack : Button
    lateinit var btnProceed : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        txtName = findViewById(R.id.txtName)
        txtUser = findViewById(R.id.txtUser)
        txtCell = findViewById(R.id.txtCell)
        btnBack = findViewById(R.id.btnBack)
        btnProceed = findViewById(R.id.btnProceed)

        btnProceed.setOnClickListener {
            Toast.makeText(this, "please enter valid data", Toast.LENGTH_LONG).show()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}