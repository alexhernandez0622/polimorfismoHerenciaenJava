class Rectangulo extends Figura {
    double longitud;
    double anchura;

    Rectangulo(double longitud, double anchura) {
        super(longitud * anchura);
        this.longitud = longitud;
        this.anchura = anchura;
    }
}