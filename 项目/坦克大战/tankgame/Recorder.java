package 项目.坦克大战.tankgame;/*
 *@author yang
  该类用于记录相关的信息，和文件交互
 */

import java.io.*;
import java.util.Vector;
@SuppressWarnings({"all"})
public class Recorder {
    //定义变量，记录我放击毁敌人坦克数量
    private static int allEnemyTankNum = 0;
    //定义IO对象,准备写数据到文件中
    private static FileWriter fw = null;
    private static BufferedWriter bw = null;

    private static BufferedReader br = null;
    private static String recordFile = "/Users/dreamtank/JDK/IDEAtest/src/项目/坦克大战/tankgame/myRecord.txt";
    //定义Vector，指向MyPanel对象的敌人坦克Vector
    private static Vector<EnemyTank> enemyTanks = null;

    //定义一个Node 的Vector，用于保存敌人的信息Node
    private static Vector<Node> nodes = new Vector<>();


    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }

    //增加一个方法，用于读取recordFile,恢复相关信息
    public static Vector<Node> getNodesAndEnemyTankNumRec() {
        try {
            br = new BufferedReader(new FileReader(recordFile));
            allEnemyTankNum = Integer.parseInt(br.readLine());
            //循环读取文件，生成nodes集合
            String line = "";
            while((line = br.readLine()) != null) {
                String[] xyd = line.split(" ");
                new Node(Integer.parseInt(xyd[0]),Integer.parseInt(xyd[1]),Integer.parseInt(xyd[2]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
        }
        return null;
    }

    //当游戏退出时，我们将allEnemyTankNum 保存到 recordFile
    //对keepRecord进行升级，保存敌人坦克的坐标和方向
    public static void keepRecord() {
        try {
            bw = new BufferedWriter(new FileWriter(recordFile));
            bw.write(allEnemyTankNum + "");
            bw.newLine();
            //遍历敌人坦克的Vector，然后根据情况保存即可
            //OOP，定义一个属性，然后通过set方法获得敌人的Vector
            for (int i = 0; i < enemyTanks.size(); i++) {
                //取出敌人坦克
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.isLive) {
                    //保存该enemyTank信息
                    String record = enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirect();
                    //写入到文件
                    bw.write(record + "");
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }
    //当我放坦克击毁一辆敌人坦克，就应当 allEnemyTankNum++
    public static void addAllEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }
}
