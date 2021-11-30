package week4.myExam;

import java.io.IOException;
import java.sql.SQLDataException;
import java.sql.SQLException;

class Mypoint3 extends Object{
    int x;
    int y;

    public void parentMethod() throws IOException, SQLException {

    }

    @Override
    public String toString() {
        return "Mypoint3{" +
                "dfdfdfx=" + x +
                ", y=" + y +
                '}';
    }
}
public class OverrideTest extends Mypoint3{
    public static void main(String[] args) {
        Mypoint3 p = new Mypoint3();
        p.x = 3;
        p.y = 5;
        System.out.println(p);
        System.out.println(p.toString());

    }
    //'parentMethod()' in 'week4.myExam.OverrideTest' clashes with 'parentMethod()' in 'week4.myExam.Mypoint3';
    // attempting to assign weaker access privileges ('private'); was 'public'


    //
    @Override
    public void parentMethod() throws IOException, SQLException, NullPointerException {
        super.parentMethod();
    }
}
