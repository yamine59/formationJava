package org.example.tp_papeterie;

import org.example.tp_papeterie.model.Article_unitaire;

import java.util.HashMap;
import java.util.Map;

public class FakeDB {
    public static Map<String, Article_unitaire> database = new HashMap<>();

    public static Map<String, Article_unitaire> getAllArticlePriceMaX(double priceMax) {

        Map<String, Article_unitaire> filteredMap = new HashMap<>();
        for (String key : database.keySet()) {
            if (database.get(key).getPu() <= priceMax) {
                filteredMap.put(key, database.get(key));
            }

        }
        return filteredMap;
    }

}
