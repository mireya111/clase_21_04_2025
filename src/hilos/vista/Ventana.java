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
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        Automovil a = new Automovil();

        marcaAuto = new JTextField();
        marcaAuto.setBounds(120, 20, 150, 30);
        add(marcaAuto);

        modeloAuto = new JTextField();
        modeloAuto.setBounds(120, 60, 150, 30);
        add(modeloAuto);

        pricioAuto = new JTextField();
        pricioAuto.setBounds(120, 100, 150, 30);
        add(pricioAuto);

        // Creación del JButton
        btnProcesar = new JButton("Procesar");
        btnProcesar.setBounds(100, 140, 100, 30);
        add(btnProcesar);

        // Creación de los JLabels
        lblMarca = new JLabel("Marca: ");
        lblMarca.setBounds(50, 20, 60, 30);
        add(lblMarca);

        lblModelo = new JLabel("Modelo: ");
        lblModelo.setBounds(50, 60, 60, 30);
        add(lblModelo);

        lblPrecio = new JLabel("Precio: ");
        lblPrecio.setBounds(50, 100, 60, 30);
        add(lblPrecio);

        btnProcesar.addActionListener(e -> {
            String marca = marcaAuto.getText();
            String modelo = modeloAuto.getText();
            Double precio = Double.parseDouble(pricioAuto.getText());
            a.setMarca(marca);
            a.setModelo(modelo);
            a.setPrecio(precio);
            this.setVisible(false);
            JOptionPane.showMessageDialog(null,
                    "Sus datos son los siguientes:\n" +
                            "Marca: " + a.getMarca() + "\n" +
                            "Modelo: " + a.getModelo() + "\n" +
                            "Precio: " + a.getPrecio());

        });

    }
}