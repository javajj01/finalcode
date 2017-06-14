package com.baizhi.service.impl;

import com.baizhi.dao.AdminMapper;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import com.baizhi.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by asus on 2017/6/12.
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminMapper adminMapper;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Admin check(Admin admin) {
        Admin dbadmin = adminMapper.selectByName(admin.getAdminname());
        if(dbadmin==null){
            throw  new RuntimeException("该管理员不存在");
        }
        String pw=admin.getPassword()+dbadmin.getSalt();
        String md5 = Utils.md5(pw);
        if(!md5.equals(dbadmin.getPassword())){
            throw new RuntimeException("密码错误");
        }else{
            return dbadmin;
        }
    }
}
