package com.example.fooddeliveryapp.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fooddeliveryapp.Fragment.LoginFragment;
import com.example.fooddeliveryapp.Fragment.RegistrationFragment;

public class EnterAdapterActivity extends FragmentPagerAdapter {
    public EnterAdapterActivity(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return position == 0 ? new LoginFragment() : new RegistrationFragment();
    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position) {

        return position == 0 ? "Авторизация" : "Регистрация";

    }
}
