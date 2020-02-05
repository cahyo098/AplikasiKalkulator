package id.ac.poliban.mi.cahyo.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        EditText angka_pertama, angka_kedua;
        Button tambah, kurang, bagi, kali,bersihkan;
        TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka_pertama = (EditText) findViewById(R.id.etAngkaPertama);
        angka_kedua = (EditText) findViewById(R.id.etAngkaKedua);
        tambah = (Button) findViewById(R.id.btTambah);
        kurang = (Button) findViewById(R.id.btKurang);
        kali = (Button) findViewById(R.id.btKali);
        bagi = (Button) findViewById(R.id.btBagi);
        bersihkan = (Button) findViewById(R.id.btBersihkan);
        hasil = (TextView) findViewById(R.id.tvHasil);

    }
}
