package models;

import play.db.jpa.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Tag extends Model {
    @Id
    private Long id;
    private String tag;
    private int reputation;
    private Long sent;
    private int hard_bounces;
    private int soft_bounces;
    private int rejects;
    private int complaints;
    private int unsubs;
    private int opens;
    private int clicks;
    private int unique_opens;
    private int unique_clicks;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "tag_contact",
            joinColumns = @JoinColumn(name = "tagId"),
            inverseJoinColumns = @JoinColumn(name = "contactId"))
    private Set<Contact> contacts;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public Long getSent() {
        return sent;
    }

    public void setSent(Long sent) {
        this.sent = sent;
    }

    public int getHard_bounces() {
        return hard_bounces;
    }

    public void setHard_bounces(int hard_bounces) {
        this.hard_bounces = hard_bounces;
    }

    public int getSoft_bounces() {
        return soft_bounces;
    }

    public void setSoft_bounces(int soft_bounces) {
        this.soft_bounces = soft_bounces;
    }

    public int getRejects() {
        return rejects;
    }

    public void setRejects(int rejects) {
        this.rejects = rejects;
    }

    public int getComplaints() {
        return complaints;
    }

    public void setComplaints(int complaints) {
        this.complaints = complaints;
    }

    public int getUnsubs() {
        return unsubs;
    }

    public void setUnsubs(int unsubs) {
        this.unsubs = unsubs;
    }

    public int getOpens() {
        return opens;
    }

    public void setOpens(int opens) {
        this.opens = opens;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public int getUnique_opens() {
        return unique_opens;
    }

    public void setUnique_opens(int unique_opens) {
        this.unique_opens = unique_opens;
    }

    public int getUnique_clicks() {
        return unique_clicks;
    }

    public void setUnique_clicks(int unique_clicks) {
        this.unique_clicks = unique_clicks;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }
}
