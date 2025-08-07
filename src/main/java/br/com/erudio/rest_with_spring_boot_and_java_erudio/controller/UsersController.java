package br.com.erudio.rest_with_spring_boot_and_java_erudio.controller;

import br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception.InvalidDataException;
import br.com.erudio.rest_with_spring_boot_and_java_erudio.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UsersController {
    @GetMapping("/{name}/{age}/{city}/{country}")

    public User jsonRegistration(
            @PathVariable String name,
            @PathVariable String age,
            @PathVariable String city,
            @PathVariable String country)
    {
        if(isNum(age)==false){
        throw new InvalidDataException("error! please enter valid data.");
        }
        else{
            int newAge=convertStringInInt(age);
            return new User(name,city,newAge,country);
        }

    }


    public Boolean isNum(String age){
        try {
            int num=Integer.parseInt(age);
            return true;
        }catch (Exception exception){
            return false;
        }
    }

    public int convertStringInInt(String age){
      return Integer.parseInt(age);
    }
}
