package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GoumaizhangjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GoumaizhangjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GoumaizhangjieView;


/**
 * 购买章节
 *
 * @author 
 * @email 
 * @date 2021-01-05 20:07:27
 */
public interface GoumaizhangjieService extends IService<GoumaizhangjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GoumaizhangjieVO> selectListVO(Wrapper<GoumaizhangjieEntity> wrapper);
   	
   	GoumaizhangjieVO selectVO(@Param("ew") Wrapper<GoumaizhangjieEntity> wrapper);
   	
   	List<GoumaizhangjieView> selectListView(Wrapper<GoumaizhangjieEntity> wrapper);
   	
   	GoumaizhangjieView selectView(@Param("ew") Wrapper<GoumaizhangjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GoumaizhangjieEntity> wrapper);
   	
}

