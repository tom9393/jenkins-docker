package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class TrackerTest {

    private Tracker tracker;

    @BeforeEach
    void setUp() {
        tracker = new Tracker();
    }

    @Test
    void addSession() {
        tracker.addSession("2024-02-01", 90);
        assertEquals(90, tracker.getTotalPracticeTime());
    }

    @Test
    void getTotalPracticeTime() {
        tracker.addSession("2024-02-01", 20);
        tracker.addSession("2024-02-02", 50);
        tracker.addSession("2024-02-03", 90);
        assertEquals(160, tracker.getTotalPracticeTime());
    }

    @Test
    void checkGraduationEligibility() {
        tracker.addSession("2024-02-01", 20);
        tracker.addSession("2024-02-02", 50);
        tracker.addSession("2024-02-03", 90);
        assertFalse(tracker.checkGraduationEligibility());

        tracker.addSession("2024-02-03", 50000);
        assertTrue(tracker.checkGraduationEligibility());
    }
}