package com.example.demo.mapper;

import com.example.demo.domian.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**  
 * @projectName demo
 * @description: 
 * @author Cirilla
 * @date 2019/7/7  17:34
 */
@Mapper
public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}