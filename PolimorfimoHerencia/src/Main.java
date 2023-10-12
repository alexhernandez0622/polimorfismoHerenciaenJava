
public class Main {
    public static void main(String[] args)
    {
        Animal miMascota = new Perro();
        miMascota.sonido();

        miMascota = new Gato();
        miMascota.sonido();
    }
}