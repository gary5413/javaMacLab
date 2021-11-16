package javaFlag.javaFlagLab07;

public class ParkFeeArray {
    public static void main(String[] argv){
        int[] hourTable={0,2,4,6};
        int[] feeTable={30,50,80,100};
        int hours=Integer.parseInt(argv[0]);
        int fee=0;
        int i=hourTable.length-1;
        while (i>0){
            if(hourTable[i]<hours){
                break;
            }
            i--;
        }
        while(i>=0){
            fee +=(hours -hourTable[i])*feeTable[i];
            hours =hourTable[i];
            i--;
        }
        System.out.println("停車時數："+argv[0]+"小時");
        System.out.println("應繳費用："+fee+"元整");
    }
}
