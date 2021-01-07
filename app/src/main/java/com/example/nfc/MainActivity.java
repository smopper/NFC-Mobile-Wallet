package com.example.nfc;

import android.nfc.NfcAdapter;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView logo;
    private Button first;
    private Button login;
    private NfcAdapter nfcadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = findViewById(R.id.logo);
        first = findViewById(R.id.first);
        login = findViewById(R.id.login);
        first.setText("Inscription");
        login.setText("Login");
        nfcadapter = NfcAdapter.getDefaultAdapter(this);
        if (nfcadapter == null)
        {
            Toast.makeText(this, "NFC is not available", Toast.LENGTH_LONG).show();
            finish();
            return;
        }
        else
        {
            Toast.makeText(this, "NFC is available", Toast.LENGTH_LONG).show();
        }
    }

}