package classwork;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CsvMain {

    public static void main(String[] args) {
        String path="C:\\Users\\yungi\\VTTP2022_2a\\day04\\exams.csv";
        String line = "";


        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
        
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            
            if(values[1].contains("group A")){
                System.out.println(values[1]+" Math Score: "+values[5]+" Read Score: "+values[6]+" Write Score:  "+values[7]);
            } else if(values[1].contains("group B")){
                System.out.println(values[1]+" Math Score: "+values[5]+" Read Score: "+values[6]+" Write Score:  "+values[7]);
            } else if(values[1].contains("group C")){
                System.out.println(values[1]+" Math Score: "+values[5]+" Read Score: "+values[6]+" Write Score:  "+values[7]);
            } else if(values[1].contains("group D")){
                System.out.println(values[1]+" Math Score: "+values[5]+" Read Score: "+values[6]+" Write Score:  "+values[7]);
            } else {
                System.out.println(values[1]+" Math Score: "+values[5]+" Read Score: "+values[6]+" Write Score:  "+values[7]);
            }

            //System.out.println(values[1]+" "+" Math Score: "+values[5]+" Read Score: "+values[6]+" Write Score:  "+values[7]);

        

        }}
        
        catch (FileNotFoundException e) {
            
            e.printStackTrace();
        } catch (IOException e) {
            
            e.printStackTrace();
        }



    }
    
}
