/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.BaseEntity;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.test.dao.TestDataChildDao;
import com.thinkgem.jeesite.test.dao.TestDataMainDao;
import com.thinkgem.jeesite.test.entity.TestDataChild;
import com.thinkgem.jeesite.test.entity.TestDataMain;

/**
 * 主子表生成Service
 * 
 * @author ThinkGem
 * @version 2015-04-06
 */
@Service
@Transactional(readOnly = true)
public class TestDataMainService extends CrudService<TestDataMainDao, TestDataMain> {

    @Autowired
    private TestDataChildDao testDataChildDao;

    @Override
    @Transactional(readOnly = false)
    public void delete(TestDataMain testDataMain) {
        super.delete(testDataMain);
        testDataChildDao.delete(new TestDataChild(testDataMain));
    }

    @Override
    public List<TestDataMain> findList(TestDataMain testDataMain) {
        return super.findList(testDataMain);
    }

    @Override
    public Page<TestDataMain> findPage(Page<TestDataMain> page, TestDataMain testDataMain) {
        return super.findPage(page, testDataMain);
    }

    @Override
    public TestDataMain get(String id) {
        TestDataMain testDataMain = super.get(id);
        testDataMain.setTestDataChildList(testDataChildDao
                .findList(new TestDataChild(testDataMain)));
        return testDataMain;
    }

    @Override
    @Transactional(readOnly = false)
    public void save(TestDataMain testDataMain) {
        super.save(testDataMain);
        for (TestDataChild testDataChild : testDataMain.getTestDataChildList()) {
            if (testDataChild.getId() == null) {
                continue;
            }
            if (BaseEntity.DEL_FLAG_NORMAL.equals(testDataChild.getDelFlag())) {
                if (org.apache.commons.lang3.StringUtils.isBlank(testDataChild.getId())) {
                    testDataChild.setTestDataMain(testDataMain);
                    testDataChild.preInsert();
                    testDataChildDao.insert(testDataChild);
                } else {
                    testDataChild.preUpdate();
                    testDataChildDao.update(testDataChild);
                }
            } else {
                testDataChildDao.delete(testDataChild);
            }
        }
    }

}