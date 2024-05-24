package examencd.local;

public class App {
    
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Xulio", 100);
        System.out.println(cuenta.getSaldo());
    }
}
