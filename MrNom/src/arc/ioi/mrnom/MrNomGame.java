package arc.ioi.mrnom;

import arc.ioi.mrnom.framework.Screen;
import arc.ioi.mrnom.framework.impl.AndroidGame;

public class MrNomGame extends AndroidGame {
	
    public Screen getStartScreen() {
        return new LoadingScreen(this); 
    }
}