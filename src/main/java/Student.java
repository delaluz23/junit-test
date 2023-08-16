import lombok.Getter;
import lombok.Setter;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

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
    public double getGradeAverage(){
        double sum =0;
        for(int grade: grades){
            sum += grade;
        }
        return sum/ grades.size();
    }
    public ArrayList<Integer> updatedGrade(int searchedGrade, int replacedgrade) {
        for (int i = 0; i < grades.size(); i++) {
            if (searchedGrade == grades.get(i)) {
                grades.set(i, replacedgrade);
            }
        }
        return grades;
    }
    public ArrayList<Integer> deleteGrade(int searchedGrade){
        for(int i = 0; i < grades.size(); i++){
            if (searchedGrade == grades.get(i)){
                grades.remove(i);
            }
        }
        return grades;
    }
    public AbstractList<Integer> addGrade(int x){
        grades.add(x);
        return grades;
    }
}
