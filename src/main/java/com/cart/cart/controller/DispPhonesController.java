
package com.cart.cart.controller;

import com.cart.cart.model.DispoPhones;
import com.cart.cart.service.IDispPhonesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


public class DispPhonesController {
    
@RestController
@RequestMapping("dispoPhones")
@CrossOrigin(origins="https://localhost:8080/")
public class DispController {
    
    @Autowired
  private IDispPhonesService interDisp; 
    @GetMapping("/getdispolist")
      public List <DispoPhones> getDisp(){
return interDisp.getDisp();
}
    
    
    @PostMapping("/crear")
    public String createDisp(@RequestBody DispoPhones disp){
    interDisp.saveDisp(disp);
    return "La persona fue guardada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteDisp(@PathVariable Long id){
    
    interDisp.deleteDisp(id);
    return "El dispositivo fue eliminado correctamente";
            }
    

    @PutMapping("/editar/{id}") //puede ser con el ID "/personas/editar/{id}"
    public DispoPhones editDisp (@PathVariable Long id,
            @RequestParam ("nombre") String nuevoNombre,
            @RequestParam("decrip") String nuevaDescrip,
            @RequestParam("precio") int nuevoPrecio,
            @RequestParam("url") String nuevaUrl) {
    DispoPhones disp= interDisp.findDisp(id);
    
    
    disp.setNombre(nuevoNombre);
    disp.setDescrip(nuevaDescrip);
    disp.setPrecio(nuevoPrecio);
    disp.setUrl(nuevaUrl);
    interDisp.saveDisp(disp);
    
    return disp;
    
}
      @GetMapping("/traer/{id}")
 
  public DispoPhones findDisp(@PathVariable Long id){ 
        return interDisp.findDisp(id);
           
    }
    
}
}
