
package com.xn.dao;

import com.xn.pojo.SolrQuestionResult;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;


/**
 * Created by Administrator on 2018/3/21.
 */

public interface SolrDao extends SolrCrudRepository<SolrQuestionResult,String> {
//    List<SolrQuestionResult> findAllByValue();
    List<SolrQuestionResult> findAllByQuestionLike(String question,Pageable page);
    List<SolrQuestionResult> findSolrQuestionResultsByQuestion(String question, Sort sort);
    @Query("question:?0 AND answer:?1")
    List<SolrQuestionResult> find(String question,String answer);
/*  @Query("question:?0")
  List<SolrQuestionResult> find(String question,String knowName);*/
}

