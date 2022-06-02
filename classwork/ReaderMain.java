package classwork;

import java.io.*;
import java.util.ArrayList;

public class ReaderMain {

   public static void main(String[] args) {
       
        ArrayList<String> aList = new ArrayList<String>();

        for (String aStudentString: aList) {
            System.out.println(aStudentString);

        }
        ArrayList<Student> students = convertToStudents(aList);
        for(Student student: students) {
            System.out.println(student.toString());
        }
   }
    
   public static ArrayList<String> readAllLinesFromFile(String path) throws IOException{

    FileReader fileReader = new FileReader(path);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String line = null;
    while( (line = bufferedReader.readLine()) != null){
        aList.add(line);
    }
    bufferedReader.close();

    return aList;

}

public static ArrayList<Student> convertToStudents(ArrayList<String> studentsStrings) {
    ArrayList<Student> students = new ArrayList<>();
    studentsStrings.remove(0);

    // 567 for marks 1 for group
    for(String studentString : studentsStrings) {
        String[] parts = studentString.split(",");
        String group = parts[1];
        int mScore = Integer.valueOf(parts[5]);
        int rScore = Integer.valueOf(parts[6]);
        int wScore = Integer.valueOf(parts[7]);
        students.add(new Student(group, mScore, rScore, wScore));
    }
    return students;


}
}

