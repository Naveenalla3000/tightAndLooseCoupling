package databasesExample;

class OracleDb{
    public String insertOne(){
        String res = "one row effected(oracle)";
        System.out.println(res);
        return res;
    }

    public String deleteOne(){
        String res = "one row deleted(oracle)";
        System.out.println(res);
        return res;
    }
}

class MySqlDb{
    public String addOne(){
        String res = "one row effected(mysql)";
        System.out.println(res);
        return res;
    }

    public String removeOne(){
        String res = "one row deleted(mysql)";
        System.out.println(res);
        return res;
    }
}
public class DbConnection {
    public static void main(String[] args) {
        OracleDb oracleDb = new OracleDb();
        MySqlDb mySqlDb = new MySqlDb();

        oracleDb.insertOne();
        oracleDb.deleteOne();

        mySqlDb.addOne();
        mySqlDb.removeOne();
    }
}
