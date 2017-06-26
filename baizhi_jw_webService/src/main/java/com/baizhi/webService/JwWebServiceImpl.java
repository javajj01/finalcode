package com.baizhi.webService;

import com.baizhi.dao.UserMapper;
import com.baizhi.entity.*;
import com.baizhi.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebService;
import javax.ws.rs.*;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by asus on 2017/6/15.
 */
@WebService
@Path("/jw")
public class JwWebServiceImpl implements JwWebService {

    @Autowired
    private UserService userService;
    @Autowired
    private LawerService lawerService;
    @Autowired
    private LawerTypeService lawerTypeService;
    @Autowired
    private DealService dealService;
    @Autowired
    private DealTypeService dealTypeService;
    @Autowired
    private RedpackageService redpackageService;
    @Autowired
    private CommentService commentService;

    @Autowired
    private RedisTemplate redisTemplate;

    @GET
    @Path("/registOrLogin/{code}/{phone}/")
    @Produces("application/json;charset=utf-8")
    public HashMap<String, Object> registOrLogin(@PathParam("phone")String phone,@PathParam("code") String code) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            ValueOperations vo = redisTemplate.opsForValue();
            String code1 = (String) vo.get(phone);
            if(code.equalsIgnoreCase(code1)){
                User user = new User();
                user.setPhone(phone);
                User add = userService.add(user);
                map.put("status",1);
                map.put("success",add);
            }else{
             throw  new RuntimeException("验证码错误");
            }
        } catch (Exception e) {
            map.put("status",0);
            e.printStackTrace();
        }
        return map;
    }

    @GET
    @Path("/phonecode/{phone}/")
    @Produces("application/json;charset=utf-8")
    public HashMap<String, Object> phonecode(@PathParam("phone") String phone) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            String phonecode = userService.phonecode(phone);
            redisTemplate.opsForValue().set(phone,phonecode);
            redisTemplate.expire(phone,60,TimeUnit.SECONDS);

            map.put("status",1);
        } catch (Exception e) {
            map.put("statusz",0);
            e.printStackTrace();
        }
        return map;
    }

    @GET
    @Path("/showUserFavorite/{id}/")
    @Produces("application/json;charset=utf-8")
    public HashMap<String, Object> showUserFavorite(@PathParam("id")String id) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            User user = userService.selectFavorite(id);
            map.put("status",1);
            map.put("success",user);
        } catch (Exception e) {
            map.put("status",0);
            e.printStackTrace();
        }
        return map;
    }

    @GET
    @Path("/showUserById/{id}/")
    @Produces("application/json;charset=utf-8")
    public HashMap<String, Object> showUserById(@PathParam("id")String id) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            User user = userService.queryByid(id);
            map.put("status",1);
            map.put("success",user);
        } catch (Exception e) {
            map.put("status",0);
            e.printStackTrace();
        }
        return map;
    }

    @GET
    @Path("/addUserFavorite/{id}/{lid}/")
    @Produces("application/json;charset=utf-8")
    public HashMap<String, Object> addUserFavorite(@PathParam("id") String id,@PathParam("lid")String lid) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            userService.addfavorite(id,lid);
            map.put("status",1);
        } catch (Exception e) {
            map.put("status",0);
            e.printStackTrace();
        }
        return map;
    }

    @GET
    @Path("/showAllLawer")
    @Produces("application/json;charset=utf-8")
    public HashMap<String, Object> showAllLawer() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            List<Lawer> show = lawerService.show();
            map.put("status",1);
            map.put("success",show);
        } catch (Exception e) {
            map.put("status",0);
            e.printStackTrace();
        }

        return map;
    }

    @GET
    @Path("/showOneLawerDetail/{id}/")
    @Produces("application/json;charset=utf-8")
    public HashMap<String, Object> showOneLawerDetail(@PathParam("id") String id) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            Lawer lawer = lawerService.showOne(id);
            map.put("status",1);
            map.put("success",lawer);
        } catch (Exception e) {
            map.put("status",0);
            e.printStackTrace();
        }
        return map;
    }

    @GET
    @Path("/showLawerType")
    @Produces("application/json;charset=utf-8")
    public HashMap<String, Object> showLawerType() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            List<Lawertype> lawertypes = lawerTypeService.showAll();
            map.put("status",1);
            map.put("success",lawertypes);
        } catch (Exception e) {
            map.put("status",0);
            e.printStackTrace();
        }
        return map;
    }

    @GET
    @Path("/showLawerByLawerType/{id}/")
    @Produces("application/json;charset=utf-8")
    public HashMap<String, Object> showLawerByLawerType(@PathParam("id") String id) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            Lawertype lawertype = lawerTypeService.showOneById(id);
            map.put("status",1);
            map.put("success",lawertype);
        } catch (Exception e) {
            map.put("status",0);
            e.printStackTrace();
        }
        return map;
    }

    @GET
    @Path("/showAllOneDealType")
    @Produces("application/json;charset=utf-8")
    public HashMap<String, Object> showAllOneDealType() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            List<Dealtype> dealtypes = dealTypeService.showOneType();
            map.put("status",1);
            map.put("success",dealtypes);
        } catch (Exception e) {
            map.put("status",0);
            e.printStackTrace();
        }
        return map;
    }

    @GET
    @Path("/showOneDealTypeDeatil/{id}/")
    @Produces("application/json;charset=utf-8")
    public HashMap<String, Object> showOneDealTypeDeatil(@PathParam("id") String id) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            Dealtype dealtype = dealTypeService.showOneDetail(id);
            map.put("status",1);
            map.put("success",dealtype);
        } catch (Exception e) {
            map.put("status",0);
            e.printStackTrace();
        }
        return map;
    }

    @GET
    @Path("/showDealByTwoDealId/{id}/")
    @Produces("application/json;charset=utf-8")
    public HashMap<String, Object> showDealByTwoDealId(@PathParam("id") String id) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            Dealtype dealtype = dealTypeService.showByTwoId(id);
            map.put("status",1);
            map.put("success",dealtype);
        } catch (Exception e) {
            map.put("status",0);
            e.printStackTrace();
        }
        return map;
    }

    @GET
    @Path("/showOneDeal/{id}/")
    @Produces("application/json;charset=utf-8")
    public HashMap<String, Object> showOneDeal(@PathParam("id") String id) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            Deal deal = dealService.showOneDeal(id);
            map.put("status",1);
            map.put("success",deal);
        } catch (Exception e) {
            map.put("status",0);
            e.printStackTrace();
        }
        return map;
    }


    @POST
    @Path("/addRedpackage")
    @Produces("application/json;charset=utf-8")
    @Consumes("application/json;charset=utf-8")
    public HashMap<String, Object> addRedpackage(Redpackage redpackage) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            redpackageService.add(redpackage);
            map.put("status",1);

        } catch (Exception e) {
            map.put("status",0);
            e.printStackTrace();
        }
        return map;
    }

    @POST
    @Path("/addComment")
    @Produces("application/json;charset=utf-8")
    @Consumes("application/json;charset=utf-8")
    public HashMap<String, Object> addComment(Comment comment) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            commentService.add(comment);
            map.put("status",1);
        } catch (Exception e) {

            e.printStackTrace();
            map.put("status",0);
        }
        return  map;
    }

    public HashMap<String, Object> addOrder(Order order) {
        return null;
    }

    public HashMap<String, Object> updateOrderStatus(Integer status) {
        return null;
    }
}
