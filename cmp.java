public class cmp {

public static void main(String[] args) {

int length;
String sub;
String curr;
String v1 ="INR6700";
String v2="INR5500";
String v3="INR800";
String v4="INR9990";

String[] v= {v1,v2,v3,v4};
if(v1.substring(0, 3).equals(v4.substring(0, 3))&v1.substring(0, 3).equals(v4.substring(0, 3))&v1.substring(0, 3).equals(v4.substring(0, 3))) {
System.out.println("All are same currencies");

     } else {
System.out.println("there is a diff currencies");
}
curr=(String) v1.subSequence(0,3);
int num[]=new int[4];
for(int i=0;i<4;i++) {
length=v[i].length();
sub=v[i].substring(3,length);
num[i]=Integer.parseInt(sub);
}
int minvalue=num[0];
for(int j=1;j<4;j++) {
if(num[j]<minvalue) {
minvalue=num[j];
}

}

System.out.println("the Least value is: " +curr+" "+minvalue);
}}