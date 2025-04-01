package br.com.bpkedu.library_spring_webmvc.controller.api;

import br.com.bpkedu.library_spring_webmvc.domain.Usuario;
import br.com.bpkedu.library_spring_webmvc.dto.UserDTD;
import br.com.bpkedu.library_spring_webmvc.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioRestController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/getAll")
    public List<Usuario> getUsuarios(){
        return usuarioService.listarTodos();
    }

    @PostMapping()
    public ResponseEntity<Usuario> novoUsuario(@RequestBody UserDTD userDTD){
        Usuario user = userDTD.toUser(userDTD);
        Usuario saved = usuarioService.salvar(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
