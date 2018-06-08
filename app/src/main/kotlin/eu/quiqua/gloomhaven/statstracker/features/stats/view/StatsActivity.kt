package eu.quiqua.gloomhaven.statstracker.features.stats.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import dagger.android.AndroidInjection
import eu.quiqua.gloomhaven.statstracker.R
import eu.quiqua.gloomhaven.statstracker.base.view.BaseActivity
import eu.quiqua.gloomhaven.statstracker.databinding.ActivityStatsBinding
import eu.quiqua.gloomhaven.statstracker.features.stats.viewModel.StatsViewModel

class StatsActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        init()
    }

    private lateinit var binding: ActivityStatsBinding

    private fun init() {
        val statsViewModel = ViewModelProviders.of(this).get(StatsViewModel::class.java)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_stats)
        binding.viewModel = statsViewModel

        statsViewModel.mutableHp.observe(this, Observer {
            it?.let { binding.currentHpLabel.text = "$it" }
        })

        statsViewModel.mutableXp.observe(this, Observer {
            it?.let { binding.currentXpLabel.text = "$it" }
        })
    }
}
