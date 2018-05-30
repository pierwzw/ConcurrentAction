/**
 * @Auther zhongweiwu
 * @Date 2018/5/29 14:38
 */
public class ConfigBean {
    // 应用允许的并发数
    private volatile int maxTotalConcurrency;
    // 缓存设置
    private volatile int maxCacheSize;

    public int getMaxTotalConcurrency() {
        return maxTotalConcurrency;
    }

    public void setMaxTotalConcurrency(int maxTotalConcurrency) {
        this.maxTotalConcurrency = maxTotalConcurrency;
    }

    public int getMaxCacheSize() {
        return maxCacheSize;
    }

    public void setMaxCacheSize(int maxCacheSize) {
        this.maxCacheSize = maxCacheSize;
    }
}
