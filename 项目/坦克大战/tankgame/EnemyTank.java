package 项目.坦克大战.tankgame;/*
 *@author yang
 */

import java.util.Vector;

public class EnemyTank extends Tank{
    Vector<Shot> shots = new Vector<>();

    boolean isLive = true;
    public EnemyTank(int x, int y) {
        super(x, y);
    }

}
