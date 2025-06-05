package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShujiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShujiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShujiaView;


/**
 * 书架
 *
 * @author 
 * @email 
 * @date 2021-01-05 20:07:27
 */
public interface ShujiaService extends IService<ShujiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShujiaVO> selectListVO(Wrapper<ShujiaEntity> wrapper);
   	
   	ShujiaVO selectVO(@Param("ew") Wrapper<ShujiaEntity> wrapper);
   	
   	List<ShujiaView> selectListView(Wrapper<ShujiaEntity> wrapper);
   	
   	ShujiaView selectView(@Param("ew") Wrapper<ShujiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShujiaEntity> wrapper);
   	
}

