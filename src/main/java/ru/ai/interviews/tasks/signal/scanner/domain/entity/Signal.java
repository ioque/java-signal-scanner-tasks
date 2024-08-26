package ru.ai.interviews.tasks.signal.scanner.domain.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import ru.ai.interviews.tasks.signal.scanner.domain.common.Persistence;

@Getter
@ToString(callSuper = false)
@EqualsAndHashCode(callSuper = false)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Signal extends Persistence {
    private String ticker;
    private Double openPrice;
    private LocalDateTime openDateTime;

    @Builder
    public Signal(UUID id, String ticker, Double openPrice, LocalDateTime openDateTime) {
        super(id);
        setTicker(ticker);
        setOpenPrice(openPrice);
        setOpenDateTime(openDateTime);
    }

    private void setTicker(String ticker) {
        if (ticker == null || ticker.isEmpty()) {
            throw new IllegalArgumentException("Ticker cannot be empty");
        }
        this.ticker = ticker;
    }

    private void setOpenPrice(Double openPrice) {
        if (openPrice == null) {
            throw new IllegalArgumentException("OpenPrice cannot be null");
        }
        if (openPrice.isNaN() || openPrice.isInfinite() || openPrice <= 0.0) {
            throw new IllegalArgumentException("OpenPrice must be a positive number");
        }
        this.openPrice = openPrice;
    }

    private void setOpenDateTime(LocalDateTime openDateTime) {
        if (openDateTime == null) {
            throw new IllegalArgumentException("OpenDateTime cannot be null");
        }
        this.openDateTime = openDateTime;
    }
}
