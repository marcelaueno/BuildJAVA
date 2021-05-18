package school.management.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int id;
        int salary;
        int grade;
        int feesPaid;

        String role;

        Integer numberOdTeachers;
        boolean continuar = true;

        Teacher teacher;
        List<Teacher> teacherList = new ArrayList<>();

        while (continuar) {

            try {
                System.out.print("\nIngrese numero de profesores que desea registrar: ");
                numberOdTeachers = scanner.nextInt();

                if (numberOdTeachers.toString().matches("[0-9]*")) {

                    /*loop*/
                    for (int i = 0; i < numberOdTeachers; i++) {
                        System.out.print("Nombre: ");
                        name = scanner.next();

                        System.out.print("Id: ");
                        id = scanner.nextInt();

                        System.out.print("Salario: ");
                        salary = scanner.nextInt();

                            /*Imprimo formulario*/
                            System.out.println();

                        teacher = new Teacher(id, name, salary);
                        teacherList.add(teacher);
                    }
                    continuar = false;
                }
            } catch (InputMismatchException error) {
                System.out.println("\nUps!\ndebes ingresar un numero");
                scanner.nextLine();
                }
        }
        /*System.out.println(teacherList.get(0).toString());*/
        System.out.println(teacherList.toString());

        String studentName;
        int studentId;
        int numberOdStudents;

        Student student;
        List<Student> studentList = new ArrayList<>();

        continuar = true;

        while (continuar) {
            try {
                System.out.print("\nIngrese numero de alumnos que desea registrar: ");
                numberOdStudents = scanner.nextInt();

                for (int i = 0; i < numberOdStudents; i++) {
                    System.out.print("Nombre: ");
                    studentName = scanner.next();

                    System.out.print("Id: ");
                    studentId = scanner.nextInt();

                    System.out.print("Nivel: ");
                    grade = scanner.nextInt();

                    System.out.print("Cuota: ");
                    feesPaid = scanner.nextInt();

                    /*Imprimo formulario*/
                    System.out.println();

                    student = new Student(studentId, studentName, grade, feesPaid);
                    studentList.add(student);
                }
                continuar = false;
            } catch (InputMismatchException error) {
                System.out.println("\nUps!\ndebes ingresar un numero");
                scanner.nextLine(); /*esto es para qeu scanner borre el primer ingreso*/
            }
        }
        System.out.println(studentList.toString());



        School ghs = new School(teacherList, studentList);

        for (int i = 0; i < studentList.size(); i++) {
        studentList.get(i).payFees(0);
        }

        System.out.println("\nGHS gano $: " + ghs.getTotalMoneyEarned());


        for (int i = 0; i < teacherList.size(); i++) {
        System.out.println("\n------Making GHS PAY SALARY-------");
        teacherList.get(i).receiveSalary(teacherList.get(i).getSalary());
        System.out.println("GHS ha gastado en sueldo de " + teacherList.get(i).getName()
                + " y ahora tiene " + ghs.getTotalMoneyEarned());
        }
    }
}


        /* ------------------------ codigo con if --------------
            Scanner scanner = new Scanner(System.in);

            String name;
            int id;
            int salary;


            Teacher teacher;
            List<Teacher> teacherList = new ArrayList<>();
            int grade;
            int feesPaid;

            Student student;
            List<Student> studentList = new ArrayList<>();

            String tipoUsuario;
            String role;

            System.out.print("\nTipo usuario (profesor/alumno): ");
            role = scanner.next();

            if(role.equals("profesor") ) {

                /*loop
                for (int i = 0; i < 2; i++) {
        System.out.print("Nombre: ");
        name = scanner.next();

        System.out.print("Id: ");
        id = scanner.nextInt();

        System.out.print("Salario: ");
        salary = scanner.nextInt();

        /*Imprimo formulario
        System.out.println();

        teacher = new Teacher(id, name, salary);
        teacherList.add(teacher);
        }

        System.out.println(teacherList.toString());

        } else if (role.equals("alumno")) {
        for (int i = 0; i < 2; i++) {
        System.out.print("Nombre: ");
        name = scanner.next();

        System.out.print("Id: ");
        id = scanner.nextInt();

        System.out.print("Nivel: ");
        grade = scanner.nextInt();

        System.out.print("Cuota: ");
        feesPaid = scanner.nextInt();

        System.out.println();

        student = new Student(id, name, grade, feesPaid);
        studentList.add(student);
        }
        System.out.println(studentList.toString());
        } else
        System.out.println("\nIntenta nuevamente...");
        System.out.print("\nTipo usuario (profesor/alumno): ");
        role = scanner.next();
         */


        /* ------------------------ codigo base --------------
        Teacher lizzy = new Teacher(1, "Lizzy",500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher juan = new Teacher(3, "Juan", 600);

        List<Teacher> teacherList = new ArrayList<>();


        Student tamara = new Student(1,"Tamara",4);
        Student rak = new Student(2,"Rak",12);
        Student rabbi = new Student(3,"Rabbi", 9);

        List<Student>studentList = new ArrayList<>();

        studentList.add(tamara);
        studentList.add(rak);
        studentList.add(rabbi);


        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan",900);

        ghs.addTeacher(megan);

        tamara.payFees(5000);
        rak.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("--------Making SCHOOL PAY SALARY----------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to "+ lizzy.getName() +" and now" +
                "has $" + ghs.getTotalMoneyEarned());

        juan.receiveSalary(juan.getSalary());
        System.out.println("GHS has spent for salary to "+ juan.getName() +" and now" +
                "has $" + ghs.getTotalMoneyEarned());

        System.out.println(rak);

        mellisa.receiveSalary(mellisa.getSalary());

        System.out.println(mellisa);*/

