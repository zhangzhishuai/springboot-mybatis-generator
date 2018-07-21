package com.jiuyue.springbootmybatisgenerator.dal.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * form
 *
 * @author hetao
 * @create 2018-07-21 下午5:12
 */
@Data
public class GeneratorForm {

    @NotNull(message = "请求参数有误,id不能为空！")
    private Integer id;

    @NotBlank(message = "请求参数有误,name不能为空！")
    private String name;
}
