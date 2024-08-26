package ru.ai.interviews.tasks.signal.scanner.domain.value;

import java.time.LocalDate;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class History {
    private String ticker;
    private Double value;
    private Double avgPrice;
    private LocalDate date;

    @Builder
    public History(
        String ticker,
        Double value,
        Double avgPrice,
        LocalDate date
    ) {
        setTicker(ticker);
        setValue(value);
        setAvgPrice(avgPrice);
        setDate(date);
    }

    private void setTicker(String ticker) {
        if (ticker == null || ticker.isEmpty()) {
            throw new IllegalArgumentException("Ticker cannot be empty.");
        }
        this.ticker = ticker;
    }

    private void setValue(Double value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null.");
        }
        if (value.isNaN() || value.isInfinite() || value <= 0.0) {
            throw new IllegalArgumentException("Value must be a positive number.");
        }
        this.value = value;
    }

    private void setAvgPrice(Double avgPrice) {
        if (avgPrice == null) {
            throw new IllegalArgumentException("AvgPrice cannot be null.");
        }
        if (value.isNaN() || value.isInfinite() || value <= 0.0) {
            throw new IllegalArgumentException("AvgPrice must be a positive number.");
        }
        this.avgPrice = avgPrice;
    }

    private void setDate(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null.");
        }
        this.date = date;
    }
}
