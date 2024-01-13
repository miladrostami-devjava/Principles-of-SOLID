package correct.dataaccess.crud;

import shared.model.Entity;

public interface UpdateRepository<T extends Entity>{
    void update(T data) throws Exception;
}
