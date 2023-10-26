import java.util.ArrayList;

public class Factura {
    /*3. Crear una clase llamada Factura que represente una factura comercial. La clase debe tener los siguientes atributos:
            •	Número de factura: Un número único para identificar la factura.
            •	Fecha de emisión: La fecha en la que se emitió la factura.
            •	Cliente: El cliente al que se le emite la factura.
            •	Artículos: Una lista de artículos vendidos en la factura.
            •	Precio unitario: El precio unitario de cada artículo.
            •	Cantidad: La cantidad de cada artículo vendido.
            •	Subtotal: El subtotal de la factura sin impuestos.
            •	IVA: El impuesto sobre el valor añadido (IVA) de la factura.
            •	Total: El total de la factura, incluyendo el IVA.
            •
            La clase debe tener los siguientes métodos:

            •	Constructor: Un constructor que inicializa los atributos de la factura.
            •	Agregar artículo: Un método que agrega un artículo a la factura.
            •	Calcular subtotal: Un método que calcula el subtotal de la factura.
            •	Calcular IVA: Un método que calcula el IVA de la factura.
            •	Calcular total: Un método que calcula el total de la factura */
    private String numeroFactura;
    private String fechaEmision;
    private String Cliente;
    private ArrayList<String> Articulos;
    private double precioUnitario;
    private double Cantidad;
    private double subTotal;
    private double IVA;
    private double Total;

    public Factura(String numeroFactura, String fechaEmision, String cliente) {
        this.numeroFactura = numeroFactura;
        this.fechaEmision = fechaEmision;
        Cliente = cliente;
        this.Articulos = new ArrayList<>();
    }
    public void AgregarArticulo(String nombreArticulo, double precioUnitario,double Cantidad){
        Articulos.add(nombreArticulo);
        this.precioUnitario = precioUnitario;
        this.Cantidad = Cantidad;
        this.subTotal += precioUnitario * Cantidad;
        this.IVA = subTotal * 0.21;
        this.Total = subTotal + IVA;
    }
    public void imprimirFactura() {
        System.out.println("Número de Factura: " + numeroFactura);
        System.out.println("Fecha de Emisión: " + fechaEmision);
        System.out.println("Cliente: " + Cliente);
        System.out.println("Artículos:");

        for (int i = 0; i < Articulos.size(); i++) {
            System.out.println(Articulos.get(i) + " - Precio Unitario: " + precioUnitario + " - Cantidad: " + Cantidad);
        }

        System.out.println("Subtotal: " + subTotal);
        System.out.println("IVA (21%): " + IVA);
        System.out.println("Total: " + Total);
    }




}
