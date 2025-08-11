package br.com.erudio.rest_with_spring_boot_and_java_erudio.Dto;

import java.util.Objects;

public class PersonDto {
        private Long id;

        private String name;

        private String email;

        private String dateOfBirth;

        private String gender;

        private String addres;

        private int age;




        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public String getGender() {
            return gender;
        }

        public Long getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        public String getAddres() {
            return addres;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setAddres(String addres) {
            this.addres = addres;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public void setId(Long id){
            this.id=id;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof br.com.erudio.rest_with_spring_boot_and_java_erudio.Model.Person person)) return false;
            return getId() == person.getId() && getAge() == person.getAge() && Objects.equals(getName(), person.getName()) && Objects.equals(getEmail(), person.getEmail()) && Objects.equals(getDateOfBirth(), person.getDateOfBirth()) && Objects.equals(getGender(), person.getGender()) && Objects.equals(getAddres(), person.getAddres());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getEmail(), getDateOfBirth(), getGender(), getAddres(), getId(), getAge());
        }
}
