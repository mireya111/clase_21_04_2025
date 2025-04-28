package hilos.vista;

import hilos.clase.Automovil;

import javax.swing.*;

public class Ventana extends JFrame {
    private JTextField marcaAuto;
    private JTextField modeloAuto;
    private JTextField pricioAuto;
    private JButton btnProcesar;
    private JLabel lblMarca;
    private JLabel lblModelo;
    private JLabel lblPrecio;

    public Ventana() {
        setTitle("Autos");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        Automovil a = new Automovil();

        marcaAuto = new JTextField();
        marcaAuto.setBounds(50, 20, 200, 30);
        add(marcaAuto);

        modeloAuto = new JTextField();
        modeloAuto.setBounds(50, 30, 200, 30);
        add(modeloAuto);

        pricioAuto = new JTextField();
        pricioAuto.setBounds(30, 40, 200, 30);
        add(pricioAuto);

        btnProcesar = new JButton("Procesar");
        btnProcesar.setBounds(160, 140, 80, 30);
        add(btnProcesar);

        lblMarca = new JLabel("Marca: ");
        lblMarca.setBounds(50, 1, 200, 30);
        add(lblMarca);

        lblModelo = new JLabel("Marca: ");
        lblModelo.setBounds(50, 5, 200, 30);
        add(lblModelo);

        lblPrecio = new JLabel("Marca: ");
        lblPrecio.setBounds(50, 10, 200, 30);
        add(lblPrecio);

        btnProcesar.addActionListener(e -> {
            String marca = marcaAuto.getText();
            String modelo = modeloAuto.getText();
            Double precio = Double.parseDouble(pricioAuto.getText());
            a.setMarca(marca);
            a.setModelo(modelo);
            a.setPrecio(precio);
            JOptionPane.showMessageDialog(null,
                    "Sus datos son los siguientes:\n" +
                            "Marca: " + a.getMarca() + "\n" +
                            "Modelo: " + a.getModelo() + "\n" +
                            "Precio: " + a.getPrecio());

        });

    }
}