package models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@Data
public class Contact {
    @Id
    private Long id;
    private String contact;
    @ManyToMany(mappedBy = "contacts")
    private Set<Tag> tagSet;
}
