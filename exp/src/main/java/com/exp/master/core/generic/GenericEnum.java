package com.exp.master.core.generic;

/**
 * 所有自定义枚举类型实现该接口
 * 
 * @author 覃班
 **/
public interface GenericEnum {

    /**
     * value: 为保存在数据库中的值
     */
    public String getValue();

    /**
     * text : 为前端显示值
     */
    public String getText();

}
