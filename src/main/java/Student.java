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
    public ArrayList<Integer> updatedGrade(int searchedGrade){
        for(int grade:  grades){
            if (searchedGrade == grade){
                Scanner sc = new Scanner(System.in);
                System.out.println("You searched for " + searchedGrade + " enter the grade you want to replace it with");
                int result =  sc.nextInt();
                grades.remove(grade);
                grades.add(result);
            }
        }
        return grades;
    }
    public ArrayList<Integer> deleteGrade(int searchedGrade){
        for(int grade:  grades){
            if (searchedGrade == grade){
                Scanner sc = new Scanner(System.in);
                System.out.println("You searched for " + searchedGrade + " and it will be deleted");
                grades.remove(grade);
            }
        }
        return grades;
    }
    public AbstractList<Integer> addGrade(int x){
        grades.add(x);
        return grades;
    }
}
