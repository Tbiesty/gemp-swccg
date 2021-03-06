package com.gempukku.swccgo.cards.set200.light;

import com.gempukku.swccgo.cards.AbstractNormalEffect;
import com.gempukku.swccgo.cards.GameConditions;
import com.gempukku.swccgo.cards.effects.usage.OncePerPhaseEffect;
import com.gempukku.swccgo.common.*;
import com.gempukku.swccgo.filters.Filters;
import com.gempukku.swccgo.game.PhysicalCard;
import com.gempukku.swccgo.game.SwccgGame;
import com.gempukku.swccgo.logic.GameUtils;
import com.gempukku.swccgo.logic.TriggerConditions;
import com.gempukku.swccgo.logic.actions.OptionalGameTextTriggerAction;
import com.gempukku.swccgo.logic.effects.choose.DeployCardToTargetFromReserveDeckEffect;
import com.gempukku.swccgo.logic.timing.EffectResult;
import com.gempukku.swccgo.logic.timing.results.PlayCardResult;

import java.util.Collections;
import java.util.List;

/**
 * Set: Set 0
 * Type: Effect
 * Title: Sai'torr Kal Fas (V)
 */
public class Card200_045 extends AbstractNormalEffect {
    public Card200_045() {
        super(Side.LIGHT, 4, PlayCardZoneOption.YOUR_SIDE_OF_TABLE, Title.Saitorr_Kal_Fas);
        setVirtualSuffix(true);
        setLore("Saurin female from planet Durkteel. Bodyguard of Hrchek, a Saurin droid trader. Sai'torr will teach battle skills to those who prove themselves worthy.");
        setGameText("Deploy on table. During your deploy phase, if you just deployed a unique (•) character, may [download] a matching weapon on that character. (Immune to Alter.)");
        addIcons(Icon.VIRTUAL_SET_0);
        addImmuneToCardTitle(Title.Alter);
    }

    @Override
    protected List<OptionalGameTextTriggerAction> getGameTextOptionalAfterTriggers(String playerId, final SwccgGame game, EffectResult effectResult, final PhysicalCard self, int gameTextSourceCardId) {
        GameTextActionId gameTextActionId = GameTextActionId.SAITORR_KAL_FAS__DOWNLOAD_MATCHING_WEAPON;

        // Check condition(s)
        if (TriggerConditions.justDeployed(game, effectResult, playerId, Filters.and(Filters.unique, Filters.character))
                && GameConditions.isOnceDuringYourPhase(game, self, playerId, gameTextSourceCardId, gameTextActionId, Phase.DEPLOY)
                && GameConditions.canDeployCardFromReserveDeck(game, playerId, self, gameTextActionId)) {
            final PhysicalCard character = ((PlayCardResult) effectResult).getPlayedCard();

            final OptionalGameTextTriggerAction action = new OptionalGameTextTriggerAction(self, gameTextSourceCardId, gameTextActionId);
            action.setText("Deploy matching weapon on " + GameUtils.getFullName(character));
            action.setActionMsg("Deploy matching weapon on " + GameUtils.getCardLink(character) + " from Reserve Deck");
            // Update usage limit(s)
            action.appendUsage(
                    new OncePerPhaseEffect(action));
            // Perform result(s)
            action.appendEffect(
                    new DeployCardToTargetFromReserveDeckEffect(action, Filters.matchingWeaponForCharacter(character), Filters.sameCardId(character), true));
            return Collections.singletonList(action);
        }
        return null;
    }
}