package com.study.test.B;

import com.study.ch16.ArrayService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> subjects = Arrays.asList(new String[]{"C", "Java", "Python"});
        SubjectService subjectService = new SubjectService(subjects);
        subjectService.showSubjects();
    }
}
