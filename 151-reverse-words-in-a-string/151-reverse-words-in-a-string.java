class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
s="";
for(String a : arr)
if(!a.equals(""))
s=a+" "+s;
return s.trim();
    }
}