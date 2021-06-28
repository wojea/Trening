package pl.tytko.trening

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.tytko.trening.ui.main.MainFragment

class TrainingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}