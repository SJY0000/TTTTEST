package ttttest.domain;

import java.util.*;
import lombok.*;
import ttttest.domain.*;
import ttttest.infra.AbstractEvent;

@Data
@ToString
public class MachineAdded extends AbstractEvent {

    private Long id;
    private String code;
    private String name;
    private String size;
    private String model;

    public MachineAdded(Machine aggregate) {
        super(aggregate);
    }

    public MachineAdded() {
        super();
    }
}
