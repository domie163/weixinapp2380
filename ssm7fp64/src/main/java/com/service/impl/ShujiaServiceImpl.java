package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShujiaDao;
import com.entity.ShujiaEntity;
import com.service.ShujiaService;
import com.entity.vo.ShujiaVO;
import com.entity.view.ShujiaView;

@Service("shujiaService")
public class ShujiaServiceImpl extends ServiceImpl<ShujiaDao, ShujiaEntity> implements ShujiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShujiaEntity> page = this.selectPage(
                new Query<ShujiaEntity>(params).getPage(),
                new EntityWrapper<ShujiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShujiaEntity> wrapper) {
		  Page<ShujiaView> page =new Query<ShujiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShujiaVO> selectListVO(Wrapper<ShujiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShujiaVO selectVO(Wrapper<ShujiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShujiaView> selectListView(Wrapper<ShujiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShujiaView selectView(Wrapper<ShujiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
