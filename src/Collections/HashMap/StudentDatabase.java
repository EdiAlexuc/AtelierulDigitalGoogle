package Collections.HashMap;

import java.util.HashMap;
import java.util.List;

public class StudentDatabase {
    private HashMap<String, String> students = new HashMap<>();

    public StudentDatabase(List<Student> students){
        students.forEach(currentStudent -> this.students.put(currentStudent.getCNP(), String.valueOf(currentStudent)));
    }

//    public String findStudentName(String CNP) {
//        if(CNP.length() != 10){
//            throw new Student.CNPSizeException();
//        }
//        return students.get(CNP).getName();
//    }
}
