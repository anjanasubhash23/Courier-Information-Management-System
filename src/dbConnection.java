import Courier_user.User;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.UserAccessorProperty;


public class dbConnection {
    
    public static Connection connect(){
        
        Connection Conn=null;
        
        try {
            
            Conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/courier_management","root","");
            
            Component rootPane=null;
            
            System.out.println("Connected");
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null,ex);
        }
        return Conn;
    }
    
    public static  int updateRecordsy(String sql){
          int i=0;
           try{
          Statement st = getStatement();
           i= st.executeUpdate(sql);
           }
           catch (Exception ex)
           {
                JOptionPane.showMessageDialog(null, ex);
           }
            return  i;
        }

    private static Statement getStatement() throws Exception{
        //To change body of generated methods, choose Tools | Templates.
        Statement st =null;
        Connection Conn = connect();
        st= Conn.createStatement();
        return st;
    
    }
    
    
   public static ArrayList UserList(String sql) throws Exception {
		ArrayList userArrayList = new ArrayList();
		ResultSet rs = null;
		Statement st = getStatement();
		rs = st.executeQuery(sql);
		while (rs.next()) {
                        User user =new User ();
                        user.setUsername(rs.getString(2));
			user.setPassword(rs.getString(3));
                        user.setName(rs.getString(4));
                        user.setAddress(rs.getString(5));
                        user.setEmail(rs.getString(6));
                        user.setPhone(rs.getString(7));
                        userArrayList.add(user);

		}

		return userArrayList;
	}
   
   
   /*private static Statement getStatement() throws Exception {
		Statement st = null;
		Connection Conn = getConnection();
		st = Conn.createStatement();
		return st;
	}*/

	// declare a method to insert record

	public static boolean insertRecord(String sql) throws Exception {
		Statement st = getStatement();
		st.executeUpdate(sql);

		return true;
	}
   
   
    
}
