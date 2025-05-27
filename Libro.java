public class Libro{
    public String titulo;
    public String autor;
    public String Isbn;
    public String codigoBarras;
    public int anioPublicacion;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getIsbn() {
        return Isbn;
    }
    public void setIsbn(String isbn) {
        Isbn = isbn;
    }
    public String getCodigoBarras() {
        return codigoBarras;
    }
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    public Libro(String titulo, String autor, String isbn, String codigoBarras, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        Isbn = isbn;
        this.codigoBarras = codigoBarras;
        this.anioPublicacion = anioPublicacion;
    }
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor  + ", anioPublicacion=" + anioPublicacion + "]";
    }


}