package eu.quiqua.gloomhaven.statstracker.app.dagger

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import eu.quiqua.gloomhaven.statstracker.features.stats.dagger.StatsSubComponent
import eu.quiqua.gloomhaven.statstracker.features.stats.view.StatsActivity

@Module
abstract class BuildersModule {
    @Binds
    @IntoMap
    @ActivityKey(StatsActivity::class)
    abstract fun bind(builder: StatsSubComponent.Builder): AndroidInjector.Factory<out Activity>
}
