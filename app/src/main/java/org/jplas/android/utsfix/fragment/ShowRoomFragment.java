package org.jplas.android.utsfix.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import org.jplas.android.utsfix.R;
import org.jplas.android.utsfix.activty.ShowRoomActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShowRoomFragment extends Fragment implements View.OnClickListener {


    View view;
    Button submit;
    EditText namaText, motorText, jumlahText, hpText, alamatText;

    public ShowRoomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_show_room, container, false);

        namaText = view.findViewById(R.id.textNama);
        motorText = view.findViewById(R.id.textMotor);
        jumlahText = view.findViewById(R.id.textJumlah);
        hpText = view.findViewById(R.id.textHp);
        alamatText = view.findViewById(R.id.textAlamat);
        submit = view.findViewById(R.id.button);
        submit.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        String nama = namaText.getText().toString();
        String motor = motorText.getText().toString();
        int jumlah = Integer.parseInt(jumlahText.getText().toString());
        int hp = Integer.parseInt(hpText.getText().toString());
        String alamat = alamatText.getText().toString();

        ShowRoomActivity pesan = new ShowRoomActivity(nama, motor, jumlah, hp, alamat);
        Bundle bl= new Bundle();
        bl.putParcelable("ShowRoomActivity", pesan);
        Fragment Result = new TampilFragment();
        Result.setArguments(bl);
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmenContainer, Result);
        fragmentTransaction.commit();
//        Toast.makeText(getActivity(), "Please select equipment and your name !", Toast.LENGTH_SHORT).show();
        }
}


