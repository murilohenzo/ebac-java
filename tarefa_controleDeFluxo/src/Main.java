public class Main {
    public static void main(String[] args) {
        Student student = new Student(5.5 , 10.0, 7.3, 5.0);
        System.out.println("aluno 1" + student);
        System.out.println("mean = " + student.mean());
        System.out.println("O aluno esta " + student.verifyMean());

        Student student1 = new Student(9.5 , 10.0, 7.3, 5.0);
        System.out.println("aluno 2" + student1);
        System.out.println("mean = " + student1.mean());
        System.out.println("O aluno esta " + student1.verifyMean());

        Student student2 = new Student(5.5 , 4.0, 3.3, 5.0);
        System.out.println("aluno 3" + student2);
        System.out.println("mean = " + student2.mean());
        System.out.println("O aluno esta " + student2.verifyMean());
    }
}