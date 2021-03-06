package com.feel.mall.db.dao;

import java.util.List;

import com.feel.mall.db.domain.MallUser;
import com.feel.mall.db.domain.MallUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MallUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    long countByExample(MallUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    int deleteByExample(MallUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    int insert(MallUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    int insertSelective(MallUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    MallUser selectOneByExample(MallUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    MallUser selectOneByExampleSelective(@Param("example") MallUserExample example, @Param("selective") MallUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    List<MallUser> selectByExampleSelective(@Param("example") MallUserExample example, @Param("selective") MallUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    List<MallUser> selectByExample(MallUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    MallUser selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MallUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    MallUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    MallUser selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallUser record, @Param("example") MallUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallUser record, @Param("example") MallUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MallUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MallUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") MallUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
