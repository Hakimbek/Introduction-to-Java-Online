package simpleClassesAndObjects.task3;
import java.util.Arrays;

/**
 * Создайте класс именем Student, содержащий поля: фамилия и инициалы, номер группы,
 * успеваемость(массив из пяти элементов). Создайте массив из десяти элементов такого типа.
 * Добавьте возможность вывода фамилий и номера групп студентов, имеющих отценки, равные тольео 9 или 10.
 */
public class Student {
    // Initials of student name
    private String initials;

    // Student surname
    private String surname;

    // Group number of student
    private int group;

    // Marks of student
    private int[] academicPerformance;

    // Constructors
    public Student(String surname, String initials, int group, int[] academicPerformance) {
        if (academicPerformance.length == 5) {
            this.surname = surname;
            this.initials = initials;
            this.group = group;
            this.academicPerformance = academicPerformance;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public Student() {}

    // Getters and Setters
    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getAcademicPerformance() {
        return Arrays.toString(academicPerformance);
    }

    public void setAcademicPerformance(int[] academicPerformance) {
        if (academicPerformance.length == 5) {
            this.academicPerformance = academicPerformance;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    // Find students with marks [9, 10] and print it
    public static void printGiftedStudents(Student[] students) {
        System.out.printf("%15s %7s %23s", "Full name", "Group", "Marks");
        System.out.printf("\n%15s %7s %23s", "---------", "-----", "---------------------");

        for (Student student : students) {
            boolean isGifted = true;
            for (int mark : student.academicPerformance) {
                if (mark < 9) {
                    isGifted = false;
                    break;
                }
            }

            if (isGifted) {
                System.out.printf("\n%15s %7s %23s", student.getSurname() + " " + student.getInitials(), student.getGroup(), student.getAcademicPerformance());
            }
        }
    }
}
