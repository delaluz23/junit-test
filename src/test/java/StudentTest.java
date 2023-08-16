import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {
    private String name;
    private long id;
    private ArrayList<Integer> grades;

    private Student actualStudent;
    private Student blankStudent;

    @Before
    public void setup(){
        grades = new ArrayList<>(Arrays.asList(70, 80, 90));
        actualStudent = new Student(123456789, "Joe MaMA", grades);
    }
    @Test
    public void testStudentNoArgConstructor(){
        assertNull(blankStudent);
        assertNotNull(actualStudent);
    }
    @Test
    public void StudentTestGetters(){
        assertEquals(actualStudent.getName(), "Joe MaMA");
        assertEquals(actualStudent.getId(), 123456789, .0000001);
        assertEquals(actualStudent.getGrades(), Arrays.asList(70, 80, 90));
        assertEquals(actualStudent.getGradeAverage(), 80, .0000001);
        actualStudent.addGrade(90);
        assertEquals(actualStudent.getGrades(), Arrays.asList(70, 80, 90,90));
    }
}
