package bo.gob.oruro.rrhh.resource;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bo.gob.oruro.rrhh.mapper.areaMap;
import bo.gob.oruro.rrhh.model.area;

@RestController
@RequestMapping("rest/area")
@CrossOrigin
public class areaRes {
    areaMap areaM;

    public areaRes(areaMap areaM) {
        this.areaM = areaM;
    }
    @GetMapping
    List<area> read(){
        return areaM.read();
    }
}
