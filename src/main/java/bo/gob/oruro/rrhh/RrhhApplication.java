package bo.gob.oruro.rrhh;

import org.apache.ibatis.type.MappedTypes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import bo.gob.oruro.rrhh.model.area;
import bo.gob.oruro.rrhh.model.asigna_cargo;
import bo.gob.oruro.rrhh.model.cargo;
import bo.gob.oruro.rrhh.model.persona;
import bo.gob.oruro.rrhh.model.sub_area;

@SpringBootApplication
@MappedTypes({persona.class, asigna_cargo.class, cargo.class, area.class, sub_area.class})

public class RrhhApplication {

	public static void main(String[] args) {
		SpringApplication.run(RrhhApplication.class, args);
	}

}
