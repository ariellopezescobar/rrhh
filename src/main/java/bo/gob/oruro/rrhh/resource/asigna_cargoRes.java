package bo.gob.oruro.rrhh.resource;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bo.gob.oruro.rrhh.mapper.asigna_cargoMap;
import bo.gob.oruro.rrhh.model.asigna_cargo;
@RestController
@RequestMapping("rest/asigna_cargo")
@CrossOrigin
public class asigna_cargoRes {
    asigna_cargoMap asigna_cargoM;

    public asigna_cargoRes(asigna_cargoMap asigna_cargoM) {
        this.asigna_cargoM = asigna_cargoM;
    }
    @GetMapping
    List<asigna_cargo> read(){
        return asigna_cargoM.read();
    }
}
