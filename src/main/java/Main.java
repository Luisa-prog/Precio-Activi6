

public class Main {
  public static void main(String[] args) {
    double PrecioPagado = 34;
    double PorcentajeDescuento = 0.15;
    double PrecioSinDescuento = PrecioPagado / (1 - PorcentajeDescuento);

    System.out.println("el precio sin descuento es: " + PrecioSinDescuento  + "€");
  }

}