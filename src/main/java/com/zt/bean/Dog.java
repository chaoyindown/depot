package com.zt.bean;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@PropertySource(value = {"classpath:dog.properties"})
@Component 

@ConfigurationProperties(prefix = "dog")

public class Dog {
//	@Email
	private String name;
	
	private Integer age;
	private Map<String, String> friend;
	private List<String> foods;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the friend
	 */
	public Map<String, String> getFriend() {
		return friend;
	}
	/**
	 * @param friend the friend to set
	 */
	public void setFriend(Map<String, String> friend) {
		this.friend = friend;
	}
	/**
	 * @return the foods
	 */
	public List<String> getFoods() {
		return foods;
	}
	/**
	 * @param foods the foods to set
	 */
	public void setFoods(List<String> foods) {
		this.foods = foods;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", friend=" + friend + ", foods=" + foods + "]";
	}
	
	
}
