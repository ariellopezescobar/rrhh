package bo.gob.oruro.rrhh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import bo.gob.oruro.rrhh.model.asigna_cargo;

@Mapper
public interface asigna_cargoMap {
    @Select("select * from asigna_cargo")
    List<asigna_cargo> read();
}
