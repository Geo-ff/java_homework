package com.milotnt.service.impl;

import com.milotnt.mapper.MemberMapper;
import com.milotnt.pojo.Member;
import com.milotnt.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员服务的实现类。
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    /**
     * 查询所有会员信息。
     *
     * @return 包含所有会员信息的列表。
     */
    @Override
    public List<Member> findAll() {
        return memberMapper.findAll();
    }

    /**
     * 新增会员信息。
     *
     * @param member 待添加的会员对象。
     * @return 如果添加成功，返回 true；否则返回 false。
     */
    @Override
    public Boolean insertMember(Member member) {
        return memberMapper.insertMember(member);
    }

    /**
     * 根据会员账号修改会员信息。
     *
     * @param member 待更新的会员对象。
     * @return 如果更新成功，返回 true；否则返回 false。
     */
    @Override
    public Boolean updateMemberByMemberAccount(Member member) {
        return memberMapper.updateMemberByMemberAccount(member);
    }

    /**
     * 会员登录验证。
     *
     * @param member 包含账号和密码的会员对象。
     * @return 如果验证成功，返回会员对象；否则返回 null。
     */
    @Override
    public Member userLogin(Member member) {
        return memberMapper.selectByAccountAndPassword(member);
    }

    /**
     * 根据会员账号删除会员信息。
     *
     * @param memberAccount 待删除的会员账号。
     * @return 如果删除成功，返回 true；否则返回 false。
     */
    @Override
    public Boolean deleteByMemberAccount(Integer memberAccount) {
        return memberMapper.deleteByMemberAccount(memberAccount);
    }

    /**
     * 查询会员总数。
     *
     * @return 会员总数。
     */
    @Override
    public Integer selectTotalCount() {
        return memberMapper.selectTotalCount();
    }

    /**
     * 根据会员账号查询会员信息。
     *
     * @param memberAccount 会员账号。
     * @return 包含会员信息的列表，如果不存在则返回空列表。
     */
    @Override
    public List<Member> selectByMemberAccount(Integer memberAccount) {
        return memberMapper.selectByMemberAccount(memberAccount);
    }
}
