public class Coding{
  public static byte[][] code (byte[] data){
    byte[][]arr=new byte[3][data.length];
    for (byte i=0; i<3;i++){
      for(byte j=0;j< data.length;j++){
        arr[i][j]=data[j];
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    decode(arr);
    return arr;
  }
  public static byte[] decode(byte[][] data){
    byte[] reponse={1,2,3,4,5,6};
    data[0][0]=50;
    data[1][3]=12;
    data[2][4]=32;
    for (byte i=0; i<3;i++){
      for(byte j=0;j< 6;j++){
        System.out.print(data[i][j]+" ");
      }
      System.out.println();
    }
    for (byte i=0; i<3;i++){
      for(byte j=0;j< 6;j++){
        if(data[i][j]!=reponse[j]){
          break;
        }
      }
      }
      return reponse;
    }
  public static void main(String[]args){
    byte[] example={1,2,3,4,5,6};
    code(example);
    System.out.print("{");
    for(int i=0; i< example.length ; i++) {
         System.out.print(example[i] +" ");
      }
      System.out.print("}");
}
}
