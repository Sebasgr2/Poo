public class CuentaBancaria {

    // Atributos 
    private String titular;
    private String numeroCuenta;
    private double saldo;

    // Constructor por defecto
    public CuentaBancaria() {
        this.titular = "";
        this.numeroCuenta = "";
        this.saldo = 0.0;
    }

    // Constructor parametrizado
    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        setTitular(titular);
        setNumeroCuenta(numeroCuenta);
        setSaldo(saldoInicial);
    }

    // Getters y Setters 
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta != null && !numeroCuenta.trim().isEmpty()) {
            this.numeroCuenta = numeroCuenta;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    // Método depositar
    public double depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
        return saldo;
    }
    // Método retirar
    public double retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
        return saldo;
    }

    // Método toString
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
} 