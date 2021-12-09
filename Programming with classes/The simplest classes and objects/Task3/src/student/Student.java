package student;

import java.util.Arrays;

/**
 * Создайте класс именем Student, содержащий поля: фамилия и инициалы, номер группы,
 * успеваемость(массив из пяти элементов). Создайте массив из десяти элементов такого типа.
 * Добавьте возможность вывода фамилий и номера групп студентов, имеющих отценки, равные только 9 или 10.
 */
public class Student {
    // Инициалы студента
    private String initials;

    // Фамилия студента
    private String surname;

    // Номер группы
    private int group;

    // Успеваемость
    private int[] academicPerformance = new int[5];

    // Конструктор с входными параметрами
    public Student(String surname, String initials, int group, int[] academicPerformance) {
        this.surname = surname;
        this.initials = initials;
        this.group = group;
        if (academicPerformance.length != 5) {
            System.arraycopy(academicPerformance, 0, this.academicPerformance, 0, academicPerformance.length);
        } else {
            this.academicPerformance = academicPerformance;
        }
    }

    // Default конструктор
    public Student() {
        this("Null", "N", 0, new int[] {0, 0, 0, 0, 0});
    }

    // Методы get- и set-
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
            System.arraycopy(academicPerformance, 0, this.academicPerformance, 0, academicPerformance.length);
        }
    }

    // Метотд, который выводит студентов имеющих отценки равные только 9 или 10
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
