package com.spokeinfotech.navigationdrawer.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.spokeinfotech.navigationdrawer.R;


public class HomeFragment extends Fragment implements View.OnClickListener {


    Button btnFirstFrag, btnSecondFrag, btnThirdFrag;

    public HomeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_home, container, false);
        btnFirstFrag = (Button) v.findViewById(R.id.btnFirstFrag);
        btnSecondFrag = (Button) v.findViewById(R.id.btnSecondFrag);
        btnThirdFrag = (Button) v.findViewById(R.id.btnThirdFrag);

        btnFirstFrag.setOnClickListener(this);
        btnSecondFrag.setOnClickListener(this);
        btnThirdFrag.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btnFirstFrag) {
            FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, new FirstFragment(), "Home");

            ft.commit();
        }
        if (v.getId() == R.id.btnSecondFrag) {
            FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, new SecondFragment(), "Home");
            ft.commit();
        }
        if (v.getId() == R.id.btnThirdFrag) {
            FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, new ThirdFragment(), "Home");
            ft.commit();
        }
    }
}
