package co.com.one.principal;

import co.com.one.controlador.ControladorConversor;
import co.com.one.modelo.ConversorDivisas;
import co.com.one.vista.VistaDivisas;

public class ProgramaPrincipal extends VistaDivisas {

    public static void main(String[] args) {

        ConversorDivisas modelo = new ConversorDivisas();
        ProgramaPrincipal vista = new ProgramaPrincipal();
        ControladorConversor controlador = new ControladorConversor(vista, modelo);

        // Métodos
        vista.conectarControlador(controlador); // Conecto la vista al controlador
        vista.arrancar(); // Muestro la interfaz gráfica
    }

}