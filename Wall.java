package ru.ah;

public class Wall implements Stop{
    private int up;
    public Wall(int up) {

        this.up = up;
    }
    @Override
    public boolean goGo(Compit i) {
        return i.jump(up);
    }
}
