package com.psp.navigraphexample;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Two extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        logmsg("onCreateView");
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        Button button = view.findViewById(R.id.backPressed);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Back pressed
                Navigation.findNavController(v).popBackStack();
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        logmsg("onViewCreated");

        // Get data from previous navigation
        Bundle bundle = getArguments();

        if(bundle == null) {
            return;
        }
        logmsg("data "+bundle.getString("key"));
    }

    @Override
    public void onStart() {
        super.onStart();
        logmsg("onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        logmsg("onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        logmsg("onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        logmsg("onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        logmsg("onDestroy");
    }


    private void logmsg(String msg) {
        Log.d("FragmentLifeTwo",msg);
    }
}