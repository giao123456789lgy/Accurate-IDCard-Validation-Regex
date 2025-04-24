import java.util.Scanner;

public class Verify_IDCard {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine();
            if(number.length()==0) {
                System.out.println("输入为空");
            }
            else if(number.length()<18||number.length()>18) {
                System.out.println("位数不合法");
            }
            else {
                String regex="[1-9]\\d{5}(19\\d{2}|20[0-1]\\d)"+
                        "((0[13578]|1[02])(0[1-9]|[1-2]\\d|3[01])|(0[469]|11)(0[1-9]|[1-2]\\d|30)|(02)(0[1-9]|1\\d|2[0-8]))"
                        +"\\d{3}[\\dxX]";
                String regex2="[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|10|11|12)(0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
                if(number.matches(regex)){
                    System.out.println("身份证号正确");
                }
                else{
                    System.out.println("身份证号错误");
                }
            }
        }
    }

