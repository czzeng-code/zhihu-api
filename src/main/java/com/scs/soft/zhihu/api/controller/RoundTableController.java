package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.RoundTableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Zeng
 * @ClassName RoundTableController
 * @Description TOOD
 * @Date 2020/1/18
 * @Version 1.0
 *
 **/
@RestController
@RequestMapping(value = "/api/roundTable")
public class RoundTableController {
    @Resource
    private RoundTableService roundTableService;

    @GetMapping
    public Result getHot() {
        return Result.success(roundTableService.selectHot());
    }

    @GetMapping(value = "/all")
    public Result getAll() {
        return Result.success(roundTableService.selectAll());
    }
}
