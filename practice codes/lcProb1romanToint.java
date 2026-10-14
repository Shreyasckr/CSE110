import java.util.Scanner;
public class lcProb1romanToint{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c1;
        char c2;
        str += "  ";
        int integer = 0;
        for(int i = 0;i<=str.length();i++){
            c1 = str.charAt(i);
            c2 = str.charAt(i+1);
            if(c1 == ' '){
                break;
            }
            else{
                if(c1 == 'I'){
                    if(c2 == 'V'){
                        integer += 4;
                        i++;
                    }
                    else if(c2 == 'X'){
                        integer += 9;
                        i++;
                    }
                    else{
                        integer += 1;
                    }
                }
                else if(c1 == 'V'){
                    integer += 5;
                }
                if(c1 == 'X'){
                    if(c2 == 'L'){
                        integer += 40;
                        i++;
                    }
                    else if(c2 == 'C'){
                        integer += 90;
                        i++;
                    }
                    else{
                        integer += 10;
                    }
                }
                else if(c1 == 'L'){
                    integer += 50;
                }
                if(c1 == 'C'){
                    if(c2 == 'D'){
                        integer += 400;
                        i++;
                    }
                    if(c2 == 'M'){
                        integer += 900;
                        i++;
                    }
                    else{
                        integer += 100;
                    }
                }
                else if(c1 == 'D'){
                    integer += 500;
                }
                else if(c1 == 'M'){
                    integer += 1000;
                }
            }
        }
        System.out.println(integer);
    }
}
