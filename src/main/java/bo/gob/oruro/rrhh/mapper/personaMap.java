package bo.gob.oruro.rrhh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import bo.gob.oruro.rrhh.model.pagination;
import bo.gob.oruro.rrhh.model.persona;

@Mapper
public interface personaMap {
    @Insert("INSERT into persona(nombre, paterno, materno, celular) values(#{nombre},#{paterno},#{materno},#{celular})")
    void create(persona p);
    @Update("UPDATE persona SET nombre = #{nombre}, paterno = #{paterno}, materno = #{materno}, celular = #{celular} WHERE idPersona = #{idPersona}")
    void update(persona p);
    @Delete("DELETE FROM persona WHERE idPersona = #{idPersona}")
    void delete(persona p);

    @Select("SELECT COUNT(*) FROM persona where nombre LIKE CONCAT('%',#{search},'%') OR paterno LIKE CONCAT('%',#{search},'%') OR materno LIKE CONCAT('%',#{search},'%') OR celular LIKE CONCAT('%',#{search},'%')")
    Integer count(pagination p);	
    @Select("SELECT * FROM persona where nombre LIKE CONCAT('%',#{search},'%') OR paterno LIKE CONCAT('%',#{search},'%') OR materno LIKE CONCAT('%',#{search},'%') OR celular LIKE CONCAT('%',#{search},'%') LIMIT #{per_page} OFFSET #{offset}")
    List<persona> read(pagination p);
    
    @Select("SELECT * FROM personal")
    List<persona> read2();
}
