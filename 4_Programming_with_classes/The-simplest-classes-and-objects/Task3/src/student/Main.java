package student;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Doe","J",10,new int[] {5,4,6,2,8}),
                new Student("Cristiano","R",10,new int[] {7,7,7,7,7}),
                new Student("Robert","D",5,new int[] {10,9,10,10,10}),
                new Student("Jenifer","E",1,new int[] {9,9,9,9,9}),
                new Student("James","G",5,new int[] {10,10,10,10,10}),
                new Student("Patrik","N",3,new int[] {9,10,9,10,9}),
                new Student("James","Sh",7,new int[] {6,8,8,4,8}),
                new Student("Lev","T",8,new int[] {10,10,10,10,10}),
                new Student("Jonatan","S",10,new int[] {9,9,10,9, 10}),
                new Student("Daniel","D",6,new int[] {1,2,3,4,5})
        };

        Student.printGiftedStudents(students);
    }
}
