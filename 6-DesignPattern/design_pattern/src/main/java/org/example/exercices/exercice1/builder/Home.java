package org.example.exercices.exercice1.builder;

public class Home {

    private int nbrFloor;
    private boolean pool;
    private String typeRoof;
    private String color;


    public Home(Builder builder){
        nbrFloor = builder.nbrFloor;
        pool = builder.pool;
        typeRoof = builder.typeRoof;
        color = builder.color;


    }
    public static class Builder {
        private int nbrFloor;
        private boolean pool;
        private String typeRoof;
        private String color;



        public Builder nbrFloor(int nbrFloor){

            this.nbrFloor = nbrFloor;
            return this;
        }
        public Builder pool(boolean pool){

            this.pool = pool;
            return this;
        }
        public Builder typeRoof(String typeRoof){

            this.typeRoof = typeRoof;
            return this;
        }
        public Builder color(String color){

            this.color = color;
            return this;
        }

        public Home build() {
            return new Home(this);
        }


    }

    @Override
    public String toString() {
        return "Home{" +
                "nbrFloor=" + nbrFloor +
                ", pool='" + pool + '\'' +
                ", typeRoof='" + typeRoof + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
