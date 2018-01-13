package cse310.lab1;
import java.io.*;
import java.util.*;
public class Fileread {
    int y=0;
    St_Data c=new St_Data();
    Menu p=new Menu();
    public void read()
    {
        try{
            File f=new File("b.txt");
  FileInputStream fstream = new FileInputStream(f);
  DataInputStream in = new DataInputStream(fstream);
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String strLine;
  StringTokenizer st=null;
  while ((strLine = br.readLine()) != null)  
  {
      st=new StringTokenizer(strLine,",");
      int i=0;
      String [] s=new String[4];
      while(st.hasMoreTokens())
      {
        s[i]=st.nextToken();
        i++;
      }     
      int sid = Integer.parseInt(s[1]);
      int pass = Integer.parseInt(s[3]);
      System.out.println(s[0]+" ,"+sid+", "+s[2]+", "+pass);
      p.s[y]=new Student(s[0],sid,s[2],pass);
       St_Data.d[y]=new Database(s[2],pass);
       Menu.le[y]=new Lec_Entry(s[2],pass);
       y++;
  }in.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }     
}

