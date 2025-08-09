package br.com.erudio.rest_with_spring_boot_and_java_erudio.controller;

import br.com.erudio.rest_with_spring_boot_and_java_erudio.Service.PersonServices;
import br.com.erudio.rest_with_spring_boot_and_java_erudio.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private  PersonServices service;


@RequestMapping(method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
public List<Person> findAll(){
        return service.findAll();
    }

    @RequestMapping(value ="/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable("id") long id){return service.findById(id);}

    @RequestMapping(method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,consumes =MediaType.APPLICATION_JSON_VALUE )
    public Person create(@RequestBody Person person){
        return service.create(person);
    }

    @RequestMapping(method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
    public Person update( @RequestBody Person person){return service.update(person);}

    @RequestMapping(value ="{id}",method=RequestMethod.DELETE)
    public void delete(@PathVariable("id")  long id){service.delete(id);}

}