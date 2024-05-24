/**
 * Paquete para almacenar .....
 */
package examencd.local;

/**
 * Clase para el guardado de la informacion sobre cuentas bancarias y mejorar su manejo
 */
public class CuentaBancaria {
    //ATRIBUTOS

    /**
     * Atributo para guardar el titular
     */
    private String titular;

    /**
     * Atributo para guardar el saldo
     */
    private double saldo;

    //CONSTRUCTORES
    /**
     * Constructor con todos los parámetros
     * @param titular el titular a insertar en la cuenta 
     * @param saldoInicial el saldo con el que creamos este objeto CuentaBancaria
     */
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    //GETTERS
    /**
     * Getter del titular
     * @return elt titular de la cuenta
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Getter del saldo 
     * @return el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    //METODOS
    /**
     * Deposita la cantidad especificada al la cuenta, suma la cantidad al saldo
     * @param cantidad cantidad a depositar
     * @throws IllegalArgumentException lanza error si se intenta depositar un negativo a la cuenta, para retirar dinero {@see examencd.local.CuentaBancaria.retirar}
     */
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            throw new IllegalArgumentException("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    /**
     * Retira la cantidad especificado de la cuenta, resta del saldo la cantidad
     * @param cantidad cantidad a retirar
     * @throws IllegalArgumentException lanza error si intentas retirar más dinero del que tienes o intentas retirar un número negativo {@see examencd.local.CuentaBancaria.depositar}
     */
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            throw new IllegalArgumentException("No se puede retirar la cantidad especificada.");
        }
    }
}