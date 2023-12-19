package com.abc.mavenBuild;

public class App 
{
    public static void main( String[] args )
    {
        int l[]= {1,4,7,9,14};
        int key=91,ind=-1;
        
        int i=0,j=l.length-1;
        int mid=(i+j)/2;
        if (key<l[mid]){
        	for(int k=0;k<mid;k++) {
        		if (l[k]==key){
        			ind=k;
        		}
        	}
        }
        else {
        	for(int k=mid;k<j;k++) {
        		if (key==l[k]) {
        			ind=k;
        		}
        	}
        }
        System.out.println("index of searched number "+ind);
    }
}

