package com.jiuyue.springbootmybatisgenerator.ao;

import com.jiuyue.springbootmybatisgenerator.common.entity.BizResult;
import com.jiuyue.springbootmybatisgenerator.dal.form.GeneratorForm;
import com.jiuyue.springbootmybatisgenerator.dal.vo.GeneratorVO;

/**
 * IGeneratorAO
 * @author zhangzhishuai
 */
public interface IGeneratorAO {

    /**
     * genertatorTest
     * @param form
     * @return
     */
    BizResult<GeneratorVO> genertatorTest(GeneratorForm form);
}
