package com.jiuyue.springbootmybatisgenerator.controller;

import com.jiuyue.springbootmybatisgenerator.ao.IGeneratorAO;
import com.jiuyue.springbootmybatisgenerator.common.entity.BizResult;
import com.jiuyue.springbootmybatisgenerator.dal.form.GeneratorForm;
import com.jiuyue.springbootmybatisgenerator.dal.vo.GeneratorVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 测试controller
 *
 * @author hetao
 * @create 2018-07-21 下午5:11
 */
@RestController
public class GeneratorController {

    @Autowired
    private IGeneratorAO generatorAO;
    /**
     * 简单的接口测试
     * @param form
     * @return
     */
    @RequestMapping(value = "/genertatorTest.json", method = RequestMethod.POST)
    @ResponseBody
    public BizResult<GeneratorVO> genertatorTest(@Valid @RequestBody GeneratorForm form) {
        return generatorAO.genertatorTest(form);
    }


}
