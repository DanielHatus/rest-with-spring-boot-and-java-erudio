package br.com.erudio.rest_with_spring_boot_and_java_erudio.Service;

import br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception.TypeExceptions.NotFoundResourcesException;
import br.com.erudio.rest_with_spring_boot_and_java_erudio.Repository.PersonRepository;
import br.com.erudio.rest_with_spring_boot_and_java_erudio.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private Logger logger=Logger.getLogger(PersonServices.class.getName());

    @Autowired
    private PersonRepository repository;

    public List<Person> findAll(){
        return repository.findAll();
    }   

    public Person findById(Long id){
   logger.info("finding one person!");
  return repository.findById(id)
          .orElseThrow(()-> new NotFoundResourcesException("No Records founds for this id! "));}

    public Person create(Person person){
        logger.info("creating one Person !");
        return repository.save(person);
    }

    public Person update(Person person){
        logger.info("updating one Person !");
        Person entity=repository.findById(person.getId())
                .orElseThrow(()->new NotFoundResourcesException("No Records founds for this id!"));
                entity.setFirstName(person.getFirstName());
                entity.setLastName(person.getLastName());
                entity.setGender(person.getGender());
                entity.setAddres(person.getAddres());
                return repository.save(entity);
    }

    public void delete(Long id){

        logger.info("Deleting one Person !");
        Person entity=repository.findById(id)
                .orElseThrow(()->new NotFoundResourcesException("No Records founds for this id!"));
                repository.delete(entity);
    }

}