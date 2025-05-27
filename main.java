import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // Crear algunos libros
        Libro libro1 = new Libro("El Quijote", "Cervantes", "123", "111AAA", 1605);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "456", "222BBB", 1967);
        Libro libro3 = new Libro("Rayuela", "Cortázar", "789", "333CCC", 1963);

        // Crear la librería (sin pasar lista)
        Libreria libreria = new Libreria();

        // Agregar libros a la librería
        libreria.agregarLibro(libro1);
        libreria.agregarLibro(libro2);
        libreria.agregarLibro(libro3);

        // Probar buscaLibroporISBN
        System.out.println(libreria.buscaLibroporISBN("123"));
        System.out.println(libreria.buscaLibroporISBN("999")); // No existe

        // Probar buscarLibrosPorAnioPublicacion
        ArrayList<Libro> libros1967 = libreria.buscarLibrosPorAnioPublicacion(1967);
        System.out.println("Libros publicados en 1967:");
        for (Libro l : libros1967) {
            System.out.println(l);
        }

        // Probar eliminarLibro
        libreria.eliminarLibro("Rayuela");
        libreria.eliminarLibro("Libro Inexistente");

        // Probar autorConMasLibros
        System.out.println(libreria.autorConMasLibros());

        // Probar guardarLibroEnfichero
        libreria.guardarLibroEnfichero("autores.CSV");
    }
}