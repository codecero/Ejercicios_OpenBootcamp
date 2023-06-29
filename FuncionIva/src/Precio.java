import static java.lang.System.*;

public class Precio {
    static double precio = 100;
//imprime el valor y lo retorna
    public static double precioConIva(double precio) {
        double precioOriginal = precio;
        double iva = 0.19;
        out.println(precioOriginal*(1+ iva));
        return precioOriginal*(1+ iva);
    }
}
