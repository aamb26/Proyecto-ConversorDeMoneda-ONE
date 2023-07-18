package co.com.one.modelo;

import javax.swing.*;
import java.util.Enumeration;
import java.util.Hashtable;

public class ConversorDivisas  extends JFrame {

    // Propiedades
    private Hashtable<String, Double> tablaConversion = new Hashtable<String, Double>();

    // Constructor
    public ConversorDivisas(){
        insertarDivisa("USD",1.09);
        insertarDivisa("EUR",0.92);
        insertarDivisa("JPY",144.43);
        insertarDivisa("GBP",0.79);
        insertarDivisa("KRW",1305.48);
        insertarDivisa("COP",4172.89);
        insertarDivisa("VES",29.54);
        insertarDivisa("BRL",4.78);
        insertarDivisa("ARS",257.97);
        insertarDivisa("MXN",17.08);
        insertarDivisa("CLP",799.85);
        insertarDivisa("PEN",3.62);
        insertarDivisa("ECS",26160.66);
        insertarDivisa("BOB",6.90);
    }

    private void insertarDivisa(String codigo, Double tipoCambio) {

        tablaConversion.put(codigo, tipoCambio);
    }

    private double obtenerDivisa(String codigoDivisa){

        return tablaConversion.get(codigoDivisa);
    }

    public Double convertir(String codDivOrigen, String codDivDestino, Double importe){
        Double euros = importe / obtenerDivisa(codDivOrigen);
        return euros * obtenerDivisa(codDivDestino);
    }

    public Enumeration<String> obtenerCodigosDivisa(){
        return tablaConversion.keys();
    }
}