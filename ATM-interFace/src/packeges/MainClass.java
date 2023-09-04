package packeges;


import java.util.*;


public class MainClass {
    public static void main(String[] args) {
        AtmOperationInterf op=new AtmOperationImpl();
        int atmnumber=12345;
        int atmpin=123;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ATM Number : ");
        int atmNumber=in.nextInt();
        System.out.print("Enter ATM Pin : ");
        int atmPin=in.nextInt();
        if ((atmnumber==atmNumber) &&(atmpin==atmPin)){
            while (true){
                System.out.println("1.View Availabel Balance\n2.Withdraw Amount\n3.Deposit Amount\nView Ministatement\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch=in.nextInt();
                if (ch==1){
                  op.viewBalance();

                } else if (ch==2){
                    System.out.println("Enter Amount to withdraw");
                    double withdrawAmount=in.nextInt();
                    op.withdrawAmount(withdrawAmount);
                }

               else if (ch==3){
                    System.out.println("Enter Amount to deposit : ");
                    int depositAmount= in.nextInt();
                    op.depositAmount(depositAmount);
                }
               else if (ch==4){
                   op.viewMiniStatement();
                }
                else if (ch==5) {
                    System.out.println("Collect your ATM card\nThank you for using");
                    System.exit(0);
                }
                else {
                    System.out.println("Please Enter correct choise");
                }



            }
        }
        else {
            System.out.println("Icorrect ATM number or pin");
            System.exit(0);
        }





    }
}