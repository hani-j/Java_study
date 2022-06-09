package week6.subject8.calculation.evaluation;

public class PassFailEvaluation implements GradeEvaluation{
    @Override
    public String getGrade(int point) {
        if (point >= 70)
            return "P";
        else
            return "F";
    }
}
