package io.github.anotherme17.amphion.model.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author lirenhao
 * date: 2018/4/17 下午9:06
 */
@Data
public class ArticleEntity {

    /**
     * ID auto increment
     */
    private Long id;

    /**
     * This Article create time
     */
    private Date createTime;

    /**
     * last modify this article time
     */
    private Date lastModifyTime;

    /**
     * this article title less than 255
     */
    private String title;

    /**
     * this article subtitle less than 500
     */
    private String subTitle;

    /**
     * this article content use TEXT u can write what ever you want
     */
    private String content;

    /**
     * logic delete flag. if true means you delete this article by logic
     */
    private boolean delFlag = false;
}
