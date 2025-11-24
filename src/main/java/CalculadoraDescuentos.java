public class CalculadoraDescuentos {

    public double aplicarDescuentoProcentaje(double monto, double porcentaje){
        return monto - (monto * porcentaje / 100.0);
    }
    
    public double aplicarDescuentoFijo(double monto, double descuento){
        return monto - descuento;
    }

    public double aplicarDescuentoAcumulado(double monto, double porcentaje, double descuentoFijo){
        double conPorcentaje = aplicarDescuentoProcentaje(monto, porcentaje);
        return aplicarDescuentoFijo(conPorcentaje, descuentoFijo);
    }

    
}
