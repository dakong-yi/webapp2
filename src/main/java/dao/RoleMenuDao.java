package dao;

import model.RoleMenu;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface RoleMenuDao {

    @Select("select * from tb_role_menu where role_id = #{id}")
    @Results({
            @Result(property = "role_id", column = "role_id"),
            @Result(property = "menu_id", column = "menu_id"),
            @Result(property = "create_time", column = "create_time"),
            @Result(property = "menu", column = "menu_id", one = @One(select = "dao.MenuDao.getMenuById"))
    })
    List<RoleMenu> getRoleMenuByRoleId(Integer id);
}
