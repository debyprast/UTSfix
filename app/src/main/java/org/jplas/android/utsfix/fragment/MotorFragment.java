package org.jplas.android.utsfix.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jplas.android.utsfix.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MotorFragment extends Fragment {


    public MotorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_motor, container, false);
    }

}
