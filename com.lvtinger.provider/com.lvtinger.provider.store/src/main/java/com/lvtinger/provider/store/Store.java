package com.lvtinger.provider.store;


import com.lvtinger.provider.common.PersistentObject;

/**
 * 店铺
 */
public class Store extends PersistentObject {

    //region fields
    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 标识
     */
    private String logo;

    /**
     * 省
     */
    private long provinceId;
    /**
     * 市
     */
    private long districtId;
    /**
     * 县
     */
    private long countyId;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 经度
     */
    private long longitude;
    /**
     * 纬度
     */
    private long latitude;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 联系人
     */
    private String linkman;
    //endregion

    //region getter&&setter

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(long provinceId) {
        this.provinceId = provinceId;
    }

    public long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(long districtId) {
        this.districtId = districtId;
    }

    public long getCountyId() {
        return countyId;
    }

    public void setCountyId(long countyId) {
        this.countyId = countyId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    //endregion

    //
    public Store() {
    }

    public Store(long id, String storeName, String logo, long provinceId, long districtId, long countyId, String address, long longitude, long latitude, String telephone, String linkman) {
        super(id);
        this.storeName = storeName;
        this.logo = logo;
        this.provinceId = provinceId;
        this.districtId = districtId;
        this.countyId = countyId;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.telephone = telephone;
        this.linkman = linkman;
    }

    public Store(long id, long version, long timeline, int status, String storeName, String logo, long provinceId, long districtId, long countyId, String address, long longitude, long latitude, String telephone, String linkman) {
        super(id, version, timeline, status);
        this.storeName = storeName;
        this.logo = logo;
        this.provinceId = provinceId;
        this.districtId = districtId;
        this.countyId = countyId;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.telephone = telephone;
        this.linkman = linkman;
    }
}
