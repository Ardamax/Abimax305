import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class ExampleMap
{
    public static List<String> highEnrollmentStudents(Map<String, List<Course>> courseListsByStudentName, int unitThreshold) {

        List<String> overEnrolledStudents = new ArrayList<>();

        /*
            Build a list of the names of students currently enrolled
            in a number of units strictly greater than the unitThreshold.
        */

        for(String student: courseListsByStudentName) {
            int numUnits = 0;

            for(String course: ) {
            }
        }

        return overEnrolledStudents;         
    }
}
