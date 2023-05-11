package week4day4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student {
    //스튜던트 클래스 - 필드 만들기
    private String code;
    private int testId;
    private String name;

    //cmd n ; constructor - 생성자만들기 -> 왜?
    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    //cmd n ; getter생성 -> getter 왜 필요할까?
    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}

public class CodeUp3108 {
    //리스트 생성하기 및 초기화 -> 왜 private으로 했을까?
    private List<Student> students = new ArrayList<>();

    //makeAStudent메소드 생성 입력 받은 값을 순서에 맞게 받는 메소드?
    public Student makeAStudent(String code, int testID, String name) {
        //왜 new?
        return new Student(code, testID, name);
    }

    //중복여부 체크 메소드
    private boolean isExist(Student pStudent) {
        for (Student student : students) {
            if (pStudent.getTestId() == student.getTestId()) {
                return true;
            }
        }
        return false;
    }

    private Student getExistStudent(Student pStudent) {
        return new Student("", 0, "");
    }

    private void deleteStudent(Student pStudent) {
        //pStudent가 students에 몇 번째에 있는지 알아야함
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getTestId() == pStudent.getTestId()) {
                students.remove(i);
            }

        }
    }

    public void process(String line) {
        String[] splitted = line.split(" ");
        Student student = makeAStudent(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);
        switch (student.getCode()) {
            case "I" -> addAStudent(student);
            case "D" -> deleteStudent(student);
        }
    }

    private void addAStudent(Student student) {
        if (!isExist(student)) {
            students.add(student);
        }
    }

    private void printStudents() {
        for (Student student : students) {
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }

    private void printSpecificStudents(int[] arr) {
        //정렬
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTestId() - o2.getTestId();
            }
        });
        //출력
        for (int i = 0; i < arr.length; i++) {
            Student student = students.get(arr[i] - 1);
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }

    public static void main(String[] args) {
        int size = 1;

        CodeUp3108 codeup3108 = new CodeUp3108();
        codeup3108.process("I 1011 한라산");
        codeup3108.process("I 999 백두산");
        codeup3108.process("I 999 오대산");
        codeup3108.process("D 999 백두산");
        codeup3108.process("I 800 백두산");
        codeup3108.process("D 500 한라산");
        codeup3108.process("I 900 남산");
        codeup3108.process("I 950 금강산");
        codeup3108.process("I 1205 지리산");
        codeup3108.process("I 700 북한산");
        codeup3108.printSpecificStudents(new int[]{1, 2, 4, 5, 6});

    }
}



    /*



    public static void main(String[] args) {
        //필드생성
        String c;
        int no;
        String name;
        //n개 입력받기 int n = 10으로 먼저 설정해보자
        int n = 10;
        //처리코드(c), 수험번호(no), 이름(name) 입력받음
        //Scanner nextLine, bufferedWriter, method생성(파라메터: c, no, name) 중 뭘 써야할까?
        //항상 메소드를 사용해
        //public void studentInfo(c, no, name) {
        }

        String c = "I";
        int no = 900;
        String name = "한라산" ;
        //여러 입력값을 split으로 나누기

        //listOfTeacher 만들어서 입력값 리스트로

        //리스트 생성(정리해서 담을 리스트)

        //리스트1 루프1 -> no이 기존 리스트에 있는가? 있으면 continue, 없으면 다른 결과 리스트에 추가
        //c == I, no에 따라 삽입
        //조건: I == I, continue;


        //리스트2 루프
        //c == D, no찾아 삭제
        //c == D && no없는 경우, 아무작업 하지 않음(continue)

        //마지막으로 n + 2번째 줄에 올바른 데이터의 위치를 나타내는 정수 5개가 입력된다.
        //sout list[0, 5]

    }


     */