package models;

import lombok.Data;
import play.db.jpa.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
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
}
