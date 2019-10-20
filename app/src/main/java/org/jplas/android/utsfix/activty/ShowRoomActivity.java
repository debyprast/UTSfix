package org.jplas.android.utsfix.activty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class ShowRoomActivity implements Parcelable {

    private String nama;
    private String motor;
    private int jumlah;
    private int hp;
    private String alamat;


    public String getNama() {
        return nama;
    }

    public int getHp() {
        return hp;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getMotor() {
        return motor;
    }

    public int getJumlah(){
        return jumlah;
    }

    public ShowRoomActivity(String nama, String motor, int jumlah, int hp, String alamat){
        this.nama = nama;
        this.motor = motor;
        this.jumlah = jumlah;
        this.hp = hp;
        this.alamat = alamat;
    }

    protected ShowRoomActivity(Parcel in) {
        nama = in.readString();
        motor = in.readString();
        jumlah = in.readInt();
        hp = in.readInt();
        alamat = in.readString();
    }

    public static final Parcelable.Creator<ShowRoomActivity> CREATOR = new Parcelable.Creator<ShowRoomActivity>() {

        @Override
        public ShowRoomActivity createFromParcel(Parcel in) {
            return new ShowRoomActivity(in);
        }

        @Override
        public ShowRoomActivity[] newArray(int size) {
            return new ShowRoomActivity[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(motor);
        parcel.writeInt(jumlah);
        parcel.writeInt(hp);
        parcel.writeString(alamat);
    }
}
