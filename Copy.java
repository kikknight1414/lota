import java.io.*;
class Copy{
public static void main(String args[])throws IOException{
int i;
FileOutputStream fout=null;
FileInputStream fin=null;
try{
	try{
		fin=new FileInputStream(args[0]);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	try{
		fout=new FileOutputStream(args[1]);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
catch(Exception e){
	System.out.println(e);
}
try{
	do{
		i=fin.read();
		if(i!=-1){
		fout.write(i);}
	}while(i!=-1);
	fin.close();
	fout.close();
}
catch(Exception e){
	System.out.println(e);
}
}
}