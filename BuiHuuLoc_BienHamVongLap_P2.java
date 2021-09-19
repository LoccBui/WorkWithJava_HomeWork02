package buihuuloc_bienhamvonglap;

import java.util.Scanner;

public class BuiHuuLoc_BienHamVongLap_P2 {
    
        public static void FindMaxNumber(int a, int b, int c){
            int max = 0;
            max = ( max < a ) ? a : max;  
            max = ( max < b ) ? b : max;  
            max = ( max < c ) ? c : max;  
            System.out.println("Số nguyên lớn nhất là: " + max);        
        }
        
        public static void ConvertToDate(int second){
            int hh = second / 3600;
            int mm = (second % 3600)  / 60;
            int ss = (second % 3600) % 60;
            System.out.println(String.format("Giờ: %02d, Phút: %02d, Giây: %02d", hh, mm, ss));
        }
        
        public static void ConvertNumToDay(int day){
            switch(day){
            case 1:{
                 System.out.println("Chủ nhật ");
            }break;
                
            case 2:{
                 System.out.println("Thứ hai ");
            }break;
      
            case 3:{
                 System.out.println("Thứ ba ");
            }break;
                  
            case 4:{
                 System.out.println("Thứ tư ");
            }break;
                  
            case 5:{
                 System.out.println("Thứ năm ");
            }break;
                       
            case 6:{
                 System.out.println("Thứ sáu ");
            }break;
                            
            case 7:{
                 System.out.println("Thứ bảy");
            }break;     
                
            default:{
                 System.out.println("Không hợp lệ");
            }
            }
        }
        
        public static void ConvertToQuy(int month){
            switch(month){
            case 1: case 2:case 3:          
            System.out.println("Tháng thuộc quý 1");
            break;
                       
            case 4:case 5: case 6:
            System.out.println("Tháng thuộc quý 2");          
            break;
                
            case 7:  case 8: case 9:   
             System.out.println("Tháng thuộc quý 3");  
            break;
                              
            case 10: case 11:case 12: 
            System.out.println("Tháng thuộc quý 4");      
            break;
            
            default:System.out.println("Tháng không hợp lệ");
            }       
        }
  
        public static void DayInAMonth(int thang, int nam){
             if ( thang < 1 || thang > 12 || nam < 1900)
                {
                    System.out.println("Nhập không hợp lệ");
                }
            else
                {
                switch(thang){
                case 1 :  case 3 :  case 5 :  case 7 :  case 8 : case 10 : case 12 :  
                    System.out.println("Có 31 ngày");
                break;

                case 4 :  case 6 :  case 9 :  case 11 :   
                    System.out.println("Có 30 ngày");
                break;

                case 2:{
                        if ( (nam % 400 ) == 0 || (nam%4 == 0&& nam%100 != 0)) {
                            System.out.println("Có 29 ngày");
                        }
                        else {
                            System.out.println("Có 28 ngày");
                        }
                    } break;

                default:  System.out.println("Tháng không hợp lệ");
                }    
                }
        }
        
        public static void ConvertNumToText(int numToText){
            switch(numToText){
                case 0: System.out.println("Không"); break;
                case 1: System.out.println("Một");break;
                case 2: System.out.println("Hai");break;
                case 3: System.out.println("Ba");break;
                case 4: System.out.println("Bốn");break;
                case 5: System.out.println("Năm");break;
                case 6: System.out.println("Sáu");break;
                case 7: System.out.println("Bảy");break;
                case 8: System.out.println("Tám");break;
                case 9: System.out.println("Chín");break;
                default: System.out.println("Số không hợp lệ");break;               
            }
        }
        
        public static void OddOrEven(int positiveNum){
            if (positiveNum <= 0){
                System.out.println("Đây không phải số nguyên dương");
            }
            else{
                if( (positiveNum % 2) ==0){
                    System.out.println("Là số chẵn");
                }
                else{
                    System.out.println("Là số lẻ");
                }
            }
        }
        
        public static void FeeToPay(int tinchi){                   
                if(tinchi  > 10){     
                    System.out.println("Học phí 1 tín chỉ : 16000 ");
                    System.out.println("Học phí sau khi giảm vì tín chỉ lớn hơn 10 : " + (tinchi*16000)*0.9);
                }
                else if( tinchi < 0){
                    System.out.println("Nhập không hợp lệ");
                }
                else {
                    System.out.println("Học phí :" + (tinchi*16000));
                }
            }
        
