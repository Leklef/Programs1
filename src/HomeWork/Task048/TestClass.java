package HomeWork.Task048;

import java.util.Scanner;

/**
 * Created by lenar on 04.12.2015.
 */
public class TestClass {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("FIO of the teacher ");
        String fio = in.next();
        System.out.print("FIO of the student ");
        String fios = in.next();
        System.out.print("Subject ");
        String subject = in.next();
        Teacher t = new Teacher();
        t.setTeacher(fio, subject, fios);
        System.out.print(t.getTeacher());
    }
}
