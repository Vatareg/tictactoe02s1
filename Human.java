package ru.ah;

public class Human implements Compit{
    private int maxRun;
    private int maxJump;

    public Human(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;

    }
    public Human(){this(20, 20);};

    @Override
    public boolean run(int dist){
        if (dist<=maxRun){
            System.out.println("Human probeshall" + dist);
            return true;
        }
        else{
            System.out.println("Human not run");
            return false;
        }
    }


    @Override
    public boolean jump(int dist){
        if (dist<=maxJump){
            System.out.println("Human prignull " + dist);
            return true;
        }
        else{
            System.out.println("Human not prignull " + dist);
            return false;
        }
    }
}
