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
import eu.quiqua.gloomhaven.statstracker.features.stats.viewModel.StatsViewModelFactory
import javax.inject.Inject

class StatsActivity : BaseActivity() {

    @Inject
    lateinit var viewModelFactory: StatsViewModelFactory

    private val viewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(StatsViewModel::class.java)
    }

    private lateinit var binding: ActivityStatsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_stats)
        binding.viewModel = viewModel

        viewModel.hp.observe(this, Observer {
            it?.let { binding.hpLabel.text = "$it" }
        })

        viewModel.xp.observe(this, Observer {
            it?.let { binding.xpLabel.text = "$it" }
        })

        viewModel.decreasableHp.observe(this, Observer {
            it?.let { binding.decreaseHpButton.isEnabled = it }
        })

        viewModel.decreasableXp.observe(this, Observer {
            it?.let { binding.decreaseXpButton.isEnabled = it }
        })

        viewModel.increasableHp.observe(this, Observer {
            it?.let { binding.increaseHpButton.isEnabled = it }
        })
    }
}
