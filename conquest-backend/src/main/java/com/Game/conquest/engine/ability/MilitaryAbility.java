package com.Game.conquest.engine.ability;

import com.Game.conquest.engine.ability.abilityInterface.InstantAbility;
import com.Game.conquest.engine.board.Board;
import com.Game.conquest.engine.board.MilitaryStore;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class MilitaryAbility extends InstantAbility {
    private int military;
    public MilitaryAbility(int military) {
        this.military = military;
    }
    @Override
    public void applyAbility(Board board) {
        MilitaryStore militaryStore = board.getMilitaryStore();
        militaryStore.addTotalMilitary(military);
    }

    @Override
    public void calculatePoints(Board board) {

    }


}
