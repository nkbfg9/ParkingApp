import java.sql.*;
public class App {
    public static void main(String[] args) throws SQLException {
       /*  try{
           // Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost/","root","password");
           //above is starting connection to the localhost server with user root


             String s = "Select * from Parkingapp.Customer;";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(s);
            while(rs.next()){
                String fname = rs.getString("Fname");
                String lname = rs.getString("Lname");
                String customerId = rs.getString("Cust_id");
                String creditNum = rs.getString("Credit_num");
                String cvv = rs.getString("Cvv");
                System.out.println(fname + " " + lname + " " + customerId + " " + creditNum + " " + creditNum + " " + cvv);
            }
            //returns all values from all tuples in the customer table


            PreparedStatement p = null;
            p = conn.prepareStatement("Insert into ParkingApp.Customer (Fname,Lname,Cust_id,Credit_num,Cvv) values(?,?,?,?,?)");
            
            p.setString(1,"tm");
            p.setString(2,"Clnky");
            p.setString(3,"123456781");
            p.setString(4,"123456879abcde1");
            p.setString(5,"121");
            p.execute();
            //inserts customer tm clnky into the database along with his corresponding information

            

            System.out.println("successfully inserted a tuple");
        }*/
        
       /*  catch(Exception e){
            e.printStackTrace();
            System.out.println("was unable to insert");

        }
        */
        //commented out sections have the functions from when it worked all in the same function instead of calling from other classes

        readAndWrite classObj = new readAndWrite();//create object to do the functions on


        String first="bobby";
        String last = "Hill";
        String userId = "987654321";
        String creditNum = "987654321654321";
        String cvv = "321";
        classObj.WriteInto(first,last,userId,creditNum,cvv);
        //should put all 5 strings into a tuple in the customer table

        ResultSet Addresses=null;
        classObj.PleaseLook(Addresses);
        //should return a result set holding all of the parking lot information
        //addresses is probably a bad name but i Dont care



   
    }
}
