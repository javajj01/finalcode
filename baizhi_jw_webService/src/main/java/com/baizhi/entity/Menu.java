package com.baizhi.entity;

import java.util.List;

public class Menu {
    private String id;

    private String name;

    private String href;

    private String iconCls;

    private List<Menu> menus;

    private Menu menu;


    public Menu() {
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", href='" + href + '\'' +
                ", iconCls='" + iconCls + '\'' +
                '}';
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String geticonCls() {
        return iconCls;
    }

    public void seticonCls(String iconCls) {
        this.iconCls = iconCls;
    }
}