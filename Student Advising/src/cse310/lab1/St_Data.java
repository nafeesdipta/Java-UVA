package cse310.lab1;
public class St_Data {
   static Database [] d=new Database[15];
   static Lec_Entry [] s1=new Lec_Entry[5];
   static Lec_Entry [] s2=new Lec_Entry[5];
   static Lec_Entry [] s3=new Lec_Entry[5];
    int i=0;
    public void entry(String s,int p)
    {
    d[i]=new Database(s, p);
    i++;
    }
    public int ret(String k,int l)
    {
        
        for (int j = 0; j <i; j++) {           
            if(d[j].email.equals(k) && d[j].password==l)
            {
            return 1;
            }            
        }
      return 0;
    }
}
