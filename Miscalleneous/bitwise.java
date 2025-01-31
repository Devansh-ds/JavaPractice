public class bitwise {
    public static void main (String args[]) {
        String binary[] = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };
        int a = 3; 
        int b = 6;
        int c = a & b;  //and gate
        int d = a | b;  //or gate
        int e = a ^ b;  //xor gate
        int f = (~a & b) | (a & ~b);  // also xor gate
        //int g = ~a;
        int g = ~a & 0x0f;

        System.out.println("a is " + binary[a]);
        System.out.println("b is " + binary[b]);
        System.out.println("c is " + binary[c]);
        System.out.println("d is " + binary[d]);
        System.out.println("e is " + binary[e]);
        System.out.println("f is " + binary[f]);
        System.out.println("g is " + binary[g]);
    }
}
