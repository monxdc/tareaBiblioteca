
package com.example.tareaBiblioteca.Controlador;
import com.example.tareaBiblioteca.Entidades.Biblioteca;
import com.example.tareaBiblioteca.Servicios.servBiblioteca;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Indicar que es un controlador
@RestController
@RequestMapping("/registrosBiblioteca")
public class ControladorBiblioteca {
    @Autowired
    servBiblioteca sControlB;
    //OBTENER DATOS
    @GetMapping("")
    public List<Biblioteca> getRegistrosB(){
        return sControlB.mtObtenerRegistros();
    }
    //INSERTAR
    @PostMapping("")
    public List<Biblioteca>postInsertarRegistro(@RequestBody Biblioteca libro){
        if(sControlB.mtInsertarRegistros(libro)){
            return sControlB.mtObtenerRegistros();  
        }else{
        return null; 
        }      
    }
    //Actualizar
    @PutMapping("")
     public List<Biblioteca>putActualizarRegistro(@RequestBody Biblioteca libro){
        if(sControlB.mtActualizarRegistros(libro)){
            return sControlB.mtObtenerRegistros();  
        }else{
        return null; 
        }      
    }
    
     //Eliminar
      @DeleteMapping("")
    public List<Biblioteca> eliminarRegistro(@RequestBody Biblioteca libro) {
        if (sControlB.mtEliminarRegistro(libro)) {
            return sControlB.mtObtenerRegistros();
        } else {
            return null;
        }
    }
     
    
    
    
    
    
    
}
