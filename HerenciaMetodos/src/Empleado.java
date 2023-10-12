class Empleado {
    String nombre;
    double salario;

    Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }
}