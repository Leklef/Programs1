package HomeWork.Task048;

/**
 * Created by lenar on 30.11.2015.
 */
public class Teacher {
    String fio, subject, fios;
    public void setTeacher(String fio, String subject, String fios) {
        this.fio = fio;
        this.subject = subject;
        this.fios = fios;
    }
    public String getTeacher(){
        int mark = (int)(Math.random()*5+2);
        String marks;
        switch (mark){
            case 2: marks = "Unsatisfactory";
                break;
            case 3: marks = "Satisfactory";
                break;
            case 4: marks = "Good";
                break;
            default: marks = "Exelent";
                break;
        }
        String result = fio+" "+subject+" "+fios+" "+marks;
        return result;
    }
}
