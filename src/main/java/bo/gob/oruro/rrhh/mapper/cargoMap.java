package bo.gob.oruro.rrhh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import bo.gob.oruro.rrhh.model.cargo;

@Mapper
public interface cargoMap {
    @Select("select * from cargo")
    List<cargo> read();
}
