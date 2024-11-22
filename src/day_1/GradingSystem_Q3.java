package day_1;

public class GradingSystem_Q3 {
    public String GradingSystem(int marks)
    {
        String grade;
        if(marks > 90 )
        {
            grade="Excellent";
        } else if (marks >80 && marks<=90) {
            grade="good";
        } else if (marks>70 && marks<=80) {
            grade="fair";
        }
        else if (marks>60 && marks<=70)
        {
            grade="Meet expectation";
        }
        else
        {
            grade="Below per";
        }
        return grade;
    }
    public static void main(String[] args) {
        GradingSystem_Q3 obj=new GradingSystem_Q3();
        System.out.println(obj.GradingSystem(73));
    }
}
