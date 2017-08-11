package com.quhxuxm.quh.proj.tonghao.dao;

import com.quhxuxm.quh.proj.tonghao.domain.Author;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/META-INF/spring/dao.xml")
public class TestAuthorRepository {
    @Autowired
    ApplicationContext daoApplicationContext;

    @Test
    public void testAuthorRepository() {
        IAuthorRepository authorRepository = daoApplicationContext
                .getBean("IAuthorRepository", IAuthorRepository.class);
        Author author=new Author();
        author.setRegistrationDate(new Date());
        author.setNickName("Qu Hao 1");
        authorRepository.save(author);
    }
}
