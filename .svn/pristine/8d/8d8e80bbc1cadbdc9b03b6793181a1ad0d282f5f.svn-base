package com.edp.common.utils;
/**
 * ClassName:SqlFormatUtil <br/>
 * Date: 2014年9月29日 下午1:53:35 <br/>
 * 
 * @author 
 * @version
 * @since JDK 1.6
 * @see
 */
public class SqlFormatUtil {
    /**
     * ORDER_BY_DIRECTION_ASC:正序.
     * 
     * @since JDK 1.6
     */
    public static final String ORDER_BY_DIRECTION_ASC = "ASC";
    /**
     * ORDER_BY_DIRECTION_DESC:倒序.
     * 
     * @since JDK 1.6
     */
    public static final String ORDER_BY_DIRECTION_DESC = "DESC";

    /**
     * makeupOrderByAndLimit:(用于后台分页，用于组合条件查询中排序语句，如果传入分页数据则组合上分页语句，可不传分页数据). <br/>
     * 由于mybatis自动生成的语句不能分页，在排序语句后加入mysql分页语句.<br/>
     * 只查询倒序后第1条数据参数示例
     * makeupOrderByAndLimit(sortFiled,SqlFormatUtil.ORDER_BY_DIRECTION_DESC
     * ,0,1);
     *
     * @author lxf
     * @param orderByFiled
     *            用于排序字段（注：字段名称为数据库字段）
     * @param orderByDirection
     *            排序方向 asc正序 desc倒序
     * @param pageIndex
     *            需要查询的页码
     * @param pageSize
     *            每页数据条数
     * @return setOrderByClause所需sql语句
     * @since JDK 1.6
     */
    public static String makeupOrderByAndLimit(String orderByFiled, String orderByDirection, Integer pageIndex, Integer pageSize) {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append(" " + orderByFiled);
        sqlBuilder.append(" " + orderByDirection);
        if (null != pageIndex && null != pageSize) {
            Integer startPoint = pageIndex * pageSize;
            sqlBuilder.append(" limit " + startPoint + "," + pageSize);
        }
        return sqlBuilder.toString();
    }
    /**
     * makeupOrderByAndLimit:(用于后台分页，用于组合条件查询中排序语句，如果传入分页数据则组合上分页语句，可不传分页数据). <br/>
     * 由于mybatis自动生成的语句不能分页，在排序语句后加入mysql分页语句). <br/>
     * @author lxf
     * @param orderByFiled 排序的字段
     * @param pageIndex 需要查询的页码
     * @param pageSize 每页的条数
     * @return setOrderByClause所需sql语句
     * @since JDK 1.6
     */
    public static String makeupOrderByAndLimitTwo(String orderByFiled, Integer pageIndex, Integer pageSize) {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append(" " + orderByFiled+" ");
        if (null != pageIndex && null != pageSize) {
            Integer startPoint = pageIndex * pageSize;
            sqlBuilder.append(" limit " + startPoint + "," + pageSize);
        }
        return sqlBuilder.toString();
    }
}
