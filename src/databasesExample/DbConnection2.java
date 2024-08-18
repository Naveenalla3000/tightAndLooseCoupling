package databasesExample;

interface DataBaseService {
    String insert();
    String delete();
}


class OracleDB1 implements DataBaseService{

    @Override
    public String insert() {
        String res = "one row inserted(oracle)";
        System.out.println(res);
        return res;
    }

    @Override
    public String delete() {
        String res = "one row deleted(oracle)";
        System.out.println(res);
        return res;
    }
}

class MysqlDB1 implements DataBaseService{


    @Override
    public String insert() {
        String res = "one row inserted(mysql)";
        System.out.println(res);
        return res;
    }

    @Override
    public String delete() {
        String res = "one row deleted(mysql)";
        System.out.println(res);
        return res;
    }
}



public class DbConnection2 {
    private DataBaseService dataBaseService;

    public static void main(String[] args) {
        DataBaseService mysql = new MysqlDB1();
        DataBaseService oracle = new OracleDB1();

        DbConnection2 dbConnection = new DbConnection2();

        // set database to mysql
        dbConnection.setDataBaseService(mysql);
        // operation on mysql
        DataBaseService mysqlDB1 = dbConnection.getDataBase();
        mysqlDB1.insert();
        mysqlDB1.delete();


        // set database to oracle
        dbConnection.setDataBaseService(oracle);
        // operation on oracle
        DataBaseService oracleDb1 = dbConnection.getDataBase();
        oracleDb1.insert();
        oracleDb1.delete();

    }

    public void setDataBaseService(DataBaseService dataBaseService){
        this.dataBaseService = dataBaseService;
    }

    public DataBaseService getDataBase(){
        return this.dataBaseService;
    }

}
