package panels;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author felip
 */
public class Cancion {
    
    private int id_cancion;
    private String titulo;
    private String autor;
    private String disco;
    private int anio;
    private int duracion_minuto;
    private int duracion_segundo;
    private String estilo;
    
    @Override
    public String toString() {
        return "Cancion" + "\n ID: " + id_cancion + "\n Titulo: " + titulo + "\n Autor: " + autor + "\n Disco: " + disco + "\n Año: " + anio 
               + "\n Duracion: " + duracion_minuto + ":" + duracion_segundo + "\n Estilo: " + estilo +  "\n ---------------";
    }

    public int getId_cancion() {
        return id_cancion;
    }

    public void setId_cancion(int id_cancion) {
        this.id_cancion = id_cancion;
    }

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

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion_minuto() {
        return duracion_minuto;
    }

    public void setDuracion_minuto(int duracion_minuto) {
        this.duracion_minuto = duracion_minuto;
    }

    public int getDuracion_segundo() {
        return duracion_segundo;
    }

    public void setDuracion_segundo(int duracion_segundo) {
        this.duracion_segundo = duracion_segundo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public Cancion(int id_cancion, String titulo, String autor, String disco, int anio, int duracion_minuto, int duracion_segundo, String estilo) {
        this.id_cancion = id_cancion;
        this.titulo = titulo;
        this.autor = autor;
        this.disco = disco;
        this.anio = anio;
        this.duracion_minuto = duracion_minuto;
        this.duracion_segundo = duracion_segundo;
        this.estilo = estilo;
    }

    public Cancion() {
    }
}
