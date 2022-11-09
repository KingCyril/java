package jiekou;

/**
 * 接口就是规范
 */
public interface UserService {

    // 接口中定义的变量其实都是常量
    public static final String ids = "001"; // String ids = "001"

    // 接口中定义的方法其实都是public abstract
    public abstract void add(String id);
    void delete(String id);
    void update(String id);
    void query(String id);
}
