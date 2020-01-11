package ma.voicecontrol.api.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="UP")
public class Update extends Mail {

    public Update() {
        super();
    }
}
