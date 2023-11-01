
package com.example.tareaBiblioteca.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Indicar que es una entidad
@Table(name="registros")
public class Biblioteca{
    @Id
    private int isbn;
    @Column( length=30)
   private String sNombreLibro;
    private String sAutorL;
    private int iNumPag;
    private String sEditorial;
    private String sIdioma;

    public Biblioteca() {
    }

    public Biblioteca(int isbn, String sNombreLibro, String sAutorL, int iNumPag, String sEditorial, String sIdioma) {
        this.isbn = isbn;
        this.sNombreLibro = sNombreLibro;
        this.sAutorL = sAutorL;
        this.iNumPag = iNumPag;
        this.sEditorial = sEditorial;
        this.sIdioma = sIdioma;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getsNombreLibro() {
        return sNombreLibro;
    }

    public void setsNombreLibro(String sNombreLibro) {
        this.sNombreLibro = sNombreLibro;
    }

    public String getsAutorL() {
        return sAutorL;
    }

    public void setsAutorL(String sAutorL) {
        this.sAutorL = sAutorL;
    }

    public int getiNumPag() {
        return iNumPag;
    }

    public void setiNumPag(int iNumPag) {
        this.iNumPag = iNumPag;
    }

    public String getsEditorial() {
        return sEditorial;
    }

    public void setsEditorial(String sEditorial) {
        this.sEditorial = sEditorial;
    }

    public String getsIdioma() {
        return sIdioma;
    }

    public void setsIdioma(String sIdioma) {
        this.sIdioma = sIdioma;
    }
    
    
}
