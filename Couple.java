public class Couple{
  private int p;
  private int q;
  public Couple(int p, int q){
    this.p = p;
    this.q=q;
  }
  public Couple(){
    p=0;
    q=0;
  }
  public Couple(Couple couple){
    this.p= couple.p;
    this.q= couple.q;
  }
  public int getP(){
    return p;
  }
  public  int getQ(){
    return q;
  }
  public void setP(int u){
    p=u;
  }
  public void setQ(int v){
    q=v;
  }
  public void display(){
    System.out.println("("+p+","+q+")");
  }
  public boolean compare(Couple obj){
    Couple other = (Couple) obj;
    return ((p<other.p) || (p==other.p && q<other.q));
    }
}
