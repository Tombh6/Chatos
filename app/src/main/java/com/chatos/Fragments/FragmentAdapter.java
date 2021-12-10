package com.chatos.Fragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {

    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position)
        {
            case 1:
                //Show Chat
                return new ChatsFragment();

            case 2:

               //Show Profile
                return new ProfileFragment();

            case 3:
               // Show Users
                 return new UsersFragment();
        }

        return new  UsersFragment();
    }

    @Override
    public int getItemCount() {
        return 3;//Number of fragment we want to show
    }

    //--------------------

}
