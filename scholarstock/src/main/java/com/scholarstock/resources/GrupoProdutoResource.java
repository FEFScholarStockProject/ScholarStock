package com.scholarstock.resources;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import com.scholarstock.domains.GrupoProduto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.scholarstock.domains.dtos.GrupoProdutoDTO;
import com.scholarstock.services.GrupoProdutoService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/GrupoProduto")
public class GrupoProdutoResource {

    @Autowired
    private GrupoProdutoService grupoProdutoService;

    @GetMapping  //exemplo http://localhost:8080/GrupoProduto
    public ResponseEntity<List<GrupoProdutoDTO>> findAll(){
        return ResponseEntity.ok().body(grupoProdutoService.findAll());
    }

    @GetMapping(value = "/{id}") //exemplo http://localhost:8080/technician/1
    public ResponseEntity<GrupoProdutoDTO> findById(@PathVariable int id){
        GrupoProduto obj = this.grupoProdutoService.findbyId(id);
        return ResponseEntity.ok().body(new GrupoProdutoDTO(obj));
    }

    @PostMapping
    public ResponseEntity<GrupoProdutoDTO> create(@Valid @RequestBody GrupoProdutoDTO objDto){
        GrupoProduto newObj = grupoProdutoService.create(objDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<GrupoProdutoDTO> update(@PathVariable int id, @Valid @RequestBody GrupoProdutoDTO objDto){
        GrupoProduto Obj = grupoProdutoService.update(id, objDto);
        return ResponseEntity.ok().body(new GrupoProdutoDTO(Obj));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<GrupoProdutoDTO> delete(@PathVariable int id){
        grupoProdutoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
