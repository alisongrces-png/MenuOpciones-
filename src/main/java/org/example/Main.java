package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Programa para crear un ciclo
        // Y crear un menú de opciones:

        Integer opcionSeleccionada=0;
        while (opcionSeleccionada !=5){
            System.out.println("Menu de opciones");
            System.out.println("****************");
            System.out.println("➕Digita 1 para sumar");
            System.out.println("➖Diigta 2 para restar");
            System.out.println("✖Digita 3 para multiplicar");
            System.out.println("➗Digita 4 para dividir");
            System.out.println("📤Digita 5 para SALIR DEL PROGRAMA");
            Scanner leerTeclado=new Scanner(System.in);
            System.out.println("Seleccione una opcion por favor: 😉");
            opcionSeleccionada=leerTeclado.nextInt();

            //Evaluando caminos según la opcion del usuario
            if (opcionSeleccionada==1){
                System.out.println("Sumando");
            } else if (opcionSeleccionada==2) {
                System.out.println("Restando");
            } else if (opcionSeleccionada==3) {
                System.out.println("Multiplicando");
            } else if (opcionSeleccionada==4) {
                System.out.println("Dividiendo");
            } else if (opcionSeleccionada==5) {
                System.out.println("Saliste del programa");
            }else{
                System.out.println("Opcion Invalida");
            }
        }

        }
    }
