import java.util.ArrayList;
import java.util.List;

public class RouteTable {
    private Integer id;
    private GateWay gateWay;
    private List<Subnet> subnetList = new ArrayList<>();

    public void setGateWay(GateWay gateWay) {
        this.gateWay = gateWay;
    }

    public GateWay getGateWay() {
        return gateWay;
    }

    public void addSubnet(Subnet subnet) {
        this.subnetList.add(subnet);
        route(subnet);
    }
    public void route(Subnet subnet){
        subnet.setRouteTable(this);
    }
}
