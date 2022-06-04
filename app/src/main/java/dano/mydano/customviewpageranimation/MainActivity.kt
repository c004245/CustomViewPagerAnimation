package dano.mydano.customviewpageranimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dano.mydano.customviewpageranimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            lifecycleOwner = this@MainActivity
        }

        setContentView(binding.root)

        binding.btnFlow.setOnClickListener {
            startActivity(Intent(this, CardFlowActivity::class.java))
        }
    }
}