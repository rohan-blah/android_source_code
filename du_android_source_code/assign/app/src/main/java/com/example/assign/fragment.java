package com.example.assign;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment extends Fragment {

    public fragment() {
        // Required empty public constructor
    }

    String tagFragment = "fragmentLifeCycle";
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tagFragment,"inside onCreate() of  fragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(tagFragment,"inside onCreateView() of  fragment");

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment, container, false);
    }
    
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        Log.d(tagFragment,"inside onActivityCreated() of  fragment");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(tagFragment,"inside onStart() of  fragment");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(tagFragment,"inside onResume() of  fragment");

    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(tagFragment,"inside onPause() of  fragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(tagFragment,"inside onStop() of  fragment");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(tagFragment,"inside onDestroyView() of  fragment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tagFragment,"inside onDestroy() of  fragment");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(tagFragment,"inside onDetach() of  fragment");
    }
}