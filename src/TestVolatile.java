/**
 * @Auther zhongweiwu
 * @Date 2018/5/29 14:36
 */
public class TestVolatile {

    static{
        Config.setMaxCacheSize(10);
        Config.setMaxTotalConcurrency(100);
    }

    public void getConfigInfo(){
        int cacheSize = Config.getConfig().getMaxCacheSize();
        int totalsize = Config.getConfig().getMaxTotalConcurrency();
        System.out.println("cacheSize:"+cacheSize+ ", totalSize:"+totalsize );
    }

    public static void main(String[] args) {
        new TestVolatile().getConfigInfo();
    }
}
