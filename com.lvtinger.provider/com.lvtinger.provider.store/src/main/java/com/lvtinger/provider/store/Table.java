package com.lvtinger.provider.store;


import com.lvtinger.provider.common.PersistentObject;

import java.math.BigDecimal;

/**
 * 桌台
 */
public class Table extends PersistentObject {

    //region fields
    /**
     * 店铺id
     */
    private long storeId;
    /**
     * 桌台分类
     */
    private long tableTypeId;
    /**
     * 桌台名称
     */
    private String name;
    /**
     * 拼音
     */
    private String pinyin;
    /**
     * 桌台编码
     */
    private String code;
    /**
     * 可用状态
     */
    private boolean enable;
    /**
     * 开台率
     */
    private boolean rate;
    /**
     * 摘要
     */
    private String summery;
    /**
     * 容量
     */
    private int capacity;
    /**
     * 服务费额度
     */
    private BigDecimal serviceCharge;
    /**
     * 服务费类型
     */
    private int serviceType;
    /**
     * 最低消费额度
     */
    private BigDecimal minimumCharge;
    /**
     * 最低消费类型
     */
    private int minimumType;
    //endregion


}