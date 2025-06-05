package com.entity.model;

import com.entity.ShuchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 书城
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-05 20:07:27
 */
public class ShuchengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 字数
	 */
	
	private String zishu;
		
	/**
	 * 章节
	 */
	
	private String zhangjie;
		
	/**
	 * 内容1
	 */
	
	private String neirong1;
		
	/**
	 * 内容2
	 */
	
	private String neirong2;
		
	/**
	 * 内容3
	 */
	
	private String neirong3;
		
	/**
	 * 作者
	 */
	
	private String zuozhe;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 上架日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangjiariqi;
		
	/**
	 * 是否完结
	 */
	
	private String shifouwanjie;
				
	
	/**
	 * 设置：分类
	 */
	 
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：字数
	 */
	 
	public void setZishu(String zishu) {
		this.zishu = zishu;
	}
	
	/**
	 * 获取：字数
	 */
	public String getZishu() {
		return zishu;
	}
				
	
	/**
	 * 设置：章节
	 */
	 
	public void setZhangjie(String zhangjie) {
		this.zhangjie = zhangjie;
	}
	
	/**
	 * 获取：章节
	 */
	public String getZhangjie() {
		return zhangjie;
	}
				
	
	/**
	 * 设置：内容1
	 */
	 
	public void setNeirong1(String neirong1) {
		this.neirong1 = neirong1;
	}
	
	/**
	 * 获取：内容1
	 */
	public String getNeirong1() {
		return neirong1;
	}
				
	
	/**
	 * 设置：内容2
	 */
	 
	public void setNeirong2(String neirong2) {
		this.neirong2 = neirong2;
	}
	
	/**
	 * 获取：内容2
	 */
	public String getNeirong2() {
		return neirong2;
	}
				
	
	/**
	 * 设置：内容3
	 */
	 
	public void setNeirong3(String neirong3) {
		this.neirong3 = neirong3;
	}
	
	/**
	 * 获取：内容3
	 */
	public String getNeirong3() {
		return neirong3;
	}
				
	
	/**
	 * 设置：作者
	 */
	 
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	
	/**
	 * 获取：作者
	 */
	public String getZuozhe() {
		return zuozhe;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：上架日期
	 */
	 
	public void setShangjiariqi(Date shangjiariqi) {
		this.shangjiariqi = shangjiariqi;
	}
	
	/**
	 * 获取：上架日期
	 */
	public Date getShangjiariqi() {
		return shangjiariqi;
	}
				
	
	/**
	 * 设置：是否完结
	 */
	 
	public void setShifouwanjie(String shifouwanjie) {
		this.shifouwanjie = shifouwanjie;
	}
	
	/**
	 * 获取：是否完结
	 */
	public String getShifouwanjie() {
		return shifouwanjie;
	}
			
}
