package 项目.坦克大战.tankgame;/*
 *@author yang
 */

import java.util.Vector;

public class EnemyTank extends Tank implements Runnable{
    Vector<Shot> shots = new Vector<>();
    //敵タンクを追加すると、EnemyTankは敵タンクのベクトルを取得できます

    //
    Vector<EnemyTank> enemyTanks = new Vector<>();

    boolean isLive = true;
    public EnemyTank(int x, int y) {
        super(x, y);
    }

    //这里提供一个方法，可以将MyPanel的成员Vector<EnemyTank> enemyTanks = new Vector<>();
    //设置到EnemyTank的成员enemyTanks
    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;

    }

    //编写方法，判断当前的这个敌人坦克，是否和enemyTanks中的其他坦克发生重叠或者是碰撞
    public boolean isTouchEnemyTank() {
        //現在の敵タンクの方向を判定します
        switch (this.getDirect()) {
            case 0: //右
                //現在の敵タンクと他のすべての敵タンクを比較する
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //自分と比較しない
                    if (enemyTank != this) {
                        //もし敵のタンクが上下方向にある場合
                        //xの範囲[enemyTank.getX(),enemyTank.getX() + 40
                        //yの範囲[enemyTank.getY(),enemyTank.getY() + 60
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 2) {
                            //現在のタンクの右上の座標[this.getX() + 60,this.getY()
                            if (this.getX() + 60>= enemyTank.getX()
                                    && this.getX() + 60<= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            //現在のタンクの右下隅の座標[this.getX() + 60,this.getY() + 40]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 40
                                    && this.getY() + 40>= enemyTank.getY()
                                    && this.getY() + 40<= enemyTank.getY() + 60) {
                                return true;
                            }

                        }
                        //もし敵のタンクが左右方向にある場合
                        //xの範囲[enemyTank.getX(),enemyTank.getX() + 60]
                        //yの範囲[enemyTank.getY(),enemyTank.getY() + 40]
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 3) {
                            //現在のタンクの右上の座標[this.getX()　+ 60,this.getY()]
                            if (this.getX() + 60>= enemyTank.getX()
                                    && this.getX() + 60<= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //現在のタンクの右下の座標[this.getX() + 60,this.getY() + 40]
                            if (this.getX() + 60 >= enemyTank.getX()
                                    && this.getX() + 60 <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }

                        }
                    }
                }
                break;
            case 1: //上
                //現在の敵タンクと他のすべての敵タンクを比較する
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //自分と比較しない
                    if (enemyTank != this) {
                        //もし敵のタンクが上下方向にある場合
                        //xの範囲[enemyTank.getX(),enemyTank.getX() + 40
                        //yの範囲[enemyTank.getY(),enemyTank.getY() + 60
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 2) {
                            //現在のタンクの左上隅の座標[this.getX(),this.getY()
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            //現在のタンクの右上隅の座標[this.getX() + 40,this.getY()]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }

                        }
                        //もし敵のタンクが左右方向にある場合
                        //xの範囲[enemyTank.getX(),enemyTank.getX() + 60]
                        //yの範囲[enemyTank.getY(),enemyTank.getY() + 40]
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 3) {
                            //現在のタンクの左上の座標[this.getX(),this.getY()]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //現在のタンクの右上の座標[this.getX() + 40,this.getY()]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }

                        }
                    }
                }
                break;
            case 2: //下
                //現在の敵タンクと他のすべての敵タンクを比較する
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //自分と比較しない
                    if (enemyTank != this) {
                        //もし敵のタンクが上下方向にある場合
                        //xの範囲[enemyTank.getX(),enemyTank.getX() + 40
                        //yの範囲[enemyTank.getY(),enemyTank.getY() + 60
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 2) {
                            //現在のタンクの左下隅の座標[this.getX(),this.getY()　+ 60]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 60>= enemyTank.getY()
                                    && this.getY() + 60<= enemyTank.getY() + 60) {
                                return true;
                            }
                            //現在のタンクの右下隅の座標[this.getX() + 40,this.getY() + 60]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 40
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 60) {
                                return true;
                            }

                        }
                        //もし敵のタンクが左右方向にある場合
                        //xの範囲[enemyTank.getX(),enemyTank.getX() + 60]
                        //yの範囲[enemyTank.getY(),enemyTank.getY() + 40]
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 3) {
                            //現在のタンクの左下の座標[this.getX(),this.getY()　+ 60]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 60 >= enemyTank.getY()
                                    && this.getY() + 60 <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //現在のタンクの右下の座標[this.getX() + 40,this.getY() + 60]
                            if (this.getX() + 40 >= enemyTank.getX()
                                    && this.getX() + 40 <= enemyTank.getX() + 60
                                    && this.getY() + 60>= enemyTank.getY()
                                    && this.getY() + 60<= enemyTank.getY() + 40) {
                                return true;
                            }

                        }
                    }
                }
                break;
            case 3: //左
                //現在の敵タンクと他のすべての敵タンクを比較する
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    //自分と比較しない
                    if (enemyTank != this) {
                        //もし敵のタンクが上下方向にある場合
                        //xの範囲[enemyTank.getX(),enemyTank.getX() + 40
                        //yの範囲[enemyTank.getY(),enemyTank.getY() + 60
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 2) {
                            //現在のタンクの左上の座標[this.getX(),this.getY()
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            //現在のタンクの左下の座標[this.getX(),this.getY()　+ 40]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 40
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }

                        }
                        //もし敵のタンクが左右方向にある場合
                        //xの範囲[enemyTank.getX(),enemyTank.getX() + 60]
                        //yの範囲[enemyTank.getY(),enemyTank.getY() + 40]
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 3) {
                            //現在のタンクの左上の座標[this.getX(),this.getY()]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() >= enemyTank.getY()
                                    && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            //現在のタンクの左下の座標[this.getX(),this.getY() + 40]
                            if (this.getX() >= enemyTank.getX()
                                    && this.getX() <= enemyTank.getX() + 60
                                    && this.getY() + 40 >= enemyTank.getY()
                                    && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }

                        }
                    }
                }
                break;
        }
        return false;
    }


    @Override
    public void run() {
        while(true) {
            //这里判断如果shots size（） = 0,创建一颗子弹放入到shots集合，并启动
            if (isLive && shots.size() == 3) {

                Shot s = null;

                //判断坦克的方向，创建对应的子弹
                switch(getDirect()) {
                    case 0:
                        s = new Shot(getX() + 60 ,getY() + 20,0);
                        break;
                    case 1:
                        s = new Shot(getX() + 20 ,getY(),1);
                        break;
                    case 2:
                        s = new Shot(getX() + 20 ,getY() + 60,2);
                        break;
                    case 3:
                        s = new Shot(getX() ,getY() + 20,3);
                        break;
                }
                shots.add(s);
                //启动
                new Thread(s).start();
            }

            //根据坦克方向继续移动
            switch(getDirect()) {
                case 0: //右
                    for (int i = 0; i < 30; i++) {

                        if (getX() + 60 < 1000 && !isTouchEnemyTank()) {
                            moveRight();
                        }
                        //休眠50毫秒
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;

                case 1: //上
                    for (int i = 0; i < 30; i++) {

                        if (getY() > 0 && !isTouchEnemyTank()) {
                            moveUp();
                        }
                        //休眠50毫秒
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 2: //下
                    for (int i = 0; i < 30; i++) {

                        if (getY() + 60 < 750 && !isTouchEnemyTank())  {
                            moveDown();
                        }
                        //休眠50毫秒
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 3: //左
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0 && !isTouchEnemyTank()) {
                            moveLeft();
                        }
                        //休眠50毫秒
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;

            }

            //然后随机的改变坦克的方向
            setDirect((int)(Math.random() * 4)); //0-3的整数
            //退出线程
            if (!isLive) {
                break;
            }


        }
    }
}
