public class Singleton {
    // Variable estática que contendrá la única instancia del Singleton
    private static Singleton instance;

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private Singleton() {
        // Código de inicialización, si es necesario
    }

    // Método público y estático que devuelve la instancia única del Singleton
    public static Singleton getInstance() {
        if (instance == null) {
            // Si la instancia es nula, se crea la instancia
            instance = new Singleton();
            System.out.println("Instancia creada");
        }
        return instance;
    }

    // Método para demostrar que la instancia fue creada
    public void showMessage() {
        System.out.println("Hola, Instancia desde el singleton!");
    }
}


