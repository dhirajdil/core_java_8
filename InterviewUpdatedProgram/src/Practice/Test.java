package Practice;

class Test
{
      public static void main(String[] args)
      {
            Test t1 = new Test(10);
            Test t2 = new Test(10);
            System.out.println(""+(t1.equals(t2)));
            System.out.println(""+t1.hashCode());
            System.out.println(""+t2.hashCode());
      }
      int index;
      Test(int index){
            this.index = index;     }
     
      @Override
      public boolean equals(Object obj) {
            if(obj instanceof Test)
{
                  return ((Test)obj).index == this.index;
            }
            return false;
      }
     
      @Override
      public int hashCode() {
            return index * 11;
      }
}