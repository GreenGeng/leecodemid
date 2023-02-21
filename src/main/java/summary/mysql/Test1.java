package summary.mysql;

public class Test1
{
    /**
     *
     * mysql 怎么加行锁
     * 表中创建索引，select where 后面必须是索引，不然行锁无效
     * 必须要有事务
     * 在select语句后面加for update
     * select * from 表 lock in share node 读锁
     *
     *
     * 慢sql怎么优化
     * 先看type是不是all 在看key 如果是null就没有用到索引
     * 然后在看rows 数值越大 扫描的行数就越多
     * 然后在看Extra 避免出现Using filesort或Using temporary这样的字眼
     *
     * mysql调优
     * 用explain看有没有命中索引（type列+key列）
     * 然后看语法
     *
     * char和varchar
     * char不可变、varchar可变
     * 比如说都是10个长度 char存储进去 后面多余的都是空格 取出来要用trim去掉空格
     * varchar存进去 会自动去掉多余空格 长度是存的字符串的长度就不是10
     *一般char存储固定长度的数据（性别）
     *
     * 
     */
}
