package es.joseljg.creararticulo.clases;

import java.io.Serializable;

public class Articulo implements Serializable {
    private String titulo;
    private String resumen;
    private String texto;
    //-----------------------------

    public Articulo(String titulo, String resumen, String texto) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.texto = texto;
    }
    //----------------------------

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    //---------------------------------------

    @Override
    public String toString() {
        return "Articulo{" +
                "titulo='" + titulo + '\'' +
                ", resumen='" + resumen + '\'' +
                ", texto='" + texto + '\'' +
                '}';
    }
    //--------------------------------------

}
