package com.example.parsonalInfo.mapper;

import com.example.entity.parsonalInfo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

@Mapper
//test //
public interface ParsonalInfoMapper  {
    @Select("select * from user where user_id = #{id}")
    User getUserById(String id);

    @Insert("insert into user(user_id, user_name, user_name_english, user_role, role_id, mail, address_ip, create_time, usable)" +
            "            values(userId, userName, userNameEnglish, userRole, roleId, mail, addressIp, createTime, usable)")
    int save(User user);

    List<User> list(@Param("param")HashMap<Object, Object> param);

}
