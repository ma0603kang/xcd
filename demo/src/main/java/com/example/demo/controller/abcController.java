package com.example.demo.controller;

public class abcController {
    @Override
    public boolean equals(Object obj) {
        System.out.println("小马哥溜的一批！，这是改的主线");
        return super.equals(obj);
    }

    public boolean equals(String obj) {
        System.out.println("小马哥溜的一批！，这是改的分支");
        return super.equals(obj);
    }
}
