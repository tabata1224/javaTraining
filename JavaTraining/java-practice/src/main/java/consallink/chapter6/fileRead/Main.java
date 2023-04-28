package consallink.chapter6.fileRead;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        try {
            File file = new File(
                    "/workspaces/Java-training/JavaTraining/java-practice/src/main/java/consallink/chapter6/fileRead/sample.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));

            String str = null;

            while ((str = br.readLine()) != null) {
                String[] nums = str.split(" ");
                for (int n = 0; n < nums.length; n++) {
                    System.out.println(nums[n]);
                }
            }

            br.close();


        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
