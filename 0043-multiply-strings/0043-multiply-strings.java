import java.math.BigInteger;
class Solution {
    
    public String multiply(String num1, String num2) {
        BigInteger bNum1 = new BigInteger(num1);
        BigInteger bNum2 = new BigInteger(num2);
        BigInteger product = bNum1.multiply(bNum2);
        return product.toString();
    }
}