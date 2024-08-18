package in.xenosis.IntermediateAssignment;

public class PlayerApp {
    public static void main(String[] args) {
        Player virat = new Player("Virat","Excellent",60);
        System.out.println(virat.getName()+"..."+virat.getTiming()+"..."+virat.getShotRange());
        virat.setName("Cheekuuu");

        Player boomBoom = new Player("BoomBoom", 100, 145.0);
        System.out.println(boomBoom.getName()+"..."+boomBoom.getAccuracy()+"..."+boomBoom.getSpeed());

        Player suiiiraj = new Player("Suiiiraj", 100, 141);
        System.out.println(suiiiraj.getName()+"..."+suiiiraj.getAccuracy()+"..."+suiiiraj.getSpeed());
        suiiiraj.setName("Miyaan");
        suiiiraj.setAccuracy(60);
        System.out.println(suiiiraj.getName()+"..."+suiiiraj.getAccuracy()+"..."+suiiiraj.getSpeed());

        Player rohit=new Player();
        rohit.setName("Hitman");
        rohit.setTiming("Excellent");
        rohit.setShotRange(100);
        System.out.println(rohit.getName()+"..."+rohit.getTiming()+"..."+rohit.getShotRange());

    }
}
