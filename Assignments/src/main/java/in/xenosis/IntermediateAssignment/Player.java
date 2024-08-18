package in.xenosis.IntermediateAssignment;

public class Player {
    String name;
    String timing;
    int shotRange;
    int accuracy;
    double speed;

    Player(){}
    Player(String name,String timing,int shotRange){
        this.timing=timing;
        this.name=name;
        this.shotRange=shotRange;
    }
    Player(String name,int accuracy,double speed){
        this.speed=speed;
        this.name=name;
        this.accuracy=accuracy;
    }
    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getShotRange() {
        return shotRange;
    }

    public void setShotRange(int shotRange) {
        this.shotRange = shotRange;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
