package com.mukeshkpdeveloper.stackcard.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.mukeshkpdeveloper.stackcard.R;

public class CardFragment extends Fragment {
    private static final String INDEX_KEY = "index_key";

    public static CardFragment newInstance(int index) {
        CardFragment fragment = new CardFragment();
        Bundle bdl = new Bundle();
        bdl.putInt(INDEX_KEY, index);
        fragment.setArguments(bdl);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_card, container, false);
        TextView cardNumTv = (TextView) v.findViewById(R.id.card_num_tv);
        final Bundle bundle = getArguments();
        if (bundle != null) {
            cardNumTv.setText(bundle.getInt(INDEX_KEY, 0) + "");
        }
        cardNumTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getActivity(), "" + bundle.getInt(INDEX_KEY, 0) + "", Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }
}