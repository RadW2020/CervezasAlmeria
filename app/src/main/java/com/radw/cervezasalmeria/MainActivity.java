package com.radw.cervezasalmeria;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends Activity {
    private BeerExpert selecc = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //call when the user clicks on the button
    public void onClickFindBeer (View view){
        // get a reference to the TextView
        TextView marcas = (TextView) findViewById(R.id.marcas);
        //Get a reference to the spinner
        Spinner marcaSpin = (Spinner) findViewById(R.id.marca);
        //get the selected item in the spinner
        String marca = String.valueOf(marcaSpin.getSelectedItem());

        //Choose from beerExpert
        List<String> listaSelecc = (selecc.getBrands(marca));
        // create string for the information text view
        StringBuilder resultSelecc = new StringBuilder();

        for (String temp : listaSelecc){
            resultSelecc = resultSelecc.append(temp.concat("\n"));
        }

        marcas.setText(resultSelecc);

    }
}