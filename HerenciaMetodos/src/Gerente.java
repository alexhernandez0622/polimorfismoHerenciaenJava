class Gerente extends Empleado {
    String departamento;

    Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    void gestionar() {
        System.out.println(nombre + " está gestionando el departamento " + departamento);
    }
}
