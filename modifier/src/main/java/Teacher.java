public class Teacher {
  private final String name;
  private Student student;

  public Teacher(String name, Student student) {
    this.name = name;
    this.student = student;
  }

  @Override
  public String toString() {
    return String.format("name: %s, Student: %s", name, student);
  }

  // 输入正数，学生加分，输入负数，学生减分
  public void changeScore(int number) {
    student.score = student.score + number;
  }
}
