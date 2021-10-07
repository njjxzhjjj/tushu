package com.xiexin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiexin.bean.Shop;
import com.xiexin.bean.ShopExample;
import com.xiexin.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/shop")
public class ShopController{
@Autowired(required = false)
private ShopService shopService;

//增
// 后端订单增加 -- 针对layui的 针对前端传 json序列化的
@RequestMapping("/insert")///api/shop/insert
public Map insert(@RequestBody Shop shop){ // orders 对象传参, 规则: 前端属性要和后台的属性一致!!!
Map map = new HashMap();
int i =  shopService.insertSelective(shop);
if(i>0){
map.put("code",200);
map.put("msg","添加成功");
return map;
}else{
map.put("code",400);
map.put("msg","添加失败,检查网络再来一次");
return map;
}
}
//@Test
//    public void test(){
//
//        Shop shop=new Shop();
//        shop.setAuthor("123");
//        shop.setBid(null);
//        shop.setBookname("123");
//        shop.setCity("1");
//        shop.setProvince("1");
//        shop.setPrice((float) 12.23);
//        System.out.println("shop = " + shop);
//
////    int i =  shopService.insert(shop);
//        List<Shop> shops = shopService.selectByExample(null);
//
//        System.out.println("i = " + shops);
//
//
//    }

// 删
// 删除订单  根据 主键 id 删除
@RequestMapping("/deleteById")
public Map deleteById(@RequestParam(value = "id") Integer id) {
Map responseMap = new HashMap();
int i = shopService.deleteByPrimaryKey(id);
if (i > 0) {
responseMap.put("code", 200);
responseMap.put("msg", "删除成功");
return responseMap;
} else {
responseMap.put("code", 400);
responseMap.put("msg", "删除失败");
return responseMap;
}
}

// 批量删除
@RequestMapping("/deleteBatch")
public Map deleteBatch(@RequestParam(value = "idList[]") List<Integer> idList) {
    for (Integer integer : idList) {
    this.deleteById(integer);
    }
    Map responseMap = new HashMap();
    responseMap.put("code", 200);
    responseMap.put("msg", "删除成功");
    return responseMap;
    }


// 改
    // 修改订单
    @RequestMapping("/update")
    public Map update(@RequestBody Shop  shop) {
    Map map = new HashMap();
    int i = shopService.updateByPrimaryKeySelective( shop);
    if (i > 0) {
    map.put("code", 200);
    map.put("msg", "修改成功");
    return map;
    } else {
    map.put("code", 400);
    map.put("msg", "修改失败,检查网络再来一次");
    return map;
    }
    }

// 查--未分页
    // 全查
    @RequestMapping("/selectAll")///api/shop//selectAll
    public Map selectAll(){
    List<Shop> shops =  shopService.selectByExample(null);
        Map responseMap = new HashMap();
        responseMap.put("code", 0);
        responseMap.put("msg", "查询成功");
        responseMap.put("shops", shops);
        return responseMap;
        }

// 查-- 查询+自身对象的查询 + 分页
// 分页查询
    @RequestMapping("/selectAllByPage")
    public Map selectAllByPage(Shop shop, @RequestParam(value = "page", defaultValue = "1", required = true) Integer page,
    @RequestParam(value = "limit", required = true) Integer pageSize) {
    // 调用service 层   , 适用于 单表!!!
    PageHelper.startPage(page, pageSize);
    ShopExample example = new ShopExample();
    ShopExample.Criteria criteria = example.createCriteria();

//    if (null!=shop.getYYYYYYYY()&&!"".equals(shop.getYYYYYYY())){
//         criteria.andPhoneEqualTo(shop.getPhone());   // 1
//    }

    List<Shop> shopsList = shopService.selectByExample(example);
        PageInfo pageInfo = new PageInfo(shopsList);
        long total = pageInfo.getTotal();
        Map responseMap = new HashMap();
        responseMap.put("code", 0);
        responseMap.put("msg", "查询成功");
        responseMap.put("pageInfo", pageInfo);
        responseMap.put("count", total);
        return responseMap;
        }




    }
