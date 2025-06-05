package com.dao;

import com.entity.GoumaizhangjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GoumaizhangjieVO;
import com.entity.view.GoumaizhangjieView;


/**
 * 购买章节
 * 
 * @author 
 * @email 
 * @date 2021-01-05 20:07:27
 */
public interface GoumaizhangjieDao extends BaseMapper<GoumaizhangjieEntity> {
	
	List<GoumaizhangjieVO> selectListVO(@Param("ew") Wrapper<GoumaizhangjieEntity> wrapper);
	
	GoumaizhangjieVO selectVO(@Param("ew") Wrapper<GoumaizhangjieEntity> wrapper);
	
	List<GoumaizhangjieView> selectListView(@Param("ew") Wrapper<GoumaizhangjieEntity> wrapper);

	List<GoumaizhangjieView> selectListView(Pagination page,@Param("ew") Wrapper<GoumaizhangjieEntity> wrapper);
	
	GoumaizhangjieView selectView(@Param("ew") Wrapper<GoumaizhangjieEntity> wrapper);
	
}
