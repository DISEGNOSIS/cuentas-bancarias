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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaBancaria cuenta1 = new CuentaBancaria("Guadalupe Savigliano", 234);
        cuenta1.setSaldo(5000);
        cuenta1.depositar(3000);
        boolean extraccionRealizada = cuenta1.extraer(2000);
        System.out.println(cuenta1);
       
        CuentaBancaria cuenta2 = new CuentaBancaria("Miguel Lezcano", 2000, 234);
        cuenta2.depositar(3000);
        extraccionRealizada = cuenta2.extraer(2000);
        extraccionRealizada = cuenta2.extraer(5000);
        System.out.println(extraccionRealizada);
        System.out.println(cuenta2);
        
        
        CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro("Agustín Lezcano", 1000, 234, 2);
        System.out.println(cajaDeAhorro1);
        System.out.println(cajaDeAhorro1.pagarIntereses());
        System.out.println(cajaDeAhorro1);
        
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente("Pepito Juárez", 3000, 234, 2000);
        System.out.println(cuentaCorriente1);
        extraccionRealizada = cuentaCorriente1.extraer(4000);
        System.out.println(cuentaCorriente1);

        
    }
    
    
}
