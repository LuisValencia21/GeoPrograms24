public class B1_MoreLoop extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 3;

        for (int x = 0; x < 5; x = x + 1) {
            int size = plane.random(170, 10);
            plane.teleport(x * 200, 100);
            square(size);
        }
        for (int x = 0; x < 5; x = x + 1) {
            int size = plane.random(170, 10);
            plane.teleport(x * 200, 500);
            triangle(size);
        }

    }

    public void square(int size) {
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
    }

    public void triangle(int size) {
        plane.move(size);
        plane.turn(120);
        plane.move(size);
        plane.turn(120);
        plane.move(size);
        plane.turn(120);
        }
    }


