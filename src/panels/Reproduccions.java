/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panels;

/**
 *
 * @author felip
 */
public class Reproduccions {
    
    private int id_cancion;
    private int id_reproduccion;
    private String nombre;
    private String fecha;
    private String escuela;

    public int getId_cancion() {
        return id_cancion;
    }

    public void setId_cancion(int id_cancion) {
        this.id_cancion = id_cancion;
    }

    public int getId_reproduccion() {
        return id_reproduccion;
    }

    public void setId_reproduccion(int id_reproduccion) {
        this.id_reproduccion = id_reproduccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public Reproduccions(int id_cancion, int id_reproduccion, String nombre, String fecha, String escuela) {
        this.id_cancion = id_cancion;
        this.id_reproduccion = id_reproduccion;
        this.nombre = nombre;
        this.fecha = fecha;
        this.escuela = escuela;
    }

    public Reproduccions() {
    }

    

    
}
