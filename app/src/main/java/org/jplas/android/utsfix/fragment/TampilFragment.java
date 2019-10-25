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
    TextView namaText, motorText, jumlahText, hpText, alamatText;

    public TampilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_tampil, container, false);
//        TextView textView = (TextView) view.findViewById(R.id.textData);
//        Bundle data = this.getArguments();

        namaText = view.findViewById(R.id.nama);
        motorText = view.findViewById(R.id.motor);
        jumlahText = view.findViewById(R.id.jumlah);
        hpText = view.findViewById(R.id.hp);
        alamatText = view.findViewById(R.id.alamat);

        Bundle bl = this.getArguments();
        items = bl.getParcelable("ShowRoomActivity");
        namaText.setText(items.getNama());
        motorText.setText(items.getMotor());
        jumlahText.setText(String.valueOf(items.getJumlah()));
        hpText.setText(String.valueOf(items.getHp()));
        alamatText.setText(items.getAlamat());

        return view;
    }

}
