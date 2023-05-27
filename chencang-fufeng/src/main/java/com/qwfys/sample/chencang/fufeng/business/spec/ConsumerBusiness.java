package com.qwfys.sample.chencang.fufeng.business.spec;

import com.qwfys.sample.chencang.common.vo.AccountDetailVO;
import com.qwfys.sample.chencang.fufeng.request.AccountDetailRequest;

/**
 * @author liuwenke
 * @since 0.0.1
 */
public interface ConsumerBusiness {
    AccountDetailVO viewAccountDetail(String token, AccountDetailRequest param);
}
