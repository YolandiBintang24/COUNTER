package com.yolandi.counter;

import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int x =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tambahAngka(View view){
    x++;
    Vibrator Getar = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        Getar.vibrate(50);
    if(x ==33){
        Getar.vibrate(2000);
    }
    if(x == 34){

        hapusAngka(view);

    }

    TextView Tambah = (TextView) findViewById(R.id.textCounter);
    Tambah.setText(Integer.toString(x));


    }

    public void hapusAngka(View view){
        x = 0;
        TextView Hapus = (TextView) findViewById(R.id.textCounter);
        Hapus.setText(Integer.toString(x));

        String Text ="Berhasil direset";
        Toast notif = Toast.makeText(this,Text,Toast.LENGTH_LONG);
        notif.setGravity(Gravity.FILL_HORIZONTAL,0,-650);
        notif.show();

    }
    public void ngurangAngka(View view){
        x--;
        TextView Kurang = (TextView) findViewById(R.id.textCounter);
        Kurang.setText(Integer.toString(x));
    }
}
