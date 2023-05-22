package escalafon.com.prueba.security;

import escalafon.com.prueba.modelsPersona.roles;
import escalafon.com.prueba.modelsPersona.usuarios;
import escalafon.com.prueba.repositoriesPersona.IUsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private IUsuariosRepository userrepo;

    @Autowired
    public CustomUserDetailsService(IUsuariosRepository userrepo) {
        this.userrepo = userrepo;
    }

    public Collection<GrantedAuthority> mapToAuthorities(List<roles> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        usuarios user = userrepo.findByEmail(username).orElseThrow(()-> new UsernameNotFoundException("Usuario no encontrado"+ username));
        return new User(user.getEmail(), user.getPassword(), mapToAuthorities(user.getRol()));
    }
}
