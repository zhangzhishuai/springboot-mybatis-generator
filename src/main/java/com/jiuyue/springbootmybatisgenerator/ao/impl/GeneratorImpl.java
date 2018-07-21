package com.jiuyue.springbootmybatisgenerator.ao.impl;

import com.jiuyue.springbootmybatisgenerator.ao.IGeneratorAO;
import com.jiuyue.springbootmybatisgenerator.common.entity.BizResult;
import com.jiuyue.springbootmybatisgenerator.dal.form.GeneratorForm;
import com.jiuyue.springbootmybatisgenerator.dal.vo.GeneratorVO;
import org.springframework.stereotype.Component;

/**
 * genertatorTest
 *
 * @author hetao
 * @create 2018-07-21 下午5:44
 */
@Component
public class GeneratorImpl implements IGeneratorAO {

    /**
     * genertatorTest
     * @param form
     * @return
     */
    @Override
    public BizResult<GeneratorVO> genertatorTest(GeneratorForm form) {
        GeneratorVO generatorVO = new GeneratorVO();
        generatorVO.setId(form.getId());
        generatorVO.setName(form.getName());
        return BizResult.create(generatorVO);
    }
}
