package ru.ai.interviews.tasks.signal.scanner.adapters;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import ru.ai.interviews.tasks.signal.scanner.domain.common.Persistence;
import ru.ai.interviews.tasks.signal.scanner.domain.common.Repository;

public abstract class AbstractRepository<Entity extends Persistence> implements Repository<Entity, UUID> {
    private final Map<UUID, Entity> entities = new HashMap<>();

    @Override
    public void save(Entity entity) {
        entities.put(entity.getId(), entity);
    }

    @Override
    public Optional<Entity> findById(UUID id) {
        return Optional.ofNullable(entities.get(id));
    }

    @Override
    public List<Entity> findAll() {
        return entities.values().stream().toList();
    }

    @Override
    public void delete(UUID id) {
        entities.remove(id);
    }

    @Override
    public void deleteAll() {
        entities.clear();
    }
}
