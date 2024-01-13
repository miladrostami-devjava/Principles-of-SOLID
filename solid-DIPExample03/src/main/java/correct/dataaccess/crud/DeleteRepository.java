package correct.dataaccess.crud;

import shared.model.Entity;

public interface DeleteRepository<T extends Entity>{

    void delete(long id) throws Exception;
}
