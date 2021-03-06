package cn.dongyiming.pojo;

import java.util.Date;

public class NcMenu {
    private Integer id;

    private Integer menuCode;

    private String menuName;

    private String menuDesc;

    private Integer authorCode;

    private String authorName;

    private Integer menuType;//0:普通歌单 1：专辑歌单 2：推荐歌单  3：独家放送 4：最新音乐 5：推荐MV  6：精选专栏  7：主播电台

    private String menuPicurl;

    private Long playcount;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(Integer menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc == null ? null : menuDesc.trim();
    }

    public Integer getAuthorCode() {
        return authorCode;
    }

    public void setAuthorCode(Integer authorCode) {
        this.authorCode = authorCode;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public String getMenuPicurl() {
        return menuPicurl;
    }

    public void setMenuPicurl(String menuPicurl) {
        this.menuPicurl = menuPicurl == null ? null : menuPicurl.trim();
    }

    public Long getPlaycount() {
        return playcount;
    }

    public void setPlaycount(Long playcount) {
        this.playcount = playcount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}