package ttttest.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ttttest.domain.*;

@RestController
// @RequestMapping(value="/machines")
@Transactional
public class MachineController {

    @Autowired
    MachineRepository machineRepository;

    @PutMapping("/machines/search/findByMCode")
    public Object findByMCode(@RequestBody MachineViewQuery query) {
        return machineRepository.findByMCode(query.getMCode());
    }
}
