
package com.cart.cart.repository;

import com.cart.cart.model.DispoPhones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispPhonesRepository extends JpaRepository<DispoPhones, Long>{
    
}
