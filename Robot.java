package ru.ah;

public class Robot implements Compit{
    private int maxRun;
    private int maxJump;

    public Robot(int maxRun, int maxJump) {

        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    public Robot(){this(20, 20);};


    @Override
    public boolean run(int dist){
        if (dist<=maxRun){
            System.out.println("Robot probeshall" + dist);
            return true;
        }
        else{
            System.out.println("Robot not run");
            return false;
        }
    }


    @Override
    public boolean jump(int dist){
        if (dist<=maxJump){
            System.out.println("Robot prignull " + dist);
            return true;
        }
        else{
            System.out.println("Robot not prignull " + dist);
            return false;
        }
    }
}
