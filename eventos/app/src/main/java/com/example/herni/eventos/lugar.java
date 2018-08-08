package com.example.herni.eventos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class lugar extends AppCompatActivity {
    public ArrayList<String> a;

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugar);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        ArrayList<String> historia_list = intent.getStringArrayListExtra("historia_list");
        a = historia_list;
        //String t1 = a.get(0);
        //Toast.makeText(this, t1, Toast.LENGTH_SHORT).show();


        // Capture the layout's TextView and set the string as its text
        //TextView textView = findViewById(R.id.mostrar);
        //textView.setText(message);
    }

    public void clicBoton(View view) {

        Intent flujo_historia = new Intent(this, conQuien.class);
        EditText editText = findViewById(R.id.input);

        String message = editText.getText().toString();

        a.add(message);

        flujo_historia.putExtra("historia_list", a);
        startActivity(flujo_historia);
    }
}
