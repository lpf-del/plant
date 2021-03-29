package plants.pojo;

public class Relationship {
    private int rid;
    private String rult;
    private String Result;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRult() {
        return rult;
    }

    public void setRult(String rult) {
        this.rult = rult;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    public Relationship(int rid, String rult, String result) {
        this.rid = rid;
        this.rult = rult;
        Result = result;
    }

    public Relationship() {
    }

    @Override
    public String toString() {
        return "Relationship{" +
                "rid=" + rid +
                ", rult='" + rult + '\'' +
                ", Result='" + Result + '\'' +
                '}';
    }
}
