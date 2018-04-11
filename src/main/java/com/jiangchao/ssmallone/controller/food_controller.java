package com.jiangchao.ssmallone.controller;


import com.jiangchao.ssmallone.bean.newss;
import com.jiangchao.ssmallone.service.Service1;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class food_controller {

    @Resource(name = "getnewsservice")
    private Service1 service1;
    @RequestMapping("/getnews")
    @ResponseBody
    public List<newss> getnews(){
        return service1.getnews();
    }
}
