package com.example.calculadorapdm20202;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView visorTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visorTv = findViewById(R.id.visorTv);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.zeroBt:
                visorTv.setText(visorTv.getText() + getString(R.string.zero));
                Log.v(getString(R.string.app_name), getString(R.string.zero));
                break;
            case R.id.umBt:
                visorTv.setText(visorTv.getText() + getString(R.string.um));
                Log.v(getString(R.string.app_name), getString(R.string.um));
                break;
            case R.id.doisBt:
                visorTv.setText(visorTv.getText() + getString(R.string.dois));
                Log.v(getString(R.string.app_name), getString(R.string.dois));
                break;
            case R.id.tresBt:
                visorTv.setText(visorTv.getText() + getString(R.string.tres));
                Log.v(getString(R.string.app_name), getString(R.string.tres));
                break;
            case R.id.quatroBt:
                visorTv.setText(visorTv.getText() + getString(R.string.quatro));
                Log.v(getString(R.string.app_name), getString(R.string.quatro));
                break;
            case R.id.cincoBt:
                visorTv.setText(visorTv.getText() + getString(R.string.cinco));
                Log.v(getString(R.string.app_name), getString(R.string.cinco));
                break;
            case R.id.seisBt:
                visorTv.setText(visorTv.getText() + getString(R.string.seis));
                Log.v(getString(R.string.app_name), getString(R.string.seis));
                break;
            case R.id.seteBt:
                visorTv.setText(visorTv.getText() + getString(R.string.sete));
                Log.v(getString(R.string.app_name), getString(R.string.sete));
                break;
            case R.id.oitoBt:
                visorTv.setText(visorTv.getText() + getString(R.string.oito));
                Log.v(getString(R.string.app_name), getString(R.string.oito));
                break;
            case R.id.noveBt:
                visorTv.setText(visorTv.getText() + getString(R.string.nove));
                Log.v(getString(R.string.app_name), getString(R.string.nove));
                break;
            case R.id.virgula:
                visorTv.setText(visorTv.getText() + getString(R.string.virgula));
                Log.v(getString(R.string.app_name), getString(R.string.virgula));
                break;
            case R.id.backspace:
                if (visorTv.getText().length() > 0) {
                    visorTv.setText(visorTv.getText().subSequence(0, visorTv.getText().length() - 1));
                    Log.v(getString(R.string.app_name), getString(R.string.nove));
                }
                break;
            case R.id.limparBt:
                visorTv.setText("");
        }
    }
}