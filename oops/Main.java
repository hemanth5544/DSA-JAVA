public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];// datatype|  local variable| newoperater(i.e., to create new data entry ) | data size

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        Student[] students = new Student[5];
        Student kunal = new Student(15, "Kunal Kushwaha", 85.4f);
        Student rahul = new Student(18, "Rahul Rana", 90.3f);
//created a class to the dara types of num,names,marks
class Student {
    int rno;
    String name;
    float marks = 90;
}
    }
}