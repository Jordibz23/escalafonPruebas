package escalafon.com.prueba.controllers;

import escalafon.com.prueba.dtos.DtoAuthRespuesta;
import escalafon.com.prueba.dtos.DtoLogin;
import escalafon.com.prueba.dtos.DtoRegistro;
import escalafon.com.prueba.modelsPersona.roles;
import escalafon.com.prueba.modelsPersona.usuarios;
import escalafon.com.prueba.repositoriesPersona.IRolesRepository;
import escalafon.com.prueba.repositoriesPersona.IUsuariosRepository;
import escalafon.com.prueba.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
//@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("/api/auth/")
public class AuthRestController {
    private AuthenticationManager authenticationManager;
    private PasswordEncoder passwordEncoder;
    private IRolesRepository rolesRepository;
    private IUsuariosRepository usuariosRepository;
    private JwtTokenProvider tokenProvider;

    @Autowired
    public AuthRestController(AuthenticationManager authenticationManager, PasswordEncoder passwordEncoder, IRolesRepository rolesRepository, IUsuariosRepository usuariosRepository, JwtTokenProvider tokenProvider) {
        this.authenticationManager = authenticationManager;
        this.passwordEncoder = passwordEncoder;
        this.rolesRepository = rolesRepository;
        this.usuariosRepository = usuariosRepository;
        this.tokenProvider = tokenProvider;
    }

    @PostMapping("registro")
    public ResponseEntity<String> registrar(@RequestBody DtoRegistro dtoRegistro){
        if (usuariosRepository.existsByEmail(dtoRegistro.getEmail())){
            return new ResponseEntity<>("El usuario ya existe", HttpStatus.BAD_REQUEST);
        }
        usuarios user = new usuarios();
        user.setName(dtoRegistro.getUsername());
        user.setPassword(passwordEncoder.encode(dtoRegistro.getPassword()));
        user.setLast_name(dtoRegistro.getLast_name());
        user.setEmail(dtoRegistro.getEmail());
        roles rol = rolesRepository.findByName("USER").get();
        user.setRol(Collections.singletonList(rol));
        usuariosRepository.save(user);
        return new ResponseEntity<>("Registro exitoso",HttpStatus.OK);
    }

    @PostMapping("registroAdm")
    public ResponseEntity<String> registrarAdmin(@RequestBody DtoRegistro dtoRegistro){
        if (usuariosRepository.existsByEmail(dtoRegistro.getEmail())){
            return new ResponseEntity<>("El usuario ya existe", HttpStatus.BAD_REQUEST);
        }
        usuarios user = new usuarios();
        user.setName(dtoRegistro.getUsername());
        user.setPassword(passwordEncoder.encode(dtoRegistro.getPassword()));
        user.setLast_name(dtoRegistro.getLast_name());
        user.setEmail(dtoRegistro.getEmail());
        roles rol = rolesRepository.findByName("ADMIN").get();
        user.setRol(Collections.singletonList(rol));
        usuariosRepository.save(user);
        return new ResponseEntity<>("Registro de admin exitoso",HttpStatus.OK);
    }

    @PostMapping("login")
    public ResponseEntity<DtoAuthRespuesta> login(@RequestBody DtoLogin dtoLogin){
        try {
            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    dtoLogin.getUsername(),dtoLogin.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
            String token = tokenProvider.generarToken(authentication);
            return new ResponseEntity<>(new DtoAuthRespuesta(token),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.UNAUTHORIZED);
        }

    }

}
