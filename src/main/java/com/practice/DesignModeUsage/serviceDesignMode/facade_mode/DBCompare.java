package com.practice.DesignModeUsage.serviceDesignMode.facade_mode;

import org.apache.hadoop.yarn.webapp.hamlet.Hamlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *  Fascade 模式: 为子系统提供一致界面
 *  JDBC应用, Spring Gateway, Slf4j 都是其应用
 */
public class DBCompare {

    // Old Version
//    Connection conn = null;
//    PreparedStatement prep = null;
//    ResultSet rset = null;
//
//    try {
//        Class.forName("<driver>").newInstance();
//        conn = DriverManager.getConnection("<database>");
//        String sql = "SELECT * FROM <table> WHERE <column name> = ?";
//        prep = conn.prepareStatement(sql);
//        prep.setString(1, "<column value>");
//        rset = prep.executeQuery();
//        if (rset.next()) {
//            System.out.println(rset.getString("<column name>"));
//        }
//    } catch (Exception e) {
//        e.printStackTrace();
//    } finally {
//        rset.close();
//        prep.close();
//        conn.close();
//    }

    // New Version (FasCade)
//    Connection conn = null;
//    PreparedStatement prep = null;
//    ResultSet rset = null;
//    String sql = "SELECT * FROM <table> WHERE <column name> = ?";
//    try {
//        Mysql msql = new mysql(sql);
//        prep.setString (1, "<column value>");
//        rset = prep.executeQuery();
//        if (rset.next()) {
//            System.out.println(rset.getString("<column name>"));
//        }
//    } catch (Exception e) {
//        e.printStackTrace();
//    } finally {
//        mysql.close();
//        mysql = null;
//    }

}
