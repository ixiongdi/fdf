package fun.xruo.fdf.dao;

import fun.xruo.fdf.pojo.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author xiongdi (kotlin@qq.com)
 * @since 2020/4/17 12:06
 */
@Mapper
public interface CityMapper {

    @Insert("INSERT INTO city (name, state, country) VALUES(#{name}, #{state}, #{country})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(City city);

    @Select("SELECT id, name, state, country FROM city WHERE id = #{id}")
    City findById(long id);

    @Select("SELECT id, name, state, country FROM city WHERE id = #{id}")
    City get(Long id);

    @Select("SELECT id, name, state, country FROM city WHERE id = #{id}")
    List<City> list(Map<String, Object> query);

    @Select("SELECT COUNT(1) FROM city")
    Long count(Map<String, Object> query);

    @Insert("INSERT INTO city (name, state, country) VALUES(#{name}, #{state}, #{country})")
    void save(City city);

    @Insert("")
    City insert();

    @Insert("")
    void remove();

    @Insert("")
    City delete();

    @Insert("")
    City update();
}
