package myapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;

import javax.lang.model.element.ExecutableElement;

// java IOMain <src> <dest>
// java IOMain myfile myfile.dup

public class IOMain {  

    public static void main(String[] args) {

        String srcFile = args[0];
        String dstFile = args[1];

        // 1k byte buffer
        byte[] buff = new byte[1024];
        int size = 0;

        try {
        InputStream is = new FileInputStream(srcFile);
        System.out.printf("%s file opened", srcFile);

        OutputStream os = new FileOutputStream(dstFile);

        while(size >= 0 ) {
            size = is.read(buff);
            System.out.printf("read: %d\n", size);

            if(size >0)
            os.write(buff,0,size);
        }
       
        is.close();
        os.flush();
        os.close();

        } catch (FileNotFoundException ex) {
            System.err.printf("Error: %s\n", ex.getMessage());
        } catch (IOException ex) {
            System.err.printf("Error: %s\n",ex.getMessage());
        }
        
    }
    
}


/* 
  Path p = Paths.get("/../../..");
        // File object
        File f = p.toFile();

        // File object
        File hostFile = new File("/../../..");
        File etcDir = new File("/etc");
        System.out.printf("%s is directory? %b\n", hostFile.getName(),hostFile.isDirectory());
        System.out.printf("%s is directory? %b\n", etcDir.getName(),etcDir.isDirectory());
 */