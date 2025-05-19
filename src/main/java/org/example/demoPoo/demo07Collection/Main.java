package org.example.demoPoo.demo07Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Démo pour SortedSet (HashSet)
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("C++"); // pas de doublons
        set.add("Python3");
        System.out.println("Hashset : "+set);

        // Demo pour SortedSet (TreeSet)
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Java");
        sortedSet.add("Python");
        sortedSet.add("C++");
        sortedSet.add("C++");
        sortedSet.add("Python3");
        sortedSet.add("Javascript");
        System.out.println("Sortedset : "+sortedSet);

        // Methode pour SortedSet
        System.out.println("Premier element : "+sortedSet.first());
        System.out.println("Dernier element : "+sortedSet.last());
        SortedSet<String> headset = sortedSet.headSet("Python");
        System.out.println("Sous ensemble avant Python :"+headset);
        SortedSet<String> tailset = sortedSet.tailSet("Javascript");
        System.out.println("Sous ensemble apres javascript "+tailset);

        // Démo pour le HashMap
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Java",20);
        hashMap.put("Python",10);
        hashMap.put("C++",30);
        System.out.println("mon hasmap : "+hashMap);
        if(hashMap.containsKey("Java")){
            System.out.println("La cle Java exite déja");
        }

        if(hashMap.containsKey("Toto")){
            System.out.println("La cle Toto exite déja");
        }else {
            hashMap.put("Toto",58);
        }

        System.out.println("mon hasmap : "+hashMap);


        // Methodes pour le hashmap
        System.out.println("Nombre d'element dans mon hasmap : "+hashMap.size());
        System.out.println("Valeur associé à la clé Java : "+hashMap.get("Java"));
        System.out.println("Supprimer l'element avec la clé Toto");
        hashMap.remove("Toto");
        System.out.println("Apres suppression : "+hashMap);


        // PArcourir notre hashmap

        // en utilisant les clés
        for (String key: hashMap.keySet()){
            System.out.println("La clé est : "+key);
            System.out.println("Et sa valeur : "+hashMap.get(key));
        }

        // en utilisant les valeurs
        for (int value: hashMap.values()){
            System.out.println("Ma valeur : "+value);
        }

        // parcours avec une boucle foreach
        for (Map.Entry<String,Integer> entry: hashMap.entrySet()){
            System.out.println("Ma clé : "+entry.getKey()+" et ma valeur : "+entry.getValue());
        }





    }
}
