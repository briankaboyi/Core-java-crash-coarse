public class Main{
   
    public static void main(String args[]){

Find fun = new Find();
int[] numArray = {2,4,6,41};
int[] twoArray;
twoArray = new int[7];
twoArray[0]=71;
twoArray[1]=72;
twoArray[2]=73;
twoArray[3]=74;
twoArray[4]=75;
twoArray[5]=76;
twoArray[6]=77;
System.out.println(twoArray[6]);
fun.findValue(3,numArray);
fun.findValue(4, twoArray);
    }
}

class Find{
 void findValue(int a,int[] b){
        System.out.println(b[a]);
    }
}