public class Test {
    public static void main(String[] args){
      String para = "{{[]}}";
      int flag = 0;
      stack s = new stack(para.length());
      for(int i=0;i<para.length();i++)
      {
          if(para.charAt(0)=='{'&&para.charAt(0)=='{'&&para.charAt(0)=='{')
          {
              s.push(para.charAt(i));
          }
          else{
              switch(para.charAt(i))
              {
                  case ')':
                      char check = s.pop();
                      if(check=='('){
                            flag = 1;
                      }else{
                          flag =0;break;
                      }
                      break;
                  case '}':
                      char check1 = s.pop();
                      if(check1=='('){
                          flag = 1;
                      }else{
                          flag =0;break;
                      }
                      break;
                  case ']':
                      char check2 = s.pop();
                      if(check2=='('){
                          flag = 1;
                      }else{
                          flag =0;break;
                      }
                      break;
              }
          }
      }
      if(flag == 0) System.out.println("the delimiter is valid");
      else System.out.println("The delimiter is invalid");
    }
}
