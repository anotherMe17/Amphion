package io.github.anotherme17.amphion.dao;

import io.github.anotherme17.amphion.mapper.ArticleMapper;
import io.github.anotherme17.amphion.model.entity.ArticleEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lirenhao
 * date: 2018/4/18 下午8:04
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleDaoTest {

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void testInsert() {
        ArticleEntity a1 = new ArticleEntity();
        a1.setTitle("11111");
        a1.setSubTitle("111111111");
        a1.setContent("111111111111111");

        System.out.println(articleMapper.insert(a1));
        System.out.println(a1.toString());
    }

    @Test
    public void testLogicDeleteById() {
        System.out.println(articleMapper.logicDeleteById(1));
    }

    @Test
    public void testPhysicDeleteById() {
        articleMapper.physicDeleteById(1);
    }

    @Test
    public void testFindAll(){
        System.out.println(articleMapper.findAll());
    }
}
