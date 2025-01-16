package classes.week6;

public class Clock {
    public int minutes;
    public int hours;

    public void tick() {
        minutes++;
        hours+= minutes/60;
        minutes%=60;
        hours%=24;
    }

    public void Show() {
        if (hours < 10) {
            System.out.print("0");
        }
        System.out.print(hours + ":");
        if (minutes < 10) {
            System.out.print("0");
        }
        System.out.print(minutes);
    }

    public static void main(String[] args) {
        Clock c1 = new Clock();
        c1.hours = 10;
        c1.minutes =8;
        System.out.print("the time is: ");
        c1.Show();
        System.out.println();
    }

}
