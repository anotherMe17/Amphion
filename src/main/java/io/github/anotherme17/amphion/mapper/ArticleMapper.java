package io.github.anotherme17.amphion.mapper;

import io.github.anotherme17.amphion.model.entity.ArticleEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author lirenhao
 * date: 2018/4/17 下午8:39
 */
public interface ArticleMapper {

    /**
     * Insert a new article
     *
     * @param article article id auto increment
     */
    @Insert("INSERT INTO t_article(title, subTitle, content) VALUES(#{title}, #{subTitle}, #{content})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(ArticleEntity article);

    /**
     * delete article by logic, you can recover it
     *
     * @param id the article id which you want to delete
     */
    @Update("UPDATE t_article SET delFlag=1,lastModifyTime=now() WHERE id=#{id} AND delFlag=0")
    int logicDeleteById(@Param("id") long id);

    /**
     * delete article by physic, that you can not recover it
     *
     * @param id the article id which you want to delete
     */
    @Delete("DELETE FROM t_article WHERE id=#{id}")
    void physicDeleteById(@Param("id") long id);

    @Select("SELECT * FROM t_article")
    List<ArticleEntity> findAll();
}
