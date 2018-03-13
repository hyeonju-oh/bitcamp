package bbb;
class E01 {
    public static void main(String[] args) {
        int i = 0, hap =0;
        while(true) {
            i++;
            if (i > 10) break;
            if(i % 5 == 0) continue;
            hap += i;
        }
        System.out.printf("%d, %d\n", i, hap);
    } 
}
