package in.climber.www.councellingguid;

import java.util.List;

public class College {
    public String clgname;
    public String bch;
    public String cat;
    public String rank;
    College(getvalue getvalue, List<College> clgList)
    {

    }

    public College(String clgname,String bch,String cat,String rank) {
        this.clgname = clgname;
        this.bch = bch;
        this.cat = cat;
        this.rank=rank;
    }

    public String getClgname() {
        return clgname;
    }

    public String getBch() {
        return bch;
    }

    public String getCat() {
        return cat;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "College{" +
                "clgname='" + clgname + '\'' +
                ", bch='" + bch + '\'' +
                ", cat='" + cat + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
