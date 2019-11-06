package dao;

import model.Menu;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MenuDao {
    @Select("select * from tb_menu where id = #{id}")
    Menu getMenuById(Integer id);

//    @Insert("insert into tb_menu()")
//    Integer insert(Menu menu);
}
