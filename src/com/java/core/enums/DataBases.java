package com.java.core.enums;

public enum DataBases {
    MYSQL("http://mysql.com"),ORACLE("http://oracle.com"),SQLSERVER("http://sqlserver.com");
    String url;

    DataBases(String url) {
        this.url = url;
    }
}
