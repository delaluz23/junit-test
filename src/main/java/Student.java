import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;
    public Student(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }
}
