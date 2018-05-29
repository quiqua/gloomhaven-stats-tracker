package eu.quiqua.gloomhaven.statstracker.ui.splash

import android.content.Intent
import android.os.Bundle
import eu.quiqua.gloomhaven.statstracker.ui.base.BaseActivity
import eu.quiqua.gloomhaven.statstracker.ui.stats.StatsActivity

class SplashActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, StatsActivity::class.java))
        finish()
    }
}
