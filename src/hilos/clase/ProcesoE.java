package hilos.clase;

import javax.swing.*;

public class ProcesoE implements Runnable{
    public void Pantalla(){
        JOptionPane.showMessageDialog(null, "Hola ¿Cómo estás?");
    }

    @Override
    public void run() {
        Pantalla();
    }
}
