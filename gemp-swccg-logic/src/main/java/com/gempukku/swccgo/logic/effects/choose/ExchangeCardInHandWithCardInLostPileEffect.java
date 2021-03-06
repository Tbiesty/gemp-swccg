package com.gempukku.swccgo.logic.effects.choose;

import com.gempukku.swccgo.common.Filterable;
import com.gempukku.swccgo.common.Zone;
import com.gempukku.swccgo.logic.timing.Action;


/**
 * An effect to exchange a card from hand with a card from Lost Pile.
 */
public class ExchangeCardInHandWithCardInLostPileEffect extends ExchangeCardsInHandWithCardInCardPileEffect {

    /**
     * Creates an effect to exchange a card from hand with a card from Lost Pile.
     * @param action the action performing this effect
     * @param playerId the player
     */
    public ExchangeCardInHandWithCardInLostPileEffect(Action action, String playerId) {
        super(action, playerId, Zone.LOST_PILE, 1, 1, false);
    }

    /**
     * Creates an effect to exchange a card from hand with a card from Lost Pile.
     * @param action the action performing this effect
     * @param playerId the player
     * @param cardInHandFilter the card in hand filter
     * @param cardInPileFilter the card in pile filter
     */
    public ExchangeCardInHandWithCardInLostPileEffect(Action action, String playerId, Filterable cardInHandFilter, Filterable cardInPileFilter) {
        super(action, playerId, Zone.LOST_PILE, 1, 1, cardInHandFilter, cardInPileFilter, false);
    }
}
