package com.jiuyue.springbootmybatisgenerator.dal.config;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.*;
import java.time.LocalTime;

/**
 * Map Java 8 LocalTime &lt;-&gt; java.sql.Time
 * @author hetao
 * @create 2017-12-22
 */
@MappedTypes(LocalTime.class)
@MappedJdbcTypes(value = JdbcType.TIME, includeNullJdbcType = true)
public class LocalTimeTypeHandler extends BaseTypeHandler<LocalTime> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, LocalTime parameter, JdbcType jdbcType) throws SQLException {
        ps.setTime(i, Time.valueOf(parameter));
    }

    @Override
    public LocalTime getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Time time = rs.getTime(columnName);
        if (time != null) {
            return time.toLocalTime();
        }
        return null;
    }

    @Override
    public LocalTime getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Time time = rs.getTime(columnIndex);
        if (time != null) {
            return time.toLocalTime();
        }
        return null;
    }

    @Override
    public LocalTime getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Time time = cs.getTime(columnIndex);
        if (time != null) {
            return time.toLocalTime();
        }
        return null;
    }
}
