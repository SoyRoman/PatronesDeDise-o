// Clase principal para probar el Singleton
public class Main {
    public static void main(String[] args) {
        // Intentamos obtener la instancia del Singleton por primera vez
        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();

        // Intentamos obtener la instancia del Singleton por segunda vez
        Singleton singleton2 = Singleton.getInstance();
        singleton2.showMessage();

        // Comparamos ambas instancias para verificar que son la misma
        if (singleton1 == singleton2) {
            System.out.println("Ambas instancias son iguales.");
        } else {
            System.out.println("Las instancias son diferentes.");
        }
    }
}