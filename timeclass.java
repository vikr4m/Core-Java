import java.util.Scanner;
class time{
    int hour,minute;
    Scanner sc = new Scanner(System.in);
    
    void getdata(){
        do{
        System.out.print("Enter hours: ");
        hour = sc.nextInt();
        System.out.print("Enter minute: ");
        minute = sc.nextInt();
        }while(minute>=60);
    }

    time addtime(time t2){
        time t3= new time();
        t3.hour = hour + t2.hour;
        t3.minute = minute + t2.minute;
        if(t3.minute >=60){
            t3.hour++;
            t3.minute -=60;
        }
        return t3;
    }

    void disp(){
        System.out.println("Total Time = "+hour+"h and "+minute+"m");
    }
}

class timeclass {
    public static void main(String args[]){
        time t1 = new time();
        time t2 = new time();
        time t3 = new time();

        t1.getdata();
        t2.getdata();
        t3 = t1.addtime(t2);
        t3.disp();
    }    
}
