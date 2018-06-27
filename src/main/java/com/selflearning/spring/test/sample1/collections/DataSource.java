package com.selflearning.spring.test.sample1.collections;

import java.util.Properties;

public class DataSource {
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "DataSource [properties=" + properties + "]";
	}
	
}
