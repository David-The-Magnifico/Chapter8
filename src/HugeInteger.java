public class HugeInteger {
    private  int[] value = new int[40];

    public int[] parse(String number) {
        int length = number.length()-1;
        for (int i = value.length-1; i >= 0; i--) {
            value[i] = number.charAt(length) - '0';
            if(length == 0) break;
            length--;
        }
        return value;
    }
    @Override
    public String toString() {
        String result = "";
        int count = 0;
        for( count = 0; count<value.length;count++){
            if(value[count]!=0)break;
        }
        for(; count< value.length;count++){
            if(count== value.length-1){
                result += value[count];
                break;
            }
            result +=value[count];
        }
        return result;
    }

    public int[] getValue() {
        return value;
    }

    public String add(HugeInteger integer2) {
        int[] temp = value;
        int[] value1 = integer2.getValue();
        int[] result = new int[40];
        int check =0;
        for(int i = value.length-1 ; i >=0; i--){
            result[i] = value[i] +  value1[i] + check;
            check = 0;
            if(result[i]>9){
                int temp1 = result[i];
                result[i] = result[i]%10;
                check = temp1/10;
            }

        }
        value = result;
        String answer = toString();
        value = temp;
        return answer;
    }

    public String subtract(HugeInteger integer2) {


    }

}
