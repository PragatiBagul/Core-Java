//Given three corner points of a triangle, and one more point P. Write a function to check whether P lies within the triangle or not.
import java.io.*;
class PointsInATriangle
{
    private static double area(float x1,float x2,float x3,float y1,float y2,float y3)
    {
        return (x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0;
    }
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the co-ordinates of the triangle : ");
        float Ax,Ay,Bx,By,Cx,Cy,Px,Py;
        System.out.println("Enter the co-ordinates of A : ");
        Ax=Float.parseFloat(br.readLine());
        Ay=Float.parseFloat(br.readLine());
        System.out.println("Enter the co-ordinates of B : ");
        Bx=Float.parseFloat(br.readLine());
        By=Float.parseFloat(br.readLine());
        System.out.println("Enter the co-ordinates of C : ");
        Cx=Float.parseFloat(br.readLine());
        Cy=Float.parseFloat(br.readLine());
        System.out.println("Enter the co-ordinates of the point : ");
        Px=Float.parseFloat(br.readLine());
        Py=Float.parseFloat(br.readLine());

        double A1,A2,A3,A;
        A=area(Ax,Bx,Cx,Ay,By,Cy);
        A1=area(Ax,Bx,Px,Ay,By,Py);
        A2=area(Ax,Px,Cx,Ay,Py,Cy);
        A3=area(Px,Bx,Cx,Py,By,Cy);
        if(A==(A1+A2+A3))
        {
            System.out.println("The point does lie in the triangle");
        }
        else
        {
            System.out.println("The point doesn't lie in the triangle");
        }
    }
}