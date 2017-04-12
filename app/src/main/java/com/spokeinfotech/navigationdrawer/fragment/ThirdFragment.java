package com.spokeinfotech.navigationdrawer.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.spokeinfotech.navigationdrawer.R;


public class ThirdFragment extends Fragment implements View.OnClickListener {


    Button btnInnerFive, btnInnerSix;

    public ThirdFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_third, container, false);
        btnInnerFive = (Button) v.findViewById(R.id.btnFiveFrag);
        btnInnerSix = (Button) v.findViewById(R.id.btnSixFrag);
        btnInnerFive.setOnClickListener(this);
        btnInnerSix.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnFiveFrag) {
            FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new InnerFiveFragment(), "Third");
            ft.commit();
        }
        if (v.getId() == R.id.btnSixFrag) {
            FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new InnerSixFragment(), "Third");
            ft.commit();
        }
    }
}

