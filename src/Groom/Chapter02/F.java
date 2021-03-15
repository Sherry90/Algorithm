package Groom.Chapter02;

import java.io.*;
import java.lang.*;
import java.util.*;

public class F {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n = scanner.nextInt();
        Point2D[] points = new Point2D[n];

        for(int i = 0 ; i < n ; i++)
        {
            int x=  scanner.nextInt();
            int y=  scanner.nextInt();
            points[i] = new Point2D(x, y);
        }

        int min_sqd = Integer.MAX_VALUE;
        int min_cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {


            }
        }


    }
}

class Point2D{
    int x;
    int y;
    public Point2D(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * 2차원 평면 상에서 점 this부터 점 target까지 거리의 제곱을 계산하는 함수
     * @param target
     * @return
     */
    public int getSquaredDistanceTo(Point2D target)
    {
        int dx = Math.abs(target.x - this.x);
        int dy = Math.abs(target.y - this.y);
        return dx * dx + dy * dy;
    }

    public double getDistanceTo(Point2D target)
    {
        double sqd = (double) this.getSquaredDistanceTo(target);
        return Math.sqrt(sqd);
    }

}
