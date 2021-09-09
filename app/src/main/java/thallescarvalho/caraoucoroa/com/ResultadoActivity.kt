package thallescarvalho.caraoucoroa.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thallescarvalho.caraoucoroa.com.databinding.ActivityMainBinding
import thallescarvalho.caraoucoroa.com.databinding.ActivityResultadoBinding

class ResultadoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val dados: Bundle? = intent.extras
        val numero = dados?.getInt("numero")

        if (numero == 0){
            binding.imageResultado.setImageResource(R.drawable.moeda_cara)
        }else{
            binding.imageResultado.setImageResource(R.drawable.moeda_coroa)
        }

        binding.imageVoltar.setOnClickListener{
            finish()
        }

    }
}