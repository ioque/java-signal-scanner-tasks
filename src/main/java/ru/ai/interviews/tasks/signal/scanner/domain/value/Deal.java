package ru.ai.interviews.tasks.signal.scanner.domain.value;

import java.time.LocalDateTime;

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
public class Deal {
    private String ticker;
    private Double price;
    private Double value;
    private LocalDateTime dateTime;

    @Builder
    public Deal(
        String ticker,
        Double price,
        Double value,
        LocalDateTime dateTime
    ) {
        setTicker(ticker);
        setPrice(price);
        setValue(value);
        setDateTime(dateTime);
    }

    private void setTicker(String ticker) {
        if (ticker == null) {
            throw new IllegalArgumentException("Ticker cannot be null");
        }
        this.ticker = ticker;
    }

    private void setPrice(Double price) {
        if(price == null) {
            throw new IllegalArgumentException("Price cannot be null");
        }
        if (price.isNaN() || price.isInfinite() || price <= 0.0) {
            throw new IllegalArgumentException("Price must be a positive number");
        }
        this.price = price;
    }

    private void setValue(Double value) {
        if(value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }
        if (value.isNaN() || value.isInfinite() || value <= 0.0) {
            throw new IllegalArgumentException("Value must be a positive number");
        }
        this.value = value;
    }

    private void setDateTime(LocalDateTime dateTime) {
        if(dateTime == null) {
            throw new IllegalArgumentException("DateTime cannot be null");
        }
        this.dateTime = dateTime;
    }
}
