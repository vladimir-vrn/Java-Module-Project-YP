
public class Race {

    String leader;
    int distance;

    Race(String leader, int distance) {
        this.leader = leader;
        this.distance = distance;
    }
    Race() {
        this("", 0);
    }

    void findLeader(Car car) {
        int carDistance = 24 * car.speed;
        if (carDistance > this.distance) {
            this.distance = carDistance;
            this.leader = car.name;
        }
    }
}
