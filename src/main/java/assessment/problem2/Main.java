package assessment.problem2;

import java.util.Arrays;
import java.util.List;

class SubjectService {
    private List<String> subjects;

    public SubjectService(List<String> subjects) {
        this.subjects = subjects;
    }

    public void showSubjects() {
        int[] length = new int[3];
        for (int i = 0; i < length.length; i++){
            System.out.println(subjects.get(i));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> subjects = Arrays.asList("C", "Java", "python");
        SubjectService subjectService = new SubjectService(subjects);
        subjectService.showSubjects();
    }
}
