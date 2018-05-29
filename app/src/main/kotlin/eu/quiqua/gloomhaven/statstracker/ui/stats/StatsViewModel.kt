package eu.quiqua.gloomhaven.statstracker.ui.stats

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import javax.inject.Inject

class StatsViewModel @Inject constructor(app: Application) : AndroidViewModel(app) {

    init {
        (app as? eu.quiqua.gloomhaven.statstracker.Application)?.component?.inject(this)
    }

    @Inject
    lateinit var model: String

    fun getStats() : String {
        return model
    }
}