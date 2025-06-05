package com.entity.view;

import com.entity.GoumaizhangjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 购买章节
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-05 20:07:27
 */
@TableName("goumaizhangjie")
public class GoumaizhangjieView  extends GoumaizhangjieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GoumaizhangjieView(){
	}
 
 	public GoumaizhangjieView(GoumaizhangjieEntity goumaizhangjieEntity){
 	try {
			BeanUtils.copyProperties(this, goumaizhangjieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
