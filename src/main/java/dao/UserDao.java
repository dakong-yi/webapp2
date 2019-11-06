package dao;

import model.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from tb_admin_user where id = #{id}")
    @Results({
            @Result(property = "role", column = "role_id", one = @One(select = "dao.RoleDao.getRoleById"))
    })
    User getUser(Integer id);
}
