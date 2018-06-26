package models;

/**
 * Created by student on 26.06.2018.
 */
public class Auto extends AutoAbs {
    //Zminni
    String str = "Stroka";
    char ch = 'c';
    byte by = 123;
    int i = 33333333;
    short sh = 333;
    long l = 222222222222222222l;
    boolean check = true;
    float f1  = 1.1f;
    double d1 = 1.1;

    @Override
    public void driveForward(int transmissionNumber) {
        System.out.println("Number transmission is:" + transmissionNumber);

    }
}