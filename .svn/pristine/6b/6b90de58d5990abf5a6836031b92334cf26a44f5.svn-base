package ibatis.config;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class SqlMapClientFactory {

	static SqlMapClient smc = null;
	static Reader rd = null;
	
	static {
		try {
			Charset charset = Charset.forName("UTF-8");
			Resources.setCharset(charset);
						
			rd = Resources.getResourceAsReader("ibatis/config/sqlMapConfig.xml");
						
			smc = SqlMapClientBuilder.buildSqlMapClient(rd);
				
						
		} catch (IOException e) {
			e.printStackTrace();
		} 
	} 
	public static SqlMapClient getSqlMapClient() {
		return smc;
	}
}
