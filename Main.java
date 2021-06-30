package com.company;
class Estudiante {
    String nombre = "Antonio Martinez";
    float[] calificaciones = {85 , 85 , 85, 85, 85};
    public int getPromedio() {
        int promedio = (int) ((calificaciones[0] + calificaciones[1] + calificaciones [2] + calificaciones [3] + calificaciones[4])/5);
        return promedio;
    }
    public char getCalif() {
        char calif = ' ' ;
        if (getPromedio() < 50) {
            calif = 'F';
        } else if (getPromedio() > 50 && getPromedio() <= 60){
            calif = 'E';
        } else if (getPromedio() > 60 && getPromedio() <= 70) {
            calif = 'D';
        } else if (getPromedio() > 70 && getPromedio() <= 80) {
            calif = 'C';
        } else if (getPromedio() > 80 && getPromedio() <= 90) {
            calif = 'B';
        } else if (getPromedio() > 90) {
            calif = 'A';
        }
        return calif;
    }

}
public class Main {


    public static void main(String[] args) {
        Estudiante estudiane1 = new Estudiante();
        System.out.println(estudiane1.nombre);
        for (int i = 0; i < 5; i++){
            System.out.println(estudiane1.calificaciones[i]);
        }
        System.out.println(estudiane1.getPromedio());
        System.out.println(estudiane1.getCalif());
    }
}
