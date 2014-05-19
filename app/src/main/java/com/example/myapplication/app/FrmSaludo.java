package com.example.myapplication.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Ph33r on 5/19/2014.
 */
public class FrmSaludo extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        //Localizar los controles
        TextView txtSaludo = (TextView)findViewById(R.id.TxtSaludo);
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
        //Construimos el mensaje a mostrar
        txtSaludo.setText("HOLA " + bundle.getString("NOMBRE"));
    }
}
