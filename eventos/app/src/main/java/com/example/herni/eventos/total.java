package com.example.herni.eventos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class total extends AppCompatActivity {
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
        setContentView(R.layout.activity_total);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        ArrayList<String> historia_list = intent.getStringArrayListExtra("historia_list");
        a = historia_list;

        String text = "Esto le pasó a un amigo de un amigo mio, " + a.get(0) + " , era una persona 'normal' que hacia cosas 'normales'. Un dia lo encontraton"
                + a.get(1) + " con " + a.get(3) + " cerca al " + a.get(2) + ". \n Eso marco un antes y un despues con sus amigos y amigas, que despues no volvieron a verlo de la misma manera. Ahora nadie habla con "
                + a.get(0);

        TextView h = findViewById(R.id.historia);
        h.setText(text);
    }
}
