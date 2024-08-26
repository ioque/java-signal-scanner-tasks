package ru.ai.interviews.tasks.signal.scanner;

import lombok.Getter;
import ru.ai.interviews.tasks.signal.scanner.adapters.InstrumentRepository;
import ru.ai.interviews.tasks.signal.scanner.adapters.SignalRepository;
import ru.ai.interviews.tasks.signal.scanner.application.SignalScannerService;

@Getter
public class FakeDiContainer {
    private final SignalRepository signalRepository;
    private final InstrumentRepository instrumentRepository;
    private final SignalScannerService signalScannerService;

    public FakeDiContainer() {
        this.signalRepository = new SignalRepository();
        this.instrumentRepository = new InstrumentRepository();
        this.signalScannerService = new SignalScannerService(signalRepository, instrumentRepository);
    }
}
