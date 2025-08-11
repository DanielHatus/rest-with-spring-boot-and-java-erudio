package br.com.erudio.rest_with_spring_boot_and_java_erudio.Service;

import br.com.erudio.rest_with_spring_boot_and_java_erudio.Dto.PersonDto;
import br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception.TypeResponseException.NotFoundResourceException;
import br.com.erudio.rest_with_spring_boot_and_java_erudio.Model.Person;
import br.com.erudio.rest_with_spring_boot_and_java_erudio.Repository.PersonRepository;
import static br.com.erudio.rest_with_spring_boot_and_java_erudio.mapper.ObjectMapper.parseObject;
import static br.com.erudio.rest_with_spring_boot_and_java_erudio.mapper.ObjectMapper.parseListObjects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServices {
    @Autowired
    private PersonRepository repository;

    public List<PersonDto> findAll(){
        return parseListObjects(repository.findAll(),PersonDto.class);
    }

    public PersonDto findById(Long id){
        var entity= repository.findById(id)
                .orElseThrow(()->new NotFoundResourceException("No Records founds for this id!"));
        return parseObject(entity, PersonDto.class);
    }

    public PersonDto create(Person person){
      return parseObject(repository.save(person), PersonDto.class);
    }

    public PersonDto update(Long id, Person person){
        Person entity=repository.findById(id)
                .orElseThrow(()->new NotFoundResourceException("No Records founds for this id!"));
                entity.setName(person.getName());
                entity.setAddres(person.getAddres());
                entity.setAge(person.getAge());
                entity.setEmail(person.getEmail());
                entity.setDateOfBirth(person.getDateOfBirth());
               return parseObject(repository.save(entity),PersonDto.class);

    }

    public void delete(Long id){
        Person entity=repository.findById(id)
                .orElseThrow(()->new NotFoundResourceException("No Records founds for this id!"));
        repository.delete(entity);

    }
}
