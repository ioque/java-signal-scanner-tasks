package ru.ai.interviews.tasks.signal.scanner.domain.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import ru.ai.interviews.tasks.signal.scanner.domain.value.History;
import ru.ai.interviews.tasks.signal.scanner.domain.common.Persistence;

@Getter
@ToString(callSuper = false)
@EqualsAndHashCode(callSuper = false)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Instrument extends Persistence {
    String ticker;
    List<History> histories;

    @Builder
    public Instrument(UUID id, String ticker, List<History> histories) {
        super(id);
        setTicker(ticker);
        setHistories(histories);
    }

    private void setTicker(String ticker) {
        if (ticker == null || ticker.isEmpty()) {
            throw new IllegalArgumentException("Ticker cannot be empty");
        }
        this.ticker = ticker;
    }

    private void setHistories(List<History> histories) {
        if (histories == null) {
            this.histories = new ArrayList<>();
            return;
        }
        this.histories = histories;
    }
}
