package br.com.erudio.rest_with_spring_boot_and_java_erudio.Repository;

import br.com.erudio.rest_with_spring_boot_and_java_erudio.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

}
