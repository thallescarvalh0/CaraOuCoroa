package thallescarvalho.caraoucoroa.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thallescarvalho.caraoucoroa.com.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.imageJogar.setOnClickListener{
            val intent = Intent(applicationContext, ResultadoActivity::class.java)

            val numero = Random().nextInt(2)

            intent.putExtra("numero", numero)

            startActivity(intent)
        }
    }
}