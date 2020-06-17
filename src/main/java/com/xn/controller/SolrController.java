
package com.xn.controller;

import com.xn.pojo.SolrQuestionResult;
import com.xn.service.SolrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/3/21.
 */

@RestController
@RequestMapping("solr")
public class SolrController {
    @Autowired
    private SolrService solrService;

    @RequestMapping("querySolr")
    public String querySolr(){
        List<SolrQuestionResult> allByValue = solrService.findAllByValue();
        for (SolrQuestionResult list:allByValue) {
            System.out.println(list);
        }
        return null;
    }
    @RequestMapping("paiXuSolr")
    public String paiXuSolr(){
        List<SolrQuestionResult> allByValue = solrService.findSolrQuestionResultsByQuestion();
        for (SolrQuestionResult list:allByValue) {
            System.out.println(list);
        }
        return null;
    }
    @RequestMapping("chaSolr")
    public String chaSolr(){
        List<SolrQuestionResult> allByValue = solrService.findSolrQuestion();
        for (SolrQuestionResult list:allByValue) {
            System.out.println(list);
        }
        return null;
    }
}

