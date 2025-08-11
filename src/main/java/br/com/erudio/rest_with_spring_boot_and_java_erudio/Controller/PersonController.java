package br.com.erudio.rest_with_spring_boot_and_java_erudio.Controller;

import br.com.erudio.rest_with_spring_boot_and_java_erudio.Dto.PersonDto;
import br.com.erudio.rest_with_spring_boot_and_java_erudio.Model.Person;
import br.com.erudio.rest_with_spring_boot_and_java_erudio.Service.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonServices personServices;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PersonDto> findAll(){return personServices.findAll();}

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonDto findById(@PathVariable Long id){return personServices.findById(id);}

    @PutMapping(value = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonDto update(@PathVariable("id") Long id,@RequestBody Person person){return personServices.update(id,person);}

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonDto> create(@RequestBody Person person){
        PersonDto entity=personServices.create(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(entity);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        personServices.delete(id);
       return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
