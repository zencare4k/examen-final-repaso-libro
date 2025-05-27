public class Ebook {
    public double tamañoArchivo;
    public String formato;

    public double getTamañoArchivo() {
        return tamañoArchivo;
    }

    public void setTamañoArchivo(double tamañoArchivo) {
        this.tamañoArchivo = tamañoArchivo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Ebook(double tamañoArchivo, String formato) {
        this.tamañoArchivo = tamañoArchivo;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Ebook [tamañoArchivo=" + tamañoArchivo + ", formato=" + formato + "]";
    }

    public boolean verificarCompatibilidadDispositivos(){
        return formato.equals("PDF") || formato.equals("EPUB");
    }
    
}
