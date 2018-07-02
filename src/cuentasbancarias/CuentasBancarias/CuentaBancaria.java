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
public class CuentaBancaria {
    
    protected static long ultimoNumeroDeCuenta = 100000;
    protected final int cbu;
    protected final String alias;
    protected double saldo;

    public CuentaBancaria(String alias, double saldo, int sucursal) {
        this.alias = alias;
        this.saldo = saldo;
        this.cbu = generarCbu(sucursal);
    }
    
    public CuentaBancaria(String alias, int sucursal) {
        this.alias = alias;
        this.cbu = generarCbu(sucursal);
    }
    
    public void depositar(double monto){
        this.saldo += monto;
        System.out.println("Se hizo un depósito de $" + monto);
    }
    
    public boolean extraer(double monto){
        boolean extraccionRealizada = false;
        if (this.saldo >= monto) {
            this.saldo -= monto;
            extraccionRealizada = true;
            System.out.println("Se realizó una extracción de $" + monto);
        }
        else {
            System.out.println("No hay saldo para poder realizar la extracción");
        }
        return extraccionRealizada;
    }
    
    private int generarCbu (int sucursal){
        int cbu1 = (int) (sucursal * 1000000 + CuentaBancaria.ultimoNumeroDeCuenta);
        CuentaBancaria.ultimoNumeroDeCuenta++;
        return cbu1;

    }
    
    protected void setSaldo (double saldo){
        this.saldo = saldo;
        System.out.println("Se ha seteado un saldo de $" + saldo);
    }
    
    @Override
    public String toString(){
        return "El titular de la cuenta es: " + this.alias + "\nEl CBU es: " + this.cbu +
        "\nEl saldo de la cuenta es de $" + this.saldo + "\n";
    }

    
}
