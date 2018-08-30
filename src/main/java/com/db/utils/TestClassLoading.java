package com.db.utils;

public class TestClassLoading {
    public static void main(String args[]) throws Exception{
        DBConnectionUtils.getEntityClassesFromPackage("com.db.entity");
    }
}
