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
    byte[] reponse=data[0];
    byte[][] decode =data;
    decode[0][0]=50;
    decode[2][3]=12;
    decode[3][4]=32;
    for (byte i=0; i<3;i++){
      for(byte j=0;j< decode.length;j++){
        System.out.print(decode[i][j]+" ");
      }
      System.out.println();
    }
    for (byte i=0; i<3;i++){
      for(byte j=0;j< decode.length;j++){
        if(decode[i][j]!=reponse[j]){
          break;
        }
      }
    }
  return reponse;
  }

  public static void main(String[]args){
    byte[] example={1,2,3,4,5,6};
    for(int i=0; i< example.length ; i++) {
         System.out.print(example[i] +" ");
    code(example);
    System.out.print("{");
      }
    }
}
