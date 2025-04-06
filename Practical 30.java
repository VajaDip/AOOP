import java.util.HashMap;

public class practical30 {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<String, String>();
        students.put("ENROO1", "Vivek");
        students.put("ENROO2", "Bhautik");
        students.put("ENROO3", "Ronak");
        students.put("ENROO4", "Man");
        students.put("ENROO5", "Harsh");

        System.out.println("Print Student Records:");

        for (String key : students.keySet()) {
            System.out.println("Enrollment No: " + key + " Name: " + students.get(key));
        }

        String enrollmentNo = "ENROO3";
        System.out.println("Retrieving student with Enrollment No: " + enrollmentNo);

        if (students.containsKey(enrollmentNo)) {
            System.out.println("Student Name: " + students.get(enrollmentNo));
        } else {
            System.out.println("Student with Enrollment No: " + enrollmentNo + " not found");
        }
    }
}
