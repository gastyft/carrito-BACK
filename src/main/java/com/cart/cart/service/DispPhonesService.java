
package com.cart.cart.service;

import com.cart.cart.model.DispoPhones;
import com.cart.cart.repository.DispPhonesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DispPhonesService implements IDispPhonesService {
    @Autowired
    private DispPhonesRepository dispRepository;
    
    
@Override
 public List<DispoPhones> getDisp(){
    List<DispoPhones> listaDisp = dispRepository.findAll();
    return listaDisp;



}
    
     @Override
    public void saveDisp(DispoPhones disp){
    dispRepository.save(disp);
    
    }

    @Override
    public void deleteDisp(Long id){
    dispRepository.deleteById(id);
    
    }
    
    @Override
    public DispoPhones findDisp(Long id_dispo){
       DispoPhones disp = dispRepository.findById(id_dispo).orElse(null);
    return disp;
    
    } 
}

