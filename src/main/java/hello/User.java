package hello;

import javax.persistence.*;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String inclusion;

    private String mettle;

    private String pioneering;

    private String accountability;

    private String collaboration;

    private String trust;

    public String getInclusion() {
        return inclusion;
    }

    public void setInclusion(String inclusion) {
        this.inclusion = inclusion;
    }

    public String getMettle() {
        return mettle;
    }

    public void setMettle(String mettle) {
        this.mettle = mettle;
    }

    public String getPioneering() {
        return pioneering;
    }

    public void setPioneering(String pioneering) {
        this.pioneering = pioneering;
    }

    public String getAccountability() {
        return accountability;
    }

    public void setAccountability(String accountability) {
        this.accountability = accountability;
    }

    public String getCollaboration() {
        return collaboration;
    }

    public void setCollaboration(String collaboration) {
        this.collaboration = collaboration;
    }

    public String getTrust() {
        return trust;
    }

    public void setTrust(String trust) {
        this.trust = trust;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }




}