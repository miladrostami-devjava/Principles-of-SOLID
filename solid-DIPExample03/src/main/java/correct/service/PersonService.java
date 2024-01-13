package correct.service;

import correct.dataaccess.CRUDRepository;
import correct.dataaccess.PersonCRUDRepository;
import shared.model.Person;

import java.util.Optional;

public class PersonService {
    private final CRUDRepository<Person> repository;

    public PersonService(CRUDRepository<Person> repository) {
        this.repository = repository;
    }
    public Optional<Person> findById(Long id){
        return repository.read(id);
    }
}
