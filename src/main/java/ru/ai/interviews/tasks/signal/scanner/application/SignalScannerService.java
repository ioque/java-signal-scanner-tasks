package ru.ai.interviews.tasks.signal.scanner.application;

import java.util.List;

import lombok.AllArgsConstructor;
import ru.ai.interviews.tasks.signal.scanner.adapters.InstrumentRepository;
import ru.ai.interviews.tasks.signal.scanner.adapters.SignalRepository;
import ru.ai.interviews.tasks.signal.scanner.domain.value.Deal;

@AllArgsConstructor
public class SignalScannerService {
    private final static Double VALUE_SCALE_COEFFICIENT = 2.5;
    private final static Double DELTA_SCALE_COEFFICIENT = 1.5;

    private final SignalRepository signalRepository;
    private final InstrumentRepository instrumentRepository;

    public void scanning(List<Deal> deals) {

    }
}
