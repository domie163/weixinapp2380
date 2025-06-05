package com.dao;

import com.entity.ShujiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShujiaVO;
import com.entity.view.ShujiaView;


/**
 * 书架
 * 
 * @author 
 * @email 
 * @date 2021-01-05 20:07:27
 */
public interface ShujiaDao extends BaseMapper<ShujiaEntity> {
	
	List<ShujiaVO> selectListVO(@Param("ew") Wrapper<ShujiaEntity> wrapper);
	
	ShujiaVO selectVO(@Param("ew") Wrapper<ShujiaEntity> wrapper);
	
	List<ShujiaView> selectListView(@Param("ew") Wrapper<ShujiaEntity> wrapper);

	List<ShujiaView> selectListView(Pagination page,@Param("ew") Wrapper<ShujiaEntity> wrapper);
	
	ShujiaView selectView(@Param("ew") Wrapper<ShujiaEntity> wrapper);
	
}
