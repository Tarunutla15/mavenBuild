package com.abc.mavenBuild;

public class sort 
{
    public static int[] sorting(int l[]) {
    	for(int i=0;i<l.length-1;i++) {
    		for(int j=i+1;j<l.length;j++) {
    			if(l[i]>l[j]) {
    				int temp=l[i];
    				l[i]=l[j];
    				l[j]=temp;
    			}
    		}
    	}
    	return l;
    }
    
}

