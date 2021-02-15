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
    return arr;
  }
  public static void main(String[]args){
    byte[] example={1,2,4,11,26,15};
    code(example);
}
}
