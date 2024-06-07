// import java.util.Scanner;
import java.util.Arrays;
//입력을 하기 위해 불러와야 할 클래스들
public class test01{
public static void main(String [] args){
        //출력
        // System.out.println("Woori Java Programming");
        // System.out.print("Hi\n");
        // System.out.println("줄바꿈이 된다");
        // int num = 0;
        // num++;
        // System.out.println("num: " + num);
        
        
        //입력과 출력
        // 스캐너 클래스를 동적할당한다. 입력하기 위한 기능을 할당
        /*Scanner scan = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");
        String str = scan.nextLine();
        System.out.println("정수를 입력하세요 : ");
        int number = scan.nextInt();
        System.out.println("실수를 입력하세요 : ");
        float floatNumber = scan.nextFloat();
        System.out.println("true/false를 입력하세요 : ");
        boolean bool = scan.nextBoolean();
        
        //결과 출력
        System.out.println(str);
        System.out.println(number);
        System.out.println(floatNumber);
        System.out.println(bool);
        //close scanner
        scan.close();*/

        //연습
        // int num1=10,num2=20;
        // int result = num1 + num2;
        // System.out.println(result);
        // int kor = 30;
        // int math = 50;
        // int eng = 70;
        // int num = kor + math + eng;
        // int result = (kor + math + eng) / 3;
        // System.out.println(num);
        // System.out.println(result);

        // int[] arr1 = new int[5];
        // arr1[0] =100;
        // arr1[1] =200;
        // arr1[2] =300;
        // for(int i = 0; i< arr1.length; i++)
        // System.out.println(arr1[i]);

    //     int [] arr1 = new int[20];
    //     arr1[0] =10;
    //     arr1[1] =20;
    //     arr1[2] =30;
    //     for(int i =0; i< arr1.length; i++){
    //         arr1[i] =(i+1)*10;
    //     }
    //     for(int i = 0; i<arr1.length; i++){
    //         System.out.println(arr1[i]);
    //     }
    // }
    
    //구구단 2단부터 9단까지 출력
    // int i = 2;
    // int j = 1;
    // while(i<10){
    //     while(j<10){
    //         System.out.println(i+'*'+j+'='+i*j);
    //         j++;
    //     }
    //     i++;
    //     j=1;
    //     }
    // }
        // char c='a'; //2byte 정수형 자료형이지만 문자 하나를 표현할 때
        // int i = 10; //4byte 정수형 자료형(계산이 빨리 되는 자료형)
        // double d = 10.2584; // 8byte 실수형 자료형
        // Boolean b = false;
        // String str = "Hello Java!"; //문자열을 자료형(가변길이로 길이가 일정하지 않음)


        /*String[] names = {"박찬호","박병호","류현진","월커슨"};
        int [] scores = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.printf(format:"%s의 점수를 입력하시오: ",names[0]); // %s : 문자열을 나타내는 서식문자
        scores[0] = scanner.nextInt();

        System.out.printf(format:"%s의 점수를 입력하시오: ",names[1]); // %s : 문자열을 나타내는 서식문자
        scores[1] = scanner.nextInt();
        System.out.printf(format:"%s의 점수를 입력하시오: ",names[2]); // %s : 문자열을 나타내는 서식문자
        scores[2] = scanner.nextInt();
        System.out.printf(format:"%s의 점수를 입력하시오: ",names[3]); // %s : 문자열을 나타내는 서식문자
        scores[3] = scanner.nextInt();

        System.out.println(names[0]+" "+(double)scores[0]);
        System.out.println(names[1]+" "+(double)scores[1]);
        System.out.println(names[2]+" "+(double)scores[2]);
        System.out.println(names[3]+" "+(double)scores[3]);
        System.out.println(names[4]+" "+(double)scores[4]);

        double avg = (double)((scores[0] + scores[1] + scores[2] + scores[3] + scores[4]) / 5);
        System.out.println("avg: " +avg);*/

        /*int[] arrA1 = new int[5]'
        arrA1[0] =1;
        arrA1[1] =2;
        arrA1[2] =3;
        arrA1[3] =4;
        arrA1[4] =5;
        int[] arrA2 =(10,20,30,40,50);*/

        //2차원 배열
        // int[][] arrMulti = new int[3][2];
        // arrMulti[0][0] = 10;
        // arrMulti[0][1] = 20;
        // arrMulti[1][0] = 30;
        // arrMulti[1][1] = 40;
        // arrMulti[2][0] = 50;
        // arrMulti[2][1] = 60;
        // System.out.println((arrMulti[0][0]));
        // System.out.println((arrMulti[1][1]));
        // System.out.println((arrMulti[2][1]));

        // for(int i = 0; i<3; i++){
        //     for(int j=0; j<2; j++)
        //     System.out.println(arrMulti[i][j]);
        // }

        //2차원 배열로 구구단 2단부터 9단까지 출력
            int[][] gugudan = new int[8][9];
            for(int i = 0; i<8; i++){
                for(int j = 0; j<9; j++)
                    gugudan[i][j]=(i+2) * (j+1);
                }
                for(int i = 0; i<8; i++){
                    for(int j=0;j<9;j++)
                    System.out.println(gugudan[i][j]);
                    System.out.println();
                }
        }
    }