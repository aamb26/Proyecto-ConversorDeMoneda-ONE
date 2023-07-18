package co.com.one.controlador;

import co.com.one.modelo.ConversorDivisas;
import co.com.one.vista.VistaDivisas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class ControladorConversor implements ActionListener {

    // Propiedades
    private VistaDivisas ventana;
    private ConversorDivisas modelo;

    // Constructor
    public ControladorConversor(VistaDivisas v, ConversorDivisas m){
        this.ventana = v;
        this.modelo = m;

        ventana.setComboDivisas(modelo.obtenerCodigosDivisa());
    }

    public void actionPerformed(ActionEvent e) {

        // Obtengo los valores para operar
        Double importe = ventana.obtenerImporte();
        String codDivisaOrigen = ventana.obtenerDivisaOrigen();
        String codDivisaDestino = ventana.obtenerDivisaDestino();

        // Realizo la conversion
        Double resultado = modelo.convertir(codDivisaOrigen, codDivisaDestino, importe);

        // Muestro el resultado en la etiqueta Resultado
        DecimalFormat df = new DecimalFormat("#,###.##"); // Formateo salida a dos decimales
        ventana.actualizarResultado(df.format(resultado).toString());
    }
}
