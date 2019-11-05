package dao;

import model.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from tb_admin_user where id = #{id}")
    User getUser(Integer id);
}
