package service;

import entity.Person;
import entity.PersonDto;
import org.springframework.stereotype.Service;
import repository.PersonRepository;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public Person createPerson (PersonDto personDto) {
        Person person = new Person();
        person.setFirstName(personDto.getFirstName());
        person.setMiddleName(personDto.getMiddleName());
        person.setLastName(personDto.getLastName());
        person.setPersonalNumber(personDto.getPersonalNumber());
        person.setAuthority(personDto.getAuthority());
        person.setEyesColor(personDto.getEyesColor());
        person.setExpiryDate(personDto.getExpiryDate());
        person.setDocumentNumber(person.getDocumentNumber());
        person.setAddress(personDto.getAddress());
        person.setBirthplace(personDto.getBirthplace());
        person.setNationality(personDto.getNationality());
        person.setHeight(personDto.getHeight());
        person.setIssueDate(personDto.getIssueDate());

        return personRepository.save(person);
    }
    Optional<Person> findPersonByPersonalNumber (Long personalNumber) {
        return personRepository.findPersonByPersonalNumber (personalNumber);
    }



}
