import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class trywithresources {
    public static void viewTable(Connection con) throws SQLException
    {
        String query = "select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";
        try (Statement stmt = con.createStatement())
        {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next())
            {
                String coffeeName = rs.getString("COF_NAME");
                int supplierID = rs.getInt("SUP_ID");
                float price = rs.getFloat("PRICE");
                int sales = rs.getInt("SALES");
                int total = rs.getInt("TOTAL");
                System.out.println(coffeeName + ", " + supplierID + ", " + price + ", " + sales + ", " + total);
            } //while ends here
        } catch (SQLException e) {
            System.out.println(e.getErrorCode()+e.getMessage());
        }
    }

    static void readFirstLineFromFile(String path) throws IOException
    {
        String line;
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr))
        {
            while((line=br.readLine())!=null)
               System.out.println(line);
        }
    }


    public static void main(String[] args) {
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc.mysql://localhost:3306/fop","root","root");
//            viewTable(con);
//        }catch(Exception e)
//         {
//             System.out.println("Exception : " + e.getClass() +  " " + e.getMessage());
//        }

        File f = new File("SampleTextFile.txt");
        try{
//            readFirstLineFromFile(f.getAbsolutePath());
           readFirstLineFromFile("SampleTextFile.txt");
        }catch(Exception e){
            System.out.println("Exception : " + e.getClass() +  " " + e.getMessage());
        }

    }
}



