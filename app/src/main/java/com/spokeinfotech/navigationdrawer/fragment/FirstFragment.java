package com.spokeinfotech.navigationdrawer.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.spokeinfotech.navigationdrawer.R;


public class FirstFragment extends Fragment implements View.OnClickListener {


    Button btnInnerOne, btnInnerTwo;

    public FirstFragment() {

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_first, container, false);
        btnInnerOne = (Button) v.findViewById(R.id.btnOneFrag);
        btnInnerTwo = (Button) v.findViewById(R.id.btnTwoFrag);

        btnInnerOne.setOnClickListener(this);
        btnInnerTwo.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnOneFrag) {
            FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, new InnerOneFragment(), "First");
            ft.commit();
        }

        if (v.getId() == R.id.btnTwoFrag) {
            FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, new InnerTwoFragment(), "First");
            ft.commit();
        }

    }
}
