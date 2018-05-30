import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Auther zhongweiwu
 * @Date 2018/5/24 11:32
 */
public class TestThreadLocal {
    private ThreadLocal<Connection> connectionHolder = new ThreadLocal<Connection>(){
        @Override
        public Connection initialValue(){
            try {
                return DriverManager.getConnection("");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }
    };

    public static void main(String[] args) {
        TestThreadLocal tt = new TestThreadLocal();
        ThreadLocal<Connection> holder = tt.connectionHolder;
        holder.get();
    }
}
