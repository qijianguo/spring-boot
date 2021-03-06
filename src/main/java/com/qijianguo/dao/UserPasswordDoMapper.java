package com.qijianguo.dao;

import com.qijianguo.dataobject.UserPasswordDo;
import com.qijianguo.dataobject.UserPasswordDoExample;
import java.util.List;

public interface UserPasswordDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sat Feb 16 11:27:31 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sat Feb 16 11:27:31 CST 2019
     */
    int insert(UserPasswordDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sat Feb 16 11:27:31 CST 2019
     */
    int insertSelective(UserPasswordDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sat Feb 16 11:27:31 CST 2019
     */
    List<UserPasswordDo> selectByExample(UserPasswordDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sat Feb 16 11:27:31 CST 2019
     */
    UserPasswordDo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sat Feb 16 11:27:31 CST 2019
     */
    int updateByPrimaryKeySelective(UserPasswordDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sat Feb 16 11:27:31 CST 2019
     */
    int updateByPrimaryKey(UserPasswordDo record);

    UserPasswordDo selectByUserId(Integer id);
}