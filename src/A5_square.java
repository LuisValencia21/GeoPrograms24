public class A5_square extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.pausetime = 2;
        plane.setColor(200, 100, 50);
        plane.startingAngle(90);
        square();

    }


    public void square() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(200);
        plane.turn(90);
        plane.move(111);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(50);
        plane.turn(270);
        plane.move(150);
        plane.turn(90);
        plane.move(65);
        plane.turn(60);

    }

}


