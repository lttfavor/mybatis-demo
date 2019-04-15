package com.shine.mybatis.Interceptor;

import com.shine.mybatis.annotation.CreateTime;
import com.shine.mybatis.annotation.UpdateTime;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;

import java.lang.reflect.Field;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;

/**
 * @author cyt
 * @since 2019-04-13 下午 13:32
 */
@Intercepts({ @Signature(type = StatementHandler.class, method = "query", args = { Statement.class, ResultHandler.class}) })
public class CustomInterceptor2 implements Interceptor {


    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
    }
}