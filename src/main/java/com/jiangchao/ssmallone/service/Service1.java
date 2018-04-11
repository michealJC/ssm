package com.jiangchao.ssmallone.service;


import com.jiangchao.ssmallone.bean.newss;
import com.jiangchao.ssmallone.dao.Mapper1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "getnewsservice")
@EnableAutoConfiguration
public class Service1 {

    @Autowired
    private Mapper1 mapper1;

    public List<newss> getnews(){
        return mapper1.getnews();
    }
}
