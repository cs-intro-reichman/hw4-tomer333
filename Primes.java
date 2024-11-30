public class Primes {
    public static void main(String[] args) {
        int upTo =  Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to "+upTo+":");
        boolean[] arr = new boolean[upTo+1];
        for (int i = 2; i <= upTo; i++) {arr[i] = true;}
        int c = 2;
        while (c < upTo) {
            if (arr[c]) {for (int i = c+c; i <= upTo; i+=c) {arr[i] = false;} }
            c++;
        }
        int primes = 0;
        for (int i = 0; i <= upTo; i++) {if(arr[i]){System.out.println(i);primes++;}}
        if (upTo == 0) {System.out.println("There are "+primes+" primes between 2 and "+upTo+" ("+(int)(primes*100/1)+"% are primes)");}
        else{System.out.println("There are "+primes+" primes between 2 and "+upTo+" ("+(int)(primes*100/upTo)+"% are primes)");}
    }
}