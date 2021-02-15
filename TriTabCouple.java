public class TriTabCouple{
  public static void bubbleSort(Couple []args){
    for(int i=0; i<args.length-1; i++){
      for (int j=0; j<args.length-i-1; j++){
        if(args[j].compare(args[i])==false){
          Couple tmp=args[j];
          args[j]=args[j+1];
          args[j+1]=tmp;
        }
      }
    }


  }
  public static void insertSort(Couple []args){
    for (int i=1; i<args.length; i++){
      Couple tmp=args[i];
      int j=i-1;
      while(j>=0 && args[j].compare(tmp)==false ){
        args[j+1]=args[j];
        j=j-1;
        args[j+1]=tmp;
      }
    }
    }
  public static void main(String[]args){
    Couple a1=new Couple(2,5);
    Couple b1=new Couple(2,3);
    Couple c1=new Couple(0,5);
    Couple [] array={a1 , b1 , c1};
    insertSort(array);
    System.out.print("Mon Tableau est{");
    for(Couple i:array){
      i.display();
    System.out.print("}");
    }
  }
}
