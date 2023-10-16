package com.lokesh.tablayout;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new First_Fragment();
        } else if (position == 1) {
            return  new Second_Fragment();
        }
        else {
            return  new Third_Fragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {

        if (position==0){
            return "Chats";
        } else if (position == 1) {
            return  "Status";
        }
        else {
            return  "Calls";
        }
    }
}
