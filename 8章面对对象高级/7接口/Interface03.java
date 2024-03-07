package 面向对象高级.接口;

public class Interface03 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
        OracleDB oracleDB = new OracleDB();
        t(oracleDB );
    }
    public static void t(DBInterface db) {
        db.conncet();
        db.close();
    }
}
