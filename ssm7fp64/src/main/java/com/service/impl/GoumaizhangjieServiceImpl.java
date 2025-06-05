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


import com.dao.GoumaizhangjieDao;
import com.entity.GoumaizhangjieEntity;
import com.service.GoumaizhangjieService;
import com.entity.vo.GoumaizhangjieVO;
import com.entity.view.GoumaizhangjieView;

@Service("goumaizhangjieService")
public class GoumaizhangjieServiceImpl extends ServiceImpl<GoumaizhangjieDao, GoumaizhangjieEntity> implements GoumaizhangjieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GoumaizhangjieEntity> page = this.selectPage(
                new Query<GoumaizhangjieEntity>(params).getPage(),
                new EntityWrapper<GoumaizhangjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GoumaizhangjieEntity> wrapper) {
		  Page<GoumaizhangjieView> page =new Query<GoumaizhangjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GoumaizhangjieVO> selectListVO(Wrapper<GoumaizhangjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GoumaizhangjieVO selectVO(Wrapper<GoumaizhangjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GoumaizhangjieView> selectListView(Wrapper<GoumaizhangjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GoumaizhangjieView selectView(Wrapper<GoumaizhangjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
