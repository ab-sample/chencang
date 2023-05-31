package com.qwfys.sample.chencang.fufeng.business.spec;

import com.qwfys.sample.chencang.fufeng.request.AccountDetailRequest;
import com.qwfys.sample.chencang.fufeng.response.AccountDetailResponse;

/**
 * @author liuwenke
 * @since 0.0.1
 */
public interface ConsumerBusiness {
    AccountDetailResponse viewAccountDetail(String token, AccountDetailRequest param);
}
