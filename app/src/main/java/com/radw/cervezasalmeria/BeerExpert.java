package com.radw.cervezasalmeria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by radw on 18/06/16.
 */
public class BeerExpert {

    List<String> getBrands(String marca) {

        List<String> brands = new ArrayList<>();
        if (marca.contains("Far West"))
        {
            brands.add("RedWine 5,2º");
            brands.add("Golden Star 3,9º");
            brands.add("Black Diamond 5º");
            brands.add("Predicador Abadía 5,2º");
            brands.add("Rauchbier Ale 5,2º");
            brands.add("Kölsch Ale 5,2º");
            brands.add("Bad Barley Ale 6,4º");
            brands.add("Sarvaje IPA Suave 4,2º");
        }
        else if (marca.contains("Alborán"))
        {
            brands.add("Alborán 4,8º");
        }
        else if (marca.contains("El Cabo"))
        {
            brands.add("Pale Ale 5,3º");
            brands.add("Selecta 6,3º");
        }
        else if (marca.contains("Origen"))
        {
            brands.add("Origen");
            brands.add("Black-Ipa");
            brands.add("Siglo XXI");
            brands.add("Stout");
        }
        else if (marca.contains("Filabres"))
        {
            brands.add("Pale Ale");
            brands.add("Red Ale");
            brands.add("Black Porter");
        }
        else //Glamour y Torolé
        {
            brands.add("Glamour");
        }

        return brands;

    }
}
