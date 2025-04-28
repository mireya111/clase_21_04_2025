import hilos.clase.*;

public static void main(String[] args) {
    /*ProcesoA a = new ProcesoA(100);
    ProcesoB b = new ProcesoB("Juan");
    ProcesoC c = new ProcesoC(10);
    //ProcesoD d = new ProcesoD();
    Runnable x = new ProcesoD(50);
    Thread d = new Thread(x);

    Runnable y = new ProcesoE();
    Thread e = new Thread(y);
    a.start();
    b.start();
    c.start();
    d.start();
    e.start();*/
    /*Persona p = new Persona();
    p.setNombre("Mireya");
    p.setFechaNacimiento("08 de septiembre del 2004");
    p.setDireccion("La Forestal");

    System.out.println("Nombre: "+p.getNombre());
    System.out.println("Fecha de nacimiento: "+p.getFechaNacimiento());
    System.out.println("Direccion: "+p.getDireccion());*/
    Runnable k = new ProcesoF();
    Thread f = new Thread(k);
    f.start();
}


