package com.example.mapper;

import com.example.entity.UserData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author 爱编程的小阿哲
 * @version 我亦无他, 惟手熟尔
 * @description: TODO
 * @date 2022/9/28 14:31
 */
@Mapper
public interface MainMapper {
    @Select("select * from users where name = #{username}")
    UserData findUserByName(String username);
}
