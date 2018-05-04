import robocode.Robot;



public class MonkaS extends Robot {

    @Override
    public void run() {
        while (true){
            ahead(100);
            turnRight(90);
            turnLeft(90);
            fire(11);
        }
    }
}
