package org.jplas.android.utsfix.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import org.jplas.android.utsfix.R;
import org.jplas.android.utsfix.activty.ShowRoomActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class TampilFragment extends Fragment {

    View view;
    ShowRoomActivity items;

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

        items = data.getParcelable("pesan");
        String dat = items.getNama()+" Akan membeli motor"+ items.getMotor()+" sejumlah "+items.getJumlah()+"pihak kami akan menghubungi nomer hp anda"+items.getHp()+"dan akan dikirim ke alamat anda"+items.getAlamat();
        textView.setText(dat);

        return view;

    }

}
