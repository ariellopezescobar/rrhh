package bo.gob.oruro.rrhh.resource;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bo.gob.oruro.rrhh.mapper.personaMap;
import bo.gob.oruro.rrhh.model.pagination;
import bo.gob.oruro.rrhh.model.persona;

@RestController
@RequestMapping("rest/personal")
@CrossOrigin
public class personaRes {
    personaMap personaM;
    public personaRes(personaMap personaM) {
        this.personaM = personaM;
    }
    @PostMapping
    public void create(persona p){
        personaM.create(p);
    }
    //@GetMapping
    public HashMap<String, Object> read(pagination p) {
        p.offset=(p.page-1)*p.per_page;
        HashMap<String, Object> map = new HashMap<>();
        map.put("page", p.page);
        map.put("total", personaM.count(p));
        map.put("data", personaM.read(p));
        return map;
    }
    @GetMapping()
    public List<persona> read2(){
        return personaM.read2();
    }
    @PutMapping
    public void update(persona p){
        personaM.update(p);
    }
    @DeleteMapping
    public void delete(persona p){
        personaM.delete(p);
    }
}
