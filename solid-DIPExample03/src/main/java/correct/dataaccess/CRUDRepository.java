package correct.dataaccess;

import correct.dataaccess.crud.CreateRepository;
import correct.dataaccess.crud.DeleteRepository;
import correct.dataaccess.crud.ReadRepository;
import correct.dataaccess.crud.UpdateRepository;
import shared.model.Entity;
import shared.model.User;

import java.util.List;
import java.util.Optional;

public abstract class CRUDRepository <T extends Entity> implements
        CreateRepository<T>,
        ReadRepository<T>,
        UpdateRepository<T>,
        DeleteRepository<T> {


    @Override
    public void create(T data) {

    }

    public abstract void create(User user);

    public abstract void update(User user) throws Exception;

    @Override
    public void delete(long id) throws Exception {

    }

    @Override
    public List<T> readAll() {
        return null;
    }

    @Override
    public Optional<T> read(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> read(long id) {
        return Optional.empty();
    }

    @Override
    public void update(T data) throws Exception {

    }
}
