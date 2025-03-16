package day24;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    // java i/o
    // input streams: read data from a source
    // output streams: write data to a destination
    
    // InputStream - base class for reading bytes
    // OutpuStream - base class for writing bytes
    // Reader - base class for reading characters like text data
    // Writer - base class for writing characters

    // byte stream:
    // handles binary data, non text files
    // ByteArray InputStream and OutputStream

    // character stream:
    // handles text data 16 bit unicode character
    // Buffered Reader and Writer

    // differences:
    // data types, also encoding: byte streams ignore encoding working with raw data, character streams handle encoding and decoding for proper text processing. character streams more efficient for text although byte streams can also handle text

    // byte[] data = {72, 101, 108, 108, 111}; //ASCII

    // ByteArrayInputStream inputStream = null;
    // try {
    //   inputStream = new ByteArrayInputStream(data);
    //   int byteData;
    //   while ((byteData = inputStream.read()) != -1) {
    //     System.out.print((char)byteData);
    //   }
    // } catch (Exception e) {
    //   System.out.println("error during input stream");
    // } finally {
    //   if (inputStream != null) {
    //     try {
    //       inputStream.close();
    //     } catch (IOException e) {
    //       e.printStackTrace();
    //     }
        
    //   }
    // }



    // 
    // 



    // OutputStream class is foundation for writing bytes to destinations like files or network connections

    // write(int b): writes single byte to destination
    // write(byte[] b): sends entire byte array at once
    // write(byte[], int off, int len): writes part of a byte array, starting at off and writing len bytes
    // write(int b): ensures any buffered data is sent out immediately
    // write(int b): closes the stream and frees resources

    // common byte output stream classes:
    // FileOutputStream: writes bytes directly to a file
    // BufferedOuputStream: enhances performance by buffereing data before writing larger chunks
    // DataOutputStream: writes primitive data types (int, float, bool) in machine independent way, useful for saving data in binary format across different systems



    // 
    // 


    // String data = "Hello this is a test using FileOutputStream";
    // will automatically close without finally by using try with this as resource
    // try(FileOutputStream fos = new FileOutputStream("day24/resources/output.txt")) {
    //   byte[] bytesArray = data.getBytes();
    //   fos.write(bytesArray);
    //   fos.flush();

    //   System.out.println("data written to file successfully");

    // } catch (FileNotFoundException e) {
    //   throw new RuntimeException(e);
    // } catch (IOException e) {
    //   throw new RuntimeException(e);
    // }



    // buffered
    // String data = "Hello this is a test using BufferedOutputStream";
    // try(FileOutputStream fos = new FileOutputStream("day24/resources/output2.txt");
    //   BufferedOutputStream bos = new BufferedOutputStream(fos)
    // ) {
    //   byte[] bytesArray = data.getBytes();
    //   bos.write(bytesArray);
    //   bos.flush();

    //   System.out.println("data written to file successfully");

    // } catch (IOException e) {
    //   throw new RuntimeException(e);
    // }



    // data outputstream
    // bin is binary
    // try(FileOutputStream fos = new FileOutputStream("day24/resources/output3.bin");
    //   DataOutputStream dos = new DataOutputStream(fos)
    // ) {
    //   // shouldnt be able to open in text file
    //   dos.writeDouble(3.14);
    //   dos.writeUTF("This is a string");

    //   dos.flush();

    //   System.out.println("data written to file successfully");

    // } catch (IOException e) {
    //   throw new RuntimeException(e);
    // }




    // 
    // 



    // InputStream class is the abase class for reaing byte streams in java, its abstract so you use its subclasses (FileInputStream) for actial inpt operations like frading from files or network connections
    // key methods:
    // int read()
    // int read(byte[] b)
    // int read(byte b, int off, int len)
    // void close()

    // classes:
    // FileInputStream: reads raw bytes from files
    // BufferedInputStream: similar but does in chunks of data, more efficient
    // DataInputStream: reads primitive data types. consistent handling of structured data

    // InputStream fileStream = new FileInputStream("day24/src/main/resources/output3.bin");

    // // if (fileStream == null) {
    // //   System.out.println("file doesnt exist");
    // //   return;
    // // }

    // try(DataInputStream dis = new DataInputStream(fileStream)) {
    //   double doubleValue = dis.readDouble();
    //   String stringValue = dis.readUTF();

    //   System.out.println("double: " + doubleValue + ", string: " + stringValue);

    // } catch (IOException e) {
    //   throw new RuntimeException(e);
    // }



    // 
    // 
    // 

    // buffered input stream
    // InputStream fileStream = new FileInputStream("day24/src/main/resources/output.txt");

    // try(BufferedInputStream bis = new BufferedInputStream(fileStream)) {
    //   int data;
    //   while((data = bis.read()) != -1){
    //     System.out.print((char)data);
    //   }


    // } catch (IOException e) {
    //   throw new RuntimeException(e);
    // }



    // 
    // 
    // 

    // create file

    // String filePath = "day24/src/main/resources/newFile.txt";
    // String renamedFilePath = "day24/src/main/resources/newFileChanged.txt";

    // File file = new File(filePath);
    // if(file.exists()){
    //   System.out.println("File exists");
    // } else {
    //   System.out.println("File doesn't exist, creating...");
    //   try {
    //     if(file.createNewFile()){
    //       System.out.println("File created " + file.getName());
    //     } else {
    //       System.out.println("failed to create file");
    //     }
    //   } catch (IOException e) { 
    //     System.out.println("an error occured while creating file");
    //     e.printStackTrace();
    //   }
    // }

    // System.out.println("File Name: " + file.getName());
    // System.out.println("File Path: " + file.getPath());



    // 
    // rename file


    // String filePath2 = "day24/src/main/resources/newFile.txt";
    // String renamedFilePath = "day24/src/main/resources/newFileChanged.txt";

    // File file = new File(filePath2);
    // if(file.exists()){
    //   System.out.println("File exists");
    // } else {
    //   System.out.println("File doesn't exist, creating...");
    //   try {
    //     if(file.createNewFile()){
    //       System.out.println("File created " + file.getName());
    //     } else {
    //       System.out.println("failed to create file");
    //     }
    //   } catch (IOException e) { 
    //     System.out.println("an error occured while creating file");
    //     e.printStackTrace();
    //   }
    // }

    // File renamedFile = new File(renamedFilePath);
    // if(file.renameTo(renamedFile)){
    //   System.out.println("File renamed: " + renamedFile.getName());
    // } else {
    //   System.out.println("file renaming failed");
    // }



    // 
    // delete files

    // String filePath2 = "day24/src/main/resources/newFile.txt";
    // String renamedFilePath = "day24/src/main/resources/newFileChanged.txt";

    // File file = new File(filePath2);
    // if(file.exists()){
    //   System.out.println("File exists");
    // } else {
    //   System.out.println("File doesn't exist, creating...");
    //   try {
    //     if(file.createNewFile()){
    //       System.out.println("File created " + file.getName());
    //     } else {
    //       System.out.println("failed to create file");
    //     }
    //   } catch (IOException e) { 
    //     System.out.println("an error occured while creating file");
    //     e.printStackTrace();
    //   }
    // }

    // File renamedFile = new File(renamedFilePath);
    // if(file.renameTo(renamedFile)){
    //   System.out.println("File renamed: " + renamedFile.getName());
    // } else {
    //   System.out.println("file renaming failed");
    // }

    // if (renamedFile.delete()){
    //   System.out.println("file deleted: " + renamedFile.getName());
    // } else {
    //   System.out.println("error deleting file");
    // }



    // 
    // 
    // create paths(folder/directories)
    // String dirPath = "day24/src/main/resources/file";
    //     String nestedDirPath = "day24/src/main/resources/file/subdir1/subdir2";

    //     File dir = new File(dirPath);
    //     if (!dir.exists()) {
    //         if (dir.mkdir()) {
    //             System.out.println("Directory created: " + dir.getName());
    //         } else {
    //             System.out.println("Failed to create dir");
    //         }
    //     } else {
    //         System.out.println("dir already exists");
    //     }

    //     File nestedDirs = new File(nestedDirPath);
    //     if (!nestedDirs.exists()) {
    //         if (nestedDirs.mkdirs()) {
    //             System.out.println("Directories created: " + nestedDirs.getName());
    //         } else {
    //             System.out.println("Failed to create dirs");
    //         }
    //     } else {
    //         System.out.println("dirs already exists");
    //     }




    // 
    // show all files in folder
    // String dirPath = "day24/src/main/resources";
    // File dir = new File(dirPath);

    // File[] files = dir.listFiles();
    // if(files != null && files.length>0){
    //   for(File f : files){
    //     System.out.println(f.getName());
    //   }
    // }




    // 
    // 


    // serialization and deserialization
    // serialization converts object into a byte stream allowing it to be saved to a file transmitted over a network or stored in a db
    // deserialization converts byte stream back into original object
    // *** must serialize to store objects!!

    // keeps object state and transferring between different parts of an app or across different systems
    // uses serializable interface to enable serialization and deserialization

    // allows you to save state of object (persistence)
    // can transmit objects over networks
    // caching, store serialized objects for faster future access

  }
}
