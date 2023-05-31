package com.qwfys.sample.chencang.fufeng.convert;

import com.qwfys.sample.chencang.common.vo.AccountDetailVO;
import com.qwfys.sample.chencang.fufeng.response.AccountDetailResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.core.convert.converter.Converter;

/**
 * @author liuwenke
 * @since 0.0.1
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AccountDetailConvert extends Converter<AccountDetailVO, AccountDetailResponse> {
}