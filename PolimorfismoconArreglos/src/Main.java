
/*@Override está destinado a sobrescribir un método con el mismo nombre y firma en la clase padre (superclase o interfaz). Esta anotación es una práctica recomendada y opcional, pero proporciona ciertas ventajas:

Verificación de errores: Si usas @Override, el compilador verificará que el método que estás anotando realmente sobrescribe un método en la clase padre. Si no es así, el compilador generará un error, lo que te ayuda a detectar posibles problemas de diseño y errores de sintaxis.

Documentación clara: Al usar @Override, es más evidente para otros desarrolladores que estás intentando sobrescribir un método de la clase padre, lo que facilita la comprensión del código.

Mantenimiento más sencillo: Cuando se actualiza el código en la clase padre (superclase o interfaz), el uso de @Override indica claramente que el método en la subclase está relacionado y debe ser actualizado o revisado en consecuencia.*/
public class Main {
    public static void main(String[] args)
    {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Coche();
        vehiculos[1] = new Moto();
        vehiculos[2] = new Vehiculo();

        for (Vehiculo v : vehiculos) {
            v.acelerar();
        }
    }
}