package ru.ai.interviews.tasks.signal.scanner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import ru.ai.interviews.tasks.signal.scanner.domain.entity.Instrument;
import ru.ai.interviews.tasks.signal.scanner.domain.entity.Signal;
import ru.ai.interviews.tasks.signal.scanner.domain.value.Deal;
import ru.ai.interviews.tasks.signal.scanner.domain.value.History;

public class DataFixture {

    public static final Instrument TGKN = Instrument.builder()
        .id(UUID.randomUUID())
        .ticker("TGKN")
        .histories(List.of(
            History.builder()
                .ticker("TGKN")
                .avgPrice(12D)
                .value(1_000_000D)
                .date(LocalDate.parse("2024-08-19"))
                .build(),
            History.builder()
                .ticker("TGKN")
                .avgPrice(14D)
                .value(1_400_000D)
                .date(LocalDate.parse("2024-08-20"))
                .build(),
            History.builder()
                .ticker("TGKN")
                .avgPrice(13D)
                .value(1_200_000D)
                .date(LocalDate.parse("2024-08-21"))
                .build(),
            History.builder()
                .ticker("TGKN")
                .avgPrice(12D)
                .value(1_500_000D)
                .date(LocalDate.parse("2024-08-22"))
                .build(),
            History.builder()
                .ticker("TGKN")
                .avgPrice(11D)
                .value(1_900_000D)
                .date(LocalDate.parse("2024-08-23"))
                .build()
        ))
        .build();

    public static final Instrument SBER = Instrument.builder()
        .id(UUID.randomUUID())
        .ticker("SBER")
        .histories(List.of(
            History.builder()
                .ticker("SBER")
                .avgPrice(242D)
                .value(1_000_000D)
                .date(LocalDate.parse("2024-08-19"))
                .build(),
            History.builder()
                .ticker("SBER")
                .avgPrice(244D)
                .value(1_000_000D)
                .date(LocalDate.parse("2024-08-20"))
                .build(),
            History.builder()
                .ticker("SBER")
                .avgPrice(245D)
                .value(1_000_000D)
                .date(LocalDate.parse("2024-08-21"))
                .build(),
            History.builder()
                .ticker("SBER")
                .avgPrice(243D)
                .value(1_000_000D)
                .date(LocalDate.parse("2024-08-22"))
                .build(),
            History.builder()
                .ticker("SBER")
                .avgPrice(244D)
                .value(1_000_000D)
                .date(LocalDate.parse("2024-08-23"))
                .build()
        ))
        .build();

    public static final Instrument SBERP = Instrument.builder()
        .id(UUID.randomUUID())
        .ticker("SBERP")
        .histories(List.of(
            History.builder()
                .ticker("SBERP")
                .avgPrice(239D)
                .value(1_000_000D)
                .date(LocalDate.parse("2024-08-19"))
                .build(),
            History.builder()
                .ticker("SBERP")
                .avgPrice(241D)
                .value(1_000_000D)
                .date(LocalDate.parse("2024-08-20"))
                .build(),
            History.builder()
                .ticker("SBERP")
                .avgPrice(243D)
                .value(1_000_000D)
                .date(LocalDate.parse("2024-08-21"))
                .build(),
            History.builder()
                .ticker("SBERP")
                .avgPrice(240D)
                .value(1_000_000D)
                .date(LocalDate.parse("2024-08-22"))
                .build(),
            History.builder()
                .ticker("SBERP")
                .avgPrice(243D)
                .value(1_000_000D)
                .date(LocalDate.parse("2024-08-23"))
                .build()
        ))
        .build();

    public static final Instrument TGKB = Instrument.builder()
        .id(UUID.randomUUID())
        .ticker("TGKB")
        .histories(List.of())
        .build();

    public static final List<Deal> DEALS_FOR_TEST_CASE_1 = List.of(
        Deal.builder()
            .ticker("TGKN")
            .price(12D)
            .value(10_000D)
            .dateTime(LocalDateTime.parse("2024-08-26T10:00:00"))
            .build(),
        Deal.builder()
            .ticker("TGKN")
            .price(11D)
            .value(100_000D)
            .dateTime(LocalDateTime.parse("2024-08-26T10:30:00"))
            .build(),
        Deal.builder()
            .ticker("TGKN")
            .price(13D)
            .value(210_000D)
            .dateTime(LocalDateTime.parse("2024-08-26T10:45:00"))
            .build(),
        Deal.builder()
            .ticker("TGKN")
            .price(15D)
            .value(1_410_000D)
            .dateTime(LocalDateTime.parse("2024-08-26T10:55:00"))
            .build(),
        Deal.builder()
            .ticker("TGKN")
            .price(16D)
            .value(1_610_000D)
            .dateTime(LocalDateTime.parse("2024-08-26T11:01:00"))
            .build()
    );

    public static final List<Deal> DEALS_FOR_TEST_CASE_2 = List.of(
        Deal.builder()
            .ticker("SBER")
            .price(242D)
            .value(10_000D)
            .dateTime(LocalDateTime.parse("2024-08-26T10:00:00"))
            .build(),
        Deal.builder()
            .ticker("SBERP")
            .price(240D)
            .value(10_000D)
            .dateTime(LocalDateTime.parse("2024-08-26T10:30:00"))
            .build(),
        Deal.builder()
            .ticker("SBERP")
            .price(241D)
            .value(10_000D)
            .dateTime(LocalDateTime.parse("2024-08-26T10:45:00"))
            .build(),
        Deal.builder()
            .ticker("SBER")
            .price(243D)
            .value(10_000D)
            .dateTime(LocalDateTime.parse("2024-08-26T10:50:00"))
            .build(),
        Deal.builder()
            .ticker("SBER")
            .price(245D)
            .value(10_000D)
            .dateTime(LocalDateTime.parse("2024-08-26T11:00:00"))
            .build()
    );

    public static final List<Deal> DEALS_FOR_TEST_CASE_3 = List.of(
        Deal.builder()
            .ticker("TGKB")
            .price(10D)
            .value(10_000D)
            .dateTime(LocalDateTime.parse("2024-08-26T11:00:00"))
            .build()
    );

    public static final List<Signal> EXPECTED_SIGNALS_FOR_TEST_CASE_1 = List.of(
        Signal.builder()
            .id(UUID.randomUUID())
            .ticker("TGKN")
            .openPrice(16D)
            .openDateTime(LocalDateTime.parse("2024-08-26T11:01:00"))
            .build()
    );

    public static final List<Signal> EXPECTED_SIGNALS_FOR_TEST_CASE_2 = List.of(
        Signal.builder()
            .id(UUID.randomUUID())
            .ticker("SBERP")
            .openPrice(241D)
            .openDateTime(LocalDateTime.parse("2024-08-26T11:00:00"))
            .build()
    );
}
