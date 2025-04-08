import java.util.Scanner; 

class Student {
    String name;
    int regno;

    void getdata(String sname, int rno) {
        name = sname;
        regno = rno;
    }

    void putdata() {
        System.out.println("NAME:" + name);
        System.out.println("REGNO:" + regno);
    }
}

class Mark extends Student {
    int m1, m2, m3;

    void getmarks(int mark1, int mark2, int mark3) {
        m1 = mark1;
        m2 = mark2;
        m3 = mark3;
    }

    void putmarks() {
        System.out.println("MARK1:" + m1);
        System.out.println("MARK2:" + m2);
        System.out.println("MARK3:" + m3);
    }
}

interface PracticalMark {
    int PRACTICAL_MARK = 60;
}

class Result extends Mark implements PracticalMark {
    int total;

    void display() {
        putdata();
        putmarks();
        System.out.println("PRACTICAL MARK:" + PRACTICAL_MARK);
        total = m1 + m2 + m3 + PRACTICAL_MARK;
        System.out.println("TOTAL :" + total);
        if ((m1 > 40) && (m2 > 40) && (m3 > 40) && (PRACTICAL_MARK > 40)) {
            System.out.println("THE STUDENT IS PASS");
        } else {
            System.out.println("THE STUDENT IS FAIL");
        }
    }
}

public class List2 { 
    public static void main(String[] args) {
        Result st = new Result();
        st.getdata("M.SENTHILKUMAR", 1001);
        st.getmarks(98, 99, 100);
        st.display();
    }
}

