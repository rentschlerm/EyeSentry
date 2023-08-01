package com.example.eyesentry;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Login_Tab_Fragment extends Fragment {

    View email, password, forgetPass, login;
    float v =0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment

         ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_login__tab_, container, false);

         email = root.findViewById(R.id.email);
         password = root.findViewById(R.id.password);
         forgetPass = root.findViewById(R.id.forget_password);
         login = root.findViewById(R.id.Login);

         email.setTranslationX(800);
         password.setTranslationX(800);
         forgetPass.setTranslationX(800);
         login.setTranslationX(800);

         email.setAlpha(v);
         password.setAlpha(v);
         forgetPass.setAlpha(v);
         login.setAlpha(v);

         email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
         password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
         forgetPass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
         login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();


        return root;
    }
}