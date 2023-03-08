import java.util.Scanner; 
public class StartProgramm {
	 // код основной программы
	public static void main(String[] args){

		System.out.println("Введите ваше имя:" );
		Scanner sc = new Scanner(System.in);
	      String opros = sc.nextLine();
	  System.out.println("Здравствуйте " +opros+ "! Вас приветствует программа определения знака зодиака." );
      System.out.println("Для выбора определения восточного гороскопа введите 1");
      System.out.println("Для выбора определения зодиакального гороскопа введите 2");
  	
      Scanner vib = new Scanner(System.in);
       int num = vib.nextInt();
       					
       switch (num) {
       case  (1):

    	   System.out.println("В восточном календаре принят 60-летний цикл, состоящий из 12-летних подциклов, обозначаемых названиями цвета: зеленый, красный, желтый, белый и черный. В каждом подцикле годы носят названия животных: крысы, коровы, тигра, зайца, дракона, змеи, лошади, овцы, обезьяны, курицы, собаки и свиньи. По номеру года определить его название, если 1984 год — начало цикла: <год зеленой крысы>.\n" +
    				"");
    				         int Y;
    				         String result ="";
    				         Scanner in = new Scanner(System.in);
    				         System.out.println("Напишите год вашего рождения: ");
    				         Y = in.nextInt();
    				         int animal = Y%12;
    				         int color = Y%10;
    				         switch (color){
    				            case 0: result = "Белый ";
    				                     break;
    				            case 1: result = "Белый ";
    				                     break;  
    				            case 2: result = "Черный ";
    				                     break;  
    				            case 3: result = "Черный ";
    				                     break;  
    				            case 4: result = "Синий ";
    				                     break;  
    				            case 5: result = "Синий ";
    				                     break;  
    				            case 6: result = "Красный ";
    				                     break; 
    				            case 7: result = "Красный ";
    				                     break;  
    				            case 8: result = "Желтый ";
    				                     break;  
    				            case 9: result = "Желтый ";
    				                     break;           
    				         }
    				              switch (animal){
    				            case 0 : result += "обезьяна ";
    				                     break;
    				            case 1: result += "петух ";
    				                     break;  
    				            case 2: result += "собака ";
    				                     break;  
    				            case 3: result += "свинья ";
    				                     break;  
    				            case 4: result += "крыса ";
    				                     break;  
    				            case 5: result += "бык ";
    				                     break;  
    				            case 6: result += "тигр ";
    				                     break; 
    				            case 7: result += "заяц ";
    				                     break;  
    				            case 8: result += "дракон ";
    				                     break;  
    				            case 9: result += "змея ";
    				                     break;
    				            case 10: result += "лошадь ";
    				                     break; 
    				            case 11: result += "овца ";
    				                     break;  
    				         }
    				              System.out.println(result);
    				          	System.out.println("Для выхода из программы нажмите любой символ и Enter");
    				              String pause1 = in.next();
	     	   
           break;
       case (2):

    Scanner s = new Scanner (System.in);
   	System.out.println("Введите дату рождения (1-31): ");
   	int day = s.nextInt();
   	System.out.println("Введите месяц рождения (1-12): ");
   	int month = s.nextInt();
   	String sign = null;
   	if((month == 1) && (day <= 20) || (month == 12) && (day >= 22)) {
    sign = "Capricorn";
   	} else if((month == 1) || (month == 2) && (day <= 19)) {
   		 sign = "Водолей";
   	} else if((month == 2) || (month == 3) && (day <= 20)) {
   		 sign = "Рыбы";
   	} else if((month == 3) || (month == 4) && (day <= 19)) {
   		 sign = "Овен";
   	} else if((month == 4) || (month == 5) && (day <= 21)) {
   		 sign = "Телец";
   	} else if((month == 5) || (month == 6) && (day <= 21)) {
   		 sign = "Близнецы";
   	} else if((month == 6) || (month == 7) && (day <= 23)) {
   		 sign = "Рак";
   	} else if((month == 7) || (month == 8) && (day <= 23)) {
   		 sign = "Лев";
   	} else if((month == 8) || (month == 9) && (day <= 23)) {
   		 sign = "Дева";
   	} else if((month == 9) || (month == 10) && (day <= 23)) {
   		 sign = "Весы";
   	} else if((month == 10) || (month == 11) && (day <= 22)) {
   	     sign = "Скорпион";
   	} else if((month == 12) || (month == 11) && (day > 22)) {
   		 sign = "Стрелец";
   	}
   	
   	System.out.println("Ваш знак зодиака  "+ sign +"!");
   	System.out.println("Для выхода из программы нажмите любой символ и Enter");
   	String pause2 = s.next();
           break;
           
       default:
    	   System.out.println("Для корректной работы программы перезагрузите ее с сделайте выбор: введите 1 или 2");
    	   Scanner s2 = new Scanner (System.in);
    	   String pause3 = s2.next();
           break;
       }
	         
	}
}
