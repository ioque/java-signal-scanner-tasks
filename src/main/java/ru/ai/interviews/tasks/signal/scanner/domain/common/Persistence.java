package ru.ai.interviews.tasks.signal.scanner.domain.common;

import java.io.Serializable;
import java.util.UUID;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public class Persistence implements Serializable {
    private UUID id;

    public Persistence(UUID id) {
        setId(id);
    }

    private void setId(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("id is null");
        }
        this.id = id;
    }
}
