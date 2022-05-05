package Negocio;

public class Transaccion {




        private boolean datosValidos (Tarjeta tarjeta,double monto){
            boolean esTarjetaValida = tarjeta != null;
            boolean esMontoValido = monto > 0 && monto < 1000;

            return esTarjetaValida && esMontoValido;
        }

}