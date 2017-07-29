package com.springboot.producer.entity.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@ApiModel
public class UserQueryForm {
    @ApiModelProperty(value = "用户姓名", required = true)
    @NotEmpty(message = "姓名不能为空")
    private String name;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date updatedDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}