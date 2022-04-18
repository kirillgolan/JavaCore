package Lesson9;

/* реализация объектов данных */
class CourseClass implements Course {
    String title; // название

    public CourseClass(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
