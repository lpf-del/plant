package plants.pojo;

public class Species {
    private int sid;
    private String sname;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Species(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public Species() {

    }

    @Override
    public String toString() {
        return "Species{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }
}
