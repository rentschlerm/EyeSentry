package com.example.eyesentry;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginAdapter extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;

    public LoginAdapter(FragmentManager fm, Context context, int totalTabs){
        super(fm);
        this.context= context;
        this.totalTabs = totalTabs;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    public Fragment getItem(int position){
        switch (position){
            case 0:
                Login_Tab_Fragment loginTabFragment = new Login_Tab_Fragment();
            return loginTabFragment;
            case 1:
                Register_Tab_Fragment register_tab_fragment = new Register_Tab_Fragment();
                return register_tab_fragment;
            default:
                return null;
        }
    }
}
