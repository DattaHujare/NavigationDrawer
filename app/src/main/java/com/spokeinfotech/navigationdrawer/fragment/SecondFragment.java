package com.spokeinfotech.navigationdrawer.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.spokeinfotech.navigationdrawer.R;


public class SecondFragment extends Fragment implements View.OnClickListener {


    Button btnInnerThree, btnInnerFour;

    public SecondFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_second, container, false);


        btnInnerThree = (Button) v.findViewById(R.id.btnThreeFrag);
        btnInnerFour = (Button) v.findViewById(R.id.btnFourFrag);

        btnInnerThree.setOnClickListener(this);
        btnInnerFour.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnThreeFrag) {
            FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new InnerThreeFragment(), "Second");
            ft.commit();
        }
        if (v.getId() == R.id.btnFourFrag) {
            FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new InnerFourFragment(), "Second");
            ft.commit();
        }
    }
}
