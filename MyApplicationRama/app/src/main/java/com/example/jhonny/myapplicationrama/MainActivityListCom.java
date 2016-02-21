package com.example.jhonny.myapplicationrama;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivityListCom extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_list_com);

        //creamos y cargamos la lista ue va a recivir el constructor del adapter
        List<Comuna> comunas=new ArrayList<Comuna>();
        comunas.add(new Comuna("comuna 1", R.drawable.comuna_1));
        comunas.add(new Comuna("comuna 2", R.drawable.comuna_2));
        comunas.add(new Comuna("comuna 3", R.drawable.comuna_3));
        comunas.add(new Comuna("comuna 4", R.drawable.comuna_4));
        comunas.add(new Comuna("comuna 5", R.drawable.comuna_5));
        comunas.add(new Comuna("comuna 6", R.drawable.comuna_6));
        comunas.add(new Comuna("comuna 7", R.drawable.comuna_7));
        comunas.add(new Comuna("comuna 8", R.drawable.comuna_8));
        comunas.add(new Comuna("comuna 9", R.drawable.comuna_9));
        comunas.add(new Comuna("comuna 10", R.drawable.comuna_10));
        comunas.add(new Comuna("comuna 11", R.drawable.comuna_11));
        comunas.add(new Comuna("comuna 12", R.drawable.comuna_12));
        comunas.add(new Comuna("comuna 13", R.drawable.comuna_13));
        comunas.add(new Comuna("comuna 14", R.drawable.comuna_14));
        comunas.add(new Comuna("comuna 15", R.drawable.comuna_15));

        //creamos el objeto adapter
        AdapterDeListaDeComunas adapterDeListaDeComunas=new AdapterDeListaDeComunas((ArrayList<Comuna>) comunas,this);

        //obtenemos una referencia al ListView
        ListView listView=(ListView)findViewById(R.id.idLisViewDeComunasParaLayoutPort);

        //ponemos el adapter en la ListView
        listView.setAdapter(adapterDeListaDeComunas);




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_list_com, menu);
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
