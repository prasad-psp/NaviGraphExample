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

public class One extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        logmsg("onCreateView");
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_one, container, false);

        Button btn = view.findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Pass data to destination navigation
                Bundle bundle = new Bundle();
                bundle.putString("key","hello world");

                Navigation.findNavController(view).navigate(R.id.action_one_to_two,bundle);
            }
        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        logmsg("onViewCreated");
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
        Log.d("FragmentLifeOne",msg);
    }
}