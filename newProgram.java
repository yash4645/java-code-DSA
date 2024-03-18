
public class newProgram {
    public static String compress(int[] raw) {
      int n=raw.length;
      if(n==0){
      return "";
        }
      String s="";
      int i=0,j=1,k=2;
      while(k<n && i<n && j<n){
        if(raw[i]==raw[j]){
          int count=1;
          while(raw[i]!=raw[j]){
            count ++;
            i++;
            j++;
          }
          s+=raw[i]+"*"+count+",";
        }else if((raw[i]-raw[j])==raw[j]-raw[k]){
          int first=raw[i];
          int last=raw[k];
          int diff=raw[j]-raw[k];
          if(diff!=1 || diff!=-1){
          while((raw[j]-raw[k])==diff){
            last=raw[k];
            j++;
            k++;
          }
          s+=first+"-"+last+"/"+diff+",";
        }else{
            while(raw[j]-raw[k]==diff){
              last=raw[k];
              j++;
              k++;
            }
            s+=first+"-"+last+",";
            
          }
          }else{
          s+=raw[i];
        }
      }
      return s;

      }
      public static void main(String [] args){
        int [] arr={0,2,4,5,7,8,9};
      
        String ans=compress(arr);
        System.out.println(ans);
      }
    }
    
  