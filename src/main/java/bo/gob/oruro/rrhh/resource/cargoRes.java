package bo.gob.oruro.rrhh.resource;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bo.gob.oruro.rrhh.mapper.cargoMap;
import bo.gob.oruro.rrhh.model.cargo;

@RestController
@RequestMapping("rest/cargo")
@CrossOrigin
public class cargoRes {
    cargoMap cargoM;

    public cargoRes(cargoMap cargoM) {
        this.cargoM = cargoM;
    } 
    @GetMapping
    List<cargo> read(){
        return cargoM.read();
    }
}
