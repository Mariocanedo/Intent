package com.example.pruebaformulario;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = findViewById(R.id.btn1);


      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
                      .setAction("Action", null).show();
              irSegundaActivity(v);
          }
      });




    }


    @Override
    protected void onStop() {
        super.onStop();
    }

    public void irSegundaActivity(View view){
        EditText ed1 = findViewById(R.id.edt);
        String send_string = ed1.getText().toString();
       Intent intent = new Intent(this,MainActivity2.class);
    intent.putExtra("LINK",send_string);
    startActivity(intent);
    }
}