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
public class CajaDeAhorro extends CuentaBancaria {
    
    private final double tasaDeInteres;

    public CajaDeAhorro(String alias, double saldo, int sucursal, double tasaDeInteres) {
        super(alias, saldo, sucursal);
        this.tasaDeInteres = tasaDeInteres;
    }
    
    public String pagarIntereses () {
        double saldoInicial = super.saldo;
        super.saldo += (super.saldo * this.tasaDeInteres) / 100;
        return "El interés fue de $" + (saldoInicial * (tasaDeInteres / 100)) + "\n";
    }

    @Override
    public String toString() {
        return super.toString() + "Es una Caja de Ahorro.\nLa tasa de Interés  es del " + tasaDeInteres + "%\n";
    }
    
    
    
    
}
