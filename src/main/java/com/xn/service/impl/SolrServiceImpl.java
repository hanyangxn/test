
package com.xn.service.impl;

import com.xn.dao.SolrDao;
import com.xn.pojo.SolrQuestionResult;
import com.xn.service.SolrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by Administrator on 2018/3/21.
 */

@Service
public class SolrServiceImpl implements SolrService {
    @Autowired
    SolrDao solrQuestionDao;
    @Override
    public List<SolrQuestionResult> findAllByValue() {
        return solrQuestionDao.findAllByQuestionLike("你",new PageRequest(0,50));
    }

    @Override
    public List<SolrQuestionResult> findSolrQuestionResultsByQuestion() {
        return solrQuestionDao.findSolrQuestionResultsByQuestion("工资",new Sort(Sort.Direction.ASC,"questionId"));
    }

    @Override
    public List<SolrQuestionResult> findSolrQuestion() {
        return solrQuestionDao.find("工资","代理");
    }
}

