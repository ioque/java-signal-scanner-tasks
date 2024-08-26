package ru.ai.interviews.tasks.signal.scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static ru.ai.interviews.tasks.signal.scanner.DataFixture.*;

public class SignalScannerServiceTests {
    private final FakeDiContainer diContainer = new FakeDiContainer();

    @BeforeEach
    void setUp() {
        diContainer.getInstrumentRepository().save(TGKN);
        diContainer.getInstrumentRepository().save(TGKB);
        diContainer.getInstrumentRepository().save(SBER);
        diContainer.getInstrumentRepository().save(SBERP);
    }

    @Test
    @DisplayName("""
        В массиве данных есть сигнал по алгоритму аномальных объемов.
        """)
    void testCase1() {
        diContainer.getSignalScannerService().scanning(DEALS_FOR_TEST_CASE_1);

        assertEquals(EXPECTED_SIGNALS_FOR_TEST_CASE_1, diContainer.getSignalRepository().findAll());
    }

    @Test
    @DisplayName("""
        В массиве данных есть сигнал по алгоритму дельта анализа пар преф-обычка.
        """)
    void testCase2() {
        diContainer.getSignalScannerService().scanning(DEALS_FOR_TEST_CASE_2);

        assertEquals(EXPECTED_SIGNALS_FOR_TEST_CASE_2, diContainer.getSignalRepository().findAll());
    }

    @Test
    @DisplayName("""
        По инструменту нет исторических данных.
        """)
    void testCase3() {
        final IllegalStateException err = assertThrows(
            IllegalStateException.class,
            () -> diContainer.getSignalScannerService().scanning(DEALS_FOR_TEST_CASE_3)
        );

        assertEquals("По инструменту TGKB нет исторических данных.", err.getMessage());
    }
}
