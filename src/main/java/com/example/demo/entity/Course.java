package com.example.demo.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Course)实体类
 *
 * @author makejava
 * @since 2023-02-07 14:41:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "")
public class Course {
    
    private static final long serialVersionUID = 1L;
    
            
    @ApiModelProperty(value = "${column.comment}")
    private String cid;
    
            
    @ApiModelProperty(value = "${column.comment}")
    private String cname;
    
            
    @ApiModelProperty(value = "${column.comment}")
    private String tid;
    
}

