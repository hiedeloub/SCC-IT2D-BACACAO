package bacacao;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    private final List<Grade> grades;

    public Grades() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public double getAverage() {
        return grades.stream().mapToInt(Grade::getScore).average().orElse(0.0);
    }
}