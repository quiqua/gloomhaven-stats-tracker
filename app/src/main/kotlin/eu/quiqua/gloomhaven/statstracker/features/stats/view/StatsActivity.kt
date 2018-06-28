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
        initializeDatabinding()
        observeStats()
        observeConditions()
    }

    private fun initializeDatabinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_stats)
        binding.viewModel = viewModel
    }

    private fun observeStats() {
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

    private fun observeConditions() {
        viewModel.disarmed.observe(this, Observer {
            it?.let { binding.disarmCheckbox.isChecked = it }
        })

        viewModel.immobilized.observe(this, Observer {
            it?.let { binding.immobilizeCheckbox.isChecked = it }
        })

        viewModel.invisible.observe(this, Observer {
            it?.let { binding.invisibleCheckbox.isChecked = it }
        })

        viewModel.muddled.observe(this, Observer {
            it?.let { binding.muddleCheckbox.isChecked = it }
        })

        viewModel.poisoned.observe(this, Observer {
            it?.let { binding.poisonCheckbox.isChecked = it }
        })

        viewModel.strengthend.observe(this, Observer {
            it?.let { binding.strengthenCheckbox.isChecked = it }
        })

        viewModel.stunned.observe(this, Observer {
            it?.let { binding.stunCheckbox.isChecked = it }
        })

        viewModel.wounded.observe(this, Observer {
            it?.let { binding.woundCheckbox.isChecked = it }
        })
    }
}
