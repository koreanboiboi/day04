package classwork;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        ArrayList<ArrayList<String>> csvLines = new ArrayList<ArrayList<String>>();

        ArrayList<String> line = csvLines.get(1);
        
        String srcFile = args[0];
        
        
        Reader reader = new FileReader(srcFile);
        BufferedReader br = new BufferedReader(reader);

        
        int lineNum = 0;
        
        while (line != null) {
            line = csvLines.get(1);
            lineNum ++;
            System.out.printf("%d: %s\n",lineNum,line);
            
        }

        //br.close();
        reader.close();

    }
    
}
