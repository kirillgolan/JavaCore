package Lesson9;

import java.util.ArrayList;
import java.util.List;

class StudentClass implements Student {
    private String name;
    private List<Course> courses;

    public StudentClass(String name, String courses) {
        this.name = name;
        this.courses = new ArrayList<Course>();
        for (String i : courses.split(", ")) {
            this.courses.add(new CourseClass(i));
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<Course> getAllCourses() {
        return this.courses;
    }

    @Override
    public String toString() {
        return "Студент \'" + name + '\'' + ", записан на курсы = " + courses;
    }
}
