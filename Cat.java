package ru.ah;

public class Cat implements Compit{
    private int maxRun;
    private int maxJump;


    public Cat(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    public Cat() {this(10, 10);}
    @Override
    public boolean run(int dist){
        if (dist<=maxRun){
            System.out.println("Cat probeshall" + dist);
            return true;
        }
        else{
            System.out.println("Cat not run");
            return false;
        }
    }

    @Override
    public boolean jump(int dist){
        if (dist<=maxJump){
            System.out.println("Cat prignull " + dist);
            return true;
        }
        else{
            System.out.println("Cat not prignull " + dist);
            return false;
        }
    }

}