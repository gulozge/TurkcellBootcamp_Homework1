package org.gamemanagment.service.concretes;

import org.gamemanagment.database.EDevletData;
import org.gamemanagment.model.Player;
import org.gamemanagment.service.abstracts.Validate;

public class ValidationWithEDevletData implements Validate {
    @Override
    public boolean validate(Player player) {
        EDevletData eDevletData=new EDevletData();
        String  playerForCheck=player.getNationalIdentity()+" "+player.getName()+" "+player.getSurName()+" "+player.getBirthDate();
        return eDevletData.eDevlet().contains(playerForCheck);
    }
}
