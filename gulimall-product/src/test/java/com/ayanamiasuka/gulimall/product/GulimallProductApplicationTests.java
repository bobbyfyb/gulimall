package com.ayanamiasuka.gulimall.product;

import com.ayanamiasuka.gulimall.product.entity.BrandEntity;
import com.ayanamiasuka.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("索尼");
        /*brandEntity.setDescript("");
        brandEntity.setName("Sony");
        brandService.save(brandEntity);
        System.out.println("save succeeded!...");*/

        /*brandService.updateById(brandEntity);*/
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
