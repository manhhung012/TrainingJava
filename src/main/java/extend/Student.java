package extend;

public class Student extends Person implements Action {
    @Override
    public String study(int brain, int mana, int hp, boolean getUp) {
        if (getUp && hp >= 80 && mana >= 50) {
            car = true;
            status = "Go to";
            brain = 100;
            hp = hp - 20;
            mana = mana - 30;
            return status;
        } else if (getUp) {
            eat();
            status = "Eating";
            return status;
        } else {
            status = "Offline";
            return status;
        }
    }

    @Override
    public void eat() {
        hp = hp + 20;
        mana = mana + 20;
    }


    @Override
    boolean getUp(boolean eye) {
        if (eye && brain >= 20) return true;
        else return false;
    }

    @Override
    public String run() {
        if(mana>=30&&hp>=30){
            status = "Runing";
            mana = mana - 30;
            hp = hp - 20;
        } else status = "Stop";

        return status;
    }
}

