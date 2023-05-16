package ttttest.domain;

import java.util.*;
import lombok.*;
import ttttest.domain.*;
import ttttest.infra.AbstractEvent;

@Data
@ToString
public class MachineAdded extends AbstractEvent {

    private String mCode;
    private Long id;
    private String mName;
    private String mSize;
    private String mModel;

    public MachineAdded(Machine aggregate) {
        super(aggregate);
    }

    public MachineAdded() {
        super();
    }
}
