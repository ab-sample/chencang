package com.qwfys.sample.chencang.fufeng.controller;

import com.qwfys.sample.chencang.common.vo.AccountDetailVO;
import com.qwfys.sample.chencang.fufeng.business.spec.ConsumerBusiness;
import com.qwfys.sample.chencang.fufeng.comon.result.JuResultCode;
import com.qwfys.sample.chencang.fufeng.comon.result.JuResult;
import com.qwfys.sample.chencang.fufeng.request.AccountDetailRequest;
import com.qwfys.sample.chencang.fufeng.response.AccountDetailResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@Tag(name = "消费方管理")
public class ConsumerController {

    @Autowired
    private ConsumerBusiness consumerBusiness;

    @PostMapping("/consumer/account/detail")
    @Operation(summary = "获取消费方账号详情")
    public JuResult<AccountDetailResponse> viewAccountDetail(@RequestHeader("Authorization") String token, @RequestBody AccountDetailRequest param) {
        JuResult<AccountDetailResponse> result = null;
        try {
            AccountDetailResponse accountDetailResponse = consumerBusiness.viewAccountDetail(token, param);
            result = JuResult.success(accountDetailResponse);

        } catch (Exception e) {
            log.error(e.getMessage(), e);
            result = JuResult.fail(JuResultCode.EXCEPTION);
        }

        log.info("response: {}", result);
        return result;
    }
}
