package com.qijianguo.dao;

import com.qijianguo.dataobject.PromoDo;
import com.qijianguo.dataobject.PromoDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PromoDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Fri Feb 22 14:20:48 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Fri Feb 22 14:20:48 CST 2019
     */
    int insert(PromoDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Fri Feb 22 14:20:48 CST 2019
     */
    int insertSelective(PromoDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Fri Feb 22 14:20:48 CST 2019
     */
    List<PromoDo> selectByExample(PromoDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Fri Feb 22 14:20:48 CST 2019
     */
    PromoDo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Fri Feb 22 14:20:48 CST 2019
     */
    int updateByPrimaryKeySelective(PromoDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Fri Feb 22 14:20:48 CST 2019
     */
    int updateByPrimaryKey(PromoDo record);

    PromoDo selectByItemId(@Param("itemId") Integer itemId);
}