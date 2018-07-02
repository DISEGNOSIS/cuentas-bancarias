/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasbancarias.CuentasBancarias;

/**
 *
 * @author Guada
 */
public class CuentaCorriente extends CuentaBancaria {
    
    private double descubierto;

    public CuentaCorriente(String alias, double saldo, int sucursal, double descubierto) {
        super(alias, saldo, sucursal);
        this.descubierto = descubierto;
    }
    
    @Override
    public boolean extraer(double monto){
        boolean extraccionRealizada = false;
        if ((super.saldo + this.descubierto) >= monto) {
            super.saldo -= monto;
            extraccionRealizada = true;
            System.out.println("Se realizó una extracción de $" + monto);
        }
        else {
            System.out.println("No hay saldo para poder realizar la extracción");
        }
        return extraccionRealizada;
    }

    @Override
    public String toString() {
        return super.toString() + "Es una Cuenta Corriente.\nEl descubierto es de $" + descubierto + "\n";
    }
    
    
    
}
