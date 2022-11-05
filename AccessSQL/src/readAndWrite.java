import java.sql.*;
public class readAndWrite {
    public ResultSet PleaseLook(ResultSet rs)throws SQLException{
        try{
         Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost/","root","Password");
           //above is starting connection to the localhost server with user root


           String s = "Select * from Parkingapp.ParkingLots;";//select all values from all tuples of parkinglots table
           Statement st = conn.createStatement();//create statement
        rs = st.executeQuery(s);//execute the statement with the string s giving us the result set rs
        conn.close();//close the connection because we are done
           /*while(rs.next()){
               String  city= rs.getString("City");
               String  state= rs.getString("State");
               String  address= rs.getString("Address");
               float  rate= rs.getFloat("Hourly_rate");
               Time  opening= rs.getTime("Start_open");
               Time  closing = rs.getTime("End_close");
               System.out.println(city + " " + state + " " + address + " " + rate + " " + opening + " " + closing);
           }*/
           //this commented out section will output of of the addresses in the table i left it here for testing
        }
        catch(Exception e){// if it goes wrong handle the error and inform user
            e.printStackTrace();
            System.out.println("oopsie woopsie");
        }
               //here we would have the calls to the maps to get the addresses into the search???
           
           //returns all values from all tuples in the customer table
        
        return rs;
    }

    public void WriteInto(String fname, String lname, String custId,String creditNum, String cvv )throws SQLException{
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/","root","password");//start connection with the local server, user root
            String s = "Insert into ParkingApp.Customer (Fname, Lname, Cust_id, Credit_num, Cvv) values(?,?,?,?,?)";//create string to insert with(leave the variables as?'s')
            PreparedStatement p = conn.prepareStatement(s);//prepare the statement
            p.setString(1,fname);//initialize the variables you want to insert
            p.setString(2,lname);
            p.setString(3,custId);
            p.setString(4,creditNum);
            p.setString(5,cvv);
            boolean i = p.execute();//execute insertion
            if(i==false){//if the execute didnt happen inform user
                System.out.println("did not execute");
            }
            else{//if inserted do the same
                System.out.println("Tuple inserted into table");
            }
            conn.close();//close connection bc its done with

        }
        catch(Exception e){//handle error and inform user
            e.printStackTrace();
            System.out.println("Something went wrong while trying to insert");

        }

    }
    
}
