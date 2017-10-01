package com.example.jonfb.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnAceptar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos una referencia a los controles de las interfaces
        txtNombre= (EditText) findViewById(R.id.txtnombre);
        btnAceptar=(Button)findViewById(R.id.btnAceptar);

        //Implementamos el evento click del botón
        btnAceptar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                //creamos el intent
                Intent intent=new Intent(MainActivity.this,SaludoActivity.class);
                //creamos la info a pasar entre atividades
                Bundle b=new Bundle();
                b.putString("NOMBRE",txtNombre.getText().toString());
                //Añadimos la informacion al intent
                intent.putExtras(b);
                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });
    }
}
