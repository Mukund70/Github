package Searching;

import java.util.Arrays;

class Student {
    int rollNum;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int rollNum, String name) {
        this.rollNum = rollNum;
        this.name = name;

    }

}

class Searcher {
    public <student> int search(student[] students, student key) {
        for (int index = 0; index < students.length; index++) {
            if (students[index].equals(key)) {
                return index;
            }
        }
        return -1;
    }
}

class Main {
    public static void main(String[] args) {

        Searcher searcher = new Searcher();

//        har ek string value ke liye ek naya object banana padega

//        search krte samay variable ko search krenege array ke andar

        Student student1 = new Student(2, "krishna garg");
        Student student3 = new Student(3, "Nikhil gupta");
        Student student4 = new Student(4, "Ayushi");
        Student student2 = new Student(1, "Mukund bansal");
        Student student5 = new Student(5, "mam");
        Student[] studentArray = new Student[]{

                student3, student1, student4, student5, student2
        };
        System.out.println("Arrays.toString(student2) = " + Arrays.toString(studentArray));

        int search = searcher.search(studentArray, student3);
        System.out.println("search = " + search);

    }
}