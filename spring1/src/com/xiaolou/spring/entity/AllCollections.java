package com.xiaolou.spring.entity;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 *  所有的集合类型
 *  
 *  测试 怎么给集合注入属性
 * @author 小楼
 *
 */
public class AllCollections {

	
	private List<String> list;
	private String[] array ;
	
	private Set<String> set;
	private Map<String,String> map ;
	
	private Properties prop;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		
		String strings = "" ;
		for(String str : array) {
			strings += str + "," ;
		}
		
		return "AllCollections [\nlist=" + list + ", \narray=" + strings+ ", \nset=" + set + ",\nmap=" + map
				+ ", prop=" + prop + "]";
	}
	
	
	
}
