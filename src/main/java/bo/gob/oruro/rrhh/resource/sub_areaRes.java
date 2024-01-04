package bo.gob.oruro.rrhh.resource;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bo.gob.oruro.rrhh.mapper.sub_areaMap;
import bo.gob.oruro.rrhh.model.sub_area;

@RestController
@RequestMapping("rest/sub_area")
@CrossOrigin
public class sub_areaRes {
    sub_areaMap sub_areaM;

    public sub_areaRes(sub_areaMap sub_areaM) {
        this.sub_areaM = sub_areaM;
    }
    @GetMapping
    List<sub_area> read(){
        return sub_areaM.read();
    }
}
