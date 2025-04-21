package clase.test;
import java.util.Scanner;

import clase.impl.Operacionesimpl;
import clase.interfaz.Operaciones;
import clase.vista.Calculadora;

import javax.swing.*;

public class OperacionesTest {
    public static void main(String[] args){
        Calculadora  c= new Calculadora();
        c.show();
        System.out.println("Hola mundo");
        Operaciones op = new Operacionesimpl();

        Scanner sc = new  Scanner(System.in);
        //System.out.println("Ingrese un valor uno:");
        double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero uno:"));

        System.out.println("Ingresar el valor 2:");
        double y = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero dos:"));;

        //Llamada a los metodos
        //double x=2.5;
        //double y=3.6;


        JOptionPane.showMessageDialog(null, "La suma es: "+op.sumar(x,y));
    }
}
