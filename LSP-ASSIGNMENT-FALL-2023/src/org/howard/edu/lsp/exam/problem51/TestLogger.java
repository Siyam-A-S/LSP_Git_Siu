package org.howard.edu.lsp.exam.problem51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestLogger {

    @Test
    public void testDisplayLog() {
        Logger logger = Logger.getInstance();
        logger.logMessage("Test message");
        assertEquals("Log:\nTest message\n", logger.displayLog());
    }

    @Test
    public void testLoggerInstances() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        assertSame(logger1, logger2, "Multiple instances should be the same");
    }
}