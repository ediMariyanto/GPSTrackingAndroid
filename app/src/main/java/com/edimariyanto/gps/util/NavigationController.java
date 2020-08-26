package com.edimariyanto.gps.util;

import androidx.fragment.app.FragmentManager;

import com.edimariyanto.gps.MainActivity;
import com.edimariyanto.gps.R;
import com.edimariyanto.gps.ui.login.LoginFragment;

import javax.inject.Inject;


public class NavigationController {

    private final int containerId;
    private final FragmentManager fragmentManager;

    @Inject
    public NavigationController(MainActivity mainActivity) {
        this.containerId = R.id.container;
        this.fragmentManager = mainActivity.getSupportFragmentManager();
    }

    public void navigateLogin() {
        LoginFragment loginFragment = LoginFragment.newInstance();
        fragmentManager.beginTransaction()
                .replace(containerId, loginFragment)
                .addToBackStack(null)
                .commitAllowingStateLoss();
    }


}
