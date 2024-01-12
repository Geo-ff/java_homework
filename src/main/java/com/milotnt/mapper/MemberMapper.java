package com.milotnt.mapper;

import com.milotnt.pojo.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 接口名：MemberMapper
 * 说明：会员信息数据访问接口
 */
@Mapper
public interface MemberMapper {

    /**
     * 查询所有会员信息
     *
     * @return 所有会员信息列表
     */
    List<Member> findAll();

    /**
     * 新增会员信息
     *
     * @param member 会员对象
     * @return 新增是否成功
     */
    Boolean insertMember(Member member);

    /**
     * 根据会员账号修改会员信息
     *
     * @param member 会员对象
     * @return 修改是否成功
     */
    Boolean updateMemberByMemberAccount(Member member);

    /**
     * 查询会员账号密码
     *
     * @param member 会员对象
     * @return 查询到的会员对象
     */
    Member selectByAccountAndPassword(Member member);

    /**
     * 根据会员账号删除会员信息
     *
     * @param memberAccount 会员账号
     * @return 删除是否成功
     */
    Boolean deleteByMemberAccount(Integer memberAccount);

    /**
     * 查询会员数
     *
     * @return 会员总数
     */
    Integer selectTotalCount();

    /**
     * 根据会员账号查询会员
     *
     * @param memberAccount 会员账号
     * @return 查询到的会员对象列表
     */
    List<Member> selectByMemberAccount(Integer memberAccount);
}
