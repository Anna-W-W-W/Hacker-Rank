package org.algo;

public class PageCount {
    private int n = 7;
    private int p = 3;

    public int pageCount(int n, int p) {
        int mid = n/2;
        System.out.println(mid + " mid ");
        if(p <= mid){

            return p/2;

            } else {
            if(n-p == 1 && n%2 == 0 && n >2 ){

                return 1;
            }

            return (n-p)/2;
        }
    }

    public static void main(String[] args) {
        PageCount pageCount = new PageCount();
        pageCount.pageCount(pageCount.n, pageCount.p);
    }
}
