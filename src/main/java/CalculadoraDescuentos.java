public class CalculadoraDescuentos {

    public double aplicarDescuentoProcentaje(double monto, double porcentaje){
        return monto - (monto * porcentaje / 100.0);
    }
    
}
