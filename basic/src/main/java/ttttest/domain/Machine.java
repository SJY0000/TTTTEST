package ttttest.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import ttttest.BasicApplication;
import ttttest.domain.MachineAdded;

@Entity
@Table(name = "Machine_table")
@Data
public class Machine {

    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String mCode;

    private String mName;

    private String mSize;

    private String mModel;

    @PostPersist
    public void onPostPersist() {
        MachineAdded machineAdded = new MachineAdded(this);
        machineAdded.publishAfterCommit();
    }

    public static MachineRepository repository() {
        MachineRepository machineRepository = applicationContext()
            .getBean(MachineRepository.class);
        return machineRepository;
    }

    public static ApplicationContext applicationContext() {
        return BasicApplication.applicationContext;
    }
}
