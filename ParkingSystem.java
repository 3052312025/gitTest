package gitTest;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ParkingSystem implements IParking,IParams{
    int a;
    int b;
    int c;
    String [] a1 = new String[100];

    @Override
    public void print( String a[]) {
        System.out.print("[");
        for(int x=3;x<a.length;x++) {
            if(a[x]!=null) {
                int y=Integer.parseInt(a[x]);
                System.out.print(addCar(y));
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    @Override
    public boolean addCar(int carType) {
        if(carType==1) {
            a--;
            return a>=0;
        }else if(carType==2) {
            b--;
            return b>=0;
        }else if(carType==3) {
            c--;
            return c>=0;
        }
        return false;
    }

    @Override
    public String[] parse(String s) {
        StringTokenizer fenxi = new StringTokenizer(s,"[],");
        int i=0;
        while(fenxi.hasMoreElements()) {
            a1[i]=fenxi.nextToken();
            i++;

        }
        return a1;
    }

    @Override
    public int getBig() {
        return a;
    }

    @Override
    public int getMedium() {
        return b;
    }

    @Override
    public int getSmall() {
        return c;
    }
    public ParkingSystem(int big, int medium, int small){
        a=big;
        b=medium;
        c=small;
    }
    public ParkingSystem() {

    }

    public static void main (String args[]) {
        Scanner ni = new Scanner(System.in);
        String s = ni.next();//[[1,1,0],[1],[2],[3],[1]]
        ParkingSystem a = new ParkingSystem();
        String aa[] = a.parse(s);
        int a1=Integer.parseInt(aa[0]);
        int a2=Integer.parseInt(aa[1]);
        int a3=Integer.parseInt(aa[2]);
        ParkingSystem b = new ParkingSystem(a1,a2,a3);
        b.print(aa);

    }
}
