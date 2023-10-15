package com.leonstyven.mywater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tv;
    public void alert(String msg){
        Toast.makeText(HomeActivity.this, msg, Toast.LENGTH_SHORT).show();
    }
    public void procesarEvento(int opc){

        Intent intent = new Intent(HomeActivity.this, SettingsActivity.class);
        String nombre = tv.getText().toString();
        //startActivity(intent);

        switch (opc){
            /*case R.id.loginBtn: alert("Hola");
                break;*/
            case 2131231213: //alert("Hola");
                            intent.putExtra("Saludo", "Hola " + nombre);
                break;
            case 2131231214: //alert("mundo!");
                            intent.putExtra("Saludo", "Adios " + nombre);
                break;
        }
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tv = (TextView) findViewById(R.id.editText);
        Button loginBtn = findViewById(R.id.loginBtn);
        Button registerBtn = findViewById(R.id.registerBtn);

        loginBtn.setOnClickListener(this);
        registerBtn.setOnClickListener(this);

        /*loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Hola mundo!", Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    @Override
    public void onClick(View view) {
        procesarEvento(view.getId());

    }
}