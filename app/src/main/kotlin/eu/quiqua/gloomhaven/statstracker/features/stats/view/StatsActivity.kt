package eu.quiqua.gloomhaven.statstracker.features.stats.view

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import eu.quiqua.gloomhaven.statstracker.R
import eu.quiqua.gloomhaven.statstracker.base.view.BaseActivity
import eu.quiqua.gloomhaven.statstracker.databinding.ActivityStatsBinding
import eu.quiqua.gloomhaven.statstracker.features.stats.viewModel.StatsViewModel

class StatsActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        val statsViewModel = ViewModelProviders.of(this).get(StatsViewModel::class.java)

        val binding = DataBindingUtil.setContentView<ActivityStatsBinding>(this, R.layout.activity_stats)
        binding.viewModel = statsViewModel
    }
}
