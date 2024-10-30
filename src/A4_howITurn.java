public class A4_howITurn extends World {

    public void go() {
        Star();
        Square();

    }

    public void Star() {
        System.out.println("Star");
        plane.startingAngle(300);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(100);
        plane.turn(250);
        plane.setColor(100, 150, 200);
        plane.move(100);
        plane.turn(20);
        plane.setColor(200, 100, 50);
        plane.move(100);
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(100, 150, 0);
        plane.move(100);
        plane.turn(300);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(380);
        plane.setColor(200, 60, 100);
        plane.move(100);
        plane.turn(252);
        plane.setColor(50, 100, 200);
        plane.move(95);
        plane.turn(37);
        plane.setColor(100, 50, 200);
        plane.move(100);
        plane.setColor(0, 0, 100);
        plane.turn(290);
        plane.setColor(0, 0, 100);
        plane.move(100);
        plane.turn(303);
        plane.setColor(100, 0, 100);
        plane.move(100);
    }

    public void Square() {
        plane.setColor(100, 100, 100);
        plane.turn(150);
        plane.isTrail = false;
        plane.move(150);
        plane.isTrail = true;
        plane.turn(87);
        plane.move(300);
        plane.turn(90);
        plane.move(420);
        plane.turn(90);
        plane.move(420);
        plane.turn(90);
        plane.move(420);
        plane.turn(90);
        plane.move(110);

    }
}







