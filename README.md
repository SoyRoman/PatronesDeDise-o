# Ejemplo del Patrón Singleton en Java
Este repositorio contiene una implementación del patrón de diseño Singleton en Java. El patrón Singleton asegura que una clase tenga solo una instancia y proporciona un punto de acceso global a dicha instancia.

## Explicación del Código
Clase Singleton
private static Singleton instance;: Una variable estática que contiene la única instancia de la clase Singleton.
private Singleton() {}: Un constructor privado que evita que otras clases creen nuevas instancias de la clase Singleton.
public static Singleton getInstance(): Un método estático que proporciona un punto de acceso global a la instancia Singleton. Si la instancia no ha sido creada aún, se crea en este método y se imprime "Instancia creada".

Clase Main
Singleton singleton1 = Singleton.getInstance();: Llama a getInstance para obtener la instancia única del Singleton. Como es la primera vez que se llama, se crea la instancia y se imprime "Instancia creada".
singleton1.showMessage();: Llama a un método en la instancia para demostrar su uso.
Singleton singleton2 = Singleton.getInstance();: Vuelve a llamar a getInstance. Esta vez no se crea una nueva instancia, sino que se devuelve la existente.
singleton2.showMessage();: Llama al mismo método para demostrar que la instancia es la misma.
La comparación if (singleton1 == singleton2) verifica que ambas variables apuntan a la misma instancia del Singleton.
Este ejemplo demuestra el uso del patrón Singleton en Java, asegurando que solo una instancia de la clase Singleton sea creada y utilizada a través del programa.
