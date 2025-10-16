public class Producto {
   
    // Atributos 
    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    // Constructor por defecto
    public Producto() {
        this.codigo = "GEN";
        this.descripcion = "Producto genérico";
        this.cantidad = 1;
        this.precioUnitario = 0.0;
    }

    // Constructor parametrizado con validaciones
    public Producto(String codigo, String descripcion, int cantidad, double precioUnitario) {
        setCodigo(codigo);
        setDescripcion(descripcion);
        setCantidad(cantidad);
        setPrecioUnitario(precioUnitario);
    }

    // Getters y Setters 
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.trim().isEmpty()) {
            this.descripcion = descripcion;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 1) {
            this.cantidad = cantidad;
        }
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario >= 0) {
            this.precioUnitario = precioUnitario;
        }
    }

    // Método calcularSubtotal
    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }

    // Método aplicarDescuento
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 50) {
            precioUnitario -= precioUnitario * (porcentaje / 100.0);
        }
    }

    // Método incrementarCantidad
    public void incrementarCantidad(int valor) {
        if (valor > 0) {
            cantidad += valor;
        }
    }
    // Método para calcular el total con impuesto del 8%
    public double calcularTotalConImpuesto() {
        double subtotal = calcularSubtotal();
        double impuesto = subtotal * 0.08;
        return subtotal + impuesto;
    }
    // Método toString
    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", subtotal=" + calcularSubtotal() +
                '}';
    }
}