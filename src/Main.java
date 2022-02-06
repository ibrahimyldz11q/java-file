import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	File file = new File("C:\\Users\\İbrahim\\dosya2\\src\\data.txt");

    fileCreate();
    fileInfo();
    fileRead();
    fileWrite();
    fileRead();

    }

    public static void fileCreate(){
        File file = new File("C:\\Users\\İbrahim\\dosya2\\src\\data.txt");
        try {
            if (file.createNewFile()){
                System.out.println("File Createed Name +"+file.getName());

            }else {
                System.out.println("File Have");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileInfo(){
        File file = new File("C:\\Users\\İbrahim\\dosya2\\src\\data.txt");

        if (file.exists()){
            System.out.println(file.getName());
            System.out.println(file.getPath());
            System.out.println(file.length());
        }else {
            System.out.println("File Can not Found");
        }

    }

    public static void fileRead(){
        File file = new File("C:\\Users\\İbrahim\\dosya2\\src\\data.txt");
        try {
            Scanner scanner = new Scanner(file);
            String line = "";
            while(scanner.hasNextLine()){
                line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void fileWrite(){

        try {
          BufferedWriter  bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\İbrahim\\dosya2\\src\\data.txt",true));

          bufferedWriter.write("Ahmet");
          bufferedWriter.newLine();
          bufferedWriter.write("Ezgi");

          bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void fileReaderx(){
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\İbrahim\\dosya2\\src\\data.txt"));
            String x = null;
            String line = "";
           while ((x = bufferedReader.readLine())!=null){

                line = x;
                System.out.println(line);
           }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}
