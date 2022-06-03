public class InternetGateWay implements GateWay{
    private Integer id;

    @Override
    public void send(String msg) {
        System.out.println("InternetGateWay : " + msg);
    }
}
