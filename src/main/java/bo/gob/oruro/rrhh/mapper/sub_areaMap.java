package bo.gob.oruro.rrhh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import bo.gob.oruro.rrhh.model.sub_area;

@Mapper
public interface sub_areaMap {
    @Select("select * from sub_area")
    List<sub_area> read();
}
