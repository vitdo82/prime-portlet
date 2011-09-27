package com.prime.primeportlet.utils;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class DebugPhaseListener implements PhaseListener {

    @Override
    public void beforePhase(PhaseEvent phaseEvent) {
        System.out.println("Start phase : " + phaseEvent.getPhaseId().toString());
    }

    @Override
    public void afterPhase(PhaseEvent phaseEvent) {
        System.out.println("End phase : " + phaseEvent.getPhaseId().toString());
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
