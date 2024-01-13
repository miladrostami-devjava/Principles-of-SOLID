package wrong.service;

import shared.model.Person;
import wrong.dataaccess.PersonCRUDRepository;

import java.util.Optional;

public class PersonService {
    private final PersonCRUDRepository repository;

    public PersonService(PersonCRUDRepository repository) {
        this.repository = repository;
    }
    public Optional<Person> findById(Long id){
        return repository.read(id);
    }
}
