package com.gempukku.swccgo.logic.timing.results;

import com.gempukku.swccgo.game.SwccgGame;
import com.gempukku.swccgo.logic.timing.Action;
import com.gempukku.swccgo.logic.timing.EffectResult;

/**
 * This effect result is triggered when a Podrace is initiated.
 */
public class PodraceInitiatedResult extends EffectResult {

    /**
     * Creates an effect result that is triggered when a Podrace is initiated.
     * @param action the action performing this effect result
     */
    public PodraceInitiatedResult(Action action) {
        super(Type.PODRACE_INITIATED, action.getPerformingPlayer());
    }

    /**
     * Gets the text to show to describe the effect result.
     * @param game the game
     * @return the text
     */
    @Override
    public String getText(SwccgGame game) {
        return "Podrace just initiated";
    }
}
