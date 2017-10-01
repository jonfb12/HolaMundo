package com.example.jonfb.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {

    private TextView txtSaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        //Localizar los controles
        txtSaludo= (TextView) findViewById(R.id.txtSaludo);

        //Recuperamos la informacion pasada en el intent
        Bundle b=this.getIntent().getExtras();

        //COnstruimos el mensaje a mostrar
        txtSaludo.setText("Hola "+b.getString("NOMBRE"));
    }
}
