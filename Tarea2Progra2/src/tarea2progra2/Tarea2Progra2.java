package tarea2progra2;

public class Tarea2Progra2 {

    public static void main(String[] args) {
        //crear expendedor y monedas 
        Expendedor expendedor = new Expendedor(2, 400);
        Moneda1000 moneda1000 = new Moneda1000();
        Moneda500 moneda500 = new Moneda500();
        Moneda400 moneda400 = new Moneda400();
        Moneda100 moneda100 = new Moneda100();
        Moneda monedaNull = null;
        
        //compra una bebida satisfactoriamente
        System.out.println("- Geoffrey fue a comprar una fanta con 1000 pesos");
        Comprador geoffrey = new Comprador(moneda1000, 1, expendedor);
        System.out.println("- Geoffrey se tomo una " + geoffrey.queBebiste() + " y obtuvo " + geoffrey.cuantoVuelto() + " pesos de vuelto.");
        //compra las bebidas con una moneda null
        System.out.println("- Dreyko fue a comprar una sprite sin monedas...");
        Comprador dreyko = new Comprador(monedaNull, 2, expendedor);
        System.out.println("- Dreyko se tomo una " + dreyko.queBebiste() + " y obtuvo " + dreyko.cuantoVuelto() + " pesos de vuelto.");
        //compra una bebida con el boton incorrecto
        System.out.println("- Benjamin fue a comprar una cocacola con 500 pesos, pero se equivoco de boton...");
        Comprador benjamin = new Comprador(moneda500, 5, expendedor);
        System.out.println("- Benjamin se tomo una " + benjamin.queBebiste() + " y obtuvo " + benjamin.cuantoVuelto() + " pesos de vuelto.");
        //compra una bebida pero le falta plata
        System.out.println("- Tomas fue a comprar una fanta con 100 pesos...");
        Comprador tomas = new Comprador(moneda100, 1, expendedor);
        System.out.println("- Tomas se tomo una " + tomas.queBebiste() + " y obtuvo " + tomas.cuantoVuelto() + " pesos de vuelto.");
        //compra una bebida con la plata justa
        System.out.println("- Shiede fue a comprar una fanta con 400 pesos...");
        Comprador shiede = new Comprador(moneda400, 1, expendedor);
        System.out.println("- Shiede se tomo una " + shiede.queBebiste() + " y obtuvo " + shiede.cuantoVuelto() + " pesos de vuelto.");
        //compra una bebida pero no hay y reclama su moneda
        System.out.println("- Jordan fue a comprar una fanta con 1000 pesos...");
        Comprador jordan = new Comprador(moneda1000, 1, expendedor);
        System.out.println("- Jordan se tomo una " + jordan.queBebiste() + " y obtuvo " + jordan.cuantoVuelto() + " pesos de vuelto.");
        System.out.println("- Observamos bien la moneda de 1000... (" + moneda1000.toString() + "). Que moneda mas rara.");
    }
    
}
