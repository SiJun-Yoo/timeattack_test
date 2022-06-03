public class NatGateWay implements GateWay{
    private Integer id;
    private Subnet subnet;

    public NatGateWay(Subnet subnet) {
        this.subnet = subnet;
    }

    @Override
    public void send(String msg) {
        System.out.println("NatGateWay : " + msg);
    }
}
