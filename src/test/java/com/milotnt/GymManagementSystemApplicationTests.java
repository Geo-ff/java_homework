package com.milotnt;

import com.milotnt.mapper.MemberMapper;
import com.milotnt.pojo.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootTest
class GymManagementSystemApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    MemberMapper memberMapper;

    /**
     * 测试数据库连接和记录总数查询。
     */
    @Test
    void contextLoads() {
        Long count = jdbcTemplate.queryForObject("select count(*) from admin", Long.class);
        System.out.println("记录总数: " + count);
    }

    /**
     * 测试会员信息查询和总数查询。
     * @throws Exception 如果测试过程中发生异常。
     */
    @Test
    public void run() throws Exception {
        // 查询所有会员信息
        List<Member> memberList = memberMapper.findAll();
        for (Member member : memberList) {
            System.out.println(member);
        }

        // 查询会员总数
        Integer total = memberMapper.selectTotalCount();
        System.out.println("会员总数: " + total);
    }
}
