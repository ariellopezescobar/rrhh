package bo.gob.oruro.rrhh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import bo.gob.oruro.rrhh.model.area;

@Mapper
public interface areaMap {
    @Select("select * from area")
    List<area> read();
}
