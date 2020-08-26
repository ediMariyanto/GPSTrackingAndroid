package com.edimariyanto.gps.di;


import com.edimariyanto.gps.ui.login.LoginFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract LoginFragment loginFragment();

}
