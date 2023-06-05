
package com.cart.cart.security.service;

import com.cart.cart.security.entity.Usuario;
import com.cart.cart.security.entity.UsuarioPrincipal;
import com.cart.cart.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service

public class UserDetailsServiceImpl implements UserDetailsService {
     
    
    @Autowired
    UsuarioRepository usuarioRepository;
    
    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
     Usuario usuario = usuarioRepository.findByNombreUsuario(nombreUsuario).get();
     return UsuarioPrincipal.build(usuario);
    }
}
