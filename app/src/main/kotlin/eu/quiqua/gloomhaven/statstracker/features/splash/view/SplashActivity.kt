package eu.quiqua.gloomhaven.statstracker.features.splash.view

import android.content.Intent
import android.os.Bundle
import eu.quiqua.gloomhaven.statstracker.base.view.BaseActivity
import eu.quiqua.gloomhaven.statstracker.features.stats.view.StatsActivity

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, StatsActivity::class.java))
        finish()
    }
}
