import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadVeryImportantData() throws InterruptedException {
        this.importantData = "Very very important data";

        domains.add("www.learnwithvinod.com");
        domains.add("www.learnwithmukesh.com");
        domains.add("www.learnwithashok.com");

        Thread.sleep(5000);
        // it will take 5 minutes to load
    }

    @Override
    public String toString() {
        return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + " : " + this.domains + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // logic for cloning deep copy

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImportantData(this.getImportantData());

        for (String d : this.getDomains()) {
            networkConnection.getDomains().add(d);
        }

        return networkConnection;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

}
