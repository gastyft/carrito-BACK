
package com.cart.cart.security.service;

import com.cart.cart.security.entity.Usuario;
import com.cart.cart.security.repository.UsuarioRepository;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    public Optional<Usuario> getByNombreUsuario(String nmbreUsuario){
        return usuarioRepository.findByNombreUsuario(nmbreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existsByEmail(String email){
        return usuarioRepository.existsByEmail(email);
        
    }
    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }
    
}
