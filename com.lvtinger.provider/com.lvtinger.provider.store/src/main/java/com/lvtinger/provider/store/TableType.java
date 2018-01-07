package com.lvtinger.provider.store;

import com.lvtinger.provider.common.PersistentObject;

/**
 * 桌台类别
 */
public class TableType extends PersistentObject {
    /**
     * 上级分类id
     */
    private long parentId;
    /**
     * 商家id
     */
    private long storeId;
    /**
     * 分类名称
     */
    private String typeName;
    /**
     * 拼音
     */
    private String pinyin;
    /**
     * 分类排序
     */
    private int sorting;

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public long getStoreId() {
        return storeId;
    }

    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public int getSorting() {
        return sorting;
    }

    public void setSorting(int sorting) {
        this.sorting = sorting;
    }

    public TableType() {
    }

    public TableType(long id, long parentId, long storeId, String typeName, int sorting) {
        super(id);
        this.parentId = parentId;
        this.storeId = storeId;
        this.typeName = typeName;
        this.sorting = sorting;
    }

    public TableType(long id, long version, long timeline, int status, long parentId, long storeId, String typeName, int sorting) {
        super(id, version, timeline, status);
        this.parentId = parentId;
        this.storeId = storeId;
        this.typeName = typeName;
        this.sorting = sorting;
    }
}
