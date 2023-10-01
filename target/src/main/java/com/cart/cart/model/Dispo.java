
package com.cart.cart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;




//DISPOSITIVO PARA NOTEBOOKS 
// EN FRONT PROBAR SUBIR NOMBRE DESCRIPCION Y FOTO CON CLOUDINARY, Y VER SI 
//SE GUARDA EL URL DE LA FOTO EN EL URL DEL DISPOSITIVO 

@Entity

@Getter @Setter

public class Dispo {
        @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
     private Long id;

    private String nombre;
    private String descrip;
    private int precio;
    
 
    private String url;
    
    
}
