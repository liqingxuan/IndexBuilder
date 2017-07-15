package io.qingxuan;

public class Main {

	private static String adsDataFilePath;
	private static String budgetDataFilePath;
	//private IndexBuilder indexBuilder;
	private static String memcachedServer;
	private static int memcachedPortal;
	private static String mysqlHost;
	private static String mysqlDb;
	private static String mysqlUser;
	private static String mysqlPass;
	
	public static void main(String[] args) {
		
		// input [adsDataFilePath, budgetDataFilePath]
		adsDataFilePath = args[0];
		budgetDataFilePath = args[1];
		memcachedServer = "127.0.0.1";
		memcachedPortal = 11211;
		mysqlHost = "127.0.0.1:3306";
		mysqlDb = "SearchAds";
		mysqlUser = "root";
		mysqlPass = "password";
		
		AdsEngine adsEngine = new AdsEngine(adsDataFilePath,budgetDataFilePath,memcachedServer,memcachedPortal,mysqlHost,mysqlDb,mysqlUser,mysqlPass);
		adsEngine.init();  
		
	
		//indexBuilder = new IndexBuilder(memcachedServer,memcachedPortal,mysql_host,mysql_db,mysql_user,mysql_pass);
	}

}
