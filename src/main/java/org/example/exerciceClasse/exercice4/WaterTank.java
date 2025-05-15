package org.example.exerciceClasse.exercice4;

public class WaterTank {
    /*
    1. Créer une classe WaterTank
    2. Ajouter les attributs suivants: poids à vide, capacité maximale, niveau de
    remplissage
    3. Créer une méthode remplir() qui ajoutera une volume d'eau à la citerne
    4. Créer une méthode vider() qui enlèvera un volume d'eau à la citerne
    5. Créer un attribut de classe qui contiendra la totalité des volumes d'eau de la
    citerne
    6. /!\ le volume d'eau d'une citerne ne peut pas être négatif ou dépasser le
    volume maximum

     */

    private int weightEmpty;
    private int maxCapacity;
    private int fillLevel;
    private static int totalFillLevel;
    private static int id = 0;
    public WaterTank(int weightEmpty, int maxCapacity, int fillLevel) {
        ++id;
        this.weightEmpty = weightEmpty;
        this.maxCapacity = maxCapacity;
        this.fillLevel = fillLevel;
        totalFillLevel += fillLevel;
    }



    public void remplir(int qt){
        if ((fillLevel + qt + weightEmpty)<= maxCapacity){
            this.fillLevel += qt;
            totalFillLevel +=qt;
        }else{
            System.out.println("capacite insuffisant ,vous voulez mettre "+qt +" alors que la capacite restant est de "+ (maxCapacity -(fillLevel +weightEmpty)+"L."));
        }


    }
    public void vider(int qt){
        if ((fillLevel +weightEmpty -qt) >0){
            this.fillLevel -= qt;
            totalFillLevel -=qt;
        }else{
            fillLevel =0;
        }
    }
    public static int getTotalFillLevel() {
        return totalFillLevel;
    }

    public static void setTotalFillLevel(int totalFillLevel) {
        WaterTank.totalFillLevel = totalFillLevel;
    }

    @Override
    public String toString() {
        return "WaterTanK "+id+" est remplir "+ fillLevel +"L / "+ maxCapacity;
    }
}
