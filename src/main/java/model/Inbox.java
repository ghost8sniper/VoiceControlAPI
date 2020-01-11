package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="IN")
public class Inbox extends Mail {

    public Inbox() {
        super();
    }
}
