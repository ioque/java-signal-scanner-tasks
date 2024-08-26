package ru.ai.interviews.tasks.signal.scanner.domain.common;

import java.util.List;
import java.util.Optional;

public interface Repository<Entity, Identity> {
    void save(Entity entity);
    Optional<Entity> findById(Identity id);
    List<Entity> findAll();
    void delete(Identity id);
    void deleteAll();
}
