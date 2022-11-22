package err;

import java.util.Scanner;

public class _05Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GirlFriend girlFriend = new GirlFriend();

        while (true){
            try{
                System.out.println("请输入姓名");
                String name = scanner.nextLine();
                girlFriend.setName(name);

                System.out.println("请输入年龄");
                String ret = scanner.nextLine();
                int age = Integer.parseInt(ret);
                girlFriend.setAge(age);
                // 输入正确，跳出循环
                break;
            }catch (NumberFormatException e){
                e.printStackTrace();
            }catch (NameFormatException e){
                e.printStackTrace();
            }catch (AgeFormatException e){
                e.printStackTrace();
            }
        }

        System.out.println(girlFriend);
    }
}
