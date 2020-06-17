
package com.xn.service;

import com.xn.pojo.SolrQuestionResult;
import org.springframework.data.domain.Sort;

import java.util.List;


/**
 * Created by Administrator on 2018/3/21.
 */

public interface SolrService {
    List<SolrQuestionResult> findAllByValue();
    List<SolrQuestionResult> findSolrQuestionResultsByQuestion();
    List<SolrQuestionResult> findSolrQuestion();
}

