
package com.cart.cart.service;


import com.cart.cart.model.DispoPhones;
import java.util.List;


public interface IDispPhonesService {
      public List <DispoPhones>  getDisp();

    public void saveDisp (DispoPhones disp);
    
    public void deleteDisp (Long id);
    
    public DispoPhones findDisp (Long id);
}
