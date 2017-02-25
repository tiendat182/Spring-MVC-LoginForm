package com.spring.common;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.util.StringUtils;

/**
 * Get connection information
 */
public class Connection {
	/**
	 * Get connection information to Database from XML file
	 * 
	 * @param resourcePath
	 *            XML file include the connection DB
	 * @return sqlSessionFactory
	 * @throws IOException
	 */
	public static SqlSession sqlSession(String resourcePath) throws IOException {
		if (StringUtils.isEmpty(resourcePath)) {
			throw new IOException("Not found connection config file.");
		}
		Reader reader = Resources.getResourceAsReader(resourcePath);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

		return sqlSessionFactory.openSession();
	}
}
