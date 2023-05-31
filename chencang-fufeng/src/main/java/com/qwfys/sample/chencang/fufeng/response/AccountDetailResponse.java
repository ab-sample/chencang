package com.qwfys.sample.chencang.fufeng.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.qwfys.sample.chencang.common.vo.DeptVO;
import com.qwfys.sample.chencang.common.vo.RoleVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author liuwenke
 * @since 0.0.1
 */
@Schema(description = "账号详情")
@Data
@Accessors(chain = true)
public class AccountDetailResponse {

    @Schema(description = "用户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @Schema(description = "用户名称")
    private String userName;

    @Schema(description = "姓名")
    private String fullName;

    @Schema(description = "电话号码")
    private String telephone;

    @Schema(description = "所属部门")
    private DeptVO dept;

    @Schema(description = "角色列表")
    private List<RoleVO> roles;
}
