package vanshika.apps.bmicalculator

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import vanshika.apps.bmicalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        var height= binding!!.HeightTextbox.text.toString().toFloatOrNull()
        var mass=binding!!.WeightTextbox.text.toString().toFloatOrNull()
        var submit = binding!!.submit
        var bmi = binding!!.BmiResult
        var healthy = binding!!.healthy
        bmi.text=""
        healthy.text=""

        submit.setOnClickListener {
            var a= height
            var b= a!! *a
            var c = mass!! /b
            bmi.text = "Your BMI is "+c
            if(c<18.5)
            {
                healthy.text="Underweight"
                healthy.setTextColor(Color.parseColor("FF0505"))

            }
            if(c>18.4 || c<25.0){
                healthy.text= "Healthy"
                healthy.setTextColor(Color.parseColor("OBDD14"))
            }
            if(c>24.9 || c<30.0 ){
                healthy.text="Overweight"
                healthy.setTextColor(Color.parseColor("FF0505"))
            }
            if(c>29.9 || c<35.0){
                healthy.text="Obese"
                healthy.setTextColor(Color.parseColor("FF0505"))
            }
            if(c>34.9){
                healthy.text="Obese"
                healthy.setTextColor(Color.parseColor("FF0505"))


            }


            var intent= Intent(this,RESULT::class.java)
            intent.putExtra("Bmi",c.toString())
            startActivity(intent)


        }}}
