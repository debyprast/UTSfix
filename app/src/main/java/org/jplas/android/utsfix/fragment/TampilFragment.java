package org.jplas.android.utsfix.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.jplas.android.utsfix.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TampilFragment extends Fragment {

    View view;
    ShowRoomFragment item;

    public TampilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_tampil, container, false);
        TextView textView = (TextView) view.findViewById(R.id.textData);
        Bundle data = this.getArguments();

        item = data.getParcelable("pesan");
        String dat = item.getNama()+" Total biaya anda "+items.getType();
        textView.setText(dat);

        return view;

    }

}
