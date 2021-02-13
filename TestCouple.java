public class TestCouple{
  public static void main(String[]args){
    Couple c1 =new Couple(2,3);
    Couple c2= new Couple();
    Couple c3 = new Couple(c1);
    c1.display();
    c2.display();
    c3.display();
    c3.setP(8);
    System.out.println("Apres modification, les lements de c3 sont:"+ c3.getP()+","+c3.getQ());
    System.out.println(c1.compare(c3));
  }
}
