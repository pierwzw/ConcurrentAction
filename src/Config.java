/**
 * @Auther zhongweiwu
 * @Date 2018/5/29 14:36
 */
public class Config {
    private static volatile ConfigBean config = new ConfigBean();

    public static ConfigBean getConfig(){
        return config;
    }

    public static void setMaxTotalConcurrency(int maxTotalConcurrency){
        config.setMaxTotalConcurrency(maxTotalConcurrency);
    }

    public static void setMaxCacheSize(int maxCacheSize){
        config.setMaxCacheSize(maxCacheSize);
    }
}
