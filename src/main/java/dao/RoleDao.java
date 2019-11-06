package dao;

import model.Role;
import org.apache.ibatis.annotations.*;

public interface RoleDao {
    @Select("select * from tb_role where id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "roleMenu", column = "id", many = @Many(select = "dao.RoleMenuDao.getRoleMenuByRoleId"))
    })
    Role getRoleById(Integer id);
}
