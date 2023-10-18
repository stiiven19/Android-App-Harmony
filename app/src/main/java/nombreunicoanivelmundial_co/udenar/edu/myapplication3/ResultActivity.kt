package nombreunicoanivelmundial_co.udenar.edu.myapplication3

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.pow

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otroejemplo)

        val weightEditText = findViewById<EditText>(R.id.weightEditText)
        val heightEditText = findViewById<EditText>(R.id.heightEditText)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        calculateButton.setOnClickListener(View.OnClickListener {
            val weight = weightEditText.text.toString().toDouble()
            val height = heightEditText.text.toString().toDouble()

            if (weight > 0 && height > 0) {
                val bmi = weight / height.pow(2)
                resultTextView.text = "IMC: %.2f".format(bmi)
            } else {
                resultTextView.text = "Ingrese un peso y altura válidos."
            }
        })
    }
}