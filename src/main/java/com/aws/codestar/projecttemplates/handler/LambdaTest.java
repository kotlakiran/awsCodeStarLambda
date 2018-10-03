package com.aws.codestar.projecttemplates.handler;

public class LambdaTest {
	
	String name;
	String value;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "LambdaTest [name=" + name + ", value=" + value + "]";
	}
	
	

}
