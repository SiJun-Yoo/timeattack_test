public class Subnet {
    private Integer id;
    private String ip;
    private String region;
    private RouteTable routeTable;

    public Subnet(Integer id, String ip, String region) {
        this.id = id;
        this.ip = ip;
        this.region = region;
    }

    public void setRouteTable(RouteTable routeTable) {
        this.routeTable = routeTable;
    }

    public void transfer(String msg){
        routeTable.getGateWay().send(msg);
    }
}