        public static void Ranking(double score){
            if(score > 9){
                System.out.println("Xuất sắc");
            }
            else if ( score < 9 || score > 8){
                System.out.println("Giỏi");
            }
             else if ( score < 8 || score > 7){
                System.out.println("Khá");
            } 
            else if ( score < 7 || score > 5){
                System.out.println("Trung Bình");
            }
            else if ( score < 5 || score > 3){
                System.out.println("Yếu");
            }    
            else if ( score < 3){
                System.out.println("Kém");
            }
            else if( score < 0){
                System.out.println("Nhập không hợp lệ");
            }
        }
        
        public static void Equatation(int a, int b, int c){
            int denta = (b*b)-4*a*c;
            if( denta > 0){
                System.out.println("Phương trình có hai nghiệm");
                System.out.println("x1 = "+ ( (-b+Math.sqrt(denta))/(2*a) ));  
                System.out.println("x2 = "+ ( (-b-Math.sqrt(denta))/(2*a) ));   
            }
            else if( denta == 0){
                System.out.println("Phương trình có nghiệm kép");
                System.out.println("x1=x2= "+ (-b / (2*a)));
            }
            else{
                System.out.println("Phương trình vô nghiệm");
            }
        }
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Bài tập 1 - FindMaxNumber");
            System.out.println("2. Bài tập 2 - ConvertToDate");
            System.out.println("3. Bài tập 3 - ConvertNumToDay");
            System.out.println("4. Bài tập 4 - ConvertToQuy");
            System.out.println("5. Bài tập 5 - DayInAMonth");
            System.out.println("6. Bài tập 6 - ConvertNumToText");
            System.out.println("7. Bài tập 7 - OddOrEven ");
            System.out.println("8. Bài tập 8 - FeeToPay ");
            System.out.println("9. Bài tập 9 - Ranking ");
            System.out.println("10. Bài tập 10 - Equatation ");
            System.out.print("Chọn số tương ứng với bài tập: ");        
            int chon = sc.nextInt();
            
            switch(chon){
                case 1:{
                    System.out.print("Nhập số nguyên a: ");
                    int a = sc.nextInt();
                    System.out.print("Nhập số nguyên b: ");
                    int b = sc.nextInt();
                    System.out.print("Nhập số nguyên c: ");
                    int c = sc.nextInt();
                    FindMaxNumber(a,b,c);
                }break;
                    
                    
                case 2:{
                    System.out.print("Nhập tổng số giây muốn đổi: ");
                    int second = sc.nextInt();
                    ConvertToDate(second);
                }break;
                    
                    
                case 3:{
                    System.out.print("Nhập vào số nguyên tương ứng ngày trong tuần: ");
                    int day = sc.nextInt();
                    ConvertNumToDay(day);
                }break;
                    
                    
                case 4:{
                    System.out.print("Nhập số tháng để hiển thị quý: ");
                    int month = sc.nextInt();
                    ConvertToQuy(month);
                }break;
                    
                
                case 5:{
                    System.out.print("Nhập vào số tháng: ");
                    int thang = sc.nextInt();
                    System.out.print("Nhập vào số năm: ");
                    int nam = sc.nextInt();
                    DayInAMonth(thang, nam);
                }break;
                    
                case 6:{
                    System.out.print("Nhập vào số từ 0-9 để đổi sang chữ tương ứng: ");
                    int numberToText = sc.nextInt();
                    ConvertNumToText(numberToText);
                }break;
                    
                case 7:{
                    System.out.print("Nhập số nguyên dương: ");
                    int positiveNum = sc.nextInt();
                    OddOrEven(positiveNum);
                }break;
                
                case 8:{
                    System.out.print("Nhập vào số tín chỉ: ");
                    int tinchi = sc.nextInt();
                    FeeToPay(tinchi);
                }break;
                    
                case 9:{
                    System.out.print("Nhập vào điểm trung bình học sinh: ");
                    double score = sc.nextDouble();
                    Ranking(score);
                }break;
                    
                case 10:{
                    System.out.print("Nhập vào a trong ax2+bx+c=0: ");
                    int number_a = sc.nextInt();
                    System.out.print("Nhập vào b trong ax2+bx+c=0: ");
                    int number_b = sc.nextInt();
                    System.out.print("Nhập vào c trong ax2+bx+c=0: ");
                    int number_c = sc.nextInt();
                    Equatation(number_a, number_b, number_c);
                }break;
                    
                
            }
        
        }
        
}
