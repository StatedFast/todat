package com.woniuxy;

import java.io.File;

public class ReadeCache {
	public ReadeCache(){
	}
	
	/*
	 * 
	 * 读取某个盘下所有文件*/
	public static boolean readFile(String filepath)   {
		try {
			File file  = new File(filepath);
			if(!file.isDirectory()) {
				System.out.println("文件");
			    System.out.println("path=" + file.getPath());
			    System.out.println("absolutepath=" + file.getAbsolutePath());
			    System.out.println("name=" + file.getName());
			}else if(file.isDirectory()) {
				System.out.println("文件夹");
				String[] filelist = file.list();
				for(int i=0;i<filelist.length;i++) {
					File readfile = new File(filepath+"\\"+filelist[i]);
					if(readfile.isDirectory()) {
						  System.out.println("path=" + readfile.getPath());
			              System.out.println("absolutepath=" + readfile.getAbsolutePath());
			              System.out.println("name=" + readfile.getName());
					}else if(readfile.isDirectory()) {
						readFile(filepath+"\\"+filelist[i]);
					}
				}
			}
		} catch (Exception e) {
			  System.out.println("readfile()   Exception:" + e.getMessage());
		}
		return true;
	}
	public static void main(String[] args) {
		try {
			readFile("E:/downloads");
		} catch (Exception e) {
			System.out.println("错误"+e);
		}
		System.out.println("OK");
	}
}
