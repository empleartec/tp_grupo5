package com.example.jhonny.myapplicationrama;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivityDeInicio extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Este boton nos redirecciona al layout activity_main_activity_gps.xml de la clase MainActivityGPS.class
        setContentView(R.layout.activity_main_activity_de_inicio);//Muestra la pantalla
        Button botonGPS=(Button)findViewById(R.id.idBotonGPS);//
        botonGPS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MainActivityGPS.class);
                startActivity(intent);
            }
        });
        //Este boton nos redirecciona al layout activity_main_activity_list_com.xml de la clase MainActivityListCom.class
        Button botonComuna=(Button)findViewById(R.id.idBotonComunas);
        botonComuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MainActivityListCom.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_de_inicio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
