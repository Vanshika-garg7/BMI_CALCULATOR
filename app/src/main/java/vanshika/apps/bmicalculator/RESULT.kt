package vanshika.apps.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import vanshika.apps.bmicalculator.databinding.ActivityResultBinding

class RESULT : AppCompatActivity() {
    private var binding:ActivityResultBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        var healthy=binding!!.healthy.text


        var result=intent.getStringExtra("Bmi").toString()
        binding!!.Bmi.text="Your BMI is "+result






    }
}