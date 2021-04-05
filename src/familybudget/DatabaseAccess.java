/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package familybudget;

import java.sql.*;




public class DatabaseAccess {
    User user;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Statement stmt;
    int id = -1;
    
    public DatabaseAccess(){

    }
    
     public void LoadDatabase() throws ClassNotFoundException,SQLException{
        try{
         //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           Class.forName("com.mysql.jdbc.Driver");
                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/budget","root","");
         //con = DriverManager.getConnection("Jdbc:Odbc:RSADS", "", "");
        }catch(  ClassNotFoundException | SQLException cnfe){
            System.out.println(cnfe.getMessage());
        }
    }
    public User getUser(String name, String passtext) throws SQLException,ClassNotFoundException, NullPointerException{
        try{
        LoadDatabase();
        ps = con.prepareStatement(SELECTSTATEMENT);
        ps.setString(1, name);
        ps.setString(2, passtext);        
        rs = ps.executeQuery();
        while(rs.next()){
            user = new User(rs.getString("email"),rs.getString("password"));
            if (name.equals(rs.getString("email")) && passtext.equals(rs.getString("password"))){
                break;
            }
        }
        
        }catch(ClassNotFoundException cnfe){
            System.out.print(cnfe.getMessage());
        }catch(SQLException se){
        }catch (NullPointerException npe){
        }
        return user;
    }
    final static String SELECTSTATEMENT = "SELECT * FROM users WHERE email = ? and password = ?";
    
    
    public void RegisterUser(String name,String password) throws ClassNotFoundException,SQLException{
        try{
        LoadDatabase();
        ps = con.prepareStatement(INSERTUSER);
        
        ps.setString(1, name);
        ps.setString(2, password);
        int count = ps.executeUpdate();
        
        }catch (ClassNotFoundException cnfe){
            
        }catch (SQLException se){
            se.printStackTrace();
            throw new SQLException ("NAME ALREADY EXIST");
        }
    }
    final static String INSERTUSER = "INSERT into users VALUES(?,?)";
    
    
      public void SelectDocList() throws ClassNotFoundException,SQLException{
        try{
        LoadDatabase();
       // ps = con.prepareStatement(SELECTDOCLIST);
       
       
        ps.executeUpdate();
        
        }catch (ClassNotFoundException cnfe){
            
        }catch (SQLException se){
            se.printStackTrace();
            throw new SQLException ("NAME ALREADY EXIST");
        }
    }
    //final static String SELECTDOCLIST = "SELECT * from Attachment";
}
