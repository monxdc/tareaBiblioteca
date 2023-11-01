
package com.example.tareaBiblioteca.Servicios;

import com.example.tareaBiblioteca.Entidades.Biblioteca;
import com.example.tareaBiblioteca.Repositorios.repBiblioteca;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//Indicar que es un servicio
@Service
public class servBiblioteca {
    //Investigar
    @Autowired
    repBiblioteca rpBiblioteca;
    //Lista de mi entidad  que contiene todos los registros.
    public List<Biblioteca> mtObtenerRegistros(){
        return rpBiblioteca.findAll();
    }
    //insertar 
    public boolean mtInsertarRegistros(Biblioteca libro){
    boolean resp = false;
    try{
        rpBiblioteca.save((libro));
    }catch (Exception e){
        resp=false;
    }
       return resp; }
    //Actualizar
public boolean mtActualizarRegistros(Biblioteca libro){
boolean resp=false;
try{
rpBiblioteca.save((libro));
}catch (Exception e){
    resp=false;
}
return resp;
}
//Eliminar
 public boolean mtEliminarRegistro(Biblioteca libro) {
        boolean resp = false;
        try {
            rpBiblioteca.delete(libro); //insert o update a nivel BD
        } catch (Exception ex) {
            resp = false;
        }
        return resp;
    }


    
}



