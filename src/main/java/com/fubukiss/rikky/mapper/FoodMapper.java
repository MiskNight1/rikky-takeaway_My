package com.fubukiss.rikky.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fubukiss.rikky.entity.Food;
import com.fubukiss.rikky.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FoodMapper  extends BaseMapper<Food> {
}
