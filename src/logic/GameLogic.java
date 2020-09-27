package logic;

import logic.enums.Player;
import logic.enums.Rooms;
import logic.enums.Weapons;

import java.util.Random;
import java.util.Vector;

public class GameLogic {
    Vector<String> data = new Vector<>();

    logic.objects.Player[] players = {};

    Player p[] = Player.values();
    Rooms r[] = Rooms.values();
    Weapons w[] = Weapons.values();

    public GameLogic(){
        initData();
        getRndCardsForPlayer(5);
    }

    public void initData() {

        for(Player pl: Player.values()){
            data.add(pl.name());
        }
        for(Rooms rm: Rooms.values()){
            data.add(rm.name());
        }
        for(Weapons wp: Weapons.values()){
            data.add(wp.name());
        }
    }

    public void getRndCardsForPlayer( int num){
        int mod = 21 % num;
        int cpp = 21/num;

        while(data.size()>0) {
            int rndCard = new Random().nextInt(21);
            int rndPlayer = new Random().nextInt(num);

            logic.objects.Player p = players[rndPlayer];
            if(p.getCardNumbers()< cpp){
                p.addCard(data.elementAt(rndCard));
                data.remove(rndCard);
            }
            else{
                // restliche Karten verteilen
            }
        }
    }

}
