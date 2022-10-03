// Importing File class
import java.io.*;
// Importing the IOException class for handling errors
import java.util.*;


public class FileHandlingExample {
    public static void main(String[] args) {
        System.out.println("********************");
        File f0 = new File("FileOperationExample.txt");
        //create file
                try {
                    // Creating an object of a file
//                    File f0 = new File("FileOperationExample.txt"); file object creation
                    if (f0.createNewFile()) {
                        System.out.println("File " + f0.getName() + " is created successfully.");
                    } else {
                        System.out.println("File is already exist in the directory.");
                    }
                } catch (IOException exception) {
                    System.out.println("An unexpected error is occurred.");
                    exception.printStackTrace();
                }
                System.out.println("********************");
                //Get File Information
                if (f0.exists()) {
                    // Getting file name
                    System.out.println("The name of the file is: " + f0.getName());

                    // Getting path of the file
                    System.out.println("The absolute path of the file is: " + f0.getAbsolutePath());

                    // Checking whether the file is writable or not
                    System.out.println("Is file writeable?: " + f0.canWrite());

                    // Checking whether the file is readable or not
                    System.out.println("Is file readable " + f0.canRead());

                    // Getting the length of the file in bytes
                    System.out.println("The size of the file in bytes is: " + f0.length());
                } else {
                    System.out.println("The file does not exist.");
                }

        //        Write
        //        we will use the FileWriter class and its write() method
        //        close the stream using the close() method
                System.out.println("********************");
                try {
                    FileWriter fwrite = new FileWriter("FileOperationExample.txt");
                    // writing the content into the FileOperationExample.txt file
                    fwrite.write("A named location used to store related information is referred to as a File.");

                    // Closing the stream
                    fwrite.close();
                    System.out.println("Content is successfully wrote to the file.");
                } catch (IOException e) {
                    System.out.println("Unexpected error occurred");
                    e.printStackTrace();
                }

//        Read from a File
                System.out.println("********************");
                try {
                    // Create f1 object of the file to read data
                    File f1 = new File("FileOperationExample.txt");
                    Scanner dataReader = new Scanner(f1);
                    while (dataReader.hasNextLine()) {
                        String fileData = dataReader.nextLine();
                        System.out.println(fileData);
                    }
                    dataReader.close();
                } catch (FileNotFoundException exception) {
                    System.out.println("Unexcpected error occurred!");
                    exception.printStackTrace();
                }


//        Delete a File
//        We don't need to close the stream using the close() method because for deleting a file,
//        we neither use the FileWriter class nor the Scanner class.
                System.out.println("********************");
                f0 = new File("FileOperationExample.txt");
                if (f0.delete()) {
                    System.out.println(f0.getName()+ " file is deleted successfully.");
                } else {
                    System.out.println("Unexpected error found in deletion of the file.");
                }


    }
}




//        try (FileReader fr = new FileReader(path);
//             BufferedReader br = new BufferedReader(fr))
//        {
//            return br.readLine();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }