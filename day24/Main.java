package day24;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
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


    // InputStream fileStream = Main.class.getClassLoader().getResourceAsStream("output3.bin");
    // InputStream fileStream = Main.class.getClassLoader().getResourceAsStream("resources/output3.bin");
    InputStream fileStream = new FileInputStream("day24/src/main/resources/output3.bin");




    if (fileStream == null) {
      System.out.println("file doesnt exist");
      return;
    }

    try(DataInputStream dis = new DataInputStream(fileStream)) {
      double doubleValue = dis.readDouble();
      String stringValue = dis.readUTF();

      System.out.println("double: " + doubleValue + ", string: " + stringValue);

    } catch (IOException e) {
      throw new RuntimeException(e);
    }


  }
}
