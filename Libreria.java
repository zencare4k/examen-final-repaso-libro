import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Libreria  {
    
    private ArrayList<Libro> librosDisponibles;

    public Libreria( ) {
        // Crear una copia para evitar modificar la lista original
        this.librosDisponibles = new ArrayList<>( );
        // Añadir libro de ejemplo
        this.librosDisponibles.add(new Libro("a", "a", "1", "23343445GWWS", 2026));
    }

    public String buscaLibroporISBN(String isbn){
        for (Libro libro : librosDisponibles) {
            if (libro.getIsbn().equals(isbn)) {
                return libro.toString();
            }  
        }
        return "No existe dicho libro";
    }

    public ArrayList<Libro> buscarLibrosPorAnioPublicacion(int anioPublicacion){
        ArrayList<Libro> resultado = new ArrayList<>();
        for (Libro libro : librosDisponibles) {
            if (libro.getAnioPublicacion() == anioPublicacion) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    public void agregarLibro(Libro libro){
        if (librosDisponibles.contains(libro)) {
            System.out.println("Este libro ya existe");
        } else {
            librosDisponibles.add(libro);
            System.out.println("El libro " + libro.titulo + " se ha agregado exitosamente.");
        }
    }

    public void eliminarLibro(String titulo){
        boolean encontrado = false;
        Iterator<Libro> it = librosDisponibles.iterator();
        while (it.hasNext()) {
            Libro libro = it.next();
            if (libro.getTitulo().equals(titulo)) {
                it.remove();
                System.out.println("El libro " + titulo + " fue eliminado con exito");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El titulo no se puede eliminar porque no existe.");
        }
    }

    public String autorConMasLibros(){
        if (librosDisponibles.isEmpty()) {
            return "No hay libros en la colección";
        }

        HashMap<String, Integer> contadorAutores = new HashMap<>();

        for (Libro libro : librosDisponibles) {
            String autor = libro.getAutor();
            contadorAutores.put(autor, contadorAutores.getOrDefault(autor, 0) + 1);
        }

        String autorMax = null;
        int maxCantidad = 0;

        for (Map.Entry<String, Integer> entry : contadorAutores.entrySet()) {
            if (entry.getValue() > maxCantidad) {
                autorMax = entry.getKey();
                maxCantidad = entry.getValue();
            }
        }

        return "El autor con más libros es: " + autorMax + " (" + maxCantidad + " libros)";
    }

    public void guardarLibroEnfichero(String nombreFichero){
        String cabecera = "Título; Autor ; Año Publicacion\n";
        try (BufferedWriter BW = new BufferedWriter(new FileWriter(nombreFichero))) {
            BW.write(cabecera);
            for (Libro libro : librosDisponibles) {
                BW.write(libro.toString() + "\n");
            }
            System.out.println("Libros guardados correctamente en " + nombreFichero);
        } catch (Exception e) {
            System.out.println("Error al guardar el fichero: " + e.getMessage());
        }
    }
}