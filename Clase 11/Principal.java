public class Principal {
    public static void main(String[] args) {
        // Crear una cuenta válida
        CuentaBancaria cuentaValida = new CuentaBancaria("Lucas Perez", "156893789", 1000.0);

        // Crear una cuenta inválida (saldo negativo, se ignora y queda en 0)
        CuentaBancaria cuentaInvalida = new CuentaBancaria("Luis Reyes", "987654321", -500.0);

        // Depositar en cuenta válida
        cuentaValida.depositar(500.0);

        // Retirar de cuenta válida
        cuentaValida.retirar(200.0);

        // Mostrar resultados
        System.out.println("Cuenta válida:");
        System.out.println("Titular: " + cuentaValida.getTitular());
        System.out.println("Número de cuenta: " + cuentaValida.getNumeroCuenta());
        System.out.println("Saldo: " + cuentaValida.getSaldo());

        System.out.println("\nCuenta inválida:");
        System.out.println("Titular: " + cuentaInvalida.getTitular());
        System.out.println("Número de cuenta: " + cuentaInvalida.getNumeroCuenta());
        System.out.println("Saldo: " + cuentaInvalida.getSaldo());

        // Espacio entre cuentas y productos
        System.out.println();

        // Crear un producto usando el constructor parametrizado
        Producto prod = new Producto("A001", "Mouse óptico", 2, 150.0);

        // Mostrar información inicial
        System.out.println(prod);

        // Aplicar descuento del 20%
        prod.aplicarDescuento(20);
        System.out.println("Después de aplicar descuento:");
        System.out.println(prod);

        // Incrementar cantidad en 3
        prod.incrementarCantidad(3);
        System.out.println("Después de incrementar cantidad:");
        System.out.println(prod);

        // Calcular subtotal
        System.out.println("Subtotal: " + prod.calcularSubtotal());
    

        // Calcular total con impuesto del 8%
        System.out.println("Total con impuesto (8%): " + prod.calcularTotalConImpuesto());
    }
}    