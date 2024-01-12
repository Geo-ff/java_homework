package com.milotnt.service;

import com.milotnt.pojo.Member;

import java.util.List;

/**
 * 会员服务接口。
 */
public interface MemberService {

    /**
     * 查询所有会员信息。
     *
     * @return 包含所有会员信息的列表。
     */
    List<Member> findAll();

    /**
     * 新增会员信息。
     *
     * @param member 包含会员信息的会员对象。
     * @return 如果新增成功，返回 true；否则返回 false。
     */
    Boolean insertMember(Member member);

    /**
     * 根据会员账号修改会员信息。
     *
     * @param member 包含更新后会员信息的会员对象。
     * @return 如果修改成功，返回 true；否则返回 false。
     */
    Boolean updateMemberByMemberAccount(Member member);

    /**
     * 查询会员账号密码（登录）。
     *
     * @param member 包含会员账号密码的会员对象。
     * @return 如果登录成功，返回会员对象；否则返回 null。
     */
    Member userLogin(Member member);

    /**
     * 根据会员账号删除会员信息。
     *
     * @param memberAccount 会员账号。
     * @return 如果删除成功，返回 true；否则返回 false。
     */
    Boolean deleteByMemberAccount(Integer memberAccount);

    /**
     * 查询会员数。
     *
     * @return 会员总数。
     */
    Integer selectTotalCount();

    /**
     * 根据会员账号查询会员。
     *
     * @param memberAccount 会员账号。
     * @return 包含会员信息的列表。
     */
    List<Member> selectByMemberAccount(Integer memberAccount);
}
